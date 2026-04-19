package af;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends f1<Byte, byte[], i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f773c = new j();

    private j() {
        super(xe.a.r(ae.e.f700a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(byte[] bArr) {
        ae.r.f(bArr, "<this>");
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public byte[] r() {
        return new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p, af.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ze.c cVar, int i10, i iVar, boolean z10) {
        ae.r.f(cVar, "decoder");
        ae.r.f(iVar, "builder");
        iVar.e(cVar.D(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public i k(byte[] bArr) {
        ae.r.f(bArr, "<this>");
        return new i(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.f1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(ze.d dVar, byte[] bArr, int i10) {
        ae.r.f(dVar, "encoder");
        ae.r.f(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.v(getDescriptor(), i11, bArr[i11]);
        }
    }
}
