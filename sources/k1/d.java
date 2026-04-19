package k1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f14334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f14335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f14336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f14337d;

    public d(float f10, float f11, float f12, float f13) {
        this.f14334a = f10;
        this.f14335b = f11;
        this.f14336c = f12;
        this.f14337d = f13;
    }

    public final float a() {
        return this.f14337d;
    }

    public final float b() {
        return this.f14334a;
    }

    public final float c() {
        return this.f14336c;
    }

    public final float d() {
        return this.f14335b;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f14334a = Math.max(f10, this.f14334a);
        this.f14335b = Math.max(f11, this.f14335b);
        this.f14336c = Math.min(f12, this.f14336c);
        this.f14337d = Math.min(f13, this.f14337d);
    }

    public final boolean f() {
        return this.f14334a >= this.f14336c || this.f14335b >= this.f14337d;
    }

    public final void g(float f10, float f11, float f12, float f13) {
        this.f14334a = f10;
        this.f14335b = f11;
        this.f14336c = f12;
        this.f14337d = f13;
    }

    public final void h(float f10) {
        this.f14337d = f10;
    }

    public final void i(float f10) {
        this.f14334a = f10;
    }

    public final void j(float f10) {
        this.f14336c = f10;
    }

    public final void k(float f10) {
        this.f14335b = f10;
    }

    public String toString() {
        return "MutableRect(" + c.a(this.f14334a, 1) + ", " + c.a(this.f14335b, 1) + ", " + c.a(this.f14336c, 1) + ", " + c.a(this.f14337d, 1) + ')';
    }
}
