package c0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6154b;

    public m(float f10) {
        super(null);
        this.f6153a = f10;
        this.f6154b = 1;
    }

    @Override // c0.q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f6153a;
        }
        return 0.0f;
    }

    @Override // c0.q
    public int b() {
        return this.f6154b;
    }

    @Override // c0.q
    public void d() {
        this.f6153a = 0.0f;
    }

    @Override // c0.q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f6153a = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            if (((m) obj).f6153a == this.f6153a) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.f6153a;
    }

    @Override // c0.q
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public m c() {
        return new m(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f6153a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f6153a;
    }
}
