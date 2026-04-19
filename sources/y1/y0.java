package y1;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23357a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f23358b = z0.a(Float.NaN, Float.NaN);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public static long a(long j10) {
        return j10;
    }

    public static final float b(long j10) {
        if (!(j10 != f23358b)) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        ae.l lVar = ae.l.f718a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        if (!(j10 != f23358b)) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        ae.l lVar = ae.l.f718a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }
}
