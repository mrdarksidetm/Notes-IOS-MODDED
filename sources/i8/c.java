package i8;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<a> f12600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final CountDownLatch f12602c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f12603d = false;

    public c(a aVar, long j10) {
        this.f12600a = new WeakReference<>(aVar);
        this.f12601b = j10;
        start();
    }

    private final void a() {
        a aVar = this.f12600a.get();
        if (aVar != null) {
            aVar.c();
            this.f12603d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f12602c.await(this.f12601b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
