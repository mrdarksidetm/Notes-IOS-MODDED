package la;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class a extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f14964b;

    a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f14963a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f14964b = list;
    }

    @Override // la.m
    public List<String> b() {
        return this.f14964b;
    }

    @Override // la.m
    public String c() {
        return this.f14963a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f14963a.equals(mVar.c()) && this.f14964b.equals(mVar.b());
    }

    public int hashCode() {
        return ((this.f14963a.hashCode() ^ 1000003) * 1000003) ^ this.f14964b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f14963a + ", usedDates=" + this.f14964b + "}";
    }
}
