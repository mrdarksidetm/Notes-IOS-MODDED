package hf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f11930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f11931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11932c;

    public b0(g0 g0Var) {
        ae.r.f(g0Var, "sink");
        this.f11930a = g0Var;
        this.f11931b = new c();
    }

    @Override // hf.d
    public d D(long j10) {
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f11931b.D(j10);
        return s();
    }

    @Override // hf.d
    public long T(i0 i0Var) {
        ae.r.f(i0Var, "source");
        long j10 = 0;
        while (true) {
            long jX = i0Var.X(this.f11931b, 8192L);
            if (jX == -1) {
                return j10;
            }
            j10 += jX;
            s();
        }
    }

    @Override // hf.d
    public d c0(long j10) {
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f11931b.c0(j10);
        return s();
    }

    @Override // hf.g0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f11932c) {
            return;
        }
        Throwable th = null;
        try {
            if (this.f11931b.size() > 0) {
                g0 g0Var = this.f11930a;
                c cVar = this.f11931b;
                g0Var.v(cVar, cVar.size());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f11930a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f11932c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // hf.d
    public c d() {
        return this.f11931b;
    }

    @Override // hf.g0
    public j0 e() {
        return this.f11930a.e();
    }

    @Override // hf.d, hf.g0, java.io.Flushable
    public void flush() {
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f11931b.size() > 0) {
            g0 g0Var = this.f11930a;
            c cVar = this.f11931b;
            g0Var.v(cVar, cVar.size());
        }
        this.f11930a.flush();
    }

    @Override // hf.d
    public d g(f fVar) {
        ae.r.f(fVar, "byteString");
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f11931b.g(fVar);
        return s();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f11932c;
    }

    @Override // hf.d
    public d n() {
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = this.f11931b.size();
        if (size > 0) {
            this.f11930a.v(this.f11931b, size);
        }
        return this;
    }

    @Override // hf.d
    public d s() {
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        long jC = this.f11931b.C();
        if (jC > 0) {
            this.f11930a.v(this.f11931b, jC);
        }
        return this;
    }

    public String toString() {
        return "buffer(" + this.f11930a + ')';
    }

    @Override // hf.g0
    public void v(c cVar, long j10) {
        ae.r.f(cVar, "source");
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f11931b.v(cVar, j10);
        s();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        ae.r.f(byteBuffer, "source");
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f11931b.write(byteBuffer);
        s();
        return iWrite;
    }

    @Override // hf.d
    public d write(byte[] bArr) {
        ae.r.f(bArr, "source");
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f11931b.write(bArr);
        return s();
    }

    @Override // hf.d
    public d write(byte[] bArr, int i10, int i11) {
        ae.r.f(bArr, "source");
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f11931b.write(bArr, i10, i11);
        return s();
    }

    @Override // hf.d
    public d writeByte(int i10) {
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f11931b.writeByte(i10);
        return s();
    }

    @Override // hf.d
    public d writeInt(int i10) {
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f11931b.writeInt(i10);
        return s();
    }

    @Override // hf.d
    public d writeShort(int i10) {
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f11931b.writeShort(i10);
        return s();
    }

    @Override // hf.d
    public d z(String str) {
        ae.r.f(str, "string");
        if (!(!this.f11932c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f11931b.z(str);
        return s();
    }
}
