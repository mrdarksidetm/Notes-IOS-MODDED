package d1;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c f9374s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f9375t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f9376u;

    public k0(c cVar, zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2, boolean z10, boolean z11) {
        zd.l<Object, md.i0> lVarK;
        zd.l<Object, md.i0> lVarH;
        super(0, n.f9390e.a(), p.K(lVar, (cVar == null || (lVarH = cVar.h()) == null) ? ((a) p.f9411j.get()).h() : lVarH, z10), p.M(lVar2, (cVar == null || (lVarK = cVar.k()) == null) ? ((a) p.f9411j.get()).k() : lVarK));
        this.f9374s = cVar;
        this.f9375t = z10;
        this.f9376u = z11;
    }

    private final c S() {
        c cVar = this.f9374s;
        return cVar == null ? (c) p.f9411j.get() : cVar;
    }

    @Override // d1.c
    public l C() {
        return S().C();
    }

    @Override // d1.c
    public v0.b<g0> E() {
        return S().E();
    }

    @Override // d1.c
    public void O(v0.b<g0> bVar) {
        y.b();
        throw new md.i();
    }

    @Override // d1.c
    public c P(zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2) {
        zd.l<Object, md.i0> lVarL = p.L(lVar, h(), false, 4, null);
        zd.l<Object, md.i0> lVarM = p.M(lVar2, k());
        return !this.f9375t ? new k0(S().P(null, lVarM), lVarL, lVarM, false, true) : S().P(lVarL, lVarM);
    }

    @Override // d1.c, d1.k
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void m(k kVar) {
        y.b();
        throw new md.i();
    }

    @Override // d1.c, d1.k
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public Void n(k kVar) {
        y.b();
        throw new md.i();
    }

    @Override // d1.c, d1.k
    public void d() {
        c cVar;
        t(true);
        if (!this.f9376u || (cVar = this.f9374s) == null) {
            return;
        }
        cVar.d();
    }

    @Override // d1.k
    public int f() {
        return S().f();
    }

    @Override // d1.k
    public n g() {
        return S().g();
    }

    @Override // d1.c, d1.k
    public boolean i() {
        return S().i();
    }

    @Override // d1.c, d1.k
    public int j() {
        return S().j();
    }

    @Override // d1.c, d1.k
    public void o() {
        S().o();
    }

    @Override // d1.c, d1.k
    public void p(g0 g0Var) {
        S().p(g0Var);
    }

    @Override // d1.k
    public void u(int i10) {
        y.b();
        throw new md.i();
    }

    @Override // d1.k
    public void v(n nVar) {
        y.b();
        throw new md.i();
    }

    @Override // d1.c, d1.k
    public void w(int i10) {
        S().w(i10);
    }

    @Override // d1.c, d1.k
    public k x(zd.l<Object, md.i0> lVar) {
        zd.l<Object, md.i0> lVarL = p.L(lVar, h(), false, 4, null);
        return !this.f9375t ? p.D(S().x(null), lVarL, true) : S().x(lVarL);
    }
}
