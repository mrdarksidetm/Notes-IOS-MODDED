package af;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends f1<Double, double[], r> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f817c = new s();

    private s() {
        super(xe.a.t(ae.k.f716a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(double[] dArr) {
        ae.r.f(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] r() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p, af.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ze.c cVar, int i10, r rVar, boolean z10) {
        ae.r.f(cVar, "decoder");
        ae.r.f(rVar, "builder");
        rVar.e(cVar.y(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public r k(double[] dArr) {
        ae.r.f(dArr, "<this>");
        return new r(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ze.d dVar, double[] dArr, int i10) {
        ae.r.f(dVar, "encoder");
        ae.r.f(dArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.x(getDescriptor(), i11, dArr[i11]);
        }
    }
}
