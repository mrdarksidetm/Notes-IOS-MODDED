package v7;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<m> f22125a;

    d(List<m> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f22125a = list;
    }

    @Override // v7.j
    public List<m> c() {
        return this.f22125a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f22125a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f22125a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f22125a + "}";
    }
}
