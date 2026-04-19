package hf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f11996a;

    public l(g0 g0Var) {
        ae.r.f(g0Var, "delegate");
        this.f11996a = g0Var;
    }

    @Override // hf.g0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11996a.close();
    }

    @Override // hf.g0
    public j0 e() {
        return this.f11996a.e();
    }

    @Override // hf.g0, java.io.Flushable
    public void flush() {
        this.f11996a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f11996a + ')';
    }

    @Override // hf.g0
    public void v(c cVar, long j10) {
        ae.r.f(cVar, "source");
        this.f11996a.v(cVar, j10);
    }
}
