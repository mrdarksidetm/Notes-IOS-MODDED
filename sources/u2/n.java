package u2;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21587c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final n f21588d = new n(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f21589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f21590b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final n a() {
            return n.f21588d;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public n(float f10, float f11) {
        this.f21589a = f10;
        this.f21590b = f11;
    }

    public /* synthetic */ n(float f10, float f11, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }

    public final float b() {
        return this.f21589a;
    }

    public final float c() {
        return this.f21590b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f21589a == nVar.f21589a) {
            return (this.f21590b > nVar.f21590b ? 1 : (this.f21590b == nVar.f21590b ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f21589a) * 31) + Float.hashCode(this.f21590b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f21589a + ", skewX=" + this.f21590b + ')';
    }
}
