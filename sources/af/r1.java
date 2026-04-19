package af;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 extends f1<md.y, md.z, q1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r1 f816c = new r1();

    private r1() {
        super(xe.a.A(md.y.f15587b));
    }

    @Override // af.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((md.z) obj).A());
    }

    @Override // af.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((md.z) obj).A());
    }

    @Override // af.f1
    public /* bridge */ /* synthetic */ md.z r() {
        return md.z.a(w());
    }

    @Override // af.f1
    public /* bridge */ /* synthetic */ void u(ze.d dVar, md.z zVar, int i10) {
        z(dVar, zVar.A(), i10);
    }

    protected int v(byte[] bArr) {
        ae.r.f(bArr, "$this$collectionSize");
        return md.z.u(bArr);
    }

    protected byte[] w() {
        return md.z.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p, af.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ze.c cVar, int i10, q1 q1Var, boolean z10) {
        ae.r.f(cVar, "decoder");
        ae.r.f(q1Var, "builder");
        q1Var.e(md.y.b(cVar.G(getDescriptor(), i10).A()));
    }

    protected q1 y(byte[] bArr) {
        ae.r.f(bArr, "$this$toBuilder");
        return new q1(bArr, null);
    }

    protected void z(ze.d dVar, byte[] bArr, int i10) {
        ae.r.f(dVar, "encoder");
        ae.r.f(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.s(getDescriptor(), i11).l(md.z.s(bArr, i11));
        }
    }
}
