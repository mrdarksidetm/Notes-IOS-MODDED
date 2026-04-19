package p2;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f18147b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f18148c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f18149d = j(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f18150e = j(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f18151f = j(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f18152g = j(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f18153h = j(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f18154i = j(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f18155j = j(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18156a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return j.f18148c;
        }

        public final int b() {
            return j.f18155j;
        }

        public final int c() {
            return j.f18150e;
        }

        public final int d() {
            return j.f18154i;
        }

        public final int e() {
            return j.f18149d;
        }

        public final int f() {
            return j.f18153h;
        }

        public final int g() {
            return j.f18151f;
        }

        public final int h() {
            return j.f18152g;
        }
    }

    private /* synthetic */ j(int i10) {
        this.f18156a = i10;
    }

    public static final /* synthetic */ j i(int i10) {
        return new j(i10);
    }

    public static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof j) && i10 == ((j) obj).o();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        return l(i10, f18149d) ? "None" : l(i10, f18148c) ? "Default" : l(i10, f18150e) ? "Go" : l(i10, f18151f) ? "Search" : l(i10, f18152g) ? "Send" : l(i10, f18153h) ? "Previous" : l(i10, f18154i) ? "Next" : l(i10, f18155j) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return k(this.f18156a, obj);
    }

    public int hashCode() {
        return m(this.f18156a);
    }

    public final /* synthetic */ int o() {
        return this.f18156a;
    }

    public String toString() {
        return n(this.f18156a);
    }
}
