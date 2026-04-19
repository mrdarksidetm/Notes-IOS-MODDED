package k1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14338b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f14339c = g.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f14340d = g.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f14341e = g.a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14342a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return f.f14340d;
        }

        public final long b() {
            return f.f14341e;
        }

        public final long c() {
            return f.f14339c;
        }
    }

    private /* synthetic */ f(long j10) {
        this.f14342a = j10;
    }

    public static final /* synthetic */ f d(long j10) {
        return new f(j10);
    }

    public static final float e(long j10) {
        return o(j10);
    }

    public static final float f(long j10) {
        return p(j10);
    }

    public static long g(long j10) {
        return j10;
    }

    public static final long h(long j10, float f10, float f11) {
        return g.a(f10, f11);
    }

    public static /* synthetic */ long i(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = o(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = p(j10);
        }
        return h(j10, f10, f11);
    }

    public static final long j(long j10, float f10) {
        return g.a(o(j10) / f10, p(j10) / f10);
    }

    public static boolean k(long j10, Object obj) {
        return (obj instanceof f) && j10 == ((f) obj).x();
    }

    public static final boolean l(long j10, long j11) {
        return j10 == j11;
    }

    public static final float m(long j10) {
        return (float) Math.sqrt((o(j10) * o(j10)) + (p(j10) * p(j10)));
    }

    public static final float n(long j10) {
        return (o(j10) * o(j10)) + (p(j10) * p(j10));
    }

    public static final float o(long j10) {
        if (!(j10 != f14341e)) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        ae.l lVar = ae.l.f718a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float p(long j10) {
        if (!(j10 != f14341e)) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        ae.l lVar = ae.l.f718a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int q(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean r(long j10) {
        if ((Float.isNaN(o(j10)) || Float.isNaN(p(j10))) ? false : true) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    public static final long s(long j10, long j11) {
        return g.a(o(j10) - o(j11), p(j10) - p(j11));
    }

    public static final long t(long j10, long j11) {
        return g.a(o(j10) + o(j11), p(j10) + p(j11));
    }

    public static final long u(long j10, float f10) {
        return g.a(o(j10) * f10, p(j10) * f10);
    }

    public static String v(long j10) {
        if (!g.c(j10)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + c.a(o(j10), 1) + ", " + c.a(p(j10), 1) + ')';
    }

    public static final long w(long j10) {
        return g.a(-o(j10), -p(j10));
    }

    public boolean equals(Object obj) {
        return k(this.f14342a, obj);
    }

    public int hashCode() {
        return q(this.f14342a);
    }

    public String toString() {
        return v(this.f14342a);
    }

    public final /* synthetic */ long x() {
        return this.f14342a;
    }
}
