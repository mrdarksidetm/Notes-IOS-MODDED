package ca;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.p002firebaseauthapi.zzg;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static z8.a f6758h = new z8.a("TokenRefresher", "FirebaseAuth:");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x9.f f6759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile long f6760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile long f6761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f6762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HandlerThread f6763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Handler f6764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f6765g;

    public v(x9.f fVar) {
        f6758h.g("Initializing TokenRefresher", new Object[0]);
        x9.f fVar2 = (x9.f) w8.m.k(fVar);
        this.f6759a = fVar2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f6763e = handlerThread;
        handlerThread.start();
        this.f6764f = new zzg(this.f6763e.getLooper());
        this.f6765g = new u(this, fVar2.p());
        this.f6762d = 300000L;
    }

    public final void b() {
        this.f6764f.removeCallbacks(this.f6765g);
    }

    public final void c() {
        f6758h.g("Scheduling refresh for " + (this.f6760b - this.f6762d), new Object[0]);
        b();
        this.f6761c = Math.max((this.f6760b - e9.f.b().a()) - this.f6762d, 0L) / 1000;
        this.f6764f.postDelayed(this.f6765g, this.f6761c * 1000);
    }

    final void d() {
        int i10 = (int) this.f6761c;
        this.f6761c = (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) ? 2 * this.f6761c : i10 != 960 ? 30L : 960L;
        this.f6760b = e9.f.b().a() + (this.f6761c * 1000);
        f6758h.g("Scheduling refresh for " + this.f6760b, new Object[0]);
        this.f6764f.postDelayed(this.f6765g, this.f6761c * 1000);
    }
}
