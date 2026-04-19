package t0;

/* JADX INFO: loaded from: classes.dex */
public class c3 extends d1.h0 implements j1, d1.u<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f20636b;

    private static final class a extends d1.i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f20637c;

        public a(long j10) {
            this.f20637c = j10;
        }

        @Override // d1.i0
        public void c(d1.i0 i0Var) {
            ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f20637c = ((a) i0Var).f20637c;
        }

        @Override // d1.i0
        public d1.i0 d() {
            return new a(this.f20637c);
        }

        public final long i() {
            return this.f20637c;
        }

        public final void j(long j10) {
            this.f20637c = j10;
        }
    }

    public c3(long j10) {
        this.f20636b = new a(j10);
    }

    @Override // t0.j1, t0.b1
    public long a() {
        return ((a) d1.p.X(this.f20636b, this)).i();
    }

    @Override // d1.u
    public e3<Long> d() {
        return f3.q();
    }

    @Override // d1.g0
    public d1.i0 f() {
        return this.f20636b;
    }

    @Override // d1.g0
    public d1.i0 l(d1.i0 i0Var, d1.i0 i0Var2, d1.i0 i0Var3) {
        ae.r.d(i0Var2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        ae.r.d(i0Var3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((a) i0Var2).i() == ((a) i0Var3).i()) {
            return i0Var2;
        }
        return null;
    }

    @Override // d1.g0
    public void n(d1.i0 i0Var) {
        ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f20636b = (a) i0Var;
    }

    @Override // t0.j1
    public void o(long j10) {
        d1.k kVarD;
        a aVar = (a) d1.p.F(this.f20636b);
        if (aVar.i() != j10) {
            a aVar2 = this.f20636b;
            d1.p.J();
            synchronized (d1.p.I()) {
                kVarD = d1.k.f9368e.d();
                ((a) d1.p.S(aVar2, this, kVarD, aVar)).j(j10);
                md.i0 i0Var = md.i0.f15558a;
            }
            d1.p.Q(kVarD, this);
        }
    }

    public String toString() {
        return "MutableLongState(value=" + ((a) d1.p.F(this.f20636b)).i() + ")@" + hashCode();
    }
}
