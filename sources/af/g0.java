package af;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends f1<Integer, int[], f0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f760c = new g0();

    private g0() {
        super(xe.a.v(ae.q.f721a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(int[] iArr) {
        ae.r.f(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p, af.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ze.c cVar, int i10, f0 f0Var, boolean z10) {
        ae.r.f(cVar, "decoder");
        ae.r.f(f0Var, "builder");
        f0Var.e(cVar.o(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public f0 k(int[] iArr) {
        ae.r.f(iArr, "<this>");
        return new f0(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ze.d dVar, int[] iArr, int i10) {
        ae.r.f(dVar, "encoder");
        ae.r.f(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.y(getDescriptor(), i11, iArr[i11]);
        }
    }
}
