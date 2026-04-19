package m1;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f15291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f15292b;

    public y(float f10, float f11) {
        this.f15291a = f10;
        this.f15292b = f11;
    }

    public y(float f10, float f11, float f12) {
        this(f10, f11, f12, f10 + f11 + f12);
    }

    private y(float f10, float f11, float f12, float f13) {
        this(f10 / f13, f11 / f13);
    }

    public final float a() {
        return this.f15291a;
    }

    public final float b() {
        return this.f15292b;
    }

    public final float[] c() {
        float f10 = this.f15291a;
        float f11 = this.f15292b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f15291a, yVar.f15291a) == 0 && Float.compare(this.f15292b, yVar.f15292b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f15291a) * 31) + Float.hashCode(this.f15292b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f15291a + ", y=" + this.f15292b + ')';
    }
}
