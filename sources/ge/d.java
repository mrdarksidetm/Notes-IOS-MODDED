package ge;

/* JADX INFO: loaded from: classes2.dex */
final class d implements e<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f11531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f11532b;

    public d(float f10, float f11) {
        this.f11531a = f10;
        this.f11532b = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ge.e
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable, Comparable comparable2) {
        return e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    @Override // ge.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float f() {
        return Float.valueOf(this.f11532b);
    }

    @Override // ge.f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float d() {
        return Float.valueOf(this.f11531a);
    }

    public boolean e(float f10, float f11) {
        return f10 <= f11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (isEmpty() && ((d) obj).isEmpty()) {
                return true;
            }
            d dVar = (d) obj;
            if (this.f11531a == dVar.f11531a) {
                if (this.f11532b == dVar.f11532b) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f11531a) * 31) + Float.hashCode(this.f11532b);
    }

    @Override // ge.e, ge.f
    public boolean isEmpty() {
        return this.f11531a > this.f11532b;
    }

    public String toString() {
        return this.f11531a + ".." + this.f11532b;
    }
}
