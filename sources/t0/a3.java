package t0;

/* JADX INFO: loaded from: classes.dex */
public class a3 extends d1.h0 implements h1, d1.u<Float> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f20624b;

    private static final class a extends d1.i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f20625c;

        public a(float f10) {
            this.f20625c = f10;
        }

        @Override // d1.i0
        public void c(d1.i0 i0Var) {
            ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f20625c = ((a) i0Var).f20625c;
        }

        @Override // d1.i0
        public d1.i0 d() {
            return new a(this.f20625c);
        }

        public final float i() {
            return this.f20625c;
        }

        public final void j(float f10) {
            this.f20625c = f10;
        }
    }

    public a3(float f10) {
        this.f20624b = new a(f10);
    }

    @Override // t0.h1, t0.m0
    public float b() {
        return ((a) d1.p.X(this.f20624b, this)).i();
    }

    @Override // d1.u
    public e3<Float> d() {
        return f3.q();
    }

    @Override // d1.g0
    public d1.i0 f() {
        return this.f20624b;
    }

    @Override // t0.h1
    public void h(float f10) {
        d1.k kVarD;
        a aVar = (a) d1.p.F(this.f20624b);
        if (aVar.i() == f10) {
            return;
        }
        a aVar2 = this.f20624b;
        d1.p.J();
        synchronized (d1.p.I()) {
            kVarD = d1.k.f9368e.d();
            ((a) d1.p.S(aVar2, this, kVarD, aVar)).j(f10);
            md.i0 i0Var = md.i0.f15558a;
        }
        d1.p.Q(kVarD, this);
    }

    @Override // d1.g0
    public d1.i0 l(d1.i0 i0Var, d1.i0 i0Var2, d1.i0 i0Var3) {
        ae.r.d(i0Var2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        ae.r.d(i0Var3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((a) i0Var2).i() == ((a) i0Var3).i()) {
            return i0Var2;
        }
        return null;
    }

    @Override // d1.g0
    public void n(d1.i0 i0Var) {
        ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f20624b = (a) i0Var;
    }

    public String toString() {
        return "MutableFloatState(value=" + ((a) d1.p.F(this.f20624b)).i() + ")@" + hashCode();
    }
}
