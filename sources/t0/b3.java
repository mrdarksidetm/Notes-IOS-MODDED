package t0;

/* JADX INFO: loaded from: classes.dex */
public class b3 extends d1.h0 implements i1, d1.u<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f20633b;

    private static final class a extends d1.i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20634c;

        public a(int i10) {
            this.f20634c = i10;
        }

        @Override // d1.i0
        public void c(d1.i0 i0Var) {
            ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.f20634c = ((a) i0Var).f20634c;
        }

        @Override // d1.i0
        public d1.i0 d() {
            return new a(this.f20634c);
        }

        public final int i() {
            return this.f20634c;
        }

        public final void j(int i10) {
            this.f20634c = i10;
        }
    }

    public b3(int i10) {
        this.f20633b = new a(i10);
    }

    @Override // d1.u
    public e3<Integer> d() {
        return f3.q();
    }

    @Override // t0.i1, t0.s0
    public int e() {
        return ((a) d1.p.X(this.f20633b, this)).i();
    }

    @Override // d1.g0
    public d1.i0 f() {
        return this.f20633b;
    }

    @Override // t0.i1
    public void k(int i10) {
        d1.k kVarD;
        a aVar = (a) d1.p.F(this.f20633b);
        if (aVar.i() != i10) {
            a aVar2 = this.f20633b;
            d1.p.J();
            synchronized (d1.p.I()) {
                kVarD = d1.k.f9368e.d();
                ((a) d1.p.S(aVar2, this, kVarD, aVar)).j(i10);
                md.i0 i0Var = md.i0.f15558a;
            }
            d1.p.Q(kVarD, this);
        }
    }

    @Override // d1.g0
    public d1.i0 l(d1.i0 i0Var, d1.i0 i0Var2, d1.i0 i0Var3) {
        ae.r.d(i0Var2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        ae.r.d(i0Var3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((a) i0Var2).i() == ((a) i0Var3).i()) {
            return i0Var2;
        }
        return null;
    }

    @Override // d1.g0
    public void n(d1.i0 i0Var) {
        ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f20633b = (a) i0Var;
    }

    public String toString() {
        return "MutableIntState(value=" + ((a) d1.p.F(this.f20633b)).i() + ")@" + hashCode();
    }
}
