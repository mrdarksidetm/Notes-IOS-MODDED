package c0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f6164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6165c;

    public n(float f10, float f11) {
        super(null);
        this.f6163a = f10;
        this.f6164b = f11;
        this.f6165c = 2;
    }

    @Override // c0.q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f6163a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f6164b;
    }

    @Override // c0.q
    public int b() {
        return this.f6165c;
    }

    @Override // c0.q
    public void d() {
        this.f6163a = 0.0f;
        this.f6164b = 0.0f;
    }

    @Override // c0.q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f6163a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f6164b = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.f6163a == this.f6163a) {
                if (nVar.f6164b == this.f6164b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f() {
        return this.f6163a;
    }

    public final float g() {
        return this.f6164b;
    }

    @Override // c0.q
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public n c() {
        return new n(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f6163a) * 31) + Float.hashCode(this.f6164b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f6163a + ", v2 = " + this.f6164b;
    }
}
