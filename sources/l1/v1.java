package l1;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14620a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f14621b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14622c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f14623d = d(2);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return v1.f14621b;
        }

        public final int b() {
            return v1.f14622c;
        }

        public final int c() {
            return v1.f14623d;
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
        return e(i10, f14621b) ? "Butt" : e(i10, f14622c) ? "Round" : e(i10, f14623d) ? "Square" : "Unknown";
    }
}
