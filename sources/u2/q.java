package u2;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21604a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f21605b = d(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21606c = d(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21607d = d(3);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return q.f21605b;
        }

        public final int b() {
            return q.f21606c;
        }

        public final int c() {
            return q.f21607d;
        }
    }

    public static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return e(i10, f21605b) ? "Clip" : e(i10, f21606c) ? "Ellipsis" : e(i10, f21607d) ? "Visible" : "Invalid";
    }
}
