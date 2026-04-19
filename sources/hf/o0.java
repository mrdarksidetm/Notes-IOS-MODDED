package hf;

import hf.c;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f12012a = new c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f12013b = -1234567890;

    public static final boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        ae.r.f(bArr, "a");
        ae.r.f(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f12013b;
    }

    public static final c.a d() {
        return f12012a;
    }

    public static final int e(f fVar, int i10) {
        ae.r.f(fVar, "<this>");
        return i10 == f12013b ? fVar.F() : i10;
    }

    public static final int f(byte[] bArr, int i10) {
        ae.r.f(bArr, "<this>");
        return i10 == f12013b ? bArr.length : i10;
    }

    public static final c.a g(c.a aVar) {
        ae.r.f(aVar, "unsafeCursor");
        return aVar == f12012a ? new c.a() : aVar;
    }

    public static final int h(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long i(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short j(short s10) {
        int i10 = s10 & 65535;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    public static final String k(byte b10) {
        return je.v.p(new char[]{p003if.g.f()[(b10 >> 4) & 15], p003if.g.f()[b10 & 15]});
    }

    public static final String l(int i10) {
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {p003if.g.f()[(i10 >> 28) & 15], p003if.g.f()[(i10 >> 24) & 15], p003if.g.f()[(i10 >> 20) & 15], p003if.g.f()[(i10 >> 16) & 15], p003if.g.f()[(i10 >> 12) & 15], p003if.g.f()[(i10 >> 8) & 15], p003if.g.f()[(i10 >> 4) & 15], p003if.g.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return je.v.q(cArr, i11, 8);
    }
}
