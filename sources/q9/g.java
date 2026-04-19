package q9;

/* JADX INFO: loaded from: classes.dex */
public final class g implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f19010c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile k f19011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f19012b = f19010c;

    private g(k kVar) {
        this.f19011a = kVar;
    }

    public static k b(k kVar) {
        return kVar instanceof g ? kVar : new g(kVar);
    }

    @Override // q9.k
    public final Object a() {
        Object objA = this.f19012b;
        Object obj = f19010c;
        if (objA == obj) {
            synchronized (this) {
                objA = this.f19012b;
                if (objA == obj) {
                    objA = this.f19011a.a();
                    Object obj2 = this.f19012b;
                    if (obj2 != obj && obj2 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f19012b = objA;
                    this.f19011a = null;
                }
            }
        }
        return objA;
    }
}
