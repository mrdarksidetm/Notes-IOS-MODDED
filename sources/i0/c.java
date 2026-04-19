package i0;

/* JADX INFO: loaded from: classes.dex */
final class c implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.p<w2.d, w2.b, d0> f12051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f12052b = w2.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f12053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d0 f12054d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(zd.p<? super w2.d, ? super w2.b, d0> pVar) {
        this.f12051a = pVar;
    }

    @Override // i0.e0
    public d0 a(w2.d dVar, long j10) {
        if (this.f12054d != null && w2.b.g(this.f12052b, j10)) {
            if (this.f12053c == dVar.getDensity()) {
                d0 d0Var = this.f12054d;
                ae.r.c(d0Var);
                return d0Var;
            }
        }
        this.f12052b = j10;
        this.f12053c = dVar.getDensity();
        d0 d0VarInvoke = this.f12051a.invoke(dVar, w2.b.b(j10));
        this.f12054d = d0VarInvoke;
        return d0VarInvoke;
    }
}
