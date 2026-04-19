package v1;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21884a;

    private /* synthetic */ a0(long j10) {
        this.f21884a = j10;
    }

    public static final /* synthetic */ a0 a(long j10) {
        return new a0(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof a0) && j10 == ((a0) obj).g();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String f(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f21884a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f21884a;
    }

    public int hashCode() {
        return e(this.f21884a);
    }

    public String toString() {
        return f(this.f21884a);
    }
}
