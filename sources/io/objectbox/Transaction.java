package io.objectbox;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public class Transaction implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f13315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BoxStore f13316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f13317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Throwable f13318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f13319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f13320f;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f13320f) {
            this.f13320f = true;
            this.f13316b.w(this);
            if (!nativeIsOwnerThread(this.f13315a)) {
                boolean zNativeIsActive = nativeIsActive(this.f13315a);
                boolean zNativeIsRecycled = nativeIsRecycled(this.f13315a);
                if (zNativeIsActive || zNativeIsRecycled) {
                    String str = " (initial commit count: " + this.f13319e + ").";
                    if (zNativeIsActive) {
                        System.err.println("Transaction is still active" + str);
                    } else {
                        System.out.println("Hint: use closeThreadResources() to avoid finalizing recycled transactions" + str);
                        System.out.flush();
                    }
                    if (this.f13318d != null) {
                        System.err.println("Transaction was initially created here:");
                        this.f13318d.printStackTrace();
                    }
                    System.err.flush();
                }
            }
            if (!this.f13316b.isClosed()) {
                nativeDestroy(this.f13315a);
            }
        }
    }

    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }

    native void nativeDestroy(long j10);

    native boolean nativeIsActive(long j10);

    native boolean nativeIsOwnerThread(long j10);

    native boolean nativeIsRecycled(long j10);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TX ");
        sb2.append(Long.toString(this.f13315a, 16));
        sb2.append(" (");
        sb2.append(this.f13317c ? "read-only" : "write");
        sb2.append(", initialCommitCount=");
        sb2.append(this.f13319e);
        sb2.append(")");
        return sb2.toString();
    }
}
