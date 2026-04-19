package m1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15189a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f15190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f15191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f15192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f15193e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return b.f15192d;
        }

        public final long b() {
            return b.f15190b;
        }

        public final long c() {
            return b.f15191c;
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f15190b = d((((long) 0) & 4294967295L) | j11);
        f15191c = d((((long) 1) & 4294967295L) | j11);
        f15192d = d(j11 | (((long) 2) & 4294967295L));
        f15193e = d((j10 & 4294967295L) | (((long) 4) << 32));
    }

    public static long d(long j10) {
        return j10;
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return e(j10, f15190b) ? "Rgb" : e(j10, f15191c) ? "Xyz" : e(j10, f15192d) ? "Lab" : e(j10, f15193e) ? "Cmyk" : "Unknown";
    }
}
