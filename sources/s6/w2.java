package s6;

import s6.s2;

/* JADX INFO: loaded from: classes.dex */
public class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f20362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f20363b;

    public w2(d1 d1Var) {
        this.f20363b = d1Var;
        this.f20362a = d1Var.p();
    }

    public final void a(int i10, int i11) {
        byte[] bArr = this.f20362a;
        bArr[i10] = (byte) ((~(1 << i11)) & bArr[i10]);
    }

    public final void b(int i10, int i11, boolean z10) {
        if (z10) {
            e(i10, i11);
        } else {
            a(i10, i11);
        }
        d();
    }

    public void c(s2.a aVar, boolean z10) {
        b(aVar.f20310a, aVar.f20311b, z10);
    }

    public final void d() {
        this.f20363b.n(this.f20362a);
    }

    public final void e(int i10, int i11) {
        byte[] bArr = this.f20362a;
        bArr[i10] = (byte) ((1 << i11) | bArr[i10]);
    }
}
