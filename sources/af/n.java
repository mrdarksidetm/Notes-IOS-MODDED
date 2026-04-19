package af;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends f1<Character, char[], m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f788c = new n();

    private n() {
        super(xe.a.s(ae.f.f702a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(char[] cArr) {
        ae.r.f(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] r() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p, af.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ze.c cVar, int i10, m mVar, boolean z10) {
        ae.r.f(cVar, "decoder");
        ae.r.f(mVar, "builder");
        mVar.e(cVar.e(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public m k(char[] cArr) {
        ae.r.f(cArr, "<this>");
        return new m(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ze.d dVar, char[] cArr, int i10) {
        ae.r.f(dVar, "encoder");
        ae.r.f(cArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.m(getDescriptor(), i11, cArr[i11]);
        }
    }
}
