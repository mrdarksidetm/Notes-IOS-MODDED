package c0;

/* JADX INFO: loaded from: classes.dex */
public final class v implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f6211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f6212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f6213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f6214d;

    public v(float f10, float f11, float f12, float f13) {
        this.f6211a = f10;
        this.f6212b = f11;
        this.f6213c = f12;
        this.f6214d = f13;
        if ((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true) {
            return;
        }
        throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + com.amazon.a.a.o.c.a.b.f7490a).toString());
    }

    private final float b(float f10, float f11, float f12) {
        float f13 = 3;
        float f14 = 1 - f12;
        return (f10 * f13 * f14 * f14 * f12) + (f13 * f11 * f14 * f12 * f12) + (f12 * f12 * f12);
    }

    @Override // c0.b0
    public float a(float f10) {
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            float f12 = 1.0f;
            if (f10 < 1.0f) {
                while (true) {
                    float f13 = (f11 + f12) / 2;
                    float fB = b(this.f6211a, this.f6213c, f13);
                    if (Math.abs(f10 - fB) < 0.001f) {
                        return b(this.f6212b, this.f6214d, f13);
                    }
                    if (fB < f10) {
                        f11 = f13;
                    } else {
                        f12 = f13;
                    }
                }
            }
        }
        return f10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f6211a == vVar.f6211a) {
                if (this.f6212b == vVar.f6212b) {
                    if (this.f6213c == vVar.f6213c) {
                        if (this.f6214d == vVar.f6214d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f6211a) * 31) + Float.hashCode(this.f6212b)) * 31) + Float.hashCode(this.f6213c)) * 31) + Float.hashCode(this.f6214d);
    }
}
