package le;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j1 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f15065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private nd.k<a1<?>> f15067e;

    public static /* synthetic */ void l0(j1 j1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        j1Var.k0(z10);
    }

    private final long m0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void q0(j1 j1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        j1Var.p0(z10);
    }

    @Override // le.j0
    public final j0 j0(int i10) {
        qe.p.a(i10);
        return this;
    }

    public final void k0(boolean z10) {
        long jM0 = this.f15065c - m0(z10);
        this.f15065c = jM0;
        if (jM0 <= 0 && this.f15066d) {
            shutdown();
        }
    }

    public final void n0(a1<?> a1Var) {
        nd.k<a1<?>> kVar = this.f15067e;
        if (kVar == null) {
            kVar = new nd.k<>();
            this.f15067e = kVar;
        }
        kVar.addLast(a1Var);
    }

    protected long o0() {
        nd.k<a1<?>> kVar = this.f15067e;
        return (kVar == null || kVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void p0(boolean z10) {
        this.f15065c += m0(z10);
        if (z10) {
            return;
        }
        this.f15066d = true;
    }

    public final boolean r0() {
        return this.f15065c >= m0(true);
    }

    public final boolean s0() {
        nd.k<a1<?>> kVar = this.f15067e;
        if (kVar != null) {
            return kVar.isEmpty();
        }
        return true;
    }

    public void shutdown() {
    }

    public long t0() {
        return !u0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean u0() {
        a1<?> a1VarV;
        nd.k<a1<?>> kVar = this.f15067e;
        if (kVar == null || (a1VarV = kVar.v()) == null) {
            return false;
        }
        a1VarV.run();
        return true;
    }

    public boolean v0() {
        return false;
    }
}
