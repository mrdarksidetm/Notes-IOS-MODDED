package u2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0439a f21511b = new C0439a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f21512c = c(0.5f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f21513d = c(-0.5f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f21514e = c(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f21515a;

    /* JADX INFO: renamed from: u2.a$a, reason: collision with other inner class name */
    public static final class C0439a {
        private C0439a() {
        }

        public /* synthetic */ C0439a(ae.j jVar) {
            this();
        }

        public final float a() {
            return a.f21514e;
        }
    }

    private /* synthetic */ a(float f10) {
        this.f21515a = f10;
    }

    public static final /* synthetic */ a b(float f10) {
        return new a(f10);
    }

    public static float c(float f10) {
        return f10;
    }

    public static boolean d(float f10, Object obj) {
        return (obj instanceof a) && Float.compare(f10, ((a) obj).h()) == 0;
    }

    public static final boolean e(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int f(float f10) {
        return Float.hashCode(f10);
    }

    public static String g(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f21515a, obj);
    }

    public final /* synthetic */ float h() {
        return this.f21515a;
    }

    public int hashCode() {
        return f(this.f21515a);
    }

    public String toString() {
        return g(this.f21515a);
    }
}
