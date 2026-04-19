package v7;

/* JADX INFO: loaded from: classes.dex */
final class h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22158a;

    h(long j10) {
        this.f22158a = j10;
    }

    @Override // v7.n
    public long c() {
        return this.f22158a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f22158a == ((n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f22158a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f22158a + "}";
    }
}
