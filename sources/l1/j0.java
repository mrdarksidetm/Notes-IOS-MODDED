package l1;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14524b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f14525c = l0.d(4278190080L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f14526d = l0.d(4282664004L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f14527e = l0.d(4287137928L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f14528f = l0.d(4291611852L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f14529g = l0.d(4294967295L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f14530h = l0.d(4294901760L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f14531i = l0.d(4278255360L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f14532j = l0.d(4278190335L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f14533k = l0.d(4294967040L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f14534l = l0.d(4278255615L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f14535m = l0.d(4294902015L);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f14536n = l0.b(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f14537o = l0.a(0.0f, 0.0f, 0.0f, 0.0f, m1.g.f15198a.y());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14538a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return j0.f14525c;
        }

        public final long b() {
            return j0.f14532j;
        }

        public final long c() {
            return j0.f14534l;
        }

        public final long d() {
            return j0.f14526d;
        }

        public final long e() {
            return j0.f14527e;
        }

        public final long f() {
            return j0.f14531i;
        }

        public final long g() {
            return j0.f14528f;
        }

        public final long h() {
            return j0.f14530h;
        }

        public final long i() {
            return j0.f14536n;
        }

        public final long j() {
            return j0.f14537o;
        }

        public final long k() {
            return j0.f14529g;
        }

        public final long l() {
            return j0.f14533k;
        }
    }

    private /* synthetic */ j0(long j10) {
        this.f14538a = j10;
    }

    public static final float A(long j10) {
        return md.c0.b(63 & j10) == 0 ? ((float) md.k0.e(md.c0.b(md.c0.b(j10 >>> 40) & 255))) / 255.0f : t0.c(t0.b((short) md.c0.b(md.c0.b(j10 >>> 32) & 65535)));
    }

    public static final float B(long j10) {
        return md.c0.b(63 & j10) == 0 ? ((float) md.k0.e(md.c0.b(md.c0.b(j10 >>> 48) & 255))) / 255.0f : t0.c(t0.b((short) md.c0.b(r4 & 65535)));
    }

    public static int C(long j10) {
        return md.c0.j(j10);
    }

    public static String D(long j10) {
        return "Color(" + B(j10) + ", " + A(j10) + ", " + y(j10) + ", " + x(j10) + ", " + z(j10).h() + ')';
    }

    public static final /* synthetic */ j0 m(long j10) {
        return new j0(j10);
    }

    public static final float n(long j10) {
        return B(j10);
    }

    public static final float o(long j10) {
        return A(j10);
    }

    public static final float p(long j10) {
        return y(j10);
    }

    public static final float q(long j10) {
        return x(j10);
    }

    public static long r(long j10) {
        return j10;
    }

    public static final long s(long j10, m1.c cVar) {
        m1.c cVarZ = z(j10);
        return ae.r.b(cVar, cVarZ) ? j10 : m1.d.i(cVarZ, cVar, 0, 2, null).e(B(j10), A(j10), y(j10), x(j10));
    }

    public static final long t(long j10, float f10, float f11, float f12, float f13) {
        return l0.a(f11, f12, f13, f10, z(j10));
    }

    public static /* synthetic */ long u(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = x(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = B(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = A(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = y(j10);
        }
        return t(j10, f14, f15, f16, f13);
    }

    public static boolean v(long j10, Object obj) {
        return (obj instanceof j0) && j10 == ((j0) obj).E();
    }

    public static final boolean w(long j10, long j11) {
        return md.c0.i(j10, j11);
    }

    public static final float x(long j10) {
        float fE;
        float f10;
        if (md.c0.b(63 & j10) == 0) {
            fE = (float) md.k0.e(md.c0.b(md.c0.b(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            fE = (float) md.k0.e(md.c0.b(md.c0.b(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return fE / f10;
    }

    public static final float y(long j10) {
        return md.c0.b(63 & j10) == 0 ? ((float) md.k0.e(md.c0.b(md.c0.b(j10 >>> 32) & 255))) / 255.0f : t0.c(t0.b((short) md.c0.b(md.c0.b(j10 >>> 16) & 65535)));
    }

    public static final m1.c z(long j10) {
        m1.g gVar = m1.g.f15198a;
        return gVar.l()[(int) md.c0.b(j10 & 63)];
    }

    public final /* synthetic */ long E() {
        return this.f14538a;
    }

    public boolean equals(Object obj) {
        return v(this.f14538a, obj);
    }

    public int hashCode() {
        return C(this.f14538a);
    }

    public String toString() {
        return D(this.f14538a);
    }
}
