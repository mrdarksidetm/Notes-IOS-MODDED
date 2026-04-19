package n2;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15768a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f15769b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15770c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f15771d = d(2);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return c0.f15771d;
        }

        public final int b() {
            return c0.f15769b;
        }

        public final int c() {
            return c0.f15770c;
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
        if (e(i10, f15769b)) {
            return "Blocking";
        }
        if (e(i10, f15770c)) {
            return "Optional";
        }
        if (e(i10, f15771d)) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }
}
