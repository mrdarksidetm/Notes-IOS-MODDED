package u2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21560b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21561c = i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21562d = i(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f21563e = i(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f21564f = i(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f21565g = i(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f21566h = i(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f21567i = i(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21568a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return i.f21563e;
        }

        public final int b() {
            return i.f21566h;
        }

        public final int c() {
            return i.f21564f;
        }

        public final int d() {
            return i.f21561c;
        }

        public final int e() {
            return i.f21562d;
        }

        public final int f() {
            return i.f21565g;
        }

        public final int g() {
            return i.f21567i;
        }
    }

    private /* synthetic */ i(int i10) {
        this.f21568a = i10;
    }

    public static final /* synthetic */ i h(int i10) {
        return new i(i10);
    }

    public static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof i) && i10 == ((i) obj).n();
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    public static String m(int i10) {
        return k(i10, f21561c) ? "Left" : k(i10, f21562d) ? "Right" : k(i10, f21563e) ? "Center" : k(i10, f21564f) ? "Justify" : k(i10, f21565g) ? "Start" : k(i10, f21566h) ? "End" : k(i10, f21567i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.f21568a, obj);
    }

    public int hashCode() {
        return l(this.f21568a);
    }

    public final /* synthetic */ int n() {
        return this.f21568a;
    }

    public String toString() {
        return m(this.f21568a);
    }
}
