package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f3586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    i f3589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3590e;

    private static final class b extends h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final byte[] f3591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f3592g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f3593h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f3594i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f3595j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f3596k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f3597l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f3598m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f3599n;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f3599n = a.e.API_PRIORITY_OTHER;
            this.f3591f = bArr;
            this.f3593h = i11 + i10;
            this.f3595j = i10;
            this.f3596k = i10;
            this.f3592g = z10;
        }

        private void M() {
            int i10 = this.f3593h + this.f3594i;
            this.f3593h = i10;
            int i11 = i10 - this.f3596k;
            int i12 = this.f3599n;
            if (i11 <= i12) {
                this.f3594i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f3594i = i13;
            this.f3593h = i10 - i13;
        }

        private void P() throws z {
            if (this.f3593h - this.f3595j >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() throws z {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f3591f;
                int i11 = this.f3595j;
                this.f3595j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw z.e();
        }

        private void R() throws z {
            for (int i10 = 0; i10 < 10; i10++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw z.e();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws z {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f3593h;
                int i11 = this.f3595j;
                if (iJ <= i10 - i11) {
                    String strE = j1.e(this.f3591f, i11, iJ);
                    this.f3595j += iJ;
                    return strE;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ <= 0) {
                throw z.f();
            }
            throw z.k();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int B() throws z {
            if (e()) {
                this.f3597l = 0;
                return 0;
            }
            int iJ = J();
            this.f3597l = iJ;
            if (k1.a(iJ) != 0) {
                return this.f3597l;
            }
            throw z.b();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long D() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean E(int i10) throws z {
            int iB = k1.b(i10);
            if (iB == 0) {
                P();
                return true;
            }
            if (iB == 1) {
                O(8);
                return true;
            }
            if (iB == 2) {
                O(J());
                return true;
            }
            if (iB == 3) {
                N();
                a(k1.c(k1.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw z.d();
            }
            O(4);
            return true;
        }

        public byte F() throws z {
            int i10 = this.f3595j;
            if (i10 == this.f3593h) {
                throw z.k();
            }
            byte[] bArr = this.f3591f;
            this.f3595j = i10 + 1;
            return bArr[i10];
        }

        public byte[] G(int i10) throws z {
            if (i10 > 0) {
                int i11 = this.f3593h;
                int i12 = this.f3595j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f3595j = i13;
                    return Arrays.copyOfRange(this.f3591f, i12, i13);
                }
            }
            if (i10 > 0) {
                throw z.k();
            }
            if (i10 == 0) {
                return y.f3781c;
            }
            throw z.f();
        }

        public int H() throws z {
            int i10 = this.f3595j;
            if (this.f3593h - i10 < 4) {
                throw z.k();
            }
            byte[] bArr = this.f3591f;
            this.f3595j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long I() throws z {
            int i10 = this.f3595j;
            if (this.f3593h - i10 < 8) {
                throw z.k();
            }
            byte[] bArr = this.f3591f;
            this.f3595j = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int J() {
            /*
                r5 = this;
                int r0 = r5.f3595j
                int r1 = r5.f3593h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f3591f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f3595j = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.L()
                int r0 = (int) r0
                return r0
            L70:
                r5.f3595j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.b.J():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long K() {
            /*
                r11 = this;
                int r0 = r11.f3595j
                int r1 = r11.f3593h
                if (r1 != r0) goto L8
                goto Lb6
            L8:
                byte[] r2 = r11.f3591f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L14
                r11.f3595j = r3
                long r0 = (long) r0
                return r0
            L14:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L1b
                goto Lb6
            L1b:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L29
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            L26:
                long r2 = (long) r0
                goto Lbd
            L29:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto Lbd
            L3a:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L48
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L26
            L48:
                long r3 = (long) r0
                int r0 = r1 + 1
                r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L5f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L5b:
                long r2 = r3 ^ r1
                r1 = r0
                goto Lbd
            L5f:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L74
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L71:
                long r2 = r3 ^ r5
                goto Lbd
            L74:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L87
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L5b
            L87:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L9a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L71
            L9a:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto Lbb
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto Lbc
            Lb6:
                long r0 = r11.L()
                return r0
            Lbb:
                r1 = r0
            Lbc:
                r2 = r3
            Lbd:
                r11.f3595j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.b.K():long");
        }

        long L() throws z {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bF = F();
                j10 |= ((long) (bF & 127)) << i10;
                if ((bF & 128) == 0) {
                    return j10;
                }
            }
            throw z.e();
        }

        public void N() throws z {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void O(int i10) throws z {
            if (i10 >= 0) {
                int i11 = this.f3593h;
                int i12 = this.f3595j;
                if (i10 <= i11 - i12) {
                    this.f3595j = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw z.k();
            }
            throw z.f();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i10) throws z {
            if (this.f3597l != i10) {
                throw z.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int d() {
            return this.f3595j - this.f3596k;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean e() {
            return this.f3595j == this.f3593h;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void k(int i10) {
            this.f3599n = i10;
            M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int l(int i10) throws z {
            if (i10 < 0) {
                throw z.f();
            }
            int iD = i10 + d();
            int i11 = this.f3599n;
            if (iD > i11) {
                throw z.k();
            }
            this.f3599n = iD;
            M();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean m() {
            return K() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g n() {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f3593h;
                int i11 = this.f3595j;
                if (iJ <= i10 - i11) {
                    g gVarF = (this.f3592g && this.f3598m) ? g.F(this.f3591f, i11, iJ) : g.l(this.f3591f, i11, iJ);
                    this.f3595j += iJ;
                    return gVarF;
                }
            }
            return iJ == 0 ? g.f3561b : g.E(G(iJ));
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int p() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long r() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int t() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long u() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int v() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long w() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int x() {
            return h.b(J());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long y() {
            return h.c(K());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String z() throws z {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f3593h;
                int i11 = this.f3595j;
                if (iJ <= i10 - i11) {
                    String str = new String(this.f3591f, i11, iJ, y.f3779a);
                    this.f3595j += iJ;
                    return str;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw z.f();
            }
            throw z.k();
        }
    }

    private static final class c extends h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InputStream f3600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f3601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f3602h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f3603i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f3604j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f3605k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f3606l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f3607m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a f3608n;

        private interface a {
            void a();
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f3607m = a.e.API_PRIORITY_OTHER;
            this.f3608n = null;
            y.b(inputStream, "input");
            this.f3600f = inputStream;
            this.f3601g = new byte[i10];
            this.f3602h = 0;
            this.f3604j = 0;
            this.f3606l = 0;
        }

        private g F(int i10) throws IOException {
            byte[] bArrI = I(i10);
            if (bArrI != null) {
                return g.k(bArrI);
            }
            int i11 = this.f3604j;
            int i12 = this.f3602h;
            int length = i12 - i11;
            this.f3606l += i12;
            this.f3604j = 0;
            this.f3602h = 0;
            List<byte[]> listJ = J(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f3601g, i11, bArr, 0, length);
            for (byte[] bArr2 : listJ) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return g.E(bArr);
        }

        private byte[] H(int i10, boolean z10) throws IOException {
            byte[] bArrI = I(i10);
            if (bArrI != null) {
                return z10 ? (byte[]) bArrI.clone() : bArrI;
            }
            int i11 = this.f3604j;
            int i12 = this.f3602h;
            int length = i12 - i11;
            this.f3606l += i12;
            this.f3604j = 0;
            this.f3602h = 0;
            List<byte[]> listJ = J(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f3601g, i11, bArr, 0, length);
            for (byte[] bArr2 : listJ) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] I(int i10) throws IOException {
            if (i10 == 0) {
                return y.f3781c;
            }
            if (i10 < 0) {
                throw z.f();
            }
            int i11 = this.f3606l;
            int i12 = this.f3604j;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f3588c > 0) {
                throw z.j();
            }
            int i14 = this.f3607m;
            if (i13 > i14) {
                S((i14 - i11) - i12);
                throw z.k();
            }
            int i15 = this.f3602h - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > this.f3600f.available()) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f3601g, this.f3604j, bArr, 0, i15);
            this.f3606l += this.f3602h;
            this.f3604j = 0;
            this.f3602h = 0;
            while (i15 < i10) {
                int i17 = this.f3600f.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw z.k();
                }
                this.f3606l += i17;
                i15 += i17;
            }
            return bArr;
        }

        private List<byte[]> J(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f3600f.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw z.k();
                    }
                    this.f3606l += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void P() {
            int i10 = this.f3602h + this.f3603i;
            this.f3602h = i10;
            int i11 = this.f3606l + i10;
            int i12 = this.f3607m;
            if (i11 <= i12) {
                this.f3603i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f3603i = i13;
            this.f3602h = i10 - i13;
        }

        private void Q(int i10) throws z {
            if (X(i10)) {
                return;
            }
            if (i10 <= (this.f3588c - this.f3606l) - this.f3604j) {
                throw z.k();
            }
            throw z.j();
        }

        private void T(int i10) throws z {
            if (i10 < 0) {
                throw z.f();
            }
            int i11 = this.f3606l;
            int i12 = this.f3604j;
            int i13 = i11 + i12 + i10;
            int i14 = this.f3607m;
            if (i13 > i14) {
                S((i14 - i11) - i12);
                throw z.k();
            }
            int i15 = 0;
            if (this.f3608n == null) {
                this.f3606l = i11 + i12;
                int i16 = this.f3602h - i12;
                this.f3602h = 0;
                this.f3604j = 0;
                i15 = i16;
                while (i15 < i10) {
                    try {
                        long j10 = i10 - i15;
                        long jSkip = this.f3600f.skip(j10);
                        if (jSkip < 0 || jSkip > j10) {
                            throw new IllegalStateException(this.f3600f.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i15 += (int) jSkip;
                        }
                    } finally {
                        this.f3606l += i15;
                        P();
                    }
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i17 = this.f3602h;
            int i18 = i17 - this.f3604j;
            this.f3604j = i17;
            while (true) {
                Q(1);
                int i19 = i10 - i18;
                int i20 = this.f3602h;
                if (i19 <= i20) {
                    this.f3604j = i19;
                    return;
                } else {
                    i18 += i20;
                    this.f3604j = i20;
                }
            }
        }

        private void U() throws z {
            if (this.f3602h - this.f3604j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() throws z {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f3601g;
                int i11 = this.f3604j;
                this.f3604j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw z.e();
        }

        private void W() throws z {
            for (int i10 = 0; i10 < 10; i10++) {
                if (G() >= 0) {
                    return;
                }
            }
            throw z.e();
        }

        private boolean X(int i10) throws IOException {
            int i11 = this.f3604j;
            if (i11 + i10 <= this.f3602h) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i12 = this.f3588c;
            int i13 = this.f3606l;
            if (i10 > (i12 - i13) - i11 || i13 + i11 + i10 > this.f3607m) {
                return false;
            }
            a aVar = this.f3608n;
            if (aVar != null) {
                aVar.a();
            }
            int i14 = this.f3604j;
            if (i14 > 0) {
                int i15 = this.f3602h;
                if (i15 > i14) {
                    byte[] bArr = this.f3601g;
                    System.arraycopy(bArr, i14, bArr, 0, i15 - i14);
                }
                this.f3606l += i14;
                this.f3602h -= i14;
                this.f3604j = 0;
            }
            InputStream inputStream = this.f3600f;
            byte[] bArr2 = this.f3601g;
            int i16 = this.f3602h;
            int i17 = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f3588c - this.f3606l) - i16));
            if (i17 == 0 || i17 < -1 || i17 > this.f3601g.length) {
                throw new IllegalStateException(this.f3600f.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
            }
            if (i17 <= 0) {
                return false;
            }
            this.f3602h += i17;
            P();
            if (this.f3602h >= i10) {
                return true;
            }
            return X(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws IOException {
            byte[] bArrH;
            int iM = M();
            int i10 = this.f3604j;
            int i11 = this.f3602h;
            if (iM <= i11 - i10 && iM > 0) {
                bArrH = this.f3601g;
                this.f3604j = i10 + iM;
            } else {
                if (iM == 0) {
                    return "";
                }
                if (iM <= i11) {
                    Q(iM);
                    bArrH = this.f3601g;
                    this.f3604j = iM + 0;
                } else {
                    bArrH = H(iM, false);
                }
                i10 = 0;
            }
            return j1.e(bArrH, i10, iM);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int B() throws z {
            if (e()) {
                this.f3605k = 0;
                return 0;
            }
            int iM = M();
            this.f3605k = iM;
            if (k1.a(iM) != 0) {
                return this.f3605k;
            }
            throw z.b();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long D() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean E(int i10) throws z {
            int iB = k1.b(i10);
            if (iB == 0) {
                U();
                return true;
            }
            if (iB == 1) {
                S(8);
                return true;
            }
            if (iB == 2) {
                S(M());
                return true;
            }
            if (iB == 3) {
                R();
                a(k1.c(k1.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw z.d();
            }
            S(4);
            return true;
        }

        public byte G() throws z {
            if (this.f3604j == this.f3602h) {
                Q(1);
            }
            byte[] bArr = this.f3601g;
            int i10 = this.f3604j;
            this.f3604j = i10 + 1;
            return bArr[i10];
        }

        public int K() throws z {
            int i10 = this.f3604j;
            if (this.f3602h - i10 < 4) {
                Q(4);
                i10 = this.f3604j;
            }
            byte[] bArr = this.f3601g;
            this.f3604j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long L() throws z {
            int i10 = this.f3604j;
            if (this.f3602h - i10 < 8) {
                Q(8);
                i10 = this.f3604j;
            }
            byte[] bArr = this.f3601g;
            this.f3604j = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int M() {
            /*
                r5 = this;
                int r0 = r5.f3604j
                int r1 = r5.f3602h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f3601g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f3604j = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.O()
                int r0 = (int) r0
                return r0
            L70:
                r5.f3604j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.c.M():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long N() {
            /*
                r11 = this;
                int r0 = r11.f3604j
                int r1 = r11.f3602h
                if (r1 != r0) goto L8
                goto Lb6
            L8:
                byte[] r2 = r11.f3601g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L14
                r11.f3604j = r3
                long r0 = (long) r0
                return r0
            L14:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L1b
                goto Lb6
            L1b:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L29
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            L26:
                long r2 = (long) r0
                goto Lbd
            L29:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto Lbd
            L3a:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L48
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L26
            L48:
                long r3 = (long) r0
                int r0 = r1 + 1
                r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L5f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L5b:
                long r2 = r3 ^ r1
                r1 = r0
                goto Lbd
            L5f:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L74
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L71:
                long r2 = r3 ^ r5
                goto Lbd
            L74:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L87
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L5b
            L87:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L9a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L71
            L9a:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto Lbb
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto Lbc
            Lb6:
                long r0 = r11.O()
                return r0
            Lbb:
                r1 = r0
            Lbc:
                r2 = r3
            Lbd:
                r11.f3604j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.c.N():long");
        }

        long O() throws z {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bG = G();
                j10 |= ((long) (bG & 127)) << i10;
                if ((bG & 128) == 0) {
                    return j10;
                }
            }
            throw z.e();
        }

        public void R() throws z {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void S(int i10) throws z {
            int i11 = this.f3602h;
            int i12 = this.f3604j;
            if (i10 > i11 - i12 || i10 < 0) {
                T(i10);
            } else {
                this.f3604j = i12 + i10;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i10) throws z {
            if (this.f3605k != i10) {
                throw z.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int d() {
            return this.f3606l + this.f3604j;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean e() {
            return this.f3604j == this.f3602h && !X(1);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void k(int i10) {
            this.f3607m = i10;
            P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int l(int i10) throws z {
            if (i10 < 0) {
                throw z.f();
            }
            int i11 = i10 + this.f3606l + this.f3604j;
            int i12 = this.f3607m;
            if (i11 > i12) {
                throw z.k();
            }
            this.f3607m = i11;
            P();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean m() {
            return N() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g n() {
            int iM = M();
            int i10 = this.f3602h;
            int i11 = this.f3604j;
            if (iM > i10 - i11 || iM <= 0) {
                return iM == 0 ? g.f3561b : F(iM);
            }
            g gVarL = g.l(this.f3601g, i11, iM);
            this.f3604j += iM;
            return gVarL;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double o() {
            return Double.longBitsToDouble(L());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int p() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long r() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float s() {
            return Float.intBitsToFloat(K());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int t() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long u() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int v() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long w() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int x() {
            return h.b(M());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long y() {
            return h.c(N());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String z() throws z {
            int iM = M();
            if (iM > 0) {
                int i10 = this.f3602h;
                int i11 = this.f3604j;
                if (iM <= i10 - i11) {
                    String str = new String(this.f3601g, i11, iM, y.f3779a);
                    this.f3604j += iM;
                    return str;
                }
            }
            if (iM == 0) {
                return "";
            }
            if (iM > this.f3602h) {
                return new String(H(iM, false), y.f3779a);
            }
            Q(iM);
            String str2 = new String(this.f3601g, this.f3604j, iM, y.f3779a);
            this.f3604j += iM;
            return str2;
        }
    }

    private h() {
        this.f3587b = 100;
        this.f3588c = a.e.API_PRIORITY_OTHER;
        this.f3590e = false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static h f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static h g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? h(y.f3781c) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static h h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static h i(byte[] bArr, int i10, int i11) {
        return j(bArr, i10, i11, false);
    }

    static h j(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.l(i11);
            return bVar;
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i10);

    public abstract int l(int i10);

    public abstract boolean m();

    public abstract g n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();
}
