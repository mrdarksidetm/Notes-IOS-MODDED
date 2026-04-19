package y1;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f23252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f23253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f23254c;

    public h(m mVar, o oVar, p pVar) {
        this.f23252a = mVar;
        this.f23253b = oVar;
        this.f23254c = pVar;
    }

    @Override // y1.m
    public int B(int i10) {
        return this.f23252a.B(i10);
    }

    @Override // y1.m
    public int E(int i10) {
        return this.f23252a.E(i10);
    }

    @Override // y1.d0
    public t0 I(long j10) {
        if (this.f23254c == p.Width) {
            return new j(this.f23253b == o.Max ? this.f23252a.E(w2.b.m(j10)) : this.f23252a.B(w2.b.m(j10)), w2.b.i(j10) ? w2.b.m(j10) : 32767);
        }
        return new j(w2.b.j(j10) ? w2.b.n(j10) : 32767, this.f23253b == o.Max ? this.f23252a.k(w2.b.n(j10)) : this.f23252a.W(w2.b.n(j10)));
    }

    @Override // y1.m
    public int W(int i10) {
        return this.f23252a.W(i10);
    }

    @Override // y1.m
    public Object f() {
        return this.f23252a.f();
    }

    @Override // y1.m
    public int k(int i10) {
        return this.f23252a.k(i10);
    }
}
