package y1;

/* JADX INFO: loaded from: classes.dex */
final class o0 extends b2.x0 implements m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.l<w2.p, md.i0> f23280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23281d;

    /* JADX WARN: Multi-variable type inference failed */
    public o0(zd.l<? super w2.p, md.i0> lVar, zd.l<? super b2.w0, md.i0> lVar2) {
        super(lVar2);
        this.f23280c = lVar;
        this.f23281d = w2.q.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            return ae.r.b(this.f23280c, ((o0) obj).f23280c);
        }
        return false;
    }

    @Override // y1.m0
    public void f(long j10) {
        if (w2.p.e(this.f23281d, j10)) {
            return;
        }
        this.f23280c.invoke(w2.p.b(j10));
        this.f23281d = j10;
    }

    public int hashCode() {
        return this.f23280c.hashCode();
    }
}
