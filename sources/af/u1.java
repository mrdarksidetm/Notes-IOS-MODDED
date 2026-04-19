package af;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends f1<md.a0, md.b0, t1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u1 f831c = new u1();

    private u1() {
        super(xe.a.B(md.a0.f15536b));
    }

    @Override // af.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((md.b0) obj).A());
    }

    @Override // af.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((md.b0) obj).A());
    }

    @Override // af.f1
    public /* bridge */ /* synthetic */ md.b0 r() {
        return md.b0.a(w());
    }

    @Override // af.f1
    public /* bridge */ /* synthetic */ void u(ze.d dVar, md.b0 b0Var, int i10) {
        z(dVar, b0Var.A(), i10);
    }

    protected int v(int[] iArr) {
        ae.r.f(iArr, "$this$collectionSize");
        return md.b0.u(iArr);
    }

    protected int[] w() {
        return md.b0.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p, af.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ze.c cVar, int i10, t1 t1Var, boolean z10) {
        ae.r.f(cVar, "decoder");
        ae.r.f(t1Var, "builder");
        t1Var.e(md.a0.b(cVar.G(getDescriptor(), i10).q()));
    }

    protected t1 y(int[] iArr) {
        ae.r.f(iArr, "$this$toBuilder");
        return new t1(iArr, null);
    }

    protected void z(ze.d dVar, int[] iArr, int i10) {
        ae.r.f(dVar, "encoder");
        ae.r.f(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.s(getDescriptor(), i11).A(md.b0.s(iArr, i11));
        }
    }
}
