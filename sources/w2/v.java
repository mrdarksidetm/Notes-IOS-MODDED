package w2;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22432b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f22433c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f22434d = e(4294967296L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f22435e = e(8589934592L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22436a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return v.f22435e;
        }

        public final long b() {
            return v.f22434d;
        }

        public final long c() {
            return v.f22433c;
        }
    }

    private /* synthetic */ v(long j10) {
        this.f22436a = j10;
    }

    public static final /* synthetic */ v d(long j10) {
        return new v(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof v) && j10 == ((v) obj).j();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return g(j10, f22433c) ? "Unspecified" : g(j10, f22434d) ? "Sp" : g(j10, f22435e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f22436a, obj);
    }

    public int hashCode() {
        return h(this.f22436a);
    }

    public final /* synthetic */ long j() {
        return this.f22436a;
    }

    public String toString() {
        return i(this.f22436a);
    }
}
