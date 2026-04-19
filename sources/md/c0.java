package md;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements Comparable<c0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15542b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f15543a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private /* synthetic */ c0(long j10) {
        this.f15543a = j10;
    }

    public static final /* synthetic */ c0 a(long j10) {
        return new c0(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof c0) && j10 == ((c0) obj).m();
    }

    public static final boolean i(long j10, long j11) {
        return j10 == j11;
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static String l(long j10) {
        return k0.f(j10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(c0 c0Var) {
        return k0.d(m(), c0Var.m());
    }

    public boolean equals(Object obj) {
        return c(this.f15543a, obj);
    }

    public int hashCode() {
        return j(this.f15543a);
    }

    public final /* synthetic */ long m() {
        return this.f15543a;
    }

    public String toString() {
        return l(this.f15543a);
    }
}
