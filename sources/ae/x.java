package ae;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f724b;

    public x(Class<?> cls, String str) {
        r.f(cls, "jClass");
        r.f(str, "moduleName");
        this.f723a = cls;
        this.f724b = str;
    }

    @Override // ae.g
    public Class<?> d() {
        return this.f723a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && r.b(d(), ((x) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}
