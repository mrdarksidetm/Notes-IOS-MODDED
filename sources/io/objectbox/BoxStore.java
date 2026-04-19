package io.objectbox;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class BoxStore implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set<String> f13308g = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f13310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Transaction> f13311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f13312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f13313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f13314f;

    private void a() {
        if (isClosed()) {
            throw new IllegalStateException("Store is closed");
        }
    }

    private void b() {
        try {
            if (this.f13312d.awaitTermination(1L, TimeUnit.SECONDS)) {
                return;
            }
            int iActiveCount = Thread.activeCount();
            System.err.println("Thread pool not terminated in time; printing stack traces...");
            Thread[] threadArr = new Thread[iActiveCount + 2];
            int iEnumerate = Thread.enumerate(threadArr);
            for (int i10 = 0; i10 < iEnumerate; i10++) {
                System.err.println("Thread: " + threadArr[i10].getName());
                Thread.dumpStack();
            }
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    static native void nativeDelete(long j10);

    private native boolean nativeStopObjectBrowser(long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z10;
        ArrayList arrayList;
        synchronized (this) {
            z10 = this.f13313e;
            if (!this.f13313e) {
                if (this.f13314f != 0) {
                    try {
                        o();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                this.f13313e = true;
                synchronized (this.f13311c) {
                    arrayList = new ArrayList(this.f13311c);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transaction) it.next()).close();
                }
                long j10 = this.f13310b;
                if (j10 != 0) {
                    nativeDelete(j10);
                    this.f13310b = 0L;
                }
                this.f13312d.shutdown();
                b();
            }
        }
        if (z10) {
            return;
        }
        Set<String> set = f13308g;
        synchronized (set) {
            set.remove(this.f13309a);
            set.notifyAll();
        }
    }

    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }

    public boolean isClosed() {
        return this.f13313e;
    }

    public long l() {
        a();
        return this.f13310b;
    }

    public synchronized boolean o() {
        if (this.f13314f == 0) {
            throw new IllegalStateException("ObjectBrowser has not been started before");
        }
        this.f13314f = 0;
        return nativeStopObjectBrowser(l());
    }

    public void w(Transaction transaction) {
        synchronized (this.f13311c) {
            this.f13311c.remove(transaction);
        }
    }
}
