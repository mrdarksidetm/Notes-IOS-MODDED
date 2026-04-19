package y1;

/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f23255b;

    public i(float f10) {
        this.f23255b = f10;
    }

    @Override // y1.f
    public long a(long j10, long j11) {
        float f10 = this.f23255b;
        return z0.a(f10, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Float.compare(this.f23255b, ((i) obj).f23255b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f23255b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f23255b + ')';
    }
}
