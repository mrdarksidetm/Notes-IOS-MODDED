package h0;

/* JADX INFO: loaded from: classes.dex */
final class n implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f11695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f11696c;

    public n(o0 o0Var, o0 o0Var2) {
        this.f11695b = o0Var;
        this.f11696c = o0Var2;
    }

    @Override // h0.o0
    public int a(w2.d dVar, w2.r rVar) {
        return ge.o.d(this.f11695b.a(dVar, rVar) - this.f11696c.a(dVar, rVar), 0);
    }

    @Override // h0.o0
    public int b(w2.d dVar) {
        return ge.o.d(this.f11695b.b(dVar) - this.f11696c.b(dVar), 0);
    }

    @Override // h0.o0
    public int c(w2.d dVar, w2.r rVar) {
        return ge.o.d(this.f11695b.c(dVar, rVar) - this.f11696c.c(dVar, rVar), 0);
    }

    @Override // h0.o0
    public int d(w2.d dVar) {
        return ge.o.d(this.f11695b.d(dVar) - this.f11696c.d(dVar), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return ae.r.b(nVar.f11695b, this.f11695b) && ae.r.b(nVar.f11696c, this.f11696c);
    }

    public int hashCode() {
        return (this.f11695b.hashCode() * 31) + this.f11696c.hashCode();
    }

    public String toString() {
        return '(' + this.f11695b + " - " + this.f11696c + ')';
    }
}
