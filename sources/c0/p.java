package c0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f6176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f6177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f6178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f6179e;

    public p(float f10, float f11, float f12, float f13) {
        super(null);
        this.f6175a = f10;
        this.f6176b = f11;
        this.f6177c = f12;
        this.f6178d = f13;
        this.f6179e = 4;
    }

    @Override // c0.q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f6175a;
        }
        if (i10 == 1) {
            return this.f6176b;
        }
        if (i10 == 2) {
            return this.f6177c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f6178d;
    }

    @Override // c0.q
    public int b() {
        return this.f6179e;
    }

    @Override // c0.q
    public void d() {
        this.f6175a = 0.0f;
        this.f6176b = 0.0f;
        this.f6177c = 0.0f;
        this.f6178d = 0.0f;
    }

    @Override // c0.q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f6175a = f10;
            return;
        }
        if (i10 == 1) {
            this.f6176b = f10;
        } else if (i10 == 2) {
            this.f6177c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f6178d = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.f6175a == this.f6175a) {
                if (pVar.f6176b == this.f6176b) {
                    if (pVar.f6177c == this.f6177c) {
                        if (pVar.f6178d == this.f6178d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final float f() {
        return this.f6175a;
    }

    public final float g() {
        return this.f6176b;
    }

    public final float h() {
        return this.f6177c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f6175a) * 31) + Float.hashCode(this.f6176b)) * 31) + Float.hashCode(this.f6177c)) * 31) + Float.hashCode(this.f6178d);
    }

    public final float i() {
        return this.f6178d;
    }

    @Override // c0.q
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p c() {
        return new p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f6175a + ", v2 = " + this.f6176b + ", v3 = " + this.f6177c + ", v4 = " + this.f6178d;
    }
}
