package k1;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14359b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f14360c = m.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f14361d = m.a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14362a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return l.f14361d;
        }

        public final long b() {
            return l.f14360c;
        }
    }

    private /* synthetic */ l(long j10) {
        this.f14362a = j10;
    }

    public static final /* synthetic */ l c(long j10) {
        return new l(j10);
    }

    public static long d(long j10) {
        return j10;
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof l) && j10 == ((l) obj).m();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final float g(long j10) {
        if (!(j10 != f14361d)) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        ae.l lVar = ae.l.f718a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final float h(long j10) {
        return Math.min(Math.abs(i(j10)), Math.abs(g(j10)));
    }

    public static final float i(long j10) {
        if (!(j10 != f14361d)) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        ae.l lVar = ae.l.f718a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean k(long j10) {
        return i(j10) <= 0.0f || g(j10) <= 0.0f;
    }

    public static String l(long j10) {
        if (!(j10 != f14359b.a())) {
            return "Size.Unspecified";
        }
        return "Size(" + c.a(i(j10), 1) + ", " + c.a(g(j10), 1) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f14362a, obj);
    }

    public int hashCode() {
        return j(this.f14362a);
    }

    public final /* synthetic */ long m() {
        return this.f14362a;
    }

    public String toString() {
        return l(this.f14362a);
    }
}
