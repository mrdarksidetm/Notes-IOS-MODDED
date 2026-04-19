package af;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends f1<Long, long[], m0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n0 f789c = new n0();

    private n0() {
        super(xe.a.w(ae.t.f722a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(long[] jArr) {
        ae.r.f(jArr, "<this>");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public long[] r() {
        return new long[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p, af.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ze.c cVar, int i10, m0 m0Var, boolean z10) {
        ae.r.f(cVar, "decoder");
        ae.r.f(m0Var, "builder");
        m0Var.e(cVar.t(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public m0 k(long[] jArr) {
        ae.r.f(jArr, "<this>");
        return new m0(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ze.d dVar, long[] jArr, int i10) {
        ae.r.f(dVar, "encoder");
        ae.r.f(jArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.B(getDescriptor(), i11, jArr[i11]);
        }
    }
}
