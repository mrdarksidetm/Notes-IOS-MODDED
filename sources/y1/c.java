package y1;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public interface a {
        boolean a();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23214a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f23215b = g(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f23216c = g(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f23217d = g(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f23218e = g(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f23219f = g(5);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f23220g = g(6);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(ae.j jVar) {
                this();
            }

            public final int a() {
                return b.f23219f;
            }

            public final int b() {
                return b.f23216c;
            }

            public final int c() {
                return b.f23215b;
            }

            public final int d() {
                return b.f23220g;
            }

            public final int e() {
                return b.f23217d;
            }

            public final int f() {
                return b.f23218e;
            }
        }

        public static int g(int i10) {
            return i10;
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }
    }

    <T> T a(int i10, zd.l<? super a, ? extends T> lVar);
}
