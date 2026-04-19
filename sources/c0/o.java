package c0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f6171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f6172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6173d;

    public o(float f10, float f11, float f12) {
        super(null);
        this.f6170a = f10;
        this.f6171b = f11;
        this.f6172c = f12;
        this.f6173d = 3;
    }

    @Override // c0.q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f6170a;
        }
        if (i10 == 1) {
            return this.f6171b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f6172c;
    }

    @Override // c0.q
    public int b() {
        return this.f6173d;
    }

    @Override // c0.q
    public void d() {
        this.f6170a = 0.0f;
        this.f6171b = 0.0f;
        this.f6172c = 0.0f;
    }

    @Override // c0.q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f6170a = f10;
        } else if (i10 == 1) {
            this.f6171b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f6172c = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.f6170a == this.f6170a) {
                if (oVar.f6171b == this.f6171b) {
                    if (oVar.f6172c == this.f6172c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // c0.q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public o c() {
        return new o(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f6170a) * 31) + Float.hashCode(this.f6171b)) * 31) + Float.hashCode(this.f6172c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f6170a + ", v2 = " + this.f6171b + ", v3 = " + this.f6172c;
    }
}
