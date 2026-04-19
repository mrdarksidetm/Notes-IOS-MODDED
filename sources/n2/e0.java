package n2;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15784b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15785c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f15786d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15787a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return e0.f15786d;
        }

        public final int b() {
            return e0.f15785c;
        }
    }

    private /* synthetic */ e0(int i10) {
        this.f15787a = i10;
    }

    public static final /* synthetic */ e0 c(int i10) {
        return new e0(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof e0) && i10 == ((e0) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f15785c) ? "Normal" : f(i10, f15786d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f15787a, obj);
    }

    public int hashCode() {
        return g(this.f15787a);
    }

    public final /* synthetic */ int i() {
        return this.f15787a;
    }

    public String toString() {
        return h(this.f15787a);
    }
}
