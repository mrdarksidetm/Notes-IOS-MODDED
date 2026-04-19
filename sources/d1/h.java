package d1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zd.l<Object, md.i0> f9355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9356h;

    public h(int i10, n nVar, zd.l<Object, md.i0> lVar) {
        super(i10, nVar, null);
        this.f9355g = lVar;
        this.f9356h = 1;
    }

    @Override // d1.k
    public void d() {
        if (e()) {
            return;
        }
        n(this);
        super.d();
    }

    @Override // d1.k
    public zd.l<Object, md.i0> h() {
        return this.f9355g;
    }

    @Override // d1.k
    public boolean i() {
        return true;
    }

    @Override // d1.k
    public zd.l<Object, md.i0> k() {
        return null;
    }

    @Override // d1.k
    public void m(k kVar) {
        this.f9356h++;
    }

    @Override // d1.k
    public void n(k kVar) {
        int i10 = this.f9356h - 1;
        this.f9356h = i10;
        if (i10 == 0) {
            b();
        }
    }

    @Override // d1.k
    public void o() {
    }

    @Override // d1.k
    public void p(g0 g0Var) {
        p.Z();
        throw new md.i();
    }

    @Override // d1.k
    public k x(zd.l<Object, md.i0> lVar) {
        p.g0(this);
        return new e(f(), g(), lVar, this);
    }
}
