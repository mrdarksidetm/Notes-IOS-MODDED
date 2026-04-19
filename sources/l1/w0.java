package l1;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14626b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14627c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f14628d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f14629e = g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f14630f = g(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f14631g = g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14632a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return w0.f14628d;
        }

        public final int b() {
            return w0.f14627c;
        }

        public final int c() {
            return w0.f14630f;
        }

        public final int d() {
            return w0.f14631g;
        }

        public final int e() {
            return w0.f14629e;
        }
    }

    private /* synthetic */ w0(int i10) {
        this.f14632a = i10;
    }

    public static final /* synthetic */ w0 f(int i10) {
        return new w0(i10);
    }

    public static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof w0) && i10 == ((w0) obj).l();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return i(i10, f14627c) ? "Argb8888" : i(i10, f14628d) ? "Alpha8" : i(i10, f14629e) ? "Rgb565" : i(i10, f14630f) ? "F16" : i(i10, f14631g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f14632a, obj);
    }

    public int hashCode() {
        return j(this.f14632a);
    }

    public final /* synthetic */ int l() {
        return this.f14632a;
    }

    public String toString() {
        return k(this.f14632a);
    }
}
