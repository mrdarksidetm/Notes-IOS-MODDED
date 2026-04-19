package i2;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12353b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f12354c = f0.a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f12355a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return e0.f12354c;
        }
    }

    private /* synthetic */ e0(long j10) {
        this.f12355a = j10;
    }

    public static final /* synthetic */ e0 b(long j10) {
        return new e0(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof e0) && j10 == ((e0) obj).n();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean f(long j10) {
        return k(j10) == g(j10);
    }

    public static final int g(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int h(long j10) {
        return i(j10) - j(j10);
    }

    public static final int i(long j10) {
        return k(j10) > g(j10) ? k(j10) : g(j10);
    }

    public static final int j(long j10) {
        return k(j10) > g(j10) ? g(j10) : k(j10);
    }

    public static final int k(long j10) {
        return (int) (j10 >> 32);
    }

    public static int l(long j10) {
        return Long.hashCode(j10);
    }

    public static String m(long j10) {
        return "TextRange(" + k(j10) + ", " + g(j10) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f12355a, obj);
    }

    public int hashCode() {
        return l(this.f12355a);
    }

    public final /* synthetic */ long n() {
        return this.f12355a;
    }

    public String toString() {
        return m(this.f12355a);
    }
}
