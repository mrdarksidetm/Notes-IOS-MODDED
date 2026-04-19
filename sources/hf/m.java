package hf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f12003a;

    public m(i0 i0Var) {
        ae.r.f(i0Var, "delegate");
        this.f12003a = i0Var;
    }

    @Override // hf.i0
    public long X(c cVar, long j10) {
        ae.r.f(cVar, "sink");
        return this.f12003a.X(cVar, j10);
    }

    public final i0 a() {
        return this.f12003a;
    }

    @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12003a.close();
    }

    @Override // hf.i0
    public j0 e() {
        return this.f12003a.e();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f12003a + ')';
    }
}
