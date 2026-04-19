package p0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f17792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f17793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f17794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f17795d;

    public f(float f10, float f11, float f12, float f13) {
        this.f17792a = f10;
        this.f17793b = f11;
        this.f17794c = f12;
        this.f17795d = f13;
    }

    public final float a() {
        return this.f17792a;
    }

    public final float b() {
        return this.f17793b;
    }

    public final float c() {
        return this.f17794c;
    }

    public final float d() {
        return this.f17795d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!(this.f17792a == fVar.f17792a)) {
            return false;
        }
        if (!(this.f17793b == fVar.f17793b)) {
            return false;
        }
        if (this.f17794c == fVar.f17794c) {
            return (this.f17795d > fVar.f17795d ? 1 : (this.f17795d == fVar.f17795d ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f17792a) * 31) + Float.hashCode(this.f17793b)) * 31) + Float.hashCode(this.f17794c)) * 31) + Float.hashCode(this.f17795d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f17792a + ", focusedAlpha=" + this.f17793b + ", hoveredAlpha=" + this.f17794c + ", pressedAlpha=" + this.f17795d + ')';
    }
}
