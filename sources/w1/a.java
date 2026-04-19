package w1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f22374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f22375b;

    public a(long j10, float f10) {
        this.f22374a = j10;
        this.f22375b = f10;
    }

    public final float a() {
        return this.f22375b;
    }

    public final long b() {
        return this.f22374a;
    }

    public final void c(float f10) {
        this.f22375b = f10;
    }

    public final void d(long j10) {
        this.f22374a = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f22374a == aVar.f22374a && Float.compare(this.f22375b, aVar.f22375b) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.f22374a) * 31) + Float.hashCode(this.f22375b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f22374a + ", dataPoint=" + this.f22375b + ')';
    }
}
