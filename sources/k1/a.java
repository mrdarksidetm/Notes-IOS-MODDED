package k1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0333a f14332a = new C0333a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f14333b = b.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: k1.a$a, reason: collision with other inner class name */
    public static final class C0333a {
        private C0333a() {
        }

        public /* synthetic */ C0333a(ae.j jVar) {
            this();
        }

        public final long a() {
            return a.f14333b;
        }
    }

    public static long b(long j10) {
        return j10;
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        ae.l lVar = ae.l.f718a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float e(long j10) {
        ae.l lVar = ae.l.f718a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int f(long j10) {
        return Long.hashCode(j10);
    }

    public static String g(long j10) {
        StringBuilder sb2;
        float fE;
        if (d(j10) == e(j10)) {
            sb2 = new StringBuilder();
            sb2.append("CornerRadius.circular(");
            fE = d(j10);
        } else {
            sb2 = new StringBuilder();
            sb2.append("CornerRadius.elliptical(");
            sb2.append(c.a(d(j10), 1));
            sb2.append(", ");
            fE = e(j10);
        }
        sb2.append(c.a(fE, 1));
        sb2.append(')');
        return sb2.toString();
    }
}
