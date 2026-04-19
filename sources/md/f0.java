package md;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements Comparable<f0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15552b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f15553a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private /* synthetic */ f0(short s10) {
        this.f15553a = s10;
    }

    public static final /* synthetic */ f0 a(short s10) {
        return new f0(s10);
    }

    public static short b(short s10) {
        return s10;
    }

    public static boolean c(short s10, Object obj) {
        return (obj instanceof f0) && s10 == ((f0) obj).l();
    }

    public static int i(short s10) {
        return Short.hashCode(s10);
    }

    public static String j(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(f0 f0Var) {
        return ae.r.g(l() & 65535, f0Var.l() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f15553a, obj);
    }

    public int hashCode() {
        return i(this.f15553a);
    }

    public final /* synthetic */ short l() {
        return this.f15553a;
    }

    public String toString() {
        return j(this.f15553a);
    }
}
