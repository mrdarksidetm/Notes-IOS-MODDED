package h0;

/* JADX INFO: loaded from: classes.dex */
final class l0 implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f11687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f11688c;

    public l0(o0 o0Var, o0 o0Var2) {
        this.f11687b = o0Var;
        this.f11688c = o0Var2;
    }

    @Override // h0.o0
    public int a(w2.d dVar, w2.r rVar) {
        return Math.max(this.f11687b.a(dVar, rVar), this.f11688c.a(dVar, rVar));
    }

    @Override // h0.o0
    public int b(w2.d dVar) {
        return Math.max(this.f11687b.b(dVar), this.f11688c.b(dVar));
    }

    @Override // h0.o0
    public int c(w2.d dVar, w2.r rVar) {
        return Math.max(this.f11687b.c(dVar, rVar), this.f11688c.c(dVar, rVar));
    }

    @Override // h0.o0
    public int d(w2.d dVar) {
        return Math.max(this.f11687b.d(dVar), this.f11688c.d(dVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return ae.r.b(l0Var.f11687b, this.f11687b) && ae.r.b(l0Var.f11688c, this.f11688c);
    }

    public int hashCode() {
        return this.f11687b.hashCode() + (this.f11688c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.f11687b + " ∪ " + this.f11688c + ')';
    }
}
