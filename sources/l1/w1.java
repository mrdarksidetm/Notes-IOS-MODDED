package l1;

/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14633a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f14634b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14635c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f14636d = d(2);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return w1.f14636d;
        }

        public final int b() {
            return w1.f14634b;
        }

        public final int c() {
            return w1.f14635c;
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
        return e(i10, f14634b) ? "Miter" : e(i10, f14635c) ? "Round" : e(i10, f14636d) ? "Bevel" : "Unknown";
    }
}
