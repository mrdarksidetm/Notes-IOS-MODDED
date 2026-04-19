package hf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class y implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f12025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f12026b;

    public y(OutputStream outputStream, j0 j0Var) {
        ae.r.f(outputStream, "out");
        ae.r.f(j0Var, "timeout");
        this.f12025a = outputStream;
        this.f12026b = j0Var;
    }

    @Override // hf.g0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12025a.close();
    }

    @Override // hf.g0
    public j0 e() {
        return this.f12026b;
    }

    @Override // hf.g0, java.io.Flushable
    public void flush() throws IOException {
        this.f12025a.flush();
    }

    public String toString() {
        return "sink(" + this.f12025a + ')';
    }

    @Override // hf.g0
    public void v(c cVar, long j10) throws IOException {
        ae.r.f(cVar, "source");
        o0.b(cVar.size(), 0L, j10);
        while (j10 > 0) {
            this.f12026b.f();
            d0 d0Var = cVar.f11933a;
            ae.r.c(d0Var);
            int iMin = (int) Math.min(j10, d0Var.f11950c - d0Var.f11949b);
            this.f12025a.write(d0Var.f11948a, d0Var.f11949b, iMin);
            d0Var.f11949b += iMin;
            long j11 = iMin;
            j10 -= j11;
            cVar.n0(cVar.size() - j11);
            if (d0Var.f11949b == d0Var.f11950c) {
                cVar.f11933a = d0Var.b();
                e0.b(d0Var);
            }
        }
    }
}
