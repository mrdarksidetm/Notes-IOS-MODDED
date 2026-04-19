package w2;

/* JADX INFO: loaded from: classes.dex */
final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f22401b;

    public e(float f10, float f11) {
        this.f22400a = f10;
        this.f22401b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f22400a, eVar.f22400a) == 0 && Float.compare(this.f22401b, eVar.f22401b) == 0;
    }

    @Override // w2.d
    public float getDensity() {
        return this.f22400a;
    }

    public int hashCode() {
        return (Float.hashCode(this.f22400a) * 31) + Float.hashCode(this.f22401b);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f22400a + ", fontScale=" + this.f22401b + ')';
    }

    @Override // w2.l
    public float y0() {
        return this.f22401b;
    }
}
