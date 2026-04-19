package d1;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f9379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f9380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f9381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final zd.l<Object, md.i0> f9382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final zd.l<Object, md.i0> f9383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final k f9384l;

    public l0(k kVar, zd.l<Object, md.i0> lVar, boolean z10, boolean z11) {
        zd.l<Object, md.i0> lVarH;
        super(0, n.f9390e.a(), null);
        this.f9379g = kVar;
        this.f9380h = z10;
        this.f9381i = z11;
        this.f9382j = p.K(lVar, (kVar == null || (lVarH = kVar.h()) == null) ? ((a) p.f9411j.get()).h() : lVarH, z10);
        this.f9384l = this;
    }

    private final k A() {
        k kVar = this.f9379g;
        return kVar == null ? (k) p.f9411j.get() : kVar;
    }

    @Override // d1.k
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void m(k kVar) {
        y.b();
        throw new md.i();
    }

    @Override // d1.k
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void n(k kVar) {
        y.b();
        throw new md.i();
    }

    @Override // d1.k
    public void d() {
        k kVar;
        t(true);
        if (!this.f9381i || (kVar = this.f9379g) == null) {
            return;
        }
        kVar.d();
    }

    @Override // d1.k
    public int f() {
        return A().f();
    }

    @Override // d1.k
    public n g() {
        return A().g();
    }

    @Override // d1.k
    public zd.l<Object, md.i0> h() {
        return this.f9382j;
    }

    @Override // d1.k
    public boolean i() {
        return A().i();
    }

    @Override // d1.k
    public zd.l<Object, md.i0> k() {
        return this.f9383k;
    }

    @Override // d1.k
    public void o() {
        A().o();
    }

    @Override // d1.k
    public void p(g0 g0Var) {
        A().p(g0Var);
    }

    @Override // d1.k
    public k x(zd.l<Object, md.i0> lVar) {
        zd.l<Object, md.i0> lVarL = p.L(lVar, h(), false, 4, null);
        return !this.f9380h ? p.D(A().x(null), lVarL, true) : A().x(lVarL);
    }
}
