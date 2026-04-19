package n2;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v0 f15832h;

    public k0(v0 v0Var) {
        super(true, null);
        this.f15832h = v0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && ae.r.b(this.f15832h, ((k0) obj).f15832h);
    }

    public int hashCode() {
        return this.f15832h.hashCode();
    }

    public final v0 o() {
        return this.f15832h;
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f15832h + ')';
    }
}
