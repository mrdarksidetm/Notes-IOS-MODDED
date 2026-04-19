package l1;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14638a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f14639b = e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14640c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f14641d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f14642e = e(3);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return x1.f14639b;
        }

        public final int b() {
            return x1.f14642e;
        }

        public final int c() {
            return x1.f14641d;
        }

        public final int d() {
            return x1.f14640c;
        }
    }

    public static int e(int i10) {
        return i10;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f14639b) ? "Clamp" : f(i10, f14640c) ? "Repeated" : f(i10, f14641d) ? "Mirror" : f(i10, f14642e) ? "Decal" : "Unknown";
    }
}
