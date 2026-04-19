package g2;

import md.g;

/* JADX INFO: loaded from: classes.dex */
public final class a<T extends md.g<? extends Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f11299b;

    public a(String str, T t10) {
        this.f11298a = str;
        this.f11299b = t10;
    }

    public final T a() {
        return this.f11299b;
    }

    public final String b() {
        return this.f11298a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return ae.r.b(this.f11298a, aVar.f11298a) && ae.r.b(this.f11299b, aVar.f11299b);
    }

    public int hashCode() {
        String str = this.f11298a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t10 = this.f11299b;
        return iHashCode + (t10 != null ? t10.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f11298a + ", action=" + this.f11299b + ')';
    }
}
