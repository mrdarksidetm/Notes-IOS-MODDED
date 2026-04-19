package b2;

/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f5417b;

    public u1(String str, Object obj) {
        this.f5416a = str;
        this.f5417b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return ae.r.b(this.f5416a, u1Var.f5416a) && ae.r.b(this.f5417b, u1Var.f5417b);
    }

    public int hashCode() {
        int iHashCode = this.f5416a.hashCode() * 31;
        Object obj = this.f5417b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.f5416a + ", value=" + this.f5417b + ')';
    }
}
