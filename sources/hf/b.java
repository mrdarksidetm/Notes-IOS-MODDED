package hf;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
final class b implements g0 {
    @Override // hf.g0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // hf.g0
    public j0 e() {
        return j0.f11991e;
    }

    @Override // hf.g0, java.io.Flushable
    public void flush() {
    }

    @Override // hf.g0
    public void v(c cVar, long j10) throws EOFException {
        ae.r.f(cVar, "source");
        cVar.skip(j10);
    }
}
