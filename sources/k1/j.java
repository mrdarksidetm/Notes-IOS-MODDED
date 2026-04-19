package k1;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f14349i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final j f14350j = k.c(0.0f, 0.0f, 0.0f, 0.0f, k1.a.f14332a.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f14351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f14352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f14353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f14354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f14355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f14356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f14357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f14358h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private j(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f14351a = f10;
        this.f14352b = f11;
        this.f14353c = f12;
        this.f14354d = f13;
        this.f14355e = j10;
        this.f14356f = j11;
        this.f14357g = j12;
        this.f14358h = j13;
    }

    public /* synthetic */ j(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, ae.j jVar) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    public final float a() {
        return this.f14354d;
    }

    public final long b() {
        return this.f14358h;
    }

    public final long c() {
        return this.f14357g;
    }

    public final float d() {
        return this.f14354d - this.f14352b;
    }

    public final float e() {
        return this.f14351a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f14351a, jVar.f14351a) == 0 && Float.compare(this.f14352b, jVar.f14352b) == 0 && Float.compare(this.f14353c, jVar.f14353c) == 0 && Float.compare(this.f14354d, jVar.f14354d) == 0 && k1.a.c(this.f14355e, jVar.f14355e) && k1.a.c(this.f14356f, jVar.f14356f) && k1.a.c(this.f14357g, jVar.f14357g) && k1.a.c(this.f14358h, jVar.f14358h);
    }

    public final float f() {
        return this.f14353c;
    }

    public final float g() {
        return this.f14352b;
    }

    public final long h() {
        return this.f14355e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f14351a) * 31) + Float.hashCode(this.f14352b)) * 31) + Float.hashCode(this.f14353c)) * 31) + Float.hashCode(this.f14354d)) * 31) + k1.a.f(this.f14355e)) * 31) + k1.a.f(this.f14356f)) * 31) + k1.a.f(this.f14357g)) * 31) + k1.a.f(this.f14358h);
    }

    public final long i() {
        return this.f14356f;
    }

    public final float j() {
        return this.f14353c - this.f14351a;
    }

    public String toString() {
        long j10 = this.f14355e;
        long j11 = this.f14356f;
        long j12 = this.f14357g;
        long j13 = this.f14358h;
        String str = c.a(this.f14351a, 1) + ", " + c.a(this.f14352b, 1) + ", " + c.a(this.f14353c, 1) + ", " + c.a(this.f14354d, 1);
        if (!k1.a.c(j10, j11) || !k1.a.c(j11, j12) || !k1.a.c(j12, j13)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) k1.a.g(j10)) + ", topRight=" + ((Object) k1.a.g(j11)) + ", bottomRight=" + ((Object) k1.a.g(j12)) + ", bottomLeft=" + ((Object) k1.a.g(j13)) + ')';
        }
        if (k1.a.d(j10) == k1.a.e(j10)) {
            return "RoundRect(rect=" + str + ", radius=" + c.a(k1.a.d(j10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + c.a(k1.a.d(j10), 1) + ", y=" + c.a(k1.a.e(j10), 1) + ')';
    }
}
