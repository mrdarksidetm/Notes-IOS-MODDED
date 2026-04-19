package c0;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f6077c;

    public i0(int i10, int i11, b0 b0Var) {
        this.f6075a = i10;
        this.f6076b = i11;
        this.f6077c = b0Var;
    }

    private final long f(long j10) {
        return ge.o.m(j10 - ((long) this.f6076b), 0L, this.f6075a);
    }

    @Override // c0.f0
    public float b(long j10, float f10, float f11, float f12) {
        long jF = f(j10 / 1000000);
        if (jF < 0) {
            return 0.0f;
        }
        if (jF == 0) {
            return f12;
        }
        return (e(jF * 1000000, f10, f11, f12) - e((jF - 1) * 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // c0.f0
    public long c(float f10, float f11, float f12) {
        return ((long) (this.f6076b + this.f6075a)) * 1000000;
    }

    @Override // c0.f0
    public float e(long j10, float f10, float f11, float f12) {
        long jF = f(j10 / 1000000);
        int i10 = this.f6075a;
        return l1.k(f10, f11, this.f6077c.a(ge.o.k(i10 == 0 ? 1.0f : jF / i10, 0.0f, 1.0f)));
    }
}
