package p2;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18174a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f18175b = j(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f18176c = j(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f18177d = j(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f18178e = j(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f18179f = j(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f18180g = j(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f18181h = j(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f18182i = j(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f18183j = j(9);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return q.f18176c;
        }

        public final int b() {
            return q.f18183j;
        }

        public final int c() {
            return q.f18180g;
        }

        public final int d() {
            return q.f18177d;
        }

        public final int e() {
            return q.f18182i;
        }

        public final int f() {
            return q.f18181h;
        }

        public final int g() {
            return q.f18178e;
        }

        public final int h() {
            return q.f18175b;
        }

        public final int i() {
            return q.f18179f;
        }
    }

    public static int j(int i10) {
        return i10;
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    public static String m(int i10) {
        return k(i10, f18175b) ? "Text" : k(i10, f18176c) ? "Ascii" : k(i10, f18177d) ? "Number" : k(i10, f18178e) ? "Phone" : k(i10, f18179f) ? "Uri" : k(i10, f18180g) ? "Email" : k(i10, f18181h) ? "Password" : k(i10, f18182i) ? "NumberPassword" : k(i10, f18183j) ? "Decimal" : "Invalid";
    }
}
