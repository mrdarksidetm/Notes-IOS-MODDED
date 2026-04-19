package w2;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22437b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f22438c = x.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22439a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final long a() {
            return w.f22438c;
        }
    }

    private /* synthetic */ w(long j10) {
        this.f22439a = j10;
    }

    public static final /* synthetic */ w b(long j10) {
        return new w(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static final long d(long j10, float f10, float f11) {
        return x.a(f10, f11);
    }

    public static /* synthetic */ long e(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = i(j10);
        }
        return d(j10, f10, f11);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof w) && j10 == ((w) obj).o();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final float h(long j10) {
        ae.l lVar = ae.l.f718a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float i(long j10) {
        ae.l lVar = ae.l.f718a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static final long k(long j10, long j11) {
        return x.a(h(j10) - h(j11), i(j10) - i(j11));
    }

    public static final long l(long j10, long j11) {
        return x.a(h(j10) + h(j11), i(j10) + i(j11));
    }

    public static final long m(long j10, float f10) {
        return x.a(h(j10) * f10, i(j10) * f10);
    }

    public static String n(long j10) {
        return '(' + h(j10) + ", " + i(j10) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return f(this.f22439a, obj);
    }

    public int hashCode() {
        return j(this.f22439a);
    }

    public final /* synthetic */ long o() {
        return this.f22439a;
    }

    public String toString() {
        return n(this.f22439a);
    }
}
