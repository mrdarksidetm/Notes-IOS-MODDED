package i0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f12049a;

    private /* synthetic */ b(long j10) {
        this.f12049a = j10;
    }

    public static final /* synthetic */ b a(long j10) {
        return new b(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).g();
    }

    public static final int d(long j10) {
        return (int) j10;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String f(long j10) {
        return "GridItemSpan(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f12049a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f12049a;
    }

    public int hashCode() {
        return e(this.f12049a);
    }

    public String toString() {
        return f(this.f12049a);
    }
}
