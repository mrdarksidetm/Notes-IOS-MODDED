package i2;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12391a;

    public j0(String str) {
        this.f12391a = str;
    }

    public final String a() {
        return this.f12391a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && ae.r.b(this.f12391a, ((j0) obj).f12391a);
    }

    public int hashCode() {
        return this.f12391a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f12391a + ')';
    }
}
