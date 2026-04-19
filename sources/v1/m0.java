package v1;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21952a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f21953b = f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21954c = f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21955d = f(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f21956e = f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f21957f = f(4);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return m0.f21957f;
        }

        public final int b() {
            return m0.f21955d;
        }

        public final int c() {
            return m0.f21956e;
        }

        public final int d() {
            return m0.f21954c;
        }

        public final int e() {
            return m0.f21953b;
        }
    }

    private static int f(int i10) {
        return i10;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }
}
