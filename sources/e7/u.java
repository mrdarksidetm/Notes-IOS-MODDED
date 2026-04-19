package e7;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10693b;

    public u(String str, String str2) {
        ae.r.f(str, "name");
        ae.r.f(str2, "vendor");
        this.f10692a = str;
        this.f10693b = str2;
    }

    public final String a() {
        return this.f10692a;
    }

    public final String b() {
        return this.f10693b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return ae.r.b(this.f10692a, uVar.f10692a) && ae.r.b(this.f10693b, uVar.f10693b);
    }

    public int hashCode() {
        return (this.f10692a.hashCode() * 31) + this.f10693b.hashCode();
    }

    public String toString() {
        return "InputDeviceData(name=" + this.f10692a + ", vendor=" + this.f10693b + ')';
    }
}
