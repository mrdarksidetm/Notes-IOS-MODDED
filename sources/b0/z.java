package b0;

import c0.g0;

/* JADX INFO: loaded from: classes.dex */
public final class z implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f5154a;

    public z(w2.d dVar) {
        this.f5154a = new o(a0.a(), dVar);
    }

    private final float f(float f10) {
        return this.f5154a.b(f10) * Math.signum(f10);
    }

    @Override // c0.g0
    public float a() {
        return 0.0f;
    }

    @Override // c0.g0
    public float b(long j10, float f10, float f11) {
        return this.f5154a.d(f11).b(j10 / 1000000);
    }

    @Override // c0.g0
    public long c(float f10, float f11) {
        return this.f5154a.c(f11) * 1000000;
    }

    @Override // c0.g0
    public float d(float f10, float f11) {
        return f10 + f(f11);
    }

    @Override // c0.g0
    public float e(long j10, float f10, float f11) {
        return f10 + this.f5154a.d(f11).a(j10 / 1000000);
    }
}
