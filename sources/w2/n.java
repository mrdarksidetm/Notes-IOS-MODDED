package w2;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22418b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f22419c = o.a(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22420a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return n.f22419c;
        }
    }

    private /* synthetic */ n(long j10) {
        this.f22420a = j10;
    }

    public static final /* synthetic */ n b(long j10) {
        return new n(j10);
    }

    public static final int c(long j10) {
        return j(j10);
    }

    public static final int d(long j10) {
        return k(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, int i10, int i11) {
        return o.a(i10, i11);
    }

    public static /* synthetic */ long g(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = j(j10);
        }
        if ((i12 & 2) != 0) {
            i11 = k(j10);
        }
        return f(j10, i10, i11);
    }

    public static boolean h(long j10, Object obj) {
        return (obj instanceof n) && j10 == ((n) obj).n();
    }

    public static final boolean i(long j10, long j11) {
        return j10 == j11;
    }

    public static final int j(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int k(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int l(long j10) {
        return Long.hashCode(j10);
    }

    public static String m(long j10) {
        return '(' + j(j10) + ", " + k(j10) + ')';
    }

    public boolean equals(Object obj) {
        return h(this.f22420a, obj);
    }

    public int hashCode() {
        return l(this.f22420a);
    }

    public final /* synthetic */ long n() {
        return this.f22420a;
    }

    public String toString() {
        return m(this.f22420a);
    }
}
