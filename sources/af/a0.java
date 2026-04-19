package af;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends f1<Float, float[], z> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f725c = new a0();

    private a0() {
        super(xe.a.u(ae.l.f718a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(float[] fArr) {
        ae.r.f(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] r() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p, af.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ze.c cVar, int i10, z zVar, boolean z10) {
        ae.r.f(cVar, "decoder");
        ae.r.f(zVar, "builder");
        zVar.e(cVar.j(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public z k(float[] fArr) {
        ae.r.f(fArr, "<this>");
        return new z(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ze.d dVar, float[] fArr, int i10) {
        ae.r.f(dVar, "encoder");
        ae.r.f(fArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.e(getDescriptor(), i11, fArr[i11]);
        }
    }
}
