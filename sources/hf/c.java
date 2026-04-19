package hf;

import com.google.android.gms.common.api.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f11933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11934b;

    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f11935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f11936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d0 f11937c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f11939e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f11938d = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f11940f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f11941g = -1;

        public final d0 a() {
            return this.f11937c;
        }

        public final int b() {
            long j10 = this.f11938d;
            c cVar = this.f11935a;
            ae.r.c(cVar);
            if (!(j10 != cVar.size())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j11 = this.f11938d;
            return o(j11 == -1 ? 0L : j11 + ((long) (this.f11941g - this.f11940f)));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f11935a != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f11935a = null;
            w(null);
            this.f11938d = -1L;
            this.f11939e = null;
            this.f11940f = -1;
            this.f11941g = -1;
        }

        public final long l(long j10) {
            c cVar = this.f11935a;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f11936b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = cVar.size();
            int i10 = 1;
            if (j10 <= size) {
                if (!(j10 >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                }
                long j11 = size - j10;
                while (true) {
                    if (j11 <= 0) {
                        break;
                    }
                    d0 d0Var = cVar.f11933a;
                    ae.r.c(d0Var);
                    d0 d0Var2 = d0Var.f11954g;
                    ae.r.c(d0Var2);
                    int i11 = d0Var2.f11950c;
                    long j12 = i11 - d0Var2.f11949b;
                    if (j12 > j11) {
                        d0Var2.f11950c = i11 - ((int) j11);
                        break;
                    }
                    cVar.f11933a = d0Var2.b();
                    e0.b(d0Var2);
                    j11 -= j12;
                }
                w(null);
                this.f11938d = j10;
                this.f11939e = null;
                this.f11940f = -1;
                this.f11941g = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z10 = true;
                while (j13 > 0) {
                    d0 d0VarQ0 = cVar.q0(i10);
                    int iMin = (int) Math.min(j13, 8192 - d0VarQ0.f11950c);
                    d0VarQ0.f11950c += iMin;
                    j13 -= (long) iMin;
                    if (z10) {
                        w(d0VarQ0);
                        this.f11938d = size;
                        this.f11939e = d0VarQ0.f11948a;
                        int i12 = d0VarQ0.f11950c;
                        this.f11940f = i12 - iMin;
                        this.f11941g = i12;
                        z10 = false;
                    }
                    i10 = 1;
                }
            }
            cVar.n0(j10);
            return size;
        }

        public final int o(long j10) {
            d0 d0VarC;
            c cVar = this.f11935a;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j10 < -1 || j10 > cVar.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + cVar.size());
            }
            if (j10 == -1 || j10 == cVar.size()) {
                w(null);
                this.f11938d = j10;
                this.f11939e = null;
                this.f11940f = -1;
                this.f11941g = -1;
                return -1;
            }
            long j11 = 0;
            long size = cVar.size();
            d0 d0VarA = cVar.f11933a;
            if (a() != null) {
                long j12 = this.f11938d;
                int i10 = this.f11940f;
                d0 d0VarA2 = a();
                ae.r.c(d0VarA2);
                long j13 = j12 - ((long) (i10 - d0VarA2.f11949b));
                if (j13 > j10) {
                    d0VarA = a();
                    size = j13;
                    d0VarC = d0VarA;
                } else {
                    d0VarC = a();
                    j11 = j13;
                }
            } else {
                d0VarC = d0VarA;
            }
            if (size - j10 > j10 - j11) {
                while (true) {
                    ae.r.c(d0VarC);
                    int i11 = d0VarC.f11950c;
                    int i12 = d0VarC.f11949b;
                    if (j10 < ((long) (i11 - i12)) + j11) {
                        break;
                    }
                    j11 += (long) (i11 - i12);
                    d0VarC = d0VarC.f11953f;
                }
            } else {
                while (size > j10) {
                    ae.r.c(d0VarA);
                    d0VarA = d0VarA.f11954g;
                    ae.r.c(d0VarA);
                    size -= (long) (d0VarA.f11950c - d0VarA.f11949b);
                }
                j11 = size;
                d0VarC = d0VarA;
            }
            if (this.f11936b) {
                ae.r.c(d0VarC);
                if (d0VarC.f11951d) {
                    d0 d0VarF = d0VarC.f();
                    if (cVar.f11933a == d0VarC) {
                        cVar.f11933a = d0VarF;
                    }
                    d0VarC = d0VarC.c(d0VarF);
                    d0 d0Var = d0VarC.f11954g;
                    ae.r.c(d0Var);
                    d0Var.b();
                }
            }
            w(d0VarC);
            this.f11938d = j10;
            ae.r.c(d0VarC);
            this.f11939e = d0VarC.f11948a;
            int i13 = d0VarC.f11949b + ((int) (j10 - j11));
            this.f11940f = i13;
            int i14 = d0VarC.f11950c;
            this.f11941g = i14;
            return i14 - i13;
        }

        public final void w(d0 d0Var) {
            this.f11937c = d0Var;
        }
    }

    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.size(), a.e.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (c.this.size() > 0) {
                return c.this.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            ae.r.f(bArr, "sink");
            return c.this.read(bArr, i10, i11);
        }

        public String toString() {
            return c.this + ".inputStream()";
        }
    }

    public static /* synthetic */ a i0(c cVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = o0.d();
        }
        return cVar.h0(aVar);
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c clone() {
        return E();
    }

    public c A0(String str, int i10, int i11, Charset charset) {
        ae.r.f(str, "string");
        ae.r.f(charset, "charset");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
        if (ae.r.b(charset, je.d.f14191b)) {
            return C0(str, i10, i11);
        }
        String strSubstring = str.substring(i10, i11);
        ae.r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        ae.r.e(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    @Override // hf.e
    public void B(c cVar, long j10) throws EOFException {
        ae.r.f(cVar, "sink");
        if (size() >= j10) {
            cVar.v(this, j10);
        } else {
            cVar.v(this, size());
            throw new EOFException();
        }
    }

    @Override // hf.d
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public c z(String str) {
        ae.r.f(str, "string");
        return C0(str, 0, str.length());
    }

    public final long C() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        d0 d0Var = this.f11933a;
        ae.r.c(d0Var);
        d0 d0Var2 = d0Var.f11954g;
        ae.r.c(d0Var2);
        int i10 = d0Var2.f11950c;
        if (i10 < 8192 && d0Var2.f11952e) {
            size -= (long) (i10 - d0Var2.f11949b);
        }
        return size;
    }

    public c C0(String str, int i10, int i11) {
        char cCharAt;
        long size;
        long j10;
        ae.r.f(str, "string");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 128) {
                d0 d0VarQ0 = q0(1);
                byte[] bArr = d0VarQ0.f11948a;
                int i12 = d0VarQ0.f11950c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = d0VarQ0.f11950c;
                int i15 = (i12 + i10) - i14;
                d0VarQ0.f11950c = i14 + i15;
                n0(size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    d0 d0VarQ02 = q0(2);
                    byte[] bArr2 = d0VarQ02.f11948a;
                    int i16 = d0VarQ02.f11950c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    d0VarQ02.f11950c = i16 + 2;
                    size = size();
                    j10 = 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    d0 d0VarQ03 = q0(3);
                    byte[] bArr3 = d0VarQ03.f11948a;
                    int i17 = d0VarQ03.f11950c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    d0VarQ03.f11950c = i17 + 3;
                    size = size();
                    j10 = 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            d0 d0VarQ04 = q0(4);
                            byte[] bArr4 = d0VarQ04.f11948a;
                            int i20 = d0VarQ04.f11950c;
                            bArr4[i20] = (byte) ((i19 >> 18) | 240);
                            bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                            bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                            bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                            d0VarQ04.f11950c = i20 + 4;
                            n0(size() + 4);
                            i10 += 2;
                        }
                    }
                    writeByte(63);
                    i10 = i18;
                }
                n0(size + j10);
                i10++;
            }
        }
        return this;
    }

    public c D0(int i10) {
        long size;
        long j10;
        if (i10 < 128) {
            writeByte(i10);
        } else {
            if (i10 < 2048) {
                d0 d0VarQ0 = q0(2);
                byte[] bArr = d0VarQ0.f11948a;
                int i11 = d0VarQ0.f11950c;
                bArr[i11] = (byte) ((i10 >> 6) | 192);
                bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
                d0VarQ0.f11950c = i11 + 2;
                size = size();
                j10 = 2;
            } else {
                boolean z10 = false;
                if (55296 <= i10 && i10 < 57344) {
                    z10 = true;
                }
                if (z10) {
                    writeByte(63);
                } else if (i10 < 65536) {
                    d0 d0VarQ02 = q0(3);
                    byte[] bArr2 = d0VarQ02.f11948a;
                    int i12 = d0VarQ02.f11950c;
                    bArr2[i12] = (byte) ((i10 >> 12) | 224);
                    bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
                    bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
                    d0VarQ02.f11950c = i12 + 3;
                    size = size();
                    j10 = 3;
                } else {
                    if (i10 > 1114111) {
                        throw new IllegalArgumentException("Unexpected code point: 0x" + o0.l(i10));
                    }
                    d0 d0VarQ03 = q0(4);
                    byte[] bArr3 = d0VarQ03.f11948a;
                    int i13 = d0VarQ03.f11950c;
                    bArr3[i13] = (byte) ((i10 >> 18) | 240);
                    bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                    bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                    bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
                    d0VarQ03.f11950c = i13 + 4;
                    size = size();
                    j10 = 4;
                }
            }
            n0(size + j10);
        }
        return this;
    }

    public final c E() {
        c cVar = new c();
        if (size() != 0) {
            d0 d0Var = this.f11933a;
            ae.r.c(d0Var);
            d0 d0VarD = d0Var.d();
            cVar.f11933a = d0VarD;
            d0VarD.f11954g = d0VarD;
            d0VarD.f11953f = d0VarD;
            for (d0 d0Var2 = d0Var.f11953f; d0Var2 != d0Var; d0Var2 = d0Var2.f11953f) {
                d0 d0Var3 = d0VarD.f11954g;
                ae.r.c(d0Var3);
                ae.r.c(d0Var2);
                d0Var3.c(d0Var2.d());
            }
            cVar.n0(size());
        }
        return cVar;
    }

    @Override // hf.e
    public boolean F(long j10) {
        return this.f11934b >= j10;
    }

    public final c G(c cVar, long j10, long j11) {
        ae.r.f(cVar, "out");
        o0.b(size(), j10, j11);
        if (j11 != 0) {
            cVar.n0(cVar.size() + j11);
            d0 d0Var = this.f11933a;
            while (true) {
                ae.r.c(d0Var);
                int i10 = d0Var.f11950c;
                int i11 = d0Var.f11949b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                d0Var = d0Var.f11953f;
            }
            while (j11 > 0) {
                ae.r.c(d0Var);
                d0 d0VarD = d0Var.d();
                int i12 = d0VarD.f11949b + ((int) j10);
                d0VarD.f11949b = i12;
                d0VarD.f11950c = Math.min(i12 + ((int) j11), d0VarD.f11950c);
                d0 d0Var2 = cVar.f11933a;
                if (d0Var2 == null) {
                    d0VarD.f11954g = d0VarD;
                    d0VarD.f11953f = d0VarD;
                    cVar.f11933a = d0VarD;
                } else {
                    ae.r.c(d0Var2);
                    d0 d0Var3 = d0Var2.f11954g;
                    ae.r.c(d0Var3);
                    d0Var3.c(d0VarD);
                }
                j11 -= (long) (d0VarD.f11950c - d0VarD.f11949b);
                d0Var = d0Var.f11953f;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // hf.d
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public c n() {
        return this;
    }

    @Override // hf.d
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public c s() {
        return this;
    }

    @Override // hf.e
    public String J() {
        return u(Long.MAX_VALUE);
    }

    @Override // hf.e
    public int K() {
        return o0.h(readInt());
    }

    public final byte L(long j10) {
        o0.b(size(), j10, 1L);
        d0 d0Var = this.f11933a;
        if (d0Var == null) {
            ae.r.c(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                d0Var = d0Var.f11954g;
                ae.r.c(d0Var);
                size -= (long) (d0Var.f11950c - d0Var.f11949b);
            }
            ae.r.c(d0Var);
            return d0Var.f11948a[(int) ((((long) d0Var.f11949b) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (d0Var.f11950c - d0Var.f11949b)) + j11;
            if (j12 > j10) {
                ae.r.c(d0Var);
                return d0Var.f11948a[(int) ((((long) d0Var.f11949b) + j10) - j11)];
            }
            d0Var = d0Var.f11953f;
            ae.r.c(d0Var);
            j11 = j12;
        }
    }

    public long M(byte b10, long j10, long j11) {
        d0 d0Var;
        int i10;
        long size = 0;
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (d0Var = this.f11933a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                d0Var = d0Var.f11954g;
                ae.r.c(d0Var);
                size -= (long) (d0Var.f11950c - d0Var.f11949b);
            }
            while (size < j11) {
                byte[] bArr = d0Var.f11948a;
                int iMin = (int) Math.min(d0Var.f11950c, (((long) d0Var.f11949b) + j11) - size);
                i10 = (int) ((((long) d0Var.f11949b) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (d0Var.f11950c - d0Var.f11949b);
                d0Var = d0Var.f11953f;
                ae.r.c(d0Var);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (d0Var.f11950c - d0Var.f11949b)) + size;
            if (j12 > j10) {
                break;
            }
            d0Var = d0Var.f11953f;
            ae.r.c(d0Var);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = d0Var.f11948a;
            int iMin2 = (int) Math.min(d0Var.f11950c, (((long) d0Var.f11949b) + j11) - size);
            i10 = (int) ((((long) d0Var.f11949b) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (d0Var.f11950c - d0Var.f11949b);
            d0Var = d0Var.f11953f;
            ae.r.c(d0Var);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - d0Var.f11949b)) + size;
    }

    @Override // hf.e
    public byte[] O(long j10) throws EOFException {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    public long P(f fVar) {
        ae.r.f(fVar, "bytes");
        return Q(fVar, 0L);
    }

    public long Q(f fVar, long j10) {
        long j11 = j10;
        ae.r.f(fVar, "bytes");
        if (!(fVar.F() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j12 = 0;
        if (!(j11 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        d0 d0Var = this.f11933a;
        if (d0Var != null) {
            if (size() - j11 < j11) {
                long size = size();
                while (size > j11) {
                    d0Var = d0Var.f11954g;
                    ae.r.c(d0Var);
                    size -= (long) (d0Var.f11950c - d0Var.f11949b);
                }
                byte[] bArrT = fVar.t();
                byte b10 = bArrT[0];
                int iF = fVar.F();
                long size2 = (size() - ((long) iF)) + 1;
                while (size < size2) {
                    byte[] bArr = d0Var.f11948a;
                    long j13 = size;
                    int iMin = (int) Math.min(d0Var.f11950c, (((long) d0Var.f11949b) + size2) - size);
                    for (int i10 = (int) ((((long) d0Var.f11949b) + j11) - j13); i10 < iMin; i10++) {
                        if (bArr[i10] == b10 && p003if.f.c(d0Var, i10 + 1, bArrT, 1, iF)) {
                            return ((long) (i10 - d0Var.f11949b)) + j13;
                        }
                    }
                    size = j13 + ((long) (d0Var.f11950c - d0Var.f11949b));
                    d0Var = d0Var.f11953f;
                    ae.r.c(d0Var);
                    j11 = size;
                }
            } else {
                while (true) {
                    long j14 = ((long) (d0Var.f11950c - d0Var.f11949b)) + j12;
                    if (j14 > j11) {
                        break;
                    }
                    d0Var = d0Var.f11953f;
                    ae.r.c(d0Var);
                    j12 = j14;
                }
                byte[] bArrT2 = fVar.t();
                byte b11 = bArrT2[0];
                int iF2 = fVar.F();
                long size3 = (size() - ((long) iF2)) + 1;
                while (j12 < size3) {
                    byte[] bArr2 = d0Var.f11948a;
                    long j15 = size3;
                    int iMin2 = (int) Math.min(d0Var.f11950c, (((long) d0Var.f11949b) + size3) - j12);
                    for (int i11 = (int) ((((long) d0Var.f11949b) + j11) - j12); i11 < iMin2; i11++) {
                        if (bArr2[i11] == b11 && p003if.f.c(d0Var, i11 + 1, bArrT2, 1, iF2)) {
                            return ((long) (i11 - d0Var.f11949b)) + j12;
                        }
                    }
                    j12 += (long) (d0Var.f11950c - d0Var.f11949b);
                    d0Var = d0Var.f11953f;
                    ae.r.c(d0Var);
                    j11 = j12;
                    size3 = j15;
                }
            }
        }
        return -1L;
    }

    @Override // hf.e
    public long R(g0 g0Var) {
        ae.r.f(g0Var, "sink");
        long size = size();
        if (size > 0) {
            g0Var.v(this, size);
        }
        return size;
    }

    @Override // hf.d
    public long T(i0 i0Var) {
        ae.r.f(i0Var, "source");
        long j10 = 0;
        while (true) {
            long jX = i0Var.X(this, 8192L);
            if (jX == -1) {
                return j10;
            }
            j10 += jX;
        }
    }

    public long U(f fVar) {
        ae.r.f(fVar, "targetBytes");
        return Y(fVar, 0L);
    }

    @Override // hf.e
    public short V() {
        return o0.j(readShort());
    }

    @Override // hf.e
    public long W() {
        return o0.i(readLong());
    }

    @Override // hf.i0
    public long X(c cVar, long j10) {
        ae.r.f(cVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        cVar.v(this, j10);
        return j10;
    }

    public long Y(f fVar, long j10) {
        int i10;
        ae.r.f(fVar, "targetBytes");
        long size = 0;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        d0 d0Var = this.f11933a;
        if (d0Var == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                d0Var = d0Var.f11954g;
                ae.r.c(d0Var);
                size -= (long) (d0Var.f11950c - d0Var.f11949b);
            }
            if (fVar.F() == 2) {
                byte bJ = fVar.j(0);
                byte bJ2 = fVar.j(1);
                while (size < size()) {
                    byte[] bArr = d0Var.f11948a;
                    i10 = (int) ((((long) d0Var.f11949b) + j10) - size);
                    int i11 = d0Var.f11950c;
                    while (i10 < i11) {
                        byte b10 = bArr[i10];
                        if (b10 != bJ && b10 != bJ2) {
                            i10++;
                        }
                    }
                    size += (long) (d0Var.f11950c - d0Var.f11949b);
                    d0Var = d0Var.f11953f;
                    ae.r.c(d0Var);
                    j10 = size;
                }
                return -1L;
            }
            byte[] bArrT = fVar.t();
            while (size < size()) {
                byte[] bArr2 = d0Var.f11948a;
                i10 = (int) ((((long) d0Var.f11949b) + j10) - size);
                int i12 = d0Var.f11950c;
                while (i10 < i12) {
                    byte b11 = bArr2[i10];
                    for (byte b12 : bArrT) {
                        if (b11 != b12) {
                        }
                    }
                    i10++;
                }
                size += (long) (d0Var.f11950c - d0Var.f11949b);
                d0Var = d0Var.f11953f;
                ae.r.c(d0Var);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (d0Var.f11950c - d0Var.f11949b)) + size;
            if (j11 > j10) {
                break;
            }
            d0Var = d0Var.f11953f;
            ae.r.c(d0Var);
            size = j11;
        }
        if (fVar.F() == 2) {
            byte bJ3 = fVar.j(0);
            byte bJ4 = fVar.j(1);
            while (size < size()) {
                byte[] bArr3 = d0Var.f11948a;
                i10 = (int) ((((long) d0Var.f11949b) + j10) - size);
                int i13 = d0Var.f11950c;
                while (i10 < i13) {
                    byte b13 = bArr3[i10];
                    if (b13 != bJ3 && b13 != bJ4) {
                        i10++;
                    }
                }
                size += (long) (d0Var.f11950c - d0Var.f11949b);
                d0Var = d0Var.f11953f;
                ae.r.c(d0Var);
                j10 = size;
            }
            return -1L;
        }
        byte[] bArrT2 = fVar.t();
        while (size < size()) {
            byte[] bArr4 = d0Var.f11948a;
            i10 = (int) ((((long) d0Var.f11949b) + j10) - size);
            int i14 = d0Var.f11950c;
            while (i10 < i14) {
                byte b14 = bArr4[i10];
                for (byte b15 : bArrT2) {
                    if (b14 != b15) {
                    }
                }
                i10++;
            }
            size += (long) (d0Var.f11950c - d0Var.f11949b);
            d0Var = d0Var.f11953f;
            ae.r.c(d0Var);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - d0Var.f11949b)) + size;
    }

    public boolean Z(long j10, f fVar) {
        ae.r.f(fVar, "bytes");
        return g0(j10, fVar, 0, fVar.F());
    }

    public final void b() throws EOFException {
        skip(size());
    }

    @Override // hf.e
    public void b0(long j10) throws EOFException {
        if (this.f11934b < j10) {
            throw new EOFException();
        }
    }

    @Override // hf.e
    public String c(long j10) throws EOFException {
        return l0(j10, je.d.f14191b);
    }

    @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // hf.e, hf.d
    public c d() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[EDGE_INSN: B:44:0x00aa->B:38:0x00aa BREAK  A[LOOP:0: B:5:0x000d->B:46:?], SYNTHETIC] */
    @Override // hf.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long d0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb4
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            hf.d0 r6 = r14.f11933a
            ae.r.c(r6)
            byte[] r7 = r6.f11948a
            int r8 = r6.f11949b
            int r9 = r6.f11950c
        L18:
            if (r8 >= r9) goto L96
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3f
        L27:
            r11 = 97
            if (r10 < r11) goto L34
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L34
            int r11 = r10 + (-97)
        L31:
            int r11 = r11 + 10
            goto L3f
        L34:
            r11 = 65
            if (r10 < r11) goto L77
            r11 = 70
            if (r10 > r11) goto L77
            int r11 = r10 + (-65)
            goto L31
        L3f:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4f
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4f:
            hf.c r0 = new hf.c
            r0.<init>()
            hf.c r0 = r0.D(r4)
            hf.c r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.m0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L77:
            if (r0 == 0) goto L7b
            r1 = 1
            goto L96
        L7b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = hf.o0.k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L96:
            if (r8 != r9) goto La2
            hf.d0 r7 = r6.b()
            r14.f11933a = r7
            hf.e0.b(r6)
            goto La4
        La2:
            r6.f11949b = r8
        La4:
            if (r1 != 0) goto Laa
            hf.d0 r6 = r14.f11933a
            if (r6 != 0) goto Ld
        Laa:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.n0(r1)
            return r4
        Lb4:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.c.d0():long");
    }

    @Override // hf.i0
    public j0 e() {
        return j0.f11991e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (size() != cVar.size()) {
                return false;
            }
            if (size() != 0) {
                d0 d0Var = this.f11933a;
                ae.r.c(d0Var);
                d0 d0Var2 = cVar.f11933a;
                ae.r.c(d0Var2);
                int i10 = d0Var.f11949b;
                int i11 = d0Var2.f11949b;
                long j10 = 0;
                while (j10 < size()) {
                    long jMin = Math.min(d0Var.f11950c - i10, d0Var2.f11950c - i11);
                    long j11 = 0;
                    while (j11 < jMin) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (d0Var.f11948a[i10] != d0Var2.f11948a[i11]) {
                            return false;
                        }
                        j11++;
                        i10 = i12;
                        i11 = i13;
                    }
                    if (i10 == d0Var.f11950c) {
                        d0Var = d0Var.f11953f;
                        ae.r.c(d0Var);
                        i10 = d0Var.f11949b;
                    }
                    if (i11 == d0Var2.f11950c) {
                        d0Var2 = d0Var2.f11953f;
                        ae.r.c(d0Var2);
                        i11 = d0Var2.f11949b;
                    }
                    j10 += jMin;
                }
            }
        }
        return true;
    }

    @Override // hf.e
    public InputStream f0() {
        return new b();
    }

    @Override // hf.d, hf.g0, java.io.Flushable
    public void flush() {
    }

    public boolean g0(long j10, f fVar, int i10, int i11) {
        ae.r.f(fVar, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || size() - j10 < i11 || fVar.F() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (L(((long) i12) + j10) != fVar.j(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public final a h0(a aVar) {
        ae.r.f(aVar, "unsafeCursor");
        return p003if.f.a(this, aVar);
    }

    public int hashCode() {
        d0 d0Var = this.f11933a;
        if (d0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = d0Var.f11950c;
            for (int i12 = d0Var.f11949b; i12 < i11; i12++) {
                i10 = (i10 * 31) + d0Var.f11948a[i12];
            }
            d0Var = d0Var.f11953f;
            ae.r.c(d0Var);
        } while (d0Var != this.f11933a);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // hf.e
    public f j(long j10) throws EOFException {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new f(O(j10));
        }
        f fVarP0 = p0((int) j10);
        skip(j10);
        return fVarP0;
    }

    public byte[] j0() {
        return O(size());
    }

    public f k0() {
        return j(size());
    }

    public String l0(long j10, Charset charset) throws EOFException {
        ae.r.f(charset, "charset");
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f11934b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        d0 d0Var = this.f11933a;
        ae.r.c(d0Var);
        int i10 = d0Var.f11949b;
        if (((long) i10) + j10 > d0Var.f11950c) {
            return new String(O(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(d0Var.f11948a, i10, i11, charset);
        int i12 = d0Var.f11949b + i11;
        d0Var.f11949b = i12;
        this.f11934b -= j10;
        if (i12 == d0Var.f11950c) {
            this.f11933a = d0Var.b();
            e0.b(d0Var);
        }
        return str;
    }

    @Override // hf.e
    public int m(x xVar) throws EOFException {
        ae.r.f(xVar, "options");
        int iF = p003if.f.f(this, xVar, false, 2, null);
        if (iF == -1) {
            return -1;
        }
        skip(xVar.l()[iF].F());
        return iF;
    }

    public String m0() {
        return l0(this.f11934b, je.d.f14191b);
    }

    public final void n0(long j10) {
        this.f11934b = j10;
    }

    public final f o0() {
        if (size() <= 2147483647L) {
            return p0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final f p0(int i10) {
        if (i10 == 0) {
            return f.f11961e;
        }
        o0.b(size(), 0L, i10);
        d0 d0Var = this.f11933a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            ae.r.c(d0Var);
            int i14 = d0Var.f11950c;
            int i15 = d0Var.f11949b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            d0Var = d0Var.f11953f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        d0 d0Var2 = this.f11933a;
        int i16 = 0;
        while (i11 < i10) {
            ae.r.c(d0Var2);
            bArr[i16] = d0Var2.f11948a;
            i11 += d0Var2.f11950c - d0Var2.f11949b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = d0Var2.f11949b;
            d0Var2.f11951d = true;
            i16++;
            d0Var2 = d0Var2.f11953f;
        }
        return new f0(bArr, iArr);
    }

    @Override // hf.e
    public e peek() {
        return u.d(new a0(this));
    }

    @Override // hf.e
    public boolean q() {
        return this.f11934b == 0;
    }

    public final d0 q0(int i10) {
        if (!(i10 >= 1 && i10 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        d0 d0Var = this.f11933a;
        if (d0Var != null) {
            ae.r.c(d0Var);
            d0 d0Var2 = d0Var.f11954g;
            ae.r.c(d0Var2);
            return (d0Var2.f11950c + i10 > 8192 || !d0Var2.f11952e) ? d0Var2.c(e0.c()) : d0Var2;
        }
        d0 d0VarC = e0.c();
        this.f11933a = d0VarC;
        d0VarC.f11954g = d0VarC;
        d0VarC.f11953f = d0VarC;
        return d0VarC;
    }

    @Override // hf.d
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public c g(f fVar) {
        ae.r.f(fVar, "byteString");
        fVar.L(this, 0, fVar.F());
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        ae.r.f(byteBuffer, "sink");
        d0 d0Var = this.f11933a;
        if (d0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), d0Var.f11950c - d0Var.f11949b);
        byteBuffer.put(d0Var.f11948a, d0Var.f11949b, iMin);
        int i10 = d0Var.f11949b + iMin;
        d0Var.f11949b = i10;
        this.f11934b -= (long) iMin;
        if (i10 == d0Var.f11950c) {
            this.f11933a = d0Var.b();
            e0.b(d0Var);
        }
        return iMin;
    }

    public int read(byte[] bArr, int i10, int i11) {
        ae.r.f(bArr, "sink");
        o0.b(bArr.length, i10, i11);
        d0 d0Var = this.f11933a;
        if (d0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, d0Var.f11950c - d0Var.f11949b);
        byte[] bArr2 = d0Var.f11948a;
        int i12 = d0Var.f11949b;
        nd.o.d(bArr2, bArr, i10, i12, i12 + iMin);
        d0Var.f11949b += iMin;
        n0(size() - ((long) iMin));
        if (d0Var.f11949b == d0Var.f11950c) {
            this.f11933a = d0Var.b();
            e0.b(d0Var);
        }
        return iMin;
    }

    @Override // hf.e
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        d0 d0Var = this.f11933a;
        ae.r.c(d0Var);
        int i10 = d0Var.f11949b;
        int i11 = d0Var.f11950c;
        int i12 = i10 + 1;
        byte b10 = d0Var.f11948a[i10];
        n0(size() - 1);
        if (i12 == i11) {
            this.f11933a = d0Var.b();
            e0.b(d0Var);
        } else {
            d0Var.f11949b = i12;
        }
        return b10;
    }

    @Override // hf.e
    public void readFully(byte[] bArr) throws EOFException {
        ae.r.f(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // hf.e
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        d0 d0Var = this.f11933a;
        ae.r.c(d0Var);
        int i10 = d0Var.f11949b;
        int i11 = d0Var.f11950c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = d0Var.f11948a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        n0(size() - 4);
        if (i17 == i11) {
            this.f11933a = d0Var.b();
            e0.b(d0Var);
        } else {
            d0Var.f11949b = i17;
        }
        return i18;
    }

    @Override // hf.e
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        d0 d0Var = this.f11933a;
        ae.r.c(d0Var);
        int i10 = d0Var.f11949b;
        int i11 = d0Var.f11950c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = d0Var.f11948a;
        int i12 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i13 = i12 + 1;
        int i14 = i13 + 1;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 48) | ((((long) bArr[i13]) & 255) << 40);
        int i15 = i14 + 1;
        int i16 = i15 + 1;
        long j12 = j11 | ((((long) bArr[i14]) & 255) << 32) | ((((long) bArr[i15]) & 255) << 24);
        int i17 = i16 + 1;
        long j13 = j12 | ((((long) bArr[i16]) & 255) << 16);
        int i18 = i17 + 1;
        long j14 = j13 | ((((long) bArr[i17]) & 255) << 8);
        int i19 = i18 + 1;
        long j15 = j14 | (((long) bArr[i18]) & 255);
        n0(size() - 8);
        if (i19 == i11) {
            this.f11933a = d0Var.b();
            e0.b(d0Var);
        } else {
            d0Var.f11949b = i19;
        }
        return j15;
    }

    @Override // hf.e
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        d0 d0Var = this.f11933a;
        ae.r.c(d0Var);
        int i10 = d0Var.f11949b;
        int i11 = d0Var.f11950c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = d0Var.f11948a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        n0(size() - 2);
        if (i13 == i11) {
            this.f11933a = d0Var.b();
            e0.b(d0Var);
        } else {
            d0Var.f11949b = i13;
        }
        return (short) i14;
    }

    @Override // hf.d
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr) {
        ae.r.f(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    public final long size() {
        return this.f11934b;
    }

    @Override // hf.e
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            d0 d0Var = this.f11933a;
            if (d0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, d0Var.f11950c - d0Var.f11949b);
            long j11 = iMin;
            n0(size() - j11);
            j10 -= j11;
            int i10 = d0Var.f11949b + iMin;
            d0Var.f11949b = i10;
            if (i10 == d0Var.f11950c) {
                this.f11933a = d0Var.b();
                e0.b(d0Var);
            }
        }
    }

    @Override // hf.e
    public long t() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        long j10 = -7;
        int i10 = 0;
        long j11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        do {
            d0 d0Var = this.f11933a;
            ae.r.c(d0Var);
            byte[] bArr = d0Var.f11948a;
            int i11 = d0Var.f11949b;
            int i12 = d0Var.f11950c;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j11 < -922337203685477580L || (j11 == -922337203685477580L && i13 < j10)) {
                        c cVarWriteByte = new c().c0(j11).writeByte(b10);
                        if (!z10) {
                            cVarWriteByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + cVarWriteByte.m0());
                    }
                    j11 = (j11 * 10) + ((long) i13);
                } else {
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j10--;
                    z10 = true;
                }
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.f11933a = d0Var.b();
                e0.b(d0Var);
            } else {
                d0Var.f11949b = i11;
            }
            if (z11) {
                break;
            }
        } while (this.f11933a != null);
        n0(size() - ((long) i10));
        if (i10 >= (z10 ? 2 : 1)) {
            return z10 ? j11 : -j11;
        }
        if (size() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + o0.k(L(0L)));
    }

    @Override // hf.d
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr, int i10, int i11) {
        ae.r.f(bArr, "source");
        long j10 = i11;
        o0.b(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            d0 d0VarQ0 = q0(1);
            int iMin = Math.min(i12 - i10, 8192 - d0VarQ0.f11950c);
            int i13 = i10 + iMin;
            nd.o.d(bArr, d0VarQ0.f11948a, d0VarQ0.f11950c, i10, i13);
            d0VarQ0.f11950c += iMin;
            i10 = i13;
        }
        n0(size() + j10);
        return this;
    }

    public String toString() {
        return o0().toString();
    }

    @Override // hf.e
    public String u(long j10) throws EOFException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jM = M((byte) 10, 0L, j11);
        if (jM != -1) {
            return p003if.f.d(this, jM);
        }
        if (j11 < size() && L(j11 - 1) == 13 && L(j11) == 10) {
            return p003if.f.d(this, j11);
        }
        c cVar = new c();
        G(cVar, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + cVar.k0().p() + (char) 8230);
    }

    @Override // hf.d
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public c writeByte(int i10) {
        d0 d0VarQ0 = q0(1);
        byte[] bArr = d0VarQ0.f11948a;
        int i11 = d0VarQ0.f11950c;
        d0VarQ0.f11950c = i11 + 1;
        bArr[i11] = (byte) i10;
        n0(size() + 1);
        return this;
    }

    @Override // hf.g0
    public void v(c cVar, long j10) {
        d0 d0Var;
        ae.r.f(cVar, "source");
        if (!(cVar != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        o0.b(cVar.size(), 0L, j10);
        while (j10 > 0) {
            d0 d0Var2 = cVar.f11933a;
            ae.r.c(d0Var2);
            int i10 = d0Var2.f11950c;
            ae.r.c(cVar.f11933a);
            if (j10 < i10 - r2.f11949b) {
                d0 d0Var3 = this.f11933a;
                if (d0Var3 != null) {
                    ae.r.c(d0Var3);
                    d0Var = d0Var3.f11954g;
                } else {
                    d0Var = null;
                }
                if (d0Var != null && d0Var.f11952e) {
                    if ((((long) d0Var.f11950c) + j10) - ((long) (d0Var.f11951d ? 0 : d0Var.f11949b)) <= 8192) {
                        d0 d0Var4 = cVar.f11933a;
                        ae.r.c(d0Var4);
                        d0Var4.g(d0Var, (int) j10);
                        cVar.n0(cVar.size() - j10);
                        n0(size() + j10);
                        return;
                    }
                }
                d0 d0Var5 = cVar.f11933a;
                ae.r.c(d0Var5);
                cVar.f11933a = d0Var5.e((int) j10);
            }
            d0 d0Var6 = cVar.f11933a;
            ae.r.c(d0Var6);
            long j11 = d0Var6.f11950c - d0Var6.f11949b;
            cVar.f11933a = d0Var6.b();
            d0 d0Var7 = this.f11933a;
            if (d0Var7 == null) {
                this.f11933a = d0Var6;
                d0Var6.f11954g = d0Var6;
                d0Var6.f11953f = d0Var6;
            } else {
                ae.r.c(d0Var7);
                d0 d0Var8 = d0Var7.f11954g;
                ae.r.c(d0Var8);
                d0Var8.c(d0Var6).a();
            }
            cVar.n0(cVar.size() - j11);
            n0(size() + j11);
            j10 -= j11;
        }
    }

    @Override // hf.d
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public c c0(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        boolean z10 = false;
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return z("-9223372036854775808");
            }
            z10 = true;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        d0 d0VarQ0 = q0(i10);
        byte[] bArr = d0VarQ0.f11948a;
        int i11 = d0VarQ0.f11950c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = p003if.f.b()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        d0VarQ0.f11950c += i10;
        n0(size() + ((long) i10));
        return this;
    }

    @Override // hf.d
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public c D(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        d0 d0VarQ0 = q0(i10);
        byte[] bArr = d0VarQ0.f11948a;
        int i11 = d0VarQ0.f11950c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = p003if.f.b()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        d0VarQ0.f11950c += i10;
        n0(size() + ((long) i10));
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        ae.r.f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            d0 d0VarQ0 = q0(1);
            int iMin = Math.min(i10, 8192 - d0VarQ0.f11950c);
            byteBuffer.get(d0VarQ0.f11948a, d0VarQ0.f11950c, iMin);
            i10 -= iMin;
            d0VarQ0.f11950c += iMin;
        }
        this.f11934b += (long) iRemaining;
        return iRemaining;
    }

    @Override // hf.d
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public c writeInt(int i10) {
        d0 d0VarQ0 = q0(4);
        byte[] bArr = d0VarQ0.f11948a;
        int i11 = d0VarQ0.f11950c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        d0VarQ0.f11950c = i14 + 1;
        n0(size() + 4);
        return this;
    }

    public c y0(long j10) {
        d0 d0VarQ0 = q0(8);
        byte[] bArr = d0VarQ0.f11948a;
        int i10 = d0VarQ0.f11950c;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j10 >>> 48) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j10 >>> 40) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j10 >>> 32) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((j10 >>> 24) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((j10 >>> 16) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((j10 >>> 8) & 255);
        bArr[i17] = (byte) (j10 & 255);
        d0VarQ0.f11950c = i17 + 1;
        n0(size() + 8);
        return this;
    }

    @Override // hf.d
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public c writeShort(int i10) {
        d0 d0VarQ0 = q0(2);
        byte[] bArr = d0VarQ0.f11948a;
        int i11 = d0VarQ0.f11950c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        d0VarQ0.f11950c = i12 + 1;
        n0(size() + 2);
        return this;
    }
}
