package af;

/* JADX INFO: loaded from: classes2.dex */
public final class x1 extends f1<md.c0, md.d0, w1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x1 f862c = new x1();

    private x1() {
        super(xe.a.C(md.c0.f15542b));
    }

    @Override // af.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((md.d0) obj).A());
    }

    @Override // af.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((md.d0) obj).A());
    }

    @Override // af.f1
    public /* bridge */ /* synthetic */ md.d0 r() {
        return md.d0.a(w());
    }

    @Override // af.f1
    public /* bridge */ /* synthetic */ void u(ze.d dVar, md.d0 d0Var, int i10) {
        z(dVar, d0Var.A(), i10);
    }

    protected int v(long[] jArr) {
        ae.r.f(jArr, "$this$collectionSize");
        return md.d0.u(jArr);
    }

    protected long[] w() {
        return md.d0.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p, af.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ze.c cVar, int i10, w1 w1Var, boolean z10) {
        ae.r.f(cVar, "decoder");
        ae.r.f(w1Var, "builder");
        w1Var.e(md.c0.b(cVar.G(getDescriptor(), i10).u()));
    }

    protected w1 y(long[] jArr) {
        ae.r.f(jArr, "$this$toBuilder");
        return new w1(jArr, null);
    }

    protected void z(ze.d dVar, long[] jArr, int i10) {
        ae.r.f(dVar, "encoder");
        ae.r.f(jArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.s(getDescriptor(), i11).C(md.d0.s(jArr, i11));
        }
    }
}
