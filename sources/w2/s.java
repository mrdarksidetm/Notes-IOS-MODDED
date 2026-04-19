package w2;

/* JADX INFO: loaded from: classes.dex */
final class s implements x2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22427a;

    public s(float f10) {
        this.f22427a = f10;
    }

    @Override // x2.a
    public float a(float f10) {
        return f10 / this.f22427a;
    }

    @Override // x2.a
    public float b(float f10) {
        return f10 * this.f22427a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Float.compare(this.f22427a, ((s) obj).f22427a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f22427a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f22427a + ')';
    }
}
