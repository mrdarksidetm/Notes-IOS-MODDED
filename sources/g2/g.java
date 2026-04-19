package g2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11311b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f11312c = c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f11313d = c(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11314a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return g.f11313d;
        }

        public final int b() {
            return g.f11312c;
        }
    }

    private static int c(int i10) {
        return i10;
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof g) && i10 == ((g) obj).h();
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return e(i10, f11312c) ? "Polite" : e(i10, f11313d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return d(this.f11314a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f11314a;
    }

    public int hashCode() {
        return f(this.f11314a);
    }

    public String toString() {
        return g(this.f11314a);
    }
}
