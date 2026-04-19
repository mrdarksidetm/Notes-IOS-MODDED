package x1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f22940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22942d;

    public b(float f10, float f11, long j10, int i10) {
        this.f22939a = f10;
        this.f22940b = f11;
        this.f22941c = j10;
        this.f22942d = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.f22939a == this.f22939a) {
                if ((bVar.f22940b == this.f22940b) && bVar.f22941c == this.f22941c && bVar.f22942d == this.f22942d) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f22939a) * 31) + Float.hashCode(this.f22940b)) * 31) + Long.hashCode(this.f22941c)) * 31) + Integer.hashCode(this.f22942d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f22939a + ",horizontalScrollPixels=" + this.f22940b + ",uptimeMillis=" + this.f22941c + ",deviceId=" + this.f22942d + ')';
    }
}
