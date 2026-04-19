package e7;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10643a;

    public c0(String str) {
        ae.r.f(str, "packageName");
        this.f10643a = str;
    }

    public final String a() {
        return this.f10643a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && ae.r.b(this.f10643a, ((c0) obj).f10643a);
    }

    public int hashCode() {
        return this.f10643a.hashCode();
    }

    public String toString() {
        return this.f10643a;
    }
}
