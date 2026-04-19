package t0;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20999b;

    public v0(Object obj, Object obj2) {
        this.f20998a = obj;
        this.f20999b = obj2;
    }

    private final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return ae.r.b(this.f20998a, v0Var.f20998a) && ae.r.b(this.f20999b, v0Var.f20999b);
    }

    public int hashCode() {
        return (a(this.f20998a) * 31) + a(this.f20999b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f20998a + ", right=" + this.f20999b + ')';
    }
}
