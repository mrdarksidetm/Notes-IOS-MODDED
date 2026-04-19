package q9;

/* JADX INFO: loaded from: classes.dex */
final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19017b;

    n(int i10, long j10) {
        this.f19016a = i10;
        this.f19017b = j10;
    }

    @Override // q9.o
    public final int a() {
        return this.f19016a;
    }

    @Override // q9.o
    public final long b() {
        return this.f19017b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f19016a == oVar.a() && this.f19017b == oVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f19017b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f19016a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f19016a + ", eventTimestamp=" + this.f19017b + "}";
    }
}
