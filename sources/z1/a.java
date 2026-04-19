package z1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j<?> f24130a;

    public a(j<?> jVar) {
        super(null);
        this.f24130a = jVar;
    }

    @Override // z1.g
    public boolean a(c<?> cVar) {
        return cVar == this.f24130a.getKey();
    }

    @Override // z1.g
    public <T> T b(c<T> cVar) {
        if (cVar == this.f24130a.getKey()) {
            return (T) this.f24130a.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void c(j<?> jVar) {
        this.f24130a = jVar;
    }
}
