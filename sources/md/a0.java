package md;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements Comparable<a0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15536b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15537a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private /* synthetic */ a0(int i10) {
        this.f15537a = i10;
    }

    public static final /* synthetic */ a0 a(int i10) {
        return new a0(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof a0) && i10 == ((a0) obj).l();
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    public static String j(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a0 a0Var) {
        return k0.b(l(), a0Var.l());
    }

    public boolean equals(Object obj) {
        return c(this.f15537a, obj);
    }

    public int hashCode() {
        return i(this.f15537a);
    }

    public final /* synthetic */ int l() {
        return this.f15537a;
    }

    public String toString() {
        return j(this.f15537a);
    }
}
