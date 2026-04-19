package l1;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14591a;

    private u1(long j10) {
        super(null);
        this.f14591a = j10;
    }

    public /* synthetic */ u1(long j10, ae.j jVar) {
        this(j10);
    }

    public final long a() {
        return this.f14591a;
    }

    @Override // l1.z
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public void mo292applyToPq9zytI(long j10, d1 d1Var, float f10) {
        long jU;
        d1Var.b(1.0f);
        if (f10 == 1.0f) {
            jU = this.f14591a;
        } else {
            long j11 = this.f14591a;
            jU = j0.u(j11, j0.x(j11) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        }
        d1Var.t(jU);
        if (d1Var.l() != null) {
            d1Var.k(null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1) && j0.w(this.f14591a, ((u1) obj).f14591a);
    }

    public int hashCode() {
        return j0.C(this.f14591a);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) j0.D(this.f14591a)) + ')';
    }
}
