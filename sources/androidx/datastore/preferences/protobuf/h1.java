package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
class h1 extends f1<g1, g1> {
    h1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public g1 g(Object obj) {
        return ((w) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(g1 g1Var) {
        return g1Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(g1 g1Var) {
        return g1Var.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public g1 k(g1 g1Var, g1 g1Var2) {
        return g1Var2.equals(g1.e()) ? g1Var : g1.k(g1Var, g1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public g1 n() {
        return g1.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, g1 g1Var) {
        p(obj, g1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, g1 g1Var) {
        ((w) obj).unknownFields = g1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public g1 r(g1 g1Var) {
        g1Var.j();
        return g1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(g1 g1Var, l1 l1Var) {
        g1Var.o(l1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(g1 g1Var, l1 l1Var) {
        g1Var.q(l1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    void j(Object obj) {
        g(obj).j();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    boolean q(y0 y0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(g1 g1Var, int i10, int i11) {
        g1Var.n(k1.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(g1 g1Var, int i10, long j10) {
        g1Var.n(k1.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(g1 g1Var, int i10, g1 g1Var2) {
        g1Var.n(k1.c(i10, 3), g1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(g1 g1Var, int i10, g gVar) {
        g1Var.n(k1.c(i10, 2), gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(g1 g1Var, int i10, long j10) {
        g1Var.n(k1.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public g1 f(Object obj) {
        g1 g1VarG = g(obj);
        if (g1VarG != g1.e()) {
            return g1VarG;
        }
        g1 g1VarL = g1.l();
        p(obj, g1VarL);
        return g1VarL;
    }
}
