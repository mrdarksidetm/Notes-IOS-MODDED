package i2;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12416a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f12417b = h(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f12418c = h(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f12419d = h(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f12420e = h(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f12421f = h(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f12422g = h(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f12423h = h(7);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return v.f12417b;
        }

        public final int b() {
            return v.f12419d;
        }

        public final int c() {
            return v.f12420e;
        }

        public final int d() {
            return v.f12422g;
        }

        public final int e() {
            return v.f12423h;
        }

        public final int f() {
            return v.f12421f;
        }

        public final int g() {
            return v.f12418c;
        }
    }

    public static int h(int i10) {
        return i10;
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return i(i10, f12417b) ? "AboveBaseline" : i(i10, f12418c) ? "Top" : i(i10, f12419d) ? "Bottom" : i(i10, f12420e) ? "Center" : i(i10, f12421f) ? "TextTop" : i(i10, f12422g) ? "TextBottom" : i(i10, f12423h) ? "TextCenter" : "Invalid";
    }
}
