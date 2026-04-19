package b0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5030a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f5031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f5032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f5033d;

    /* JADX INFO: renamed from: b0.a$a, reason: collision with other inner class name */
    public static final class C0119a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f5034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f5035b;

        public C0119a(float f10, float f11) {
            this.f5034a = f10;
            this.f5035b = f11;
        }

        public final float a() {
            return this.f5034a;
        }

        public final float b() {
            return this.f5035b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0119a)) {
                return false;
            }
            C0119a c0119a = (C0119a) obj;
            return Float.compare(this.f5034a, c0119a.f5034a) == 0 && Float.compare(this.f5035b, c0119a.f5035b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f5034a) * 31) + Float.hashCode(this.f5035b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f5034a + ", velocityCoefficient=" + this.f5035b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f5031b = fArr;
        float[] fArr2 = new float[101];
        f5032c = fArr2;
        y.b(fArr, fArr2, 100);
        f5033d = 8;
    }

    private a() {
    }

    public final double a(float f10, float f11) {
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) f11));
    }

    public final C0119a b(float f10) {
        float f11;
        float f12;
        float f13 = 100;
        int i10 = (int) (f13 * f10);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f5031b;
            float f16 = fArr[i10];
            f12 = (fArr[i11] - f16) / (f15 - f14);
            f11 = f16 + ((f10 - f14) * f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        return new C0119a(f11, f12);
    }
}
