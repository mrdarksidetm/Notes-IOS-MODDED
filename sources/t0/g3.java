package t0;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l3<b1.d> f20771a = new l3<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l3<v0.d<g0>> f20772b = new l3<>();

    public static final v0.d<g0> b() {
        l3<v0.d<g0>> l3Var = f20772b;
        v0.d<g0> dVarA = l3Var.a();
        if (dVarA != null) {
            return dVarA;
        }
        v0.d<g0> dVar = new v0.d<>(new g0[0], 0);
        l3Var.b(dVar);
        return dVar;
    }

    public static final <T> p3<T> c(e3<T> e3Var, zd.a<? extends T> aVar) {
        return new e0(aVar, e3Var);
    }

    public static final <T> p3<T> d(zd.a<? extends T> aVar) {
        return new e0(aVar, null);
    }
}
