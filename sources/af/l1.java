package af;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends f1<Short, short[], k1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l1 f781c = new l1();

    private l1() {
        super(xe.a.x(ae.k0.f717a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(short[] sArr) {
        ae.r.f(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] r() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p, af.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ze.c cVar, int i10, k1 k1Var, boolean z10) {
        ae.r.f(cVar, "decoder");
        ae.r.f(k1Var, "builder");
        k1Var.e(cVar.f(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public k1 k(short[] sArr) {
        ae.r.f(sArr, "<this>");
        return new k1(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ze.d dVar, short[] sArr, int i10) {
        ae.r.f(dVar, "encoder");
        ae.r.f(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.o(getDescriptor(), i11, sArr[i11]);
        }
    }
}
