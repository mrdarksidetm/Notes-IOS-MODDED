package hf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
class q implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f12018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f12019b;

    public q(InputStream inputStream, j0 j0Var) {
        ae.r.f(inputStream, "input");
        ae.r.f(j0Var, "timeout");
        this.f12018a = inputStream;
        this.f12019b = j0Var;
    }

    @Override // hf.i0
    public long X(c cVar, long j10) throws IOException {
        ae.r.f(cVar, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f12019b.f();
            d0 d0VarQ0 = cVar.q0(1);
            int i10 = this.f12018a.read(d0VarQ0.f11948a, d0VarQ0.f11950c, (int) Math.min(j10, 8192 - d0VarQ0.f11950c));
            if (i10 != -1) {
                d0VarQ0.f11950c += i10;
                long j11 = i10;
                cVar.n0(cVar.size() + j11);
                return j11;
            }
            if (d0VarQ0.f11949b != d0VarQ0.f11950c) {
                return -1L;
            }
            cVar.f11933a = d0VarQ0.b();
            e0.b(d0VarQ0);
            return -1L;
        } catch (AssertionError e10) {
            if (u.e(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12018a.close();
    }

    @Override // hf.i0
    public j0 e() {
        return this.f12019b;
    }

    public String toString() {
        return "source(" + this.f12018a + ')';
    }
}
