package n0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0357a f15605a = new C0357a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f15606b = b(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: n0.a$a, reason: collision with other inner class name */
    public static final class C0357a {
        private C0357a() {
        }

        public /* synthetic */ C0357a(ae.j jVar) {
            this();
        }

        public final long a() {
            return a.f15606b;
        }
    }

    public static long b(float f10, float f11) {
        return c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    private static long c(long j10) {
        return j10;
    }

    public static long d(w2.d dVar) {
        return b(dVar.getDensity(), dVar.y0());
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }
}
