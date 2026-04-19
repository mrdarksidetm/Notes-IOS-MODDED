package n3;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f15917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f15918b;

    public h(float f10, float f11) {
        this.f15917a = g.c(f10, "width");
        this.f15918b = g.c(f11, "height");
    }

    public float a() {
        return this.f15918b;
    }

    public float b() {
        return this.f15917a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f15917a == this.f15917a && hVar.f15918b == this.f15918b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f15917a) ^ Float.floatToIntBits(this.f15918b);
    }

    public String toString() {
        return this.f15917a + "x" + this.f15918b;
    }
}
