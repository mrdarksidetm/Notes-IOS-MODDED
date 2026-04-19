package v9;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C0461a f22286a = new C0461a(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f22287b = new c(new d(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final byte[] f22288c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* JADX INFO: renamed from: v9.a$a, reason: collision with other inner class name */
    static class C0461a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long[] f22289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long[] f22290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long[] f22291c;

        C0461a() {
            this(new long[10], new long[10], new long[10]);
        }

        C0461a(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f22289a = jArr;
            this.f22290b = jArr2;
            this.f22291c = jArr3;
        }

        void a(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }
    }

    private static class b extends C0461a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long[] f22292d;

        b() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        b(e eVar) {
            this();
            long[] jArr = this.f22289a;
            d dVar = eVar.f22298a;
            f.n(jArr, dVar.f22296b, dVar.f22295a);
            long[] jArr2 = this.f22290b;
            d dVar2 = eVar.f22298a;
            f.m(jArr2, dVar2.f22296b, dVar2.f22295a);
            System.arraycopy(eVar.f22298a.f22297c, 0, this.f22292d, 0, 10);
            f.f(this.f22291c, eVar.f22299b, v9.b.f22301b);
        }

        b(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.f22292d = jArr3;
        }

        @Override // v9.a.C0461a
        public void a(long[] jArr, long[] jArr2) {
            f.f(jArr, jArr2, this.f22292d);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f22293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long[] f22294b;

        c() {
            this(new d(), new long[10]);
        }

        c(c cVar) {
            this.f22293a = new d(cVar.f22293a);
            this.f22294b = Arrays.copyOf(cVar.f22294b, 10);
        }

        c(d dVar, long[] jArr) {
            this.f22293a = dVar;
            this.f22294b = jArr;
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long[] f22295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long[] f22296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long[] f22297c;

        d() {
            this(new long[10], new long[10], new long[10]);
        }

        d(c cVar) {
            this();
            a(this, cVar);
        }

        d(d dVar) {
            this.f22295a = Arrays.copyOf(dVar.f22295a, 10);
            this.f22296b = Arrays.copyOf(dVar.f22296b, 10);
            this.f22297c = Arrays.copyOf(dVar.f22297c, 10);
        }

        d(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f22295a = jArr;
            this.f22296b = jArr2;
            this.f22297c = jArr3;
        }

        static d a(d dVar, c cVar) {
            f.f(dVar.f22295a, cVar.f22293a.f22295a, cVar.f22294b);
            long[] jArr = dVar.f22296b;
            d dVar2 = cVar.f22293a;
            f.f(jArr, dVar2.f22296b, dVar2.f22297c);
            f.f(dVar.f22297c, cVar.f22293a.f22297c, cVar.f22294b);
            return dVar;
        }

        byte[] b() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            f.e(jArr, this.f22297c);
            f.f(jArr2, this.f22295a, jArr);
            f.f(jArr3, this.f22296b, jArr);
            byte[] bArrA = f.a(jArr3);
            bArrA[31] = (byte) ((a.i(jArr2) << 7) ^ bArrA[31]);
            return bArrA;
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f22298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long[] f22299b;

        e() {
            this(new d(), new long[10]);
        }

        e(c cVar) {
            this();
            d(this, cVar);
        }

        e(d dVar, long[] jArr) {
            this.f22298a = dVar;
            this.f22299b = jArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e c(byte[] bArr) throws GeneralSecurityException {
            long[] jArr = new long[10];
            long[] jArrC = f.c(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            f.k(jArr4, jArrC);
            f.f(jArr5, jArr4, v9.b.f22300a);
            f.m(jArr4, jArr4, jArr2);
            f.n(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            f.k(jArr8, jArr5);
            f.f(jArr8, jArr8, jArr5);
            f.k(jArr, jArr8);
            f.f(jArr, jArr, jArr5);
            f.f(jArr, jArr, jArr4);
            a.o(jArr, jArr);
            f.f(jArr, jArr, jArr8);
            f.f(jArr, jArr, jArr4);
            f.k(jArr6, jArr);
            f.f(jArr6, jArr6, jArr5);
            f.m(jArr7, jArr6, jArr4);
            if (a.j(jArr7)) {
                f.n(jArr7, jArr6, jArr4);
                if (a.j(jArr7)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                f.f(jArr, jArr, v9.b.f22302c);
            }
            if (!a.j(jArr) && ((bArr[31] & 255) >> 7) != 0) {
                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
            }
            if (a.i(jArr) == ((bArr[31] & 255) >> 7)) {
                a.n(jArr, jArr);
            }
            f.f(jArr3, jArr, jArrC);
            return new e(new d(jArr, jArrC, jArr2), jArr3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e d(e eVar, c cVar) {
            f.f(eVar.f22298a.f22295a, cVar.f22293a.f22295a, cVar.f22294b);
            long[] jArr = eVar.f22298a.f22296b;
            d dVar = cVar.f22293a;
            f.f(jArr, dVar.f22296b, dVar.f22297c);
            f.f(eVar.f22298a.f22297c, cVar.f22293a.f22297c, cVar.f22294b);
            long[] jArr2 = eVar.f22299b;
            d dVar2 = cVar.f22293a;
            f.f(jArr2, dVar2.f22295a, dVar2.f22296b);
            return eVar;
        }
    }

    private static void e(c cVar, e eVar, C0461a c0461a) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.f22293a.f22295a;
        d dVar = eVar.f22298a;
        f.n(jArr2, dVar.f22296b, dVar.f22295a);
        long[] jArr3 = cVar.f22293a.f22296b;
        d dVar2 = eVar.f22298a;
        f.m(jArr3, dVar2.f22296b, dVar2.f22295a);
        long[] jArr4 = cVar.f22293a.f22296b;
        f.f(jArr4, jArr4, c0461a.f22290b);
        d dVar3 = cVar.f22293a;
        f.f(dVar3.f22297c, dVar3.f22295a, c0461a.f22289a);
        f.f(cVar.f22294b, eVar.f22299b, c0461a.f22291c);
        c0461a.a(cVar.f22293a.f22295a, eVar.f22298a.f22297c);
        long[] jArr5 = cVar.f22293a.f22295a;
        f.n(jArr, jArr5, jArr5);
        d dVar4 = cVar.f22293a;
        f.m(dVar4.f22295a, dVar4.f22297c, dVar4.f22296b);
        d dVar5 = cVar.f22293a;
        long[] jArr6 = dVar5.f22296b;
        f.n(jArr6, dVar5.f22297c, jArr6);
        f.n(cVar.f22293a.f22297c, jArr, cVar.f22294b);
        long[] jArr7 = cVar.f22294b;
        f.m(jArr7, jArr, jArr7);
    }

    private static d f(byte[] bArr, e eVar, byte[] bArr2) {
        b[] bVarArr = new b[8];
        bVarArr[0] = new b(eVar);
        c cVar = new c();
        h(cVar, eVar);
        e eVar2 = new e(cVar);
        for (int i10 = 1; i10 < 8; i10++) {
            e(cVar, eVar2, bVarArr[i10 - 1]);
            bVarArr[i10] = new b(new e(cVar));
        }
        byte[] bArrQ = q(bArr);
        byte[] bArrQ2 = q(bArr2);
        c cVar2 = new c(f22287b);
        e eVar3 = new e();
        int i11 = 255;
        while (i11 >= 0 && bArrQ[i11] == 0 && bArrQ2[i11] == 0) {
            i11--;
        }
        while (i11 >= 0) {
            g(cVar2, new d(cVar2));
            byte b10 = bArrQ[i11];
            if (b10 > 0) {
                e(cVar2, e.d(eVar3, cVar2), bVarArr[bArrQ[i11] / 2]);
            } else if (b10 < 0) {
                r(cVar2, e.d(eVar3, cVar2), bVarArr[(-bArrQ[i11]) / 2]);
            }
            byte b11 = bArrQ2[i11];
            if (b11 > 0) {
                e(cVar2, e.d(eVar3, cVar2), v9.b.f22304e[bArrQ2[i11] / 2]);
            } else if (b11 < 0) {
                r(cVar2, e.d(eVar3, cVar2), v9.b.f22304e[(-bArrQ2[i11]) / 2]);
            }
            i11--;
        }
        return new d(cVar2);
    }

    private static void g(c cVar, d dVar) {
        long[] jArr = new long[10];
        f.k(cVar.f22293a.f22295a, dVar.f22295a);
        f.k(cVar.f22293a.f22297c, dVar.f22296b);
        f.k(cVar.f22294b, dVar.f22297c);
        long[] jArr2 = cVar.f22294b;
        f.n(jArr2, jArr2, jArr2);
        f.n(cVar.f22293a.f22296b, dVar.f22295a, dVar.f22296b);
        f.k(jArr, cVar.f22293a.f22296b);
        d dVar2 = cVar.f22293a;
        f.n(dVar2.f22296b, dVar2.f22297c, dVar2.f22295a);
        d dVar3 = cVar.f22293a;
        long[] jArr3 = dVar3.f22297c;
        f.m(jArr3, jArr3, dVar3.f22295a);
        d dVar4 = cVar.f22293a;
        f.m(dVar4.f22295a, jArr, dVar4.f22296b);
        long[] jArr4 = cVar.f22294b;
        f.m(jArr4, jArr4, cVar.f22293a.f22297c);
    }

    private static void h(c cVar, e eVar) {
        g(cVar, eVar.f22298a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(long[] jArr) {
        return f.a(jArr)[0] & 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        f.i(jArr2);
        for (byte b10 : f.a(jArr2)) {
            if (b10 != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean k(byte[] bArr) {
        for (int i10 = 31; i10 >= 0; i10--) {
            int i11 = bArr[i10] & 255;
            int i12 = f22288c[i10] & 255;
            if (i11 != i12) {
                return i11 < i12;
            }
        }
        return false;
    }

    private static long l(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 2] & 255)) << 16) | (((long) bArr[i10]) & 255) | (((long) (bArr[i10 + 1] & 255)) << 8);
    }

    private static long m(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) | l(bArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < jArr2.length; i10++) {
            jArr[i10] = -jArr2[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        f.k(jArr3, jArr2);
        f.k(jArr4, jArr3);
        for (int i10 = 1; i10 < 2; i10++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr4, jArr2, jArr4);
        f.f(jArr3, jArr3, jArr4);
        f.k(jArr3, jArr3);
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr4, jArr3);
        for (int i11 = 1; i11 < 5; i11++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr4, jArr3);
        for (int i12 = 1; i12 < 10; i12++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr4, jArr4, jArr3);
        f.k(jArr5, jArr4);
        for (int i13 = 1; i13 < 20; i13++) {
            f.k(jArr5, jArr5);
        }
        f.f(jArr4, jArr5, jArr4);
        f.k(jArr4, jArr4);
        for (int i14 = 1; i14 < 10; i14++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr4, jArr3);
        for (int i15 = 1; i15 < 50; i15++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr4, jArr4, jArr3);
        f.k(jArr5, jArr4);
        for (int i16 = 1; i16 < 100; i16++) {
            f.k(jArr5, jArr5);
        }
        f.f(jArr4, jArr5, jArr4);
        f.k(jArr4, jArr4);
        for (int i17 = 1; i17 < 50; i17++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr3, jArr3);
        for (int i18 = 1; i18 < 2; i18++) {
            f.k(jArr3, jArr3);
        }
        f.f(jArr, jArr3, jArr2);
    }

    private static void p(byte[] bArr) {
        long jL = l(bArr, 0) & 2097151;
        long jM = (m(bArr, 2) >> 5) & 2097151;
        long jL2 = (l(bArr, 5) >> 2) & 2097151;
        long jM2 = (m(bArr, 7) >> 7) & 2097151;
        long jM3 = (m(bArr, 10) >> 4) & 2097151;
        long jL3 = (l(bArr, 13) >> 1) & 2097151;
        long jM4 = (m(bArr, 15) >> 6) & 2097151;
        long jL4 = (l(bArr, 18) >> 3) & 2097151;
        long jL5 = l(bArr, 21) & 2097151;
        long jM5 = (m(bArr, 23) >> 5) & 2097151;
        long jL6 = (l(bArr, 26) >> 2) & 2097151;
        long jM6 = (m(bArr, 28) >> 7) & 2097151;
        long jM7 = (m(bArr, 31) >> 4) & 2097151;
        long jL7 = (l(bArr, 34) >> 1) & 2097151;
        long jM8 = (m(bArr, 36) >> 6) & 2097151;
        long jL8 = (l(bArr, 39) >> 3) & 2097151;
        long jL9 = l(bArr, 42) & 2097151;
        long jM9 = (m(bArr, 44) >> 5) & 2097151;
        long jL10 = (l(bArr, 47) >> 2) & 2097151;
        long jM10 = (m(bArr, 49) >> 7) & 2097151;
        long jM11 = (m(bArr, 52) >> 4) & 2097151;
        long jL11 = (l(bArr, 55) >> 1) & 2097151;
        long jM12 = (m(bArr, 57) >> 6) & 2097151;
        long jM13 = m(bArr, 60) >> 3;
        long j10 = jL9 - (jM13 * 683901);
        long j11 = ((jM8 - (jM13 * 997805)) + (jM12 * 136657)) - (jL11 * 683901);
        long j12 = ((((jM7 + (jM13 * 470296)) + (jM12 * 654183)) - (jL11 * 997805)) + (jM11 * 136657)) - (jM10 * 683901);
        long j13 = jM4 + (jL10 * 666643);
        long j14 = jL4 + (jM10 * 666643) + (jL10 * 470296);
        long j15 = jL5 + (jM11 * 666643) + (jM10 * 470296) + (jL10 * 654183);
        long j16 = (((jM5 + (jL11 * 666643)) + (jM11 * 470296)) + (jM10 * 654183)) - (jL10 * 997805);
        long j17 = ((((jL6 + (jM12 * 666643)) + (jL11 * 470296)) + (jM11 * 654183)) - (jM10 * 997805)) + (jL10 * 136657);
        long j18 = (((((jM6 + (jM13 * 666643)) + (jM12 * 470296)) + (jL11 * 654183)) - (jM11 * 997805)) + (jM10 * 136657)) - (jL10 * 683901);
        long j19 = (j13 + 1048576) >> 21;
        long j20 = j14 + j19;
        long j21 = j13 - (j19 << 21);
        long j22 = (j15 + 1048576) >> 21;
        long j23 = j16 + j22;
        long j24 = j15 - (j22 << 21);
        long j25 = (j17 + 1048576) >> 21;
        long j26 = j18 + j25;
        long j27 = j17 - (j25 << 21);
        long j28 = (j12 + 1048576) >> 21;
        long j29 = ((((jL7 + (jM13 * 654183)) - (jM12 * 997805)) + (jL11 * 136657)) - (jM11 * 683901)) + j28;
        long j30 = j12 - (j28 << 21);
        long j31 = (j11 + 1048576) >> 21;
        long j32 = ((jL8 + (jM13 * 136657)) - (jM12 * 683901)) + j31;
        long j33 = j11 - (j31 << 21);
        long j34 = (j10 + 1048576) >> 21;
        long j35 = jM9 + j34;
        long j36 = j10 - (j34 << 21);
        long j37 = (j20 + 1048576) >> 21;
        long j38 = j24 + j37;
        long j39 = j20 - (j37 << 21);
        long j40 = (j23 + 1048576) >> 21;
        long j41 = j27 + j40;
        long j42 = j23 - (j40 << 21);
        long j43 = (j26 + 1048576) >> 21;
        long j44 = j30 + j43;
        long j45 = j26 - (j43 << 21);
        long j46 = (j29 + 1048576) >> 21;
        long j47 = j33 + j46;
        long j48 = j29 - (j46 << 21);
        long j49 = (j32 + 1048576) >> 21;
        long j50 = j36 + j49;
        long j51 = j32 - (j49 << 21);
        long j52 = j41 - (j35 * 683901);
        long j53 = ((j38 - (j35 * 997805)) + (j50 * 136657)) - (j51 * 683901);
        long j54 = ((((j21 + (j35 * 470296)) + (j50 * 654183)) - (j51 * 997805)) + (j47 * 136657)) - (j48 * 683901);
        long j55 = jL + (j44 * 666643);
        long j56 = jM + (j48 * 666643) + (j44 * 470296);
        long j57 = jL2 + (j47 * 666643) + (j48 * 470296) + (j44 * 654183);
        long j58 = (((jM2 + (j51 * 666643)) + (j47 * 470296)) + (j48 * 654183)) - (j44 * 997805);
        long j59 = ((((jM3 + (j50 * 666643)) + (j51 * 470296)) + (j47 * 654183)) - (j48 * 997805)) + (j44 * 136657);
        long j60 = (((((jL3 + (j35 * 666643)) + (j50 * 470296)) + (j51 * 654183)) - (j47 * 997805)) + (j48 * 136657)) - (j44 * 683901);
        long j61 = (j55 + 1048576) >> 21;
        long j62 = j56 + j61;
        long j63 = j55 - (j61 << 21);
        long j64 = (j57 + 1048576) >> 21;
        long j65 = j58 + j64;
        long j66 = j57 - (j64 << 21);
        long j67 = (j59 + 1048576) >> 21;
        long j68 = j60 + j67;
        long j69 = j59 - (j67 << 21);
        long j70 = (j54 + 1048576) >> 21;
        long j71 = ((((j39 + (j35 * 654183)) - (j50 * 997805)) + (j51 * 136657)) - (j47 * 683901)) + j70;
        long j72 = j54 - (j70 << 21);
        long j73 = (j53 + 1048576) >> 21;
        long j74 = ((j42 + (j35 * 136657)) - (j50 * 683901)) + j73;
        long j75 = j53 - (j73 << 21);
        long j76 = (j52 + 1048576) >> 21;
        long j77 = j45 + j76;
        long j78 = j52 - (j76 << 21);
        long j79 = (j62 + 1048576) >> 21;
        long j80 = j66 + j79;
        long j81 = j62 - (j79 << 21);
        long j82 = (j65 + 1048576) >> 21;
        long j83 = j69 + j82;
        long j84 = j65 - (j82 << 21);
        long j85 = (j68 + 1048576) >> 21;
        long j86 = j72 + j85;
        long j87 = j68 - (j85 << 21);
        long j88 = (j71 + 1048576) >> 21;
        long j89 = j75 + j88;
        long j90 = j71 - (j88 << 21);
        long j91 = (j74 + 1048576) >> 21;
        long j92 = j78 + j91;
        long j93 = j74 - (j91 << 21);
        long j94 = (j77 + 1048576) >> 21;
        long j95 = j94 + 0;
        long j96 = j63 + (j95 * 666643);
        long j97 = j81 + (j95 * 470296);
        long j98 = j80 + (j95 * 654183);
        long j99 = j84 - (j95 * 997805);
        long j100 = j83 + (j95 * 136657);
        long j101 = j87 - (j95 * 683901);
        long j102 = j96 >> 21;
        long j103 = j97 + j102;
        long j104 = j96 - (j102 << 21);
        long j105 = j103 >> 21;
        long j106 = j98 + j105;
        long j107 = j103 - (j105 << 21);
        long j108 = j106 >> 21;
        long j109 = j99 + j108;
        long j110 = j106 - (j108 << 21);
        long j111 = j109 >> 21;
        long j112 = j100 + j111;
        long j113 = j109 - (j111 << 21);
        long j114 = j112 >> 21;
        long j115 = j101 + j114;
        long j116 = j112 - (j114 << 21);
        long j117 = j115 >> 21;
        long j118 = j86 + j117;
        long j119 = j115 - (j117 << 21);
        long j120 = j118 >> 21;
        long j121 = j90 + j120;
        long j122 = j118 - (j120 << 21);
        long j123 = j121 >> 21;
        long j124 = j89 + j123;
        long j125 = j121 - (j123 << 21);
        long j126 = j124 >> 21;
        long j127 = j93 + j126;
        long j128 = j124 - (j126 << 21);
        long j129 = j127 >> 21;
        long j130 = j92 + j129;
        long j131 = j127 - (j129 << 21);
        long j132 = j130 >> 21;
        long j133 = (j77 - (j94 << 21)) + j132;
        long j134 = j130 - (j132 << 21);
        long j135 = j133 >> 21;
        long j136 = j135 + 0;
        long j137 = j133 - (j135 << 21);
        long j138 = j104 + (666643 * j136);
        long j139 = j138 >> 21;
        long j140 = j107 + (470296 * j136) + j139;
        long j141 = j138 - (j139 << 21);
        long j142 = j140 >> 21;
        long j143 = j110 + (654183 * j136) + j142;
        long j144 = j140 - (j142 << 21);
        long j145 = j143 >> 21;
        long j146 = (j113 - (997805 * j136)) + j145;
        long j147 = j143 - (j145 << 21);
        long j148 = j146 >> 21;
        long j149 = j116 + (136657 * j136) + j148;
        long j150 = j146 - (j148 << 21);
        long j151 = j149 >> 21;
        long j152 = (j119 - (j136 * 683901)) + j151;
        long j153 = j149 - (j151 << 21);
        long j154 = j152 >> 21;
        long j155 = j122 + j154;
        long j156 = j152 - (j154 << 21);
        long j157 = j155 >> 21;
        long j158 = j125 + j157;
        long j159 = j155 - (j157 << 21);
        long j160 = j158 >> 21;
        long j161 = j128 + j160;
        long j162 = j158 - (j160 << 21);
        long j163 = j161 >> 21;
        long j164 = j131 + j163;
        long j165 = j164 >> 21;
        long j166 = j134 + j165;
        long j167 = j164 - (j165 << 21);
        long j168 = j166 >> 21;
        long j169 = j137 + j168;
        long j170 = j166 - (j168 << 21);
        bArr[0] = (byte) j141;
        bArr[1] = (byte) (j141 >> 8);
        bArr[2] = (byte) ((j141 >> 16) | (j144 << 5));
        bArr[3] = (byte) (j144 >> 3);
        bArr[4] = (byte) (j144 >> 11);
        bArr[5] = (byte) ((j144 >> 19) | (j147 << 2));
        bArr[6] = (byte) (j147 >> 6);
        bArr[7] = (byte) ((j147 >> 14) | (j150 << 7));
        bArr[8] = (byte) (j150 >> 1);
        bArr[9] = (byte) (j150 >> 9);
        bArr[10] = (byte) ((j150 >> 17) | (j153 << 4));
        bArr[11] = (byte) (j153 >> 4);
        bArr[12] = (byte) (j153 >> 12);
        bArr[13] = (byte) ((j153 >> 20) | (j156 << 1));
        bArr[14] = (byte) (j156 >> 7);
        bArr[15] = (byte) ((j156 >> 15) | (j159 << 6));
        bArr[16] = (byte) (j159 >> 2);
        bArr[17] = (byte) (j159 >> 10);
        bArr[18] = (byte) ((j159 >> 18) | (j162 << 3));
        bArr[19] = (byte) (j162 >> 5);
        bArr[20] = (byte) (j162 >> 13);
        bArr[21] = (byte) (j161 - (j163 << 21));
        bArr[22] = (byte) (r11 >> 8);
        bArr[23] = (byte) ((r11 >> 16) | (j167 << 5));
        bArr[24] = (byte) (j167 >> 3);
        bArr[25] = (byte) (j167 >> 11);
        bArr[26] = (byte) ((j167 >> 19) | (j170 << 2));
        bArr[27] = (byte) (j170 >> 6);
        bArr[28] = (byte) ((j170 >> 14) | (j169 << 7));
        bArr[29] = (byte) (j169 >> 1);
        bArr[30] = (byte) (j169 >> 9);
        bArr[31] = (byte) (j169 >> 17);
    }

    private static byte[] q(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (bArr2[i12] != 0) {
                for (int i13 = 1; i13 <= 6 && (i10 = i12 + i13) < 256; i13++) {
                    byte b10 = bArr2[i10];
                    if (b10 != 0) {
                        byte b11 = bArr2[i12];
                        if ((b10 << i13) + b11 <= 15) {
                            bArr2[i12] = (byte) (b11 + (b10 << i13));
                            bArr2[i10] = 0;
                        } else if (b11 - (b10 << i13) >= -15) {
                            bArr2[i12] = (byte) (b11 - (b10 << i13));
                            while (true) {
                                if (i10 >= 256) {
                                    break;
                                }
                                if (bArr2[i10] == 0) {
                                    bArr2[i10] = 1;
                                    break;
                                }
                                bArr2[i10] = 0;
                                i10++;
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void r(c cVar, e eVar, C0461a c0461a) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.f22293a.f22295a;
        d dVar = eVar.f22298a;
        f.n(jArr2, dVar.f22296b, dVar.f22295a);
        long[] jArr3 = cVar.f22293a.f22296b;
        d dVar2 = eVar.f22298a;
        f.m(jArr3, dVar2.f22296b, dVar2.f22295a);
        long[] jArr4 = cVar.f22293a.f22296b;
        f.f(jArr4, jArr4, c0461a.f22289a);
        d dVar3 = cVar.f22293a;
        f.f(dVar3.f22297c, dVar3.f22295a, c0461a.f22290b);
        f.f(cVar.f22294b, eVar.f22299b, c0461a.f22291c);
        c0461a.a(cVar.f22293a.f22295a, eVar.f22298a.f22297c);
        long[] jArr5 = cVar.f22293a.f22295a;
        f.n(jArr, jArr5, jArr5);
        d dVar4 = cVar.f22293a;
        f.m(dVar4.f22295a, dVar4.f22297c, dVar4.f22296b);
        d dVar5 = cVar.f22293a;
        long[] jArr6 = dVar5.f22296b;
        f.n(jArr6, dVar5.f22297c, jArr6);
        f.m(cVar.f22293a.f22297c, jArr, cVar.f22294b);
        long[] jArr7 = cVar.f22294b;
        f.n(jArr7, jArr, jArr7);
    }

    static boolean s(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 32, 64);
        if (!k(bArrCopyOfRange)) {
            return false;
        }
        MessageDigest messageDigestA = v9.d.f22316e.a("SHA-512");
        messageDigestA.update(bArr2, 0, 32);
        messageDigestA.update(bArr3);
        messageDigestA.update(bArr);
        byte[] bArrDigest = messageDigestA.digest();
        p(bArrDigest);
        byte[] bArrB = f(bArrDigest, e.c(bArr3), bArrCopyOfRange).b();
        for (int i10 = 0; i10 < 32; i10++) {
            if (bArrB[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }
}
