package hf;

import com.google.android.gms.common.api.a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f11943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f11944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11945c;

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            c0 c0Var = c0.this;
            if (c0Var.f11945c) {
                throw new IOException("closed");
            }
            return (int) Math.min(c0Var.f11944b.size(), a.e.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            c0.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            c0 c0Var = c0.this;
            if (c0Var.f11945c) {
                throw new IOException("closed");
            }
            if (c0Var.f11944b.size() == 0) {
                c0 c0Var2 = c0.this;
                if (c0Var2.f11943a.X(c0Var2.f11944b, 8192L) == -1) {
                    return -1;
                }
            }
            return c0.this.f11944b.readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            ae.r.f(bArr, "data");
            if (c0.this.f11945c) {
                throw new IOException("closed");
            }
            o0.b(bArr.length, i10, i11);
            if (c0.this.f11944b.size() == 0) {
                c0 c0Var = c0.this;
                if (c0Var.f11943a.X(c0Var.f11944b, 8192L) == -1) {
                    return -1;
                }
            }
            return c0.this.f11944b.read(bArr, i10, i11);
        }

        public String toString() {
            return c0.this + ".inputStream()";
        }
    }

    public c0(i0 i0Var) {
        ae.r.f(i0Var, "source");
        this.f11943a = i0Var;
        this.f11944b = new c();
    }

    @Override // hf.e
    public void B(c cVar, long j10) throws EOFException {
        ae.r.f(cVar, "sink");
        try {
            b0(j10);
            this.f11944b.B(cVar, j10);
        } catch (EOFException e10) {
            cVar.T(this.f11944b);
            throw e10;
        }
    }

    @Override // hf.e
    public boolean F(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f11945c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f11944b.size() < j10) {
            if (this.f11943a.X(this.f11944b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // hf.e
    public String J() {
        return u(Long.MAX_VALUE);
    }

    @Override // hf.e
    public int K() throws EOFException {
        b0(4L);
        return this.f11944b.K();
    }

    @Override // hf.e
    public byte[] O(long j10) throws EOFException {
        b0(j10);
        return this.f11944b.O(j10);
    }

    @Override // hf.e
    public long R(g0 g0Var) {
        ae.r.f(g0Var, "sink");
        long j10 = 0;
        while (this.f11943a.X(this.f11944b, 8192L) != -1) {
            long jC = this.f11944b.C();
            if (jC > 0) {
                j10 += jC;
                g0Var.v(this.f11944b, jC);
            }
        }
        if (this.f11944b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f11944b.size();
        c cVar = this.f11944b;
        g0Var.v(cVar, cVar.size());
        return size;
    }

    @Override // hf.e
    public short V() throws EOFException {
        b0(2L);
        return this.f11944b.V();
    }

    @Override // hf.e
    public long W() throws EOFException {
        b0(8L);
        return this.f11944b.W();
    }

    @Override // hf.i0
    public long X(c cVar, long j10) {
        ae.r.f(cVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f11945c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f11944b.size() == 0 && this.f11943a.X(this.f11944b, 8192L) == -1) {
            return -1L;
        }
        return this.f11944b.X(cVar, Math.min(j10, this.f11944b.size()));
    }

    public long a(byte b10) {
        return b(b10, 0L, Long.MAX_VALUE);
    }

    public long b(byte b10, long j10, long j11) {
        if (!(!this.f11945c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j10 && j10 <= j11)) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        while (j10 < j11) {
            long jM = this.f11944b.M(b10, j10, j11);
            if (jM != -1) {
                return jM;
            }
            long size = this.f11944b.size();
            if (size >= j11 || this.f11943a.X(this.f11944b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
        return -1L;
    }

    @Override // hf.e
    public void b0(long j10) throws EOFException {
        if (!F(j10)) {
            throw new EOFException();
        }
    }

    @Override // hf.e
    public String c(long j10) throws EOFException {
        b0(j10);
        return this.f11944b.c(j10);
    }

    @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f11945c) {
            return;
        }
        this.f11945c = true;
        this.f11943a.close();
        this.f11944b.b();
    }

    @Override // hf.e, hf.d
    public c d() {
        return this.f11944b;
    }

    @Override // hf.e
    public long d0() throws EOFException {
        byte bL;
        b0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!F(i11)) {
                break;
            }
            bL = this.f11944b.L(i10);
            if ((bL < 48 || bL > 57) && ((bL < 97 || bL > 102) && (bL < 65 || bL > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bL, je.b.a(je.b.a(16)));
            ae.r.e(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f11944b.d0();
    }

    @Override // hf.i0
    public j0 e() {
        return this.f11943a.e();
    }

    @Override // hf.e
    public InputStream f0() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f11945c;
    }

    @Override // hf.e
    public f j(long j10) throws EOFException {
        b0(j10);
        return this.f11944b.j(j10);
    }

    @Override // hf.e
    public int m(x xVar) throws EOFException {
        ae.r.f(xVar, "options");
        if (!(!this.f11945c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int iE = p003if.f.e(this.f11944b, xVar, true);
            if (iE != -2) {
                if (iE != -1) {
                    this.f11944b.skip(xVar.l()[iE].F());
                    return iE;
                }
            } else if (this.f11943a.X(this.f11944b, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // hf.e
    public e peek() {
        return u.d(new a0(this));
    }

    @Override // hf.e
    public boolean q() {
        if (!this.f11945c) {
            return this.f11944b.q() && this.f11943a.X(this.f11944b, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        ae.r.f(byteBuffer, "sink");
        if (this.f11944b.size() == 0 && this.f11943a.X(this.f11944b, 8192L) == -1) {
            return -1;
        }
        return this.f11944b.read(byteBuffer);
    }

    @Override // hf.e
    public byte readByte() throws EOFException {
        b0(1L);
        return this.f11944b.readByte();
    }

    @Override // hf.e
    public void readFully(byte[] bArr) throws EOFException {
        ae.r.f(bArr, "sink");
        try {
            b0(bArr.length);
            this.f11944b.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f11944b.size() > 0) {
                c cVar = this.f11944b;
                int i11 = cVar.read(bArr, i10, (int) cVar.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // hf.e
    public int readInt() throws EOFException {
        b0(4L);
        return this.f11944b.readInt();
    }

    @Override // hf.e
    public long readLong() throws EOFException {
        b0(8L);
        return this.f11944b.readLong();
    }

    @Override // hf.e
    public short readShort() throws EOFException {
        b0(2L);
        return this.f11944b.readShort();
    }

    @Override // hf.e
    public void skip(long j10) throws EOFException {
        if (!(!this.f11945c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            if (this.f11944b.size() == 0 && this.f11943a.X(this.f11944b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f11944b.size());
            this.f11944b.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // hf.e
    public long t() throws EOFException {
        byte bL;
        b0(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!F(j11)) {
                break;
            }
            bL = this.f11944b.L(j10);
            if ((bL < 48 || bL > 57) && !(j10 == 0 && bL == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bL, je.b.a(je.b.a(16)));
            ae.r.e(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f11944b.t();
    }

    public String toString() {
        return "buffer(" + this.f11943a + ')';
    }

    @Override // hf.e
    public String u(long j10) throws EOFException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jB = b((byte) 10, 0L, j11);
        if (jB != -1) {
            return p003if.f.d(this.f11944b, jB);
        }
        if (j11 < Long.MAX_VALUE && F(j11) && this.f11944b.L(j11 - 1) == 13 && F(1 + j11) && this.f11944b.L(j11) == 10) {
            return p003if.f.d(this.f11944b, j11);
        }
        c cVar = new c();
        c cVar2 = this.f11944b;
        cVar2.G(cVar, 0L, Math.min(32, cVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f11944b.size(), j10) + " content=" + cVar.k0().p() + (char) 8230);
    }
}
