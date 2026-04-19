package l0;

import k1.l;

/* JADX INFO: loaded from: classes.dex */
final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f14485a;

    public e(float f10) {
        this.f14485a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // l0.b
    public float a(long j10, w2.d dVar) {
        return l.h(j10) * (this.f14485a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f14485a, ((e) obj).f14485a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f14485a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f14485a + "%)";
    }
}
