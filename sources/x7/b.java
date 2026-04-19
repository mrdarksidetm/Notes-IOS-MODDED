package x7;

import x7.g;

/* JADX INFO: loaded from: classes.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f23055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23056b;

    b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f23055a = aVar;
        this.f23056b = j10;
    }

    @Override // x7.g
    public long b() {
        return this.f23056b;
    }

    @Override // x7.g
    public g.a c() {
        return this.f23055a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f23055a.equals(gVar.c()) && this.f23056b == gVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.f23055a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f23056b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f23055a + ", nextRequestWaitMillis=" + this.f23056b + "}";
    }
}
