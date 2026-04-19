package w2;

/* JADX INFO: loaded from: classes.dex */
final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f22403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x2.a f22404c;

    public g(float f10, float f11, x2.a aVar) {
        this.f22402a = f10;
        this.f22403b = f11;
        this.f22404c = aVar;
    }

    @Override // w2.l
    public float Q(long j10) {
        if (v.g(t.g(j10), v.f22432b.b())) {
            return h.m(this.f22404c.b(t.h(j10)));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f22402a, gVar.f22402a) == 0 && Float.compare(this.f22403b, gVar.f22403b) == 0 && ae.r.b(this.f22404c, gVar.f22404c);
    }

    @Override // w2.l
    public long g(float f10) {
        return u.d(this.f22404c.a(f10));
    }

    @Override // w2.d
    public float getDensity() {
        return this.f22402a;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f22402a) * 31) + Float.hashCode(this.f22403b)) * 31) + this.f22404c.hashCode();
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.f22402a + ", fontScale=" + this.f22403b + ", converter=" + this.f22404c + ')';
    }

    @Override // w2.l
    public float y0() {
        return this.f22403b;
    }
}
