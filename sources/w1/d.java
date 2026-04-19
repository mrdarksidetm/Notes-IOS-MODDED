package w1;

import k1.f;
import w2.w;
import w2.x;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f22390a = new c(false, null, 3, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f22391b = new c(false, null, 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f22392c = f.f14338b.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22393d;

    public final void a(long j10, long j11) {
        this.f22390a.a(j10, f.o(j11));
        this.f22391b.a(j10, f.p(j11));
    }

    public final long b(long j10) {
        if (w.h(j10) > 0.0f && w.i(j10) > 0.0f) {
            return x.a(this.f22390a.d(w.h(j10)), this.f22391b.d(w.i(j10)));
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + ((Object) w.n(j10))).toString());
    }

    public final long c() {
        return this.f22392c;
    }

    public final long d() {
        return this.f22393d;
    }

    public final void e() {
        this.f22390a.e();
        this.f22391b.e();
        this.f22393d = 0L;
    }

    public final void f(long j10) {
        this.f22392c = j10;
    }

    public final void g(long j10) {
        this.f22393d = j10;
    }
}
