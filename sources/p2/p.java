package p2;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18169a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f18170b = e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f18171c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f18172d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f18173e = e(3);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return p.f18171c;
        }

        public final int b() {
            return p.f18170b;
        }

        public final int c() {
            return p.f18173e;
        }

        public final int d() {
            return p.f18172d;
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
        return f(i10, f18170b) ? "None" : f(i10, f18171c) ? "Characters" : f(i10, f18172d) ? "Words" : f(i10, f18173e) ? "Sentences" : "Invalid";
    }
}
