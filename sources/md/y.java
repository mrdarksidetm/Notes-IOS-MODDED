package md;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements Comparable<y> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15587b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f15588a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private /* synthetic */ y(byte b10) {
        this.f15588a = b10;
    }

    public static final /* synthetic */ y a(byte b10) {
        return new y(b10);
    }

    public static byte b(byte b10) {
        return b10;
    }

    public static boolean c(byte b10, Object obj) {
        return (obj instanceof y) && b10 == ((y) obj).l();
    }

    public static int i(byte b10) {
        return Byte.hashCode(b10);
    }

    public static String j(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(y yVar) {
        return ae.r.g(l() & 255, yVar.l() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f15588a, obj);
    }

    public int hashCode() {
        return i(this.f15588a);
    }

    public final /* synthetic */ byte l() {
        return this.f15588a;
    }

    public String toString() {
        return j(this.f15588a);
    }
}
