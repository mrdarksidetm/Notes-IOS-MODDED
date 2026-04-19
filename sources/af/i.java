package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends d1<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f769b;

    public i(byte[] bArr) {
        ae.r.f(bArr, "bufferWithData");
        this.f768a = bArr;
        this.f769b = bArr.length;
        b(10);
    }

    @Override // af.d1
    public void b(int i10) {
        byte[] bArr = this.f768a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, ge.o.d(i10, bArr.length * 2));
            ae.r.e(bArrCopyOf, "copyOf(this, newSize)");
            this.f768a = bArrCopyOf;
        }
    }

    @Override // af.d1
    public int d() {
        return this.f769b;
    }

    public final void e(byte b10) {
        d1.c(this, 0, 1, null);
        byte[] bArr = this.f768a;
        int iD = d();
        this.f769b = iD + 1;
        bArr[iD] = b10;
    }

    @Override // af.d1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f768a, d());
        ae.r.e(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }
}
