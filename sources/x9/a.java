package x9;

/* JADX INFO: loaded from: classes2.dex */
final class a extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23081c;

    a(long j10, long j11, long j12) {
        this.f23079a = j10;
        this.f23080b = j11;
        this.f23081c = j12;
    }

    @Override // x9.p
    public long b() {
        return this.f23080b;
    }

    @Override // x9.p
    public long c() {
        return this.f23079a;
    }

    @Override // x9.p
    public long d() {
        return this.f23081c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f23079a == pVar.c() && this.f23080b == pVar.b() && this.f23081c == pVar.d();
    }

    public int hashCode() {
        long j10 = this.f23079a;
        long j11 = this.f23080b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f23081c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f23079a + ", elapsedRealtime=" + this.f23080b + ", uptimeMillis=" + this.f23081c + "}";
    }
}
