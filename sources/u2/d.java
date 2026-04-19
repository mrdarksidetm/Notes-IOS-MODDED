package u2;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21519a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f21520b = d(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21521c = d(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21522d = d(Integer.MIN_VALUE);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return d.f21521c;
        }

        public final int b() {
            return d.f21520b;
        }

        public final int c() {
            return d.f21522d;
        }
    }

    private static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return e(i10, f21520b) ? "Hyphens.None" : e(i10, f21521c) ? "Hyphens.Auto" : e(i10, f21522d) ? "Hyphens.Unspecified" : "Invalid";
    }
}
