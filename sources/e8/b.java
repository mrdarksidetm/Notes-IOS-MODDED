package e8;

/* JADX INFO: loaded from: classes.dex */
final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f10713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.o f10714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7.i f10715c;

    b(long j10, w7.o oVar, w7.i iVar) {
        this.f10713a = j10;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f10714b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f10715c = iVar;
    }

    @Override // e8.k
    public w7.i b() {
        return this.f10715c;
    }

    @Override // e8.k
    public long c() {
        return this.f10713a;
    }

    @Override // e8.k
    public w7.o d() {
        return this.f10714b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f10713a == kVar.c() && this.f10714b.equals(kVar.d()) && this.f10715c.equals(kVar.b());
    }

    public int hashCode() {
        long j10 = this.f10713a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f10714b.hashCode()) * 1000003) ^ this.f10715c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f10713a + ", transportContext=" + this.f10714b + ", event=" + this.f10715c + "}";
    }
}
