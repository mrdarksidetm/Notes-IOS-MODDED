package je;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ge.i f14210b;

    public f(String str, ge.i iVar) {
        ae.r.f(str, "value");
        ae.r.f(iVar, "range");
        this.f14209a = str;
        this.f14210b = iVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return ae.r.b(this.f14209a, fVar.f14209a) && ae.r.b(this.f14210b, fVar.f14210b);
    }

    public int hashCode() {
        return (this.f14209a.hashCode() * 31) + this.f14210b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f14209a + ", range=" + this.f14210b + ')';
    }
}
