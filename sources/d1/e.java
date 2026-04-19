package d1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f9350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final zd.l<Object, md.i0> f9351h;

    static final class a extends ae.s implements zd.l<Object, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<Object, md.i0> f9352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<Object, md.i0> f9353b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2) {
            super(1);
            this.f9352a = lVar;
            this.f9353b = lVar2;
        }

        public final void a(Object obj) {
            this.f9352a.invoke(obj);
            this.f9353b.invoke(obj);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Object obj) {
            a(obj);
            return md.i0.f15558a;
        }
    }

    public e(int i10, n nVar, zd.l<Object, md.i0> lVar, k kVar) {
        super(i10, nVar, null);
        this.f9350g = kVar;
        kVar.m(this);
        if (lVar != null) {
            zd.l<Object, md.i0> lVarH = kVar.h();
            if (lVarH != null) {
                lVar = new a(lVar, lVarH);
            }
        } else {
            lVar = kVar.h();
        }
        this.f9351h = lVar;
    }

    @Override // d1.k
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Void m(k kVar) {
        y.b();
        throw new md.i();
    }

    @Override // d1.k
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void n(k kVar) {
        y.b();
        throw new md.i();
    }

    @Override // d1.k
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void p(g0 g0Var) {
        p.Z();
        throw new md.i();
    }

    @Override // d1.k
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public e x(zd.l<Object, md.i0> lVar) {
        return new e(f(), g(), lVar, this.f9350g);
    }

    @Override // d1.k
    public void d() {
        if (e()) {
            return;
        }
        if (f() != this.f9350g.f()) {
            b();
        }
        this.f9350g.n(this);
        super.d();
    }

    @Override // d1.k
    public zd.l<Object, md.i0> h() {
        return this.f9351h;
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
    public void o() {
    }
}
