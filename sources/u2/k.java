package u2;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21574b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21575c = h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21576d = h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f21577e = h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f21578f = h(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f21579g = h(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f21580h = h(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21581a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return k.f21577e;
        }

        public final int b() {
            return k.f21578f;
        }

        public final int c() {
            return k.f21579g;
        }

        public final int d() {
            return k.f21575c;
        }

        public final int e() {
            return k.f21576d;
        }

        public final int f() {
            return k.f21580h;
        }
    }

    private /* synthetic */ k(int i10) {
        this.f21581a = i10;
    }

    public static final /* synthetic */ k g(int i10) {
        return new k(i10);
    }

    public static int h(int i10) {
        return i10;
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof k) && i10 == ((k) obj).m();
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    public static String l(int i10) {
        return j(i10, f21575c) ? "Ltr" : j(i10, f21576d) ? "Rtl" : j(i10, f21577e) ? "Content" : j(i10, f21578f) ? "ContentOrLtr" : j(i10, f21579g) ? "ContentOrRtl" : j(i10, f21580h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f21581a, obj);
    }

    public int hashCode() {
        return k(this.f21581a);
    }

    public final /* synthetic */ int m() {
        return this.f21581a;
    }

    public String toString() {
        return l(this.f21581a);
    }
}
