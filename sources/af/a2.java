package af;

/* JADX INFO: loaded from: classes2.dex */
public final class a2 extends f1<md.f0, md.g0, z1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a2 f742c = new a2();

    private a2() {
        super(xe.a.D(md.f0.f15552b));
    }

    @Override // af.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((md.g0) obj).A());
    }

    @Override // af.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((md.g0) obj).A());
    }

    @Override // af.f1
    public /* bridge */ /* synthetic */ md.g0 r() {
        return md.g0.a(w());
    }

    @Override // af.f1
    public /* bridge */ /* synthetic */ void u(ze.d dVar, md.g0 g0Var, int i10) {
        z(dVar, g0Var.A(), i10);
    }

    protected int v(short[] sArr) {
        ae.r.f(sArr, "$this$collectionSize");
        return md.g0.u(sArr);
    }

    protected short[] w() {
        return md.g0.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p, af.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ze.c cVar, int i10, z1 z1Var, boolean z10) {
        ae.r.f(cVar, "decoder");
        ae.r.f(z1Var, "builder");
        z1Var.e(md.f0.b(cVar.G(getDescriptor(), i10).C()));
    }

    protected z1 y(short[] sArr) {
        ae.r.f(sArr, "$this$toBuilder");
        return new z1(sArr, null);
    }

    protected void z(ze.d dVar, short[] sArr, int i10) {
        ae.r.f(dVar, "encoder");
        ae.r.f(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.s(getDescriptor(), i11).i(md.g0.s(sArr, i11));
        }
    }
}
