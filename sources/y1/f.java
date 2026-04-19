package y1;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23237a = a.f23238a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f23238a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final f f23239b = new C0484a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final f f23240c = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final f f23241d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final f f23242e = new d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final f f23243f = new C0485f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final i f23244g = new i(1.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final f f23245h = new b();

        /* JADX INFO: renamed from: y1.f$a$a, reason: collision with other inner class name */
        public static final class C0484a implements f {
            C0484a() {
            }

            @Override // y1.f
            public long a(long j10, long j11) {
                float f10 = g.f(j10, j11);
                return z0.a(f10, f10);
            }
        }

        public static final class b implements f {
            b() {
            }

            @Override // y1.f
            public long a(long j10, long j11) {
                return z0.a(g.h(j10, j11), g.e(j10, j11));
            }
        }

        public static final class c implements f {
            c() {
            }

            @Override // y1.f
            public long a(long j10, long j11) {
                float fE = g.e(j10, j11);
                return z0.a(fE, fE);
            }
        }

        public static final class d implements f {
            d() {
            }

            @Override // y1.f
            public long a(long j10, long j11) {
                float fH = g.h(j10, j11);
                return z0.a(fH, fH);
            }
        }

        public static final class e implements f {
            e() {
            }

            @Override // y1.f
            public long a(long j10, long j11) {
                float fG = g.g(j10, j11);
                return z0.a(fG, fG);
            }
        }

        /* JADX INFO: renamed from: y1.f$a$f, reason: collision with other inner class name */
        public static final class C0485f implements f {
            C0485f() {
            }

            @Override // y1.f
            public long a(long j10, long j11) {
                float fG = (k1.l.i(j10) > k1.l.i(j11) || k1.l.g(j10) > k1.l.g(j11)) ? g.g(j10, j11) : 1.0f;
                return z0.a(fG, fG);
            }
        }

        private a() {
        }

        public final f a() {
            return f23239b;
        }

        public final f b() {
            return f23240c;
        }

        public final f c() {
            return f23243f;
        }

        public final i d() {
            return f23244g;
        }
    }

    long a(long j10, long j11);
}
