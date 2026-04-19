package n2;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15789b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15790c = c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f15791d = c(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f15792e = c(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f15793f = c(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15794a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return f0.f15791d;
        }
    }

    private /* synthetic */ f0(int i10) {
        this.f15794a = i10;
    }

    public static final /* synthetic */ f0 b(int i10) {
        return new f0(i10);
    }

    public static int c(int i10) {
        return i10;
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof f0) && i10 == ((f0) obj).j();
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static final boolean g(int i10) {
        return e(i10, f15791d) || e(i10, f15793f);
    }

    public static final boolean h(int i10) {
        return e(i10, f15791d) || e(i10, f15792e);
    }

    public static String i(int i10) {
        return e(i10, f15790c) ? "None" : e(i10, f15791d) ? "All" : e(i10, f15792e) ? "Weight" : e(i10, f15793f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return d(this.f15794a, obj);
    }

    public int hashCode() {
        return f(this.f15794a);
    }

    public final /* synthetic */ int j() {
        return this.f15794a;
    }

    public String toString() {
        return i(this.f15794a);
    }
}
