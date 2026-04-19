package h0;

/* JADX INFO: loaded from: classes.dex */
final class j implements z1.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.l<o0, md.i0> f11668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o0 f11669c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(zd.l<? super o0, md.i0> lVar) {
        this.f11668b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return ae.r.b(((j) obj).f11668b, this.f11668b);
        }
        return false;
    }

    public int hashCode() {
        return this.f11668b.hashCode();
    }

    @Override // z1.d
    public void q(z1.k kVar) {
        o0 o0Var = (o0) kVar.p(r0.a());
        if (ae.r.b(o0Var, this.f11669c)) {
            return;
        }
        this.f11669c = o0Var;
        this.f11668b.invoke(o0Var);
    }
}
