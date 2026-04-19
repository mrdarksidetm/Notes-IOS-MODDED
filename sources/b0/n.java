package b0;

import c0.e0;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f5141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0<Float> f5142b;

    public n(float f10, e0<Float> e0Var) {
        this.f5141a = f10;
        this.f5142b = e0Var;
    }

    public final float a() {
        return this.f5141a;
    }

    public final e0<Float> b() {
        return this.f5142b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f5141a, nVar.f5141a) == 0 && ae.r.b(this.f5142b, nVar.f5142b);
    }

    public int hashCode() {
        return (Float.hashCode(this.f5141a) * 31) + this.f5142b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f5141a + ", animationSpec=" + this.f5142b + ')';
    }
}
