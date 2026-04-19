package af;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends f1<Boolean, boolean[], f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f759c = new g();

    private g() {
        super(xe.a.q(ae.d.f698a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(boolean[] zArr) {
        ae.r.f(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public boolean[] r() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p, af.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ze.c cVar, int i10, f fVar, boolean z10) {
        ae.r.f(cVar, "decoder");
        ae.r.f(fVar, "builder");
        fVar.e(cVar.g(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public f k(boolean[] zArr) {
        ae.r.f(zArr, "<this>");
        return new f(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ze.d dVar, boolean[] zArr, int i10) {
        ae.r.f(dVar, "encoder");
        ae.r.f(zArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.j(getDescriptor(), i11, zArr[i11]);
        }
    }
}
