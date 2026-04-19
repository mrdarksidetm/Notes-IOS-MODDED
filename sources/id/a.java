package id;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f12638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12639b;

    public a(int i10) {
        this(new byte[i10]);
    }

    public a(byte[] bArr) {
        this.f12638a = bArr;
        this.f12639b = 0;
    }

    public a(byte[] bArr, int i10) {
        this.f12638a = bArr;
        this.f12639b = i10;
    }

    @Override // id.d
    public int a() {
        return this.f12639b;
    }

    @Override // id.e
    public void b(double d10) {
        o(this.f12639b, d10);
        this.f12639b += 8;
    }

    @Override // id.e
    public void c(short s10) {
        s(this.f12639b, s10);
        this.f12639b += 2;
    }

    @Override // id.e
    public void clear() {
        this.f12639b = 0;
    }

    @Override // id.d
    public byte[] d() {
        return this.f12638a;
    }

    @Override // id.d
    public String e(int i10, int i11) {
        return g.a(this.f12638a, i10, i11);
    }

    @Override // id.e
    public int f() {
        return this.f12639b;
    }

    @Override // id.e
    public void g(float f10) {
        p(this.f12639b, f10);
        this.f12639b += 4;
    }

    @Override // id.d
    public byte get(int i10) {
        return this.f12638a[i10];
    }

    @Override // id.d
    public double getDouble(int i10) {
        return Double.longBitsToDouble(getLong(i10));
    }

    @Override // id.d
    public float getFloat(int i10) {
        return Float.intBitsToFloat(getInt(i10));
    }

    @Override // id.d
    public int getInt(int i10) {
        byte[] bArr = this.f12638a;
        return (bArr[i10] & 255) | (bArr[i10 + 3] << 24) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
    }

    @Override // id.d
    public long getLong(int i10) {
        byte[] bArr = this.f12638a;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i15 + 1;
        return j13 | ((((long) bArr[i15]) & 255) << 40) | ((255 & ((long) bArr[i16])) << 48) | (((long) bArr[i16 + 1]) << 56);
    }

    @Override // id.d
    public short getShort(int i10) {
        byte[] bArr = this.f12638a;
        return (short) ((bArr[i10] & 255) | (bArr[i10 + 1] << 8));
    }

    @Override // id.e
    public void h(int i10) {
        q(this.f12639b, i10);
        this.f12639b += 4;
    }

    @Override // id.e
    public void i(byte[] bArr, int i10, int i11) {
        n(this.f12639b, bArr, i10, i11);
        this.f12639b += i11;
    }

    @Override // id.e
    public void j(byte b10) {
        m(this.f12639b, b10);
        this.f12639b++;
    }

    @Override // id.e
    public void k(long j10) {
        r(this.f12639b, j10);
        this.f12639b += 8;
    }

    public boolean l(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Capacity may not be negative (likely a previous int overflow)");
        }
        byte[] bArr = this.f12638a;
        if (bArr.length >= i10) {
            return true;
        }
        int length = bArr.length;
        int i11 = length + (length >> 1);
        if (i11 >= i10) {
            i10 = i11;
        }
        this.f12638a = Arrays.copyOf(bArr, i10);
        return true;
    }

    public void m(int i10, byte b10) {
        l(i10 + 1);
        this.f12638a[i10] = b10;
    }

    public void n(int i10, byte[] bArr, int i11, int i12) {
        l((i12 - i11) + i10);
        System.arraycopy(bArr, i11, this.f12638a, i10, i12);
    }

    public void o(int i10, double d10) {
        l(i10 + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i11 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.f12638a;
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i11 >> 8) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i11 >> 16) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((i11 >> 24) & 255);
        int i16 = (int) (jDoubleToRawLongBits >> 32);
        int i17 = i15 + 1;
        bArr[i15] = (byte) (i16 & 255);
        int i18 = i17 + 1;
        bArr[i17] = (byte) ((i16 >> 8) & 255);
        bArr[i18] = (byte) ((i16 >> 16) & 255);
        bArr[i18 + 1] = (byte) ((i16 >> 24) & 255);
    }

    public void p(int i10, float f10) {
        l(i10 + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        byte[] bArr = this.f12638a;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (iFloatToRawIntBits & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i12] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i12 + 1] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    public void q(int i10, int i11) {
        l(i10 + 4);
        byte[] bArr = this.f12638a;
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i11 >> 8) & 255);
        bArr[i13] = (byte) ((i11 >> 16) & 255);
        bArr[i13 + 1] = (byte) ((i11 >> 24) & 255);
    }

    public void r(int i10, long j10) {
        l(i10 + 8);
        int i11 = (int) j10;
        byte[] bArr = this.f12638a;
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i11 >> 8) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i11 >> 16) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((i11 >> 24) & 255);
        int i16 = (int) (j10 >> 32);
        int i17 = i15 + 1;
        bArr[i15] = (byte) (i16 & 255);
        int i18 = i17 + 1;
        bArr[i17] = (byte) ((i16 >> 8) & 255);
        bArr[i18] = (byte) ((i16 >> 16) & 255);
        bArr[i18 + 1] = (byte) ((i16 >> 24) & 255);
    }

    public void s(int i10, short s10) {
        l(i10 + 2);
        byte[] bArr = this.f12638a;
        bArr[i10] = (byte) (s10 & 255);
        bArr[i10 + 1] = (byte) ((s10 >> 8) & 255);
    }
}
