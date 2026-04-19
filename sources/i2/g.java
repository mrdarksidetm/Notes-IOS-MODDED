package i2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12362b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f12363c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f12364d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12365a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return g.f12363c;
        }

        public final int b() {
            return g.f12364d;
        }
    }

    private /* synthetic */ g(int i10) {
        this.f12365a = i10;
    }

    public static final /* synthetic */ g c(int i10) {
        return new g(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof g) && i10 == ((g) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        if (i10 == f12363c) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == f12364d) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f12365a, obj);
    }

    public int hashCode() {
        return g(this.f12365a);
    }

    public final /* synthetic */ int i() {
        return this.f12365a;
    }

    public String toString() {
        return h(this.f12365a);
    }
}
