package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.j1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends e4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f3641c = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f3642d = i1.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    k f3643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3644b;

    private static abstract class b extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f3645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f3646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3647g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3648h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f3645e = bArr;
            this.f3646f = bArr.length;
        }

        final void b1(byte b10) {
            byte[] bArr = this.f3645e;
            int i10 = this.f3647g;
            this.f3647g = i10 + 1;
            bArr[i10] = b10;
            this.f3648h++;
        }

        final void c1(int i10) {
            byte[] bArr = this.f3645e;
            int i11 = this.f3647g;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f3647g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f3648h += 4;
        }

        final void d1(long j10) {
            byte[] bArr = this.f3645e;
            int i10 = this.f3647g;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f3647g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f3648h += 8;
        }

        final void e1(int i10) {
            if (i10 >= 0) {
                g1(i10);
            } else {
                h1(i10);
            }
        }

        final void f1(int i10, int i11) {
            g1(k1.c(i10, i11));
        }

        final void g1(int i10) {
            if (!j.f3642d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f3645e;
                    int i11 = this.f3647g;
                    this.f3647g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.f3648h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f3645e;
                int i12 = this.f3647g;
                this.f3647g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f3648h++;
                return;
            }
            long j10 = this.f3647g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f3645e;
                int i13 = this.f3647g;
                this.f3647g = i13 + 1;
                i1.H(bArr3, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f3645e;
            int i14 = this.f3647g;
            this.f3647g = i14 + 1;
            i1.H(bArr4, i14, (byte) i10);
            this.f3648h += (int) (((long) this.f3647g) - j10);
        }

        final void h1(long j10) {
            if (!j.f3642d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f3645e;
                    int i10 = this.f3647g;
                    this.f3647g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.f3648h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f3645e;
                int i11 = this.f3647g;
                this.f3647g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f3648h++;
                return;
            }
            long j11 = this.f3647g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f3645e;
                int i12 = this.f3647g;
                this.f3647g = i12 + 1;
                i1.H(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f3645e;
            int i13 = this.f3647g;
            this.f3647g = i13 + 1;
            i1.H(bArr4, i13, (byte) j10);
            this.f3648h += (int) (((long) this.f3647g) - j11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final int i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f3649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f3650f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f3651g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f3652h;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f3649e = bArr;
            this.f3650f = i10;
            this.f3652h = i10;
            this.f3651g = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void E0(int i10, int i11) throws d {
            W0(i10, 0);
            F0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void F0(int i10) throws d {
            if (i10 >= 0) {
                Y0(i10);
            } else {
                a1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        final void I0(int i10, n0 n0Var, z0 z0Var) throws d {
            W0(i10, 2);
            Y0(((androidx.datastore.preferences.protobuf.a) n0Var).k(z0Var));
            z0Var.e(n0Var, this.f3643a);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void J0(n0 n0Var) throws d {
            Y0(n0Var.e());
            n0Var.f(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void K0(int i10, n0 n0Var) throws d {
            W0(1, 3);
            X0(2, i10);
            c1(3, n0Var);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void L0(int i10, g gVar) throws d {
            W0(1, 3);
            X0(2, i10);
            o0(3, gVar);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void U0(int i10, String str) throws d {
            W0(i10, 2);
            V0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void V0(String str) throws d {
            int iF;
            int i10 = this.f3652h;
            try {
                int iX = j.X(str.length() * 3);
                int iX2 = j.X(str.length());
                if (iX2 == iX) {
                    int i11 = i10 + iX2;
                    this.f3652h = i11;
                    iF = j1.f(str, this.f3649e, i11, i0());
                    this.f3652h = i10;
                    Y0((iF - i10) - iX2);
                } else {
                    Y0(j1.g(str));
                    iF = j1.f(str, this.f3649e, this.f3652h, i0());
                }
                this.f3652h = iF;
            } catch (j1.d e10) {
                this.f3652h = i10;
                d0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void W0(int i10, int i11) throws d {
            Y0(k1.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void X0(int i10, int i11) throws d {
            W0(i10, 0);
            Y0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void Y0(int i10) throws d {
            if (!j.f3642d || androidx.datastore.preferences.protobuf.d.c() || i0() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f3649e;
                        int i11 = this.f3652h;
                        this.f3652h = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3652h), Integer.valueOf(this.f3651g), 1), e10);
                    }
                }
                byte[] bArr2 = this.f3649e;
                int i12 = this.f3652h;
                this.f3652h = i12 + 1;
                bArr2[i12] = (byte) i10;
                return;
            }
            if ((i10 & (-128)) == 0) {
                byte[] bArr3 = this.f3649e;
                int i13 = this.f3652h;
                this.f3652h = i13 + 1;
                i1.H(bArr3, i13, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f3649e;
            int i14 = this.f3652h;
            this.f3652h = i14 + 1;
            i1.H(bArr4, i14, (byte) (i10 | 128));
            int i15 = i10 >>> 7;
            if ((i15 & (-128)) == 0) {
                byte[] bArr5 = this.f3649e;
                int i16 = this.f3652h;
                this.f3652h = i16 + 1;
                i1.H(bArr5, i16, (byte) i15);
                return;
            }
            byte[] bArr6 = this.f3649e;
            int i17 = this.f3652h;
            this.f3652h = i17 + 1;
            i1.H(bArr6, i17, (byte) (i15 | 128));
            int i18 = i15 >>> 7;
            if ((i18 & (-128)) == 0) {
                byte[] bArr7 = this.f3649e;
                int i19 = this.f3652h;
                this.f3652h = i19 + 1;
                i1.H(bArr7, i19, (byte) i18);
                return;
            }
            byte[] bArr8 = this.f3649e;
            int i20 = this.f3652h;
            this.f3652h = i20 + 1;
            i1.H(bArr8, i20, (byte) (i18 | 128));
            int i21 = i18 >>> 7;
            if ((i21 & (-128)) == 0) {
                byte[] bArr9 = this.f3649e;
                int i22 = this.f3652h;
                this.f3652h = i22 + 1;
                i1.H(bArr9, i22, (byte) i21);
                return;
            }
            byte[] bArr10 = this.f3649e;
            int i23 = this.f3652h;
            this.f3652h = i23 + 1;
            i1.H(bArr10, i23, (byte) (i21 | 128));
            byte[] bArr11 = this.f3649e;
            int i24 = this.f3652h;
            this.f3652h = i24 + 1;
            i1.H(bArr11, i24, (byte) (i21 >>> 7));
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void Z0(int i10, long j10) throws d {
            W0(i10, 0);
            a1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j, e4.a
        public final void a(byte[] bArr, int i10, int i11) throws d {
            b1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void a1(long j10) throws d {
            if (j.f3642d && i0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f3649e;
                    int i10 = this.f3652h;
                    this.f3652h = i10 + 1;
                    i1.H(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f3649e;
                int i11 = this.f3652h;
                this.f3652h = i11 + 1;
                i1.H(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f3649e;
                    int i12 = this.f3652h;
                    this.f3652h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3652h), Integer.valueOf(this.f3651g), 1), e10);
                }
            }
            byte[] bArr4 = this.f3649e;
            int i13 = this.f3652h;
            this.f3652h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void b1(byte[] bArr, int i10, int i11) throws d {
            try {
                System.arraycopy(bArr, i10, this.f3649e, this.f3652h, i11);
                this.f3652h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3652h), Integer.valueOf(this.f3651g), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void c0() {
        }

        public final void c1(int i10, n0 n0Var) throws d {
            W0(i10, 2);
            J0(n0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final int i0() {
            return this.f3651g - this.f3652h;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void j0(byte b10) throws d {
            try {
                byte[] bArr = this.f3649e;
                int i10 = this.f3652h;
                this.f3652h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3652h), Integer.valueOf(this.f3651g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void k0(int i10, boolean z10) throws d {
            W0(i10, 0);
            j0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void n0(byte[] bArr, int i10, int i11) throws d {
            Y0(i11);
            b1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void o0(int i10, g gVar) throws d {
            W0(i10, 2);
            p0(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void p0(g gVar) throws d {
            Y0(gVar.size());
            gVar.G(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void u0(int i10, int i11) throws d {
            W0(i10, 5);
            v0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void v0(int i10) throws d {
            try {
                byte[] bArr = this.f3649e;
                int i11 = this.f3652h;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f3652h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3652h), Integer.valueOf(this.f3651g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void w0(int i10, long j10) throws d {
            W0(i10, 1);
            x0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void x0(long j10) throws d {
            try {
                byte[] bArr = this.f3649e;
                int i10 = this.f3652h;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f3652h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3652h), Integer.valueOf(this.f3651g), 1), e10);
            }
        }
    }

    public static class d extends IOException {
        d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private static final class e extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OutputStream f3653i;

        e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f3653i = outputStream;
        }

        private void i1() throws IOException {
            this.f3653i.write(this.f3645e, 0, this.f3647g);
            this.f3647g = 0;
        }

        private void j1(int i10) throws IOException {
            if (this.f3646f - this.f3647g < i10) {
                i1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void E0(int i10, int i11) throws IOException {
            j1(20);
            f1(i10, 0);
            e1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void F0(int i10) throws IOException {
            if (i10 >= 0) {
                Y0(i10);
            } else {
                a1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        void I0(int i10, n0 n0Var, z0 z0Var) throws IOException {
            W0(i10, 2);
            m1(n0Var, z0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void J0(n0 n0Var) throws IOException {
            Y0(n0Var.e());
            n0Var.f(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void K0(int i10, n0 n0Var) throws IOException {
            W0(1, 3);
            X0(2, i10);
            l1(3, n0Var);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void L0(int i10, g gVar) throws IOException {
            W0(1, 3);
            X0(2, i10);
            o0(3, gVar);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void U0(int i10, String str) throws IOException {
            W0(i10, 2);
            V0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void V0(String str) throws IOException {
            int iG;
            try {
                int length = str.length() * 3;
                int iX = j.X(length);
                int i10 = iX + length;
                int i11 = this.f3646f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iF = j1.f(str, bArr, 0, length);
                    Y0(iF);
                    a(bArr, 0, iF);
                    return;
                }
                if (i10 > i11 - this.f3647g) {
                    i1();
                }
                int iX2 = j.X(str.length());
                int i12 = this.f3647g;
                try {
                    if (iX2 == iX) {
                        int i13 = i12 + iX2;
                        this.f3647g = i13;
                        int iF2 = j1.f(str, this.f3645e, i13, this.f3646f - i13);
                        this.f3647g = i12;
                        iG = (iF2 - i12) - iX2;
                        g1(iG);
                        this.f3647g = iF2;
                    } else {
                        iG = j1.g(str);
                        g1(iG);
                        this.f3647g = j1.f(str, this.f3645e, this.f3647g, iG);
                    }
                    this.f3648h += iG;
                } catch (j1.d e10) {
                    this.f3648h -= this.f3647g - i12;
                    this.f3647g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (j1.d e12) {
                d0(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void W0(int i10, int i11) throws IOException {
            Y0(k1.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void X0(int i10, int i11) throws IOException {
            j1(20);
            f1(i10, 0);
            g1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void Y0(int i10) throws IOException {
            j1(5);
            g1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void Z0(int i10, long j10) throws IOException {
            j1(20);
            f1(i10, 0);
            h1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j, e4.a
        public void a(byte[] bArr, int i10, int i11) throws IOException {
            k1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void a1(long j10) throws IOException {
            j1(10);
            h1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void c0() throws IOException {
            if (this.f3647g > 0) {
                i1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void j0(byte b10) throws IOException {
            if (this.f3647g == this.f3646f) {
                i1();
            }
            b1(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void k0(int i10, boolean z10) throws IOException {
            j1(11);
            f1(i10, 0);
            b1(z10 ? (byte) 1 : (byte) 0);
        }

        public void k1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f3646f;
            int i13 = this.f3647g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f3645e, i13, i11);
                this.f3647g += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.f3645e, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.f3647g = this.f3646f;
                this.f3648h += i14;
                i1();
                if (i11 <= this.f3646f) {
                    System.arraycopy(bArr, i15, this.f3645e, 0, i11);
                    this.f3647g = i11;
                } else {
                    this.f3653i.write(bArr, i15, i11);
                }
            }
            this.f3648h += i11;
        }

        public void l1(int i10, n0 n0Var) throws IOException {
            W0(i10, 2);
            J0(n0Var);
        }

        void m1(n0 n0Var, z0 z0Var) throws IOException {
            Y0(((androidx.datastore.preferences.protobuf.a) n0Var).k(z0Var));
            z0Var.e(n0Var, this.f3643a);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void n0(byte[] bArr, int i10, int i11) throws IOException {
            Y0(i11);
            k1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void o0(int i10, g gVar) throws IOException {
            W0(i10, 2);
            p0(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void p0(g gVar) throws IOException {
            Y0(gVar.size());
            gVar.G(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void u0(int i10, int i11) throws IOException {
            j1(14);
            f1(i10, 5);
            c1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void v0(int i10) throws IOException {
            j1(4);
            c1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void w0(int i10, long j10) throws IOException {
            j1(18);
            f1(i10, 1);
            d1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void x0(long j10) throws IOException {
            j1(8);
            d1(j10);
        }
    }

    private j() {
    }

    public static int A(int i10, b0 b0Var) {
        return V(i10) + B(b0Var);
    }

    public static int B(b0 b0Var) {
        return C(b0Var.b());
    }

    static int C(int i10) {
        return X(i10) + i10;
    }

    public static int D(int i10, n0 n0Var) {
        return (V(1) * 2) + W(2, i10) + E(3, n0Var);
    }

    public static int E(int i10, n0 n0Var) {
        return V(i10) + G(n0Var);
    }

    static int F(int i10, n0 n0Var, z0 z0Var) {
        return V(i10) + H(n0Var, z0Var);
    }

    public static int G(n0 n0Var) {
        return C(n0Var.e());
    }

    static int H(n0 n0Var, z0 z0Var) {
        return C(((androidx.datastore.preferences.protobuf.a) n0Var).k(z0Var));
    }

    static int I(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int J(int i10, g gVar) {
        return (V(1) * 2) + W(2, i10) + g(3, gVar);
    }

    @Deprecated
    public static int K(int i10) {
        return X(i10);
    }

    public static int L(int i10, int i11) {
        return V(i10) + M(i11);
    }

    public static int M(int i10) {
        return 4;
    }

    public static int N(int i10, long j10) {
        return V(i10) + O(j10);
    }

    public static int O(long j10) {
        return 8;
    }

    public static int P(int i10, int i11) {
        return V(i10) + Q(i11);
    }

    public static int Q(int i10) {
        return X(a0(i10));
    }

    public static int R(int i10, long j10) {
        return V(i10) + S(j10);
    }

    public static int S(long j10) {
        return Z(b0(j10));
    }

    public static int T(int i10, String str) {
        return V(i10) + U(str);
    }

    public static int U(String str) {
        int length;
        try {
            length = j1.g(str);
        } catch (j1.d unused) {
            length = str.getBytes(y.f3779a).length;
        }
        return C(length);
    }

    public static int V(int i10) {
        return X(k1.c(i10, 0));
    }

    public static int W(int i10, int i11) {
        return V(i10) + X(i11);
    }

    public static int X(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int Y(int i10, long j10) {
        return V(i10) + Z(j10);
    }

    public static int Z(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int a0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long b0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int d(int i10, boolean z10) {
        return V(i10) + e(z10);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static j f0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static int g(int i10, g gVar) {
        return V(i10) + h(gVar);
    }

    public static j g0(byte[] bArr) {
        return h0(bArr, 0, bArr.length);
    }

    public static int h(g gVar) {
        return C(gVar.size());
    }

    public static j h0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int i(int i10, double d10) {
        return V(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return V(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return V(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return V(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return V(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    @Deprecated
    static int s(int i10, n0 n0Var, z0 z0Var) {
        return (V(i10) * 2) + u(n0Var, z0Var);
    }

    @Deprecated
    public static int t(n0 n0Var) {
        return n0Var.e();
    }

    @Deprecated
    static int u(n0 n0Var, z0 z0Var) {
        return ((androidx.datastore.preferences.protobuf.a) n0Var).k(z0Var);
    }

    public static int v(int i10, int i11) {
        return V(i10) + w(i11);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return X(i10);
        }
        return 10;
    }

    public static int x(int i10, long j10) {
        return V(i10) + y(j10);
    }

    public static int y(long j10) {
        return Z(j10);
    }

    public static int z(int i10, b0 b0Var) {
        return (V(1) * 2) + W(2, i10) + A(3, b0Var);
    }

    @Deprecated
    public final void A0(int i10, n0 n0Var) {
        W0(i10, 3);
        C0(n0Var);
        W0(i10, 4);
    }

    @Deprecated
    final void B0(int i10, n0 n0Var, z0 z0Var) {
        W0(i10, 3);
        D0(n0Var, z0Var);
        W0(i10, 4);
    }

    @Deprecated
    public final void C0(n0 n0Var) {
        n0Var.f(this);
    }

    @Deprecated
    final void D0(n0 n0Var, z0 z0Var) {
        z0Var.e(n0Var, this.f3643a);
    }

    public abstract void E0(int i10, int i11);

    public abstract void F0(int i10);

    public final void G0(int i10, long j10) {
        Z0(i10, j10);
    }

    public final void H0(long j10) {
        a1(j10);
    }

    abstract void I0(int i10, n0 n0Var, z0 z0Var);

    public abstract void J0(n0 n0Var);

    public abstract void K0(int i10, n0 n0Var);

    public abstract void L0(int i10, g gVar);

    public final void M0(int i10, int i11) {
        u0(i10, i11);
    }

    public final void N0(int i10) {
        v0(i10);
    }

    public final void O0(int i10, long j10) {
        w0(i10, j10);
    }

    public final void P0(long j10) {
        x0(j10);
    }

    public final void Q0(int i10, int i11) {
        X0(i10, a0(i11));
    }

    public final void R0(int i10) {
        Y0(a0(i10));
    }

    public final void S0(int i10, long j10) {
        Z0(i10, b0(j10));
    }

    public final void T0(long j10) {
        a1(b0(j10));
    }

    public abstract void U0(int i10, String str);

    public abstract void V0(String str);

    public abstract void W0(int i10, int i11);

    public abstract void X0(int i10, int i11);

    public abstract void Y0(int i10);

    public abstract void Z0(int i10, long j10);

    @Override // e4.a
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a1(long j10);

    public final void c() {
        if (i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void c0();

    final void d0(String str, j1.d dVar) throws d {
        f3641c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(y.f3779a);
        try {
            Y0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (d e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new d(e11);
        }
    }

    boolean e0() {
        return this.f3644b;
    }

    public abstract int i0();

    public abstract void j0(byte b10);

    public abstract void k0(int i10, boolean z10);

    public final void l0(boolean z10) {
        j0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void m0(byte[] bArr) {
        n0(bArr, 0, bArr.length);
    }

    abstract void n0(byte[] bArr, int i10, int i11);

    public abstract void o0(int i10, g gVar);

    public abstract void p0(g gVar);

    public final void q0(int i10, double d10) {
        w0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void r0(double d10) {
        x0(Double.doubleToRawLongBits(d10));
    }

    public final void s0(int i10, int i11) {
        E0(i10, i11);
    }

    public final void t0(int i10) {
        F0(i10);
    }

    public abstract void u0(int i10, int i11);

    public abstract void v0(int i10);

    public abstract void w0(int i10, long j10);

    public abstract void x0(long j10);

    public final void y0(int i10, float f10) {
        u0(i10, Float.floatToRawIntBits(f10));
    }

    public final void z0(float f10) {
        v0(Float.floatToRawIntBits(f10));
    }
}
