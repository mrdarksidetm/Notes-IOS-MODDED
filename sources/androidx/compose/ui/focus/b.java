package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2698b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f2699c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f2700d = j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f2701e = j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f2702f = j(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f2703g = j(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f2704h = j(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f2705i = j(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f2706j = j(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2707a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return b.f2704h;
        }

        public final int b() {
            return b.f2705i;
        }

        public final int c() {
            return b.f2706j;
        }

        public final int d() {
            return b.f2701e;
        }

        public final int e() {
            return b.f2699c;
        }

        public final int f() {
            return b.f2700d;
        }

        public final int g() {
            return b.f2702f;
        }

        public final int h() {
            return b.f2703g;
        }
    }

    private /* synthetic */ b(int i10) {
        this.f2707a = i10;
    }

    public static final /* synthetic */ b i(int i10) {
        return new b(i10);
    }

    public static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).o();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        return l(i10, f2699c) ? "Next" : l(i10, f2700d) ? "Previous" : l(i10, f2701e) ? "Left" : l(i10, f2702f) ? "Right" : l(i10, f2703g) ? "Up" : l(i10, f2704h) ? "Down" : l(i10, f2705i) ? "Enter" : l(i10, f2706j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f2707a, obj);
    }

    public int hashCode() {
        return m(this.f2707a);
    }

    public final /* synthetic */ int o() {
        return this.f2707a;
    }

    public String toString() {
        return n(this.f2707a);
    }
}
