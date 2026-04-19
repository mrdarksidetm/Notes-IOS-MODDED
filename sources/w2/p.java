package w2;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22421b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f22422c = c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22423a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return p.f22422c;
        }
    }

    private /* synthetic */ p(long j10) {
        this.f22423a = j10;
    }

    public static final /* synthetic */ p b(long j10) {
        return new p(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof p) && j10 == ((p) obj).j();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int g(long j10) {
        return (int) (j10 >> 32);
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return g(j10) + " x " + f(j10);
    }

    public boolean equals(Object obj) {
        return d(this.f22423a, obj);
    }

    public int hashCode() {
        return h(this.f22423a);
    }

    public final /* synthetic */ long j() {
        return this.f22423a;
    }

    public String toString() {
        return i(this.f22423a);
    }
}
