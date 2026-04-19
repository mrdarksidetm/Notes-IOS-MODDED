package l1;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14565a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f14566b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14567c = c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f14568d = c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f14569e = c(3);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return s0.f14567c;
        }

        public final int b() {
            return s0.f14566b;
        }
    }

    public static int c(int i10) {
        return i10;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    public static String f(int i10) {
        return d(i10, f14566b) ? "None" : d(i10, f14567c) ? "Low" : d(i10, f14568d) ? "Medium" : d(i10, f14569e) ? "High" : "Unknown";
    }
}
