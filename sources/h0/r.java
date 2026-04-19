package h0;

/* JADX INFO: loaded from: classes.dex */
final class r implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f11739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w2.d f11740b;

    public r(o0 o0Var, w2.d dVar) {
        this.f11739a = o0Var;
        this.f11740b = dVar;
    }

    @Override // h0.y
    public float a() {
        w2.d dVar = this.f11740b;
        return dVar.l0(this.f11739a.b(dVar));
    }

    @Override // h0.y
    public float b(w2.r rVar) {
        w2.d dVar = this.f11740b;
        return dVar.l0(this.f11739a.c(dVar, rVar));
    }

    @Override // h0.y
    public float c() {
        w2.d dVar = this.f11740b;
        return dVar.l0(this.f11739a.d(dVar));
    }

    @Override // h0.y
    public float d(w2.r rVar) {
        w2.d dVar = this.f11740b;
        return dVar.l0(this.f11739a.a(dVar, rVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return ae.r.b(this.f11739a, rVar.f11739a) && ae.r.b(this.f11740b, rVar.f11740b);
    }

    public int hashCode() {
        return (this.f11739a.hashCode() * 31) + this.f11740b.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f11739a + ", density=" + this.f11740b + ')';
    }
}
