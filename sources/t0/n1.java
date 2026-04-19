package t0;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20875a;

    public n1(String str) {
        this.f20875a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1) && ae.r.b(this.f20875a, ((n1) obj).f20875a);
    }

    public int hashCode() {
        return this.f20875a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f20875a + ')';
    }
}
