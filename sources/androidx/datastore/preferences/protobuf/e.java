package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.z;
import com.google.android.gms.common.api.a;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class e implements y0 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3543a;

        static {
            int[] iArr = new int[k1.b.values().length];
            f3543a = iArr;
            try {
                iArr[k1.b.f3670j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3543a[k1.b.f3674n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3543a[k1.b.f3663c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3543a[k1.b.f3676p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3543a[k1.b.f3669i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3543a[k1.b.f3668h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3543a[k1.b.f3664d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3543a[k1.b.f3667g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3543a[k1.b.f3665e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3543a[k1.b.f3673m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3543a[k1.b.f3677q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3543a[k1.b.f3678r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3543a[k1.b.f3679s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3543a[k1.b.f3680t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3543a[k1.b.f3671k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3543a[k1.b.f3675o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3543a[k1.b.f3666f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f3544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f3545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f3547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f3549f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f3550g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super(null);
            this.f3544a = z10;
            this.f3545b = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f3546c = iArrayOffset;
            this.f3547d = iArrayOffset;
            this.f3548e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            return this.f3546c == this.f3548e;
        }

        private byte S() throws z {
            int i10 = this.f3546c;
            if (i10 == this.f3548e) {
                throw z.k();
            }
            byte[] bArr = this.f3545b;
            this.f3546c = i10 + 1;
            return bArr[i10];
        }

        private Object T(k1.b bVar, Class<?> cls, o oVar) {
            switch (a.f3543a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(j());
                case 2:
                    return D();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(t());
                case 5:
                    return Integer.valueOf(i());
                case 6:
                    return Long.valueOf(d());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(F());
                case 9:
                    return Long.valueOf(M());
                case 10:
                    return e(cls, oVar);
                case 11:
                    return Integer.valueOf(I());
                case 12:
                    return Long.valueOf(k());
                case 13:
                    return Integer.valueOf(w());
                case 14:
                    return Long.valueOf(x());
                case 15:
                    return N();
                case 16:
                    return Integer.valueOf(n());
                case 17:
                    return Long.valueOf(c());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T U(z0<T> z0Var, o oVar) {
            int i10 = this.f3550g;
            this.f3550g = k1.c(k1.a(this.f3549f), 4);
            try {
                T tH = z0Var.h();
                z0Var.b(tH, this, oVar);
                z0Var.c(tH);
                if (this.f3549f == this.f3550g) {
                    return tH;
                }
                throw z.g();
            } finally {
                this.f3550g = i10;
            }
        }

        private int V() throws z {
            f0(4);
            return W();
        }

        private int W() {
            int i10 = this.f3546c;
            byte[] bArr = this.f3545b;
            this.f3546c = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        private long X() throws z {
            f0(8);
            return Y();
        }

        private long Y() {
            int i10 = this.f3546c;
            byte[] bArr = this.f3545b;
            this.f3546c = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        private <T> T Z(z0<T> z0Var, o oVar) throws z {
            int iC0 = c0();
            f0(iC0);
            int i10 = this.f3548e;
            int i11 = this.f3546c + iC0;
            this.f3548e = i11;
            try {
                T tH = z0Var.h();
                z0Var.b(tH, this, oVar);
                z0Var.c(tH);
                if (this.f3546c == i11) {
                    return tH;
                }
                throw z.g();
            } finally {
                this.f3548e = i10;
            }
        }

        private int c0() throws z {
            int i10;
            int i11 = this.f3546c;
            int i12 = this.f3548e;
            if (i12 == i11) {
                throw z.k();
            }
            byte[] bArr = this.f3545b;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f3546c = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return (int) e0();
            }
            int i14 = i13 + 1;
            int i15 = b10 ^ (bArr[i13] << 7);
            if (i15 < 0) {
                i10 = i15 ^ (-128);
            } else {
                int i16 = i14 + 1;
                int i17 = i15 ^ (bArr[i14] << 14);
                if (i17 >= 0) {
                    i10 = i17 ^ 16256;
                } else {
                    i14 = i16 + 1;
                    int i18 = i17 ^ (bArr[i16] << 21);
                    if (i18 < 0) {
                        i10 = i18 ^ (-2080896);
                    } else {
                        i16 = i14 + 1;
                        byte b11 = bArr[i14];
                        i10 = (i18 ^ (b11 << 28)) ^ 266354560;
                        if (b11 < 0) {
                            i14 = i16 + 1;
                            if (bArr[i16] < 0) {
                                i16 = i14 + 1;
                                if (bArr[i14] < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                throw z.e();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i14 = i16;
            }
            this.f3546c = i14;
            return i10;
        }

        private long e0() throws z {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bS = S();
                j10 |= ((long) (bS & 127)) << i10;
                if ((bS & 128) == 0) {
                    return j10;
                }
            }
            throw z.e();
        }

        private void f0(int i10) throws z {
            if (i10 < 0 || i10 > this.f3548e - this.f3546c) {
                throw z.k();
            }
        }

        private void g0(int i10) throws z {
            if (this.f3546c != i10) {
                throw z.k();
            }
        }

        private void h0(int i10) throws z.a {
            if (k1.b(this.f3549f) != i10) {
                throw z.d();
            }
        }

        private void i0(int i10) throws z {
            f0(i10);
            this.f3546c += i10;
        }

        private void j0() throws z {
            int i10 = this.f3550g;
            this.f3550g = k1.c(k1.a(this.f3549f), 4);
            while (A() != Integer.MAX_VALUE && H()) {
            }
            if (this.f3549f != this.f3550g) {
                throw z.g();
            }
            this.f3550g = i10;
        }

        private void k0() throws z {
            int i10 = this.f3548e;
            int i11 = this.f3546c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f3545b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f3546c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            l0();
        }

        private void l0() throws z {
            for (int i10 = 0; i10 < 10; i10++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw z.e();
        }

        private void m0(int i10) throws z {
            f0(i10);
            if ((i10 & 3) != 0) {
                throw z.g();
            }
        }

        private void n0(int i10) throws z {
            f0(i10);
            if ((i10 & 7) != 0) {
                throw z.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public int A() throws z {
            if (R()) {
                return a.e.API_PRIORITY_OTHER;
            }
            int iC0 = c0();
            this.f3549f = iC0;
            return iC0 == this.f3550g ? a.e.API_PRIORITY_OTHER : k1.a(iC0);
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void B(List<String> list) throws z.a {
            b0(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void C(List<String> list) throws z.a {
            b0(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public g D() throws z {
            h0(2);
            int iC0 = c0();
            if (iC0 == 0) {
                return g.f3561b;
            }
            f0(iC0);
            g gVarF = this.f3544a ? g.F(this.f3545b, this.f3546c, iC0) : g.l(this.f3545b, this.f3546c, iC0);
            this.f3546c += iC0;
            return gVarF;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void E(List<Float> list) throws z {
            int i10;
            int i11;
            if (!(list instanceof u)) {
                int iB = k1.b(this.f3549f);
                if (iB == 2) {
                    int iC0 = c0();
                    m0(iC0);
                    int i12 = this.f3546c + iC0;
                    while (this.f3546c < i12) {
                        list.add(Float.valueOf(Float.intBitsToFloat(W())));
                    }
                    return;
                }
                if (iB != 5) {
                    throw z.d();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f3546c;
                    }
                } while (c0() == this.f3549f);
                this.f3546c = i10;
                return;
            }
            u uVar = (u) list;
            int iB2 = k1.b(this.f3549f);
            if (iB2 == 2) {
                int iC02 = c0();
                m0(iC02);
                int i13 = this.f3546c + iC02;
                while (this.f3546c < i13) {
                    uVar.f(Float.intBitsToFloat(W()));
                }
                return;
            }
            if (iB2 != 5) {
                throw z.d();
            }
            do {
                uVar.f(readFloat());
                if (R()) {
                    return;
                } else {
                    i11 = this.f3546c;
                }
            } while (c0() == this.f3549f);
            this.f3546c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public int F() throws z.a {
            h0(0);
            return c0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.y0
        public <T> void G(List<T> list, z0<T> z0Var, o oVar) throws z.a {
            int i10;
            if (k1.b(this.f3549f) != 3) {
                throw z.d();
            }
            int i11 = this.f3549f;
            do {
                list.add(U(z0Var, oVar));
                if (R()) {
                    return;
                } else {
                    i10 = this.f3546c;
                }
            } while (c0() == i11);
            this.f3546c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public boolean H() throws z {
            int i10;
            int iC0;
            if (R() || (i10 = this.f3549f) == this.f3550g) {
                return false;
            }
            int iB = k1.b(i10);
            if (iB == 0) {
                k0();
                return true;
            }
            if (iB == 1) {
                iC0 = 8;
            } else if (iB == 2) {
                iC0 = c0();
            } else {
                if (iB == 3) {
                    j0();
                    return true;
                }
                if (iB != 5) {
                    throw z.d();
                }
                iC0 = 4;
            }
            i0(iC0);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public int I() throws z.a {
            h0(5);
            return V();
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void J(List<g> list) throws z.a {
            int i10;
            if (k1.b(this.f3549f) != 2) {
                throw z.d();
            }
            do {
                list.add(D());
                if (R()) {
                    return;
                } else {
                    i10 = this.f3546c;
                }
            } while (c0() == this.f3549f);
            this.f3546c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void K(List<Double> list) throws z {
            int i10;
            int i11;
            if (!(list instanceof l)) {
                int iB = k1.b(this.f3549f);
                if (iB == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f3546c;
                        }
                    } while (c0() == this.f3549f);
                    this.f3546c = i10;
                    return;
                }
                if (iB != 2) {
                    throw z.d();
                }
                int iC0 = c0();
                n0(iC0);
                int i12 = this.f3546c + iC0;
                while (this.f3546c < i12) {
                    list.add(Double.valueOf(Double.longBitsToDouble(Y())));
                }
                return;
            }
            l lVar = (l) list;
            int iB2 = k1.b(this.f3549f);
            if (iB2 == 1) {
                do {
                    lVar.f(readDouble());
                    if (R()) {
                        return;
                    } else {
                        i11 = this.f3546c;
                    }
                } while (c0() == this.f3549f);
                this.f3546c = i11;
                return;
            }
            if (iB2 != 2) {
                throw z.d();
            }
            int iC02 = c0();
            n0(iC02);
            int i13 = this.f3546c + iC02;
            while (this.f3546c < i13) {
                lVar.f(Double.longBitsToDouble(Y()));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.y0
        public <T> void L(List<T> list, z0<T> z0Var, o oVar) throws z.a {
            int i10;
            if (k1.b(this.f3549f) != 2) {
                throw z.d();
            }
            int i11 = this.f3549f;
            do {
                list.add(Z(z0Var, oVar));
                if (R()) {
                    return;
                } else {
                    i10 = this.f3546c;
                }
            } while (c0() == i11);
            this.f3546c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public long M() throws z.a {
            h0(0);
            return d0();
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public String N() {
            return a0(true);
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void O(List<Long> list) throws z {
            int i10;
            int i11;
            if (!(list instanceof e0)) {
                int iB = k1.b(this.f3549f);
                if (iB == 1) {
                    do {
                        list.add(Long.valueOf(d()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f3546c;
                        }
                    } while (c0() == this.f3549f);
                    this.f3546c = i10;
                    return;
                }
                if (iB != 2) {
                    throw z.d();
                }
                int iC0 = c0();
                n0(iC0);
                int i12 = this.f3546c + iC0;
                while (this.f3546c < i12) {
                    list.add(Long.valueOf(Y()));
                }
                return;
            }
            e0 e0Var = (e0) list;
            int iB2 = k1.b(this.f3549f);
            if (iB2 == 1) {
                do {
                    e0Var.k(d());
                    if (R()) {
                        return;
                    } else {
                        i11 = this.f3546c;
                    }
                } while (c0() == this.f3549f);
                this.f3546c = i11;
                return;
            }
            if (iB2 != 2) {
                throw z.d();
            }
            int iC02 = c0();
            n0(iC02);
            int i13 = this.f3546c + iC02;
            while (this.f3546c < i13) {
                e0Var.k(Y());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public <T> T P(z0<T> z0Var, o oVar) throws z.a {
            h0(3);
            return (T) U(z0Var, oVar);
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public <T> T a(z0<T> z0Var, o oVar) throws z.a {
            h0(2);
            return (T) Z(z0Var, oVar);
        }

        public String a0(boolean z10) throws z {
            h0(2);
            int iC0 = c0();
            if (iC0 == 0) {
                return "";
            }
            f0(iC0);
            if (z10) {
                byte[] bArr = this.f3545b;
                int i10 = this.f3546c;
                if (!j1.n(bArr, i10, i10 + iC0)) {
                    throw z.c();
                }
            }
            String str = new String(this.f3545b, this.f3546c, iC0, y.f3779a);
            this.f3546c += iC0;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void b(List<Integer> list) throws z {
            int i10;
            int i11;
            if (!(list instanceof x)) {
                int iB = k1.b(this.f3549f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw z.d();
                    }
                    int iC0 = this.f3546c + c0();
                    while (this.f3546c < iC0) {
                        list.add(Integer.valueOf(h.b(c0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(w()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f3546c;
                    }
                } while (c0() == this.f3549f);
                this.f3546c = i10;
                return;
            }
            x xVar = (x) list;
            int iB2 = k1.b(this.f3549f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw z.d();
                }
                int iC02 = this.f3546c + c0();
                while (this.f3546c < iC02) {
                    xVar.f(h.b(c0()));
                }
                return;
            }
            do {
                xVar.f(w());
                if (R()) {
                    return;
                } else {
                    i11 = this.f3546c;
                }
            } while (c0() == this.f3549f);
            this.f3546c = i11;
        }

        public void b0(List<String> list, boolean z10) throws z.a {
            int i10;
            int i11;
            if (k1.b(this.f3549f) != 2) {
                throw z.d();
            }
            if (!(list instanceof e4.d) || z10) {
                do {
                    list.add(a0(z10));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f3546c;
                    }
                } while (c0() == this.f3549f);
                this.f3546c = i10;
                return;
            }
            e4.d dVar = (e4.d) list;
            do {
                dVar.c(D());
                if (R()) {
                    return;
                } else {
                    i11 = this.f3546c;
                }
            } while (c0() == this.f3549f);
            this.f3546c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public long c() throws z.a {
            h0(0);
            return d0();
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public long d() throws z.a {
            h0(1);
            return X();
        }

        public long d0() throws z {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f3546c;
            int i12 = this.f3548e;
            if (i12 == i11) {
                throw z.k();
            }
            byte[] bArr = this.f3545b;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f3546c = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return e0();
            }
            int i14 = i13 + 1;
            int i15 = b10 ^ (bArr[i13] << 7);
            if (i15 >= 0) {
                int i16 = i14 + 1;
                int i17 = i15 ^ (bArr[i14] << 14);
                if (i17 >= 0) {
                    i14 = i16;
                    j10 = i17 ^ 16256;
                } else {
                    i14 = i16 + 1;
                    int i18 = i17 ^ (bArr[i16] << 21);
                    if (i18 < 0) {
                        i10 = i18 ^ (-2080896);
                    } else {
                        long j13 = i18;
                        int i19 = i14 + 1;
                        long j14 = j13 ^ (((long) bArr[i14]) << 28);
                        if (j14 >= 0) {
                            j12 = 266354560;
                        } else {
                            i14 = i19 + 1;
                            long j15 = j14 ^ (((long) bArr[i19]) << 35);
                            if (j15 < 0) {
                                j11 = -34093383808L;
                            } else {
                                i19 = i14 + 1;
                                j14 = j15 ^ (((long) bArr[i14]) << 42);
                                if (j14 >= 0) {
                                    j12 = 4363953127296L;
                                } else {
                                    i14 = i19 + 1;
                                    j15 = j14 ^ (((long) bArr[i19]) << 49);
                                    if (j15 < 0) {
                                        j11 = -558586000294016L;
                                    } else {
                                        int i20 = i14 + 1;
                                        long j16 = (j15 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                        if (j16 < 0) {
                                            i14 = i20 + 1;
                                            if (bArr[i20] < 0) {
                                                throw z.e();
                                            }
                                        } else {
                                            i14 = i20;
                                        }
                                        j10 = j16;
                                    }
                                }
                            }
                            j10 = j15 ^ j11;
                        }
                        j10 = j14 ^ j12;
                        i14 = i19;
                    }
                }
                this.f3546c = i14;
                return j10;
            }
            i10 = i15 ^ (-128);
            j10 = i10;
            this.f3546c = i14;
            return j10;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public <T> T e(Class<T> cls, o oVar) throws z.a {
            h0(2);
            return (T) Z(v0.a().d(cls), oVar);
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void f(List<Integer> list) throws z {
            int i10;
            int i11;
            if (!(list instanceof x)) {
                int iB = k1.b(this.f3549f);
                if (iB == 2) {
                    int iC0 = c0();
                    m0(iC0);
                    int i12 = this.f3546c + iC0;
                    while (this.f3546c < i12) {
                        list.add(Integer.valueOf(W()));
                    }
                    return;
                }
                if (iB != 5) {
                    throw z.d();
                }
                do {
                    list.add(Integer.valueOf(I()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f3546c;
                    }
                } while (c0() == this.f3549f);
                this.f3546c = i10;
                return;
            }
            x xVar = (x) list;
            int iB2 = k1.b(this.f3549f);
            if (iB2 == 2) {
                int iC02 = c0();
                m0(iC02);
                int i13 = this.f3546c + iC02;
                while (this.f3546c < i13) {
                    xVar.f(W());
                }
                return;
            }
            if (iB2 != 5) {
                throw z.d();
            }
            do {
                xVar.f(I());
                if (R()) {
                    return;
                } else {
                    i11 = this.f3546c;
                }
            } while (c0() == this.f3549f);
            this.f3546c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void g(List<Long> list) throws z {
            int i10;
            int i11;
            if (!(list instanceof e0)) {
                int iB = k1.b(this.f3549f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw z.d();
                    }
                    int iC0 = this.f3546c + c0();
                    while (this.f3546c < iC0) {
                        list.add(Long.valueOf(h.c(d0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(x()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f3546c;
                    }
                } while (c0() == this.f3549f);
                this.f3546c = i10;
                return;
            }
            e0 e0Var = (e0) list;
            int iB2 = k1.b(this.f3549f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw z.d();
                }
                int iC02 = this.f3546c + c0();
                while (this.f3546c < iC02) {
                    e0Var.k(h.c(d0()));
                }
                return;
            }
            do {
                e0Var.k(x());
                if (R()) {
                    return;
                } else {
                    i11 = this.f3546c;
                }
            } while (c0() == this.f3549f);
            this.f3546c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void h(List<Integer> list) throws z {
            int i10;
            int i11;
            if (!(list instanceof x)) {
                int iB = k1.b(this.f3549f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw z.d();
                    }
                    int iC0 = this.f3546c + c0();
                    while (this.f3546c < iC0) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(n()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f3546c;
                    }
                } while (c0() == this.f3549f);
                this.f3546c = i10;
                return;
            }
            x xVar = (x) list;
            int iB2 = k1.b(this.f3549f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw z.d();
                }
                int iC02 = this.f3546c + c0();
                while (this.f3546c < iC02) {
                    xVar.f(c0());
                }
                return;
            }
            do {
                xVar.f(n());
                if (R()) {
                    return;
                } else {
                    i11 = this.f3546c;
                }
            } while (c0() == this.f3549f);
            this.f3546c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public int i() throws z.a {
            h0(5);
            return V();
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public boolean j() throws z.a {
            h0(0);
            return c0() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public long k() throws z.a {
            h0(1);
            return X();
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void l(List<Long> list) throws z {
            int i10;
            int iC0;
            int i11;
            if (list instanceof e0) {
                e0 e0Var = (e0) list;
                int iB = k1.b(this.f3549f);
                if (iB == 0) {
                    do {
                        e0Var.k(c());
                        if (R()) {
                            return;
                        } else {
                            i11 = this.f3546c;
                        }
                    } while (c0() == this.f3549f);
                    this.f3546c = i11;
                    return;
                }
                if (iB != 2) {
                    throw z.d();
                }
                iC0 = this.f3546c + c0();
                while (this.f3546c < iC0) {
                    e0Var.k(d0());
                }
            } else {
                int iB2 = k1.b(this.f3549f);
                if (iB2 == 0) {
                    do {
                        list.add(Long.valueOf(c()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f3546c;
                        }
                    } while (c0() == this.f3549f);
                    this.f3546c = i10;
                    return;
                }
                if (iB2 != 2) {
                    throw z.d();
                }
                iC0 = this.f3546c + c0();
                while (this.f3546c < iC0) {
                    list.add(Long.valueOf(d0()));
                }
            }
            g0(iC0);
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public <T> T m(Class<T> cls, o oVar) throws z.a {
            h0(3);
            return (T) U(v0.a().d(cls), oVar);
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public int n() throws z.a {
            h0(0);
            return c0();
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void o(List<Long> list) throws z {
            int i10;
            int iC0;
            int i11;
            if (list instanceof e0) {
                e0 e0Var = (e0) list;
                int iB = k1.b(this.f3549f);
                if (iB == 0) {
                    do {
                        e0Var.k(M());
                        if (R()) {
                            return;
                        } else {
                            i11 = this.f3546c;
                        }
                    } while (c0() == this.f3549f);
                    this.f3546c = i11;
                    return;
                }
                if (iB != 2) {
                    throw z.d();
                }
                iC0 = this.f3546c + c0();
                while (this.f3546c < iC0) {
                    e0Var.k(d0());
                }
            } else {
                int iB2 = k1.b(this.f3549f);
                if (iB2 == 0) {
                    do {
                        list.add(Long.valueOf(M()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f3546c;
                        }
                    } while (c0() == this.f3549f);
                    this.f3546c = i10;
                    return;
                }
                if (iB2 != 2) {
                    throw z.d();
                }
                iC0 = this.f3546c + c0();
                while (this.f3546c < iC0) {
                    list.add(Long.valueOf(d0()));
                }
            }
            g0(iC0);
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void p(List<Long> list) throws z {
            int i10;
            int i11;
            if (!(list instanceof e0)) {
                int iB = k1.b(this.f3549f);
                if (iB == 1) {
                    do {
                        list.add(Long.valueOf(k()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f3546c;
                        }
                    } while (c0() == this.f3549f);
                    this.f3546c = i10;
                    return;
                }
                if (iB != 2) {
                    throw z.d();
                }
                int iC0 = c0();
                n0(iC0);
                int i12 = this.f3546c + iC0;
                while (this.f3546c < i12) {
                    list.add(Long.valueOf(Y()));
                }
                return;
            }
            e0 e0Var = (e0) list;
            int iB2 = k1.b(this.f3549f);
            if (iB2 == 1) {
                do {
                    e0Var.k(k());
                    if (R()) {
                        return;
                    } else {
                        i11 = this.f3546c;
                    }
                } while (c0() == this.f3549f);
                this.f3546c = i11;
                return;
            }
            if (iB2 != 2) {
                throw z.d();
            }
            int iC02 = c0();
            n0(iC02);
            int i13 = this.f3546c + iC02;
            while (this.f3546c < i13) {
                e0Var.k(Y());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void q(List<Integer> list) throws z {
            int i10;
            int iC0;
            int i11;
            if (list instanceof x) {
                x xVar = (x) list;
                int iB = k1.b(this.f3549f);
                if (iB == 0) {
                    do {
                        xVar.f(F());
                        if (R()) {
                            return;
                        } else {
                            i11 = this.f3546c;
                        }
                    } while (c0() == this.f3549f);
                    this.f3546c = i11;
                    return;
                }
                if (iB != 2) {
                    throw z.d();
                }
                iC0 = this.f3546c + c0();
                while (this.f3546c < iC0) {
                    xVar.f(c0());
                }
            } else {
                int iB2 = k1.b(this.f3549f);
                if (iB2 == 0) {
                    do {
                        list.add(Integer.valueOf(F()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f3546c;
                        }
                    } while (c0() == this.f3549f);
                    this.f3546c = i10;
                    return;
                }
                if (iB2 != 2) {
                    throw z.d();
                }
                iC0 = this.f3546c + c0();
                while (this.f3546c < iC0) {
                    list.add(Integer.valueOf(c0()));
                }
            }
            g0(iC0);
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void r(List<Integer> list) throws z {
            int i10;
            int i11;
            if (!(list instanceof x)) {
                int iB = k1.b(this.f3549f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw z.d();
                    }
                    int iC0 = this.f3546c + c0();
                    while (this.f3546c < iC0) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(t()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f3546c;
                    }
                } while (c0() == this.f3549f);
                this.f3546c = i10;
                return;
            }
            x xVar = (x) list;
            int iB2 = k1.b(this.f3549f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw z.d();
                }
                int iC02 = this.f3546c + c0();
                while (this.f3546c < iC02) {
                    xVar.f(c0());
                }
                return;
            }
            do {
                xVar.f(t());
                if (R()) {
                    return;
                } else {
                    i11 = this.f3546c;
                }
            } while (c0() == this.f3549f);
            this.f3546c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public double readDouble() throws z.a {
            h0(1);
            return Double.longBitsToDouble(X());
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public float readFloat() throws z.a {
            h0(5);
            return Float.intBitsToFloat(V());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.y0
        public <K, V> void s(Map<K, V> map, g0.a<K, V> aVar, o oVar) throws z {
            h0(2);
            int iC0 = c0();
            f0(iC0);
            int i10 = this.f3548e;
            this.f3548e = this.f3546c + iC0;
            try {
                Object objT = aVar.f3577b;
                Object objT2 = aVar.f3579d;
                while (true) {
                    int iA = A();
                    if (iA == Integer.MAX_VALUE) {
                        map.put(objT, objT2);
                        return;
                    }
                    if (iA == 1) {
                        objT = T(aVar.f3576a, null, null);
                    } else if (iA != 2) {
                        try {
                            if (!H()) {
                                throw new z("Unable to parse map entry.");
                            }
                        } catch (z.a unused) {
                            if (!H()) {
                                throw new z("Unable to parse map entry.");
                            }
                        }
                    } else {
                        objT2 = T(aVar.f3578c, aVar.f3579d.getClass(), oVar);
                    }
                }
            } finally {
                this.f3548e = i10;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public int t() throws z.a {
            h0(0);
            return c0();
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public int u() {
            return this.f3549f;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void v(List<Integer> list) throws z {
            int i10;
            int i11;
            if (!(list instanceof x)) {
                int iB = k1.b(this.f3549f);
                if (iB == 2) {
                    int iC0 = c0();
                    m0(iC0);
                    int i12 = this.f3546c + iC0;
                    while (this.f3546c < i12) {
                        list.add(Integer.valueOf(W()));
                    }
                    return;
                }
                if (iB != 5) {
                    throw z.d();
                }
                do {
                    list.add(Integer.valueOf(i()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f3546c;
                    }
                } while (c0() == this.f3549f);
                this.f3546c = i10;
                return;
            }
            x xVar = (x) list;
            int iB2 = k1.b(this.f3549f);
            if (iB2 == 2) {
                int iC02 = c0();
                m0(iC02);
                int i13 = this.f3546c + iC02;
                while (this.f3546c < i13) {
                    xVar.f(W());
                }
                return;
            }
            if (iB2 != 5) {
                throw z.d();
            }
            do {
                xVar.f(i());
                if (R()) {
                    return;
                } else {
                    i11 = this.f3546c;
                }
            } while (c0() == this.f3549f);
            this.f3546c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public int w() throws z.a {
            h0(0);
            return h.b(c0());
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public long x() throws z.a {
            h0(0);
            return h.c(d0());
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public void y(List<Boolean> list) throws z {
            int i10;
            int iC0;
            int i11;
            if (list instanceof f) {
                f fVar = (f) list;
                int iB = k1.b(this.f3549f);
                if (iB == 0) {
                    do {
                        fVar.k(j());
                        if (R()) {
                            return;
                        } else {
                            i11 = this.f3546c;
                        }
                    } while (c0() == this.f3549f);
                    this.f3546c = i11;
                    return;
                }
                if (iB != 2) {
                    throw z.d();
                }
                iC0 = this.f3546c + c0();
                while (this.f3546c < iC0) {
                    fVar.k(c0() != 0);
                }
            } else {
                int iB2 = k1.b(this.f3549f);
                if (iB2 == 0) {
                    do {
                        list.add(Boolean.valueOf(j()));
                        if (R()) {
                            return;
                        } else {
                            i10 = this.f3546c;
                        }
                    } while (c0() == this.f3549f);
                    this.f3546c = i10;
                    return;
                }
                if (iB2 != 2) {
                    throw z.d();
                }
                iC0 = this.f3546c + c0();
                while (this.f3546c < iC0) {
                    list.add(Boolean.valueOf(c0() != 0));
                }
            }
            g0(iC0);
        }

        @Override // androidx.datastore.preferences.protobuf.y0
        public String z() {
            return a0(false);
        }
    }

    private e() {
    }

    /* synthetic */ e(a aVar) {
        this();
    }

    public static e Q(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
