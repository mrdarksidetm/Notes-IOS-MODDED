package c0;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f6070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f6071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f6072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y0 f6073d;

    public h0() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public h0(float f10, float f11, float f12) {
        this.f6070a = f10;
        this.f6071b = f11;
        this.f6072c = f12;
        y0 y0Var = new y0(1.0f);
        y0Var.d(f10);
        y0Var.f(f11);
        this.f6073d = y0Var;
    }

    public /* synthetic */ h0(float f10, float f11, float f12, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }

    @Override // c0.f0
    public float b(long j10, float f10, float f11, float f12) {
        this.f6073d.e(f11);
        return q0.c(this.f6073d.g(f10, f12, j10 / 1000000));
    }

    @Override // c0.f0
    public long c(float f10, float f11, float f12) {
        float fB = this.f6073d.b();
        float fA = this.f6073d.a();
        float f13 = f10 - f11;
        float f14 = this.f6072c;
        return x0.b(fB, fA, f12 / f14, f13 / f14, 1.0f) * 1000000;
    }

    @Override // c0.f0
    public float d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // c0.f0
    public float e(long j10, float f10, float f11, float f12) {
        this.f6073d.e(f11);
        return q0.b(this.f6073d.g(f10, f12, j10 / 1000000));
    }
}
