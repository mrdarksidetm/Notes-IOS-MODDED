package g2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11320b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f11321c = i(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f11322d = i(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f11323e = i(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f11324f = i(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f11325g = i(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f11326h = i(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f11327i = i(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11328a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return i.f11321c;
        }

        public final int b() {
            return i.f11322d;
        }

        public final int c() {
            return i.f11327i;
        }

        public final int d() {
            return i.f11326h;
        }

        public final int e() {
            return i.f11324f;
        }

        public final int f() {
            return i.f11323e;
        }

        public final int g() {
            return i.f11325g;
        }
    }

    private /* synthetic */ i(int i10) {
        this.f11328a = i10;
    }

    public static final /* synthetic */ i h(int i10) {
        return new i(i10);
    }

    private static int i(int i10) {
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
        return k(i10, f11321c) ? "Button" : k(i10, f11322d) ? "Checkbox" : k(i10, f11323e) ? "Switch" : k(i10, f11324f) ? "RadioButton" : k(i10, f11325g) ? "Tab" : k(i10, f11326h) ? "Image" : k(i10, f11327i) ? "DropdownList" : "Unknown";
    }

    public boolean equals(Object obj) {
        return j(this.f11328a, obj);
    }

    public int hashCode() {
        return l(this.f11328a);
    }

    public final /* synthetic */ int n() {
        return this.f11328a;
    }

    public String toString() {
        return m(this.f11328a);
    }
}
