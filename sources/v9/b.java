package v9;

import java.lang.reflect.Array;
import java.math.BigInteger;
import v9.a;

/* JADX INFO: loaded from: classes2.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long[] f22300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long[] f22301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long[] f22302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a.C0461a[][] f22303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final a.C0461a[] f22304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BigInteger f22305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BigInteger f22306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final BigInteger f22307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final BigInteger f22308i;

    /* JADX INFO: renamed from: v9.b$b, reason: collision with other inner class name */
    private static class C0462b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BigInteger f22309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private BigInteger f22310b;

        private C0462b() {
        }
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f22305f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f22306g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f22307h = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        f22308i = bigIntegerModPow;
        C0462b c0462b = new C0462b();
        c0462b.f22310b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        c0462b.f22309a = c(c0462b.f22310b);
        f22300a = f.c(d(bigIntegerMod));
        f22301b = f.c(d(bigIntegerMod2));
        f22302c = f.c(d(bigIntegerModPow));
        f22303d = (a.C0461a[][]) Array.newInstance((Class<?>) a.C0461a.class, 32, 8);
        C0462b c0462bA = c0462b;
        for (int i10 = 0; i10 < 32; i10++) {
            C0462b c0462bA2 = c0462bA;
            for (int i11 = 0; i11 < 8; i11++) {
                f22303d[i10][i11] = b(c0462bA2);
                c0462bA2 = a(c0462bA2, c0462bA);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                c0462bA = a(c0462bA, c0462bA);
            }
        }
        C0462b c0462bA3 = a(c0462b, c0462b);
        f22304e = new a.C0461a[8];
        for (int i13 = 0; i13 < 8; i13++) {
            f22304e[i13] = b(c0462b);
            c0462b = a(c0462b, c0462bA3);
        }
    }

    private static C0462b a(C0462b c0462b, C0462b c0462b2) {
        C0462b c0462b3 = new C0462b();
        BigInteger bigIntegerMultiply = f22306g.multiply(c0462b.f22309a.multiply(c0462b2.f22309a).multiply(c0462b.f22310b).multiply(c0462b2.f22310b));
        BigInteger bigInteger = f22305f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = c0462b.f22309a.multiply(c0462b2.f22310b).add(c0462b2.f22309a.multiply(c0462b.f22310b));
        BigInteger bigInteger2 = BigInteger.ONE;
        c0462b3.f22309a = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        c0462b3.f22310b = c0462b.f22310b.multiply(c0462b2.f22310b).add(c0462b.f22309a.multiply(c0462b2.f22309a)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return c0462b3;
    }

    private static a.C0461a b(C0462b c0462b) {
        BigInteger bigIntegerAdd = c0462b.f22310b.add(c0462b.f22309a);
        BigInteger bigInteger = f22305f;
        return new a.C0461a(f.c(d(bigIntegerAdd.mod(bigInteger))), f.c(d(c0462b.f22310b.subtract(c0462b.f22309a).mod(bigInteger))), f.c(d(f22307h.multiply(c0462b.f22309a).multiply(c0462b.f22310b).mod(bigInteger))));
    }

    private static BigInteger c(BigInteger bigInteger) {
        BigInteger bigIntegerPow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerPow.subtract(bigInteger2);
        BigInteger bigIntegerAdd = f22306g.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = f22305f;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigIntegerAdd.modInverse(bigInteger3));
        BigInteger bigIntegerModPow = bigIntegerMultiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!bigIntegerModPow.pow(2).subtract(bigIntegerMultiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            bigIntegerModPow = bigIntegerModPow.multiply(f22308i).mod(bigInteger3);
        }
        return bigIntegerModPow.testBit(0) ? bigInteger3.subtract(bigIntegerModPow) : bigIntegerModPow;
    }

    private static byte[] d(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = (32 - i10) - 1;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }
}
