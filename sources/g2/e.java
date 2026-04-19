package g2;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.a<Boolean> f11310b;

    public final zd.a<Boolean> a() {
        return this.f11310b;
    }

    public final String b() {
        return this.f11309a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return ae.r.b(this.f11309a, eVar.f11309a) && ae.r.b(this.f11310b, eVar.f11310b);
    }

    public int hashCode() {
        return (this.f11309a.hashCode() * 31) + this.f11310b.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f11309a + ", action=" + this.f11310b + ')';
    }
}
