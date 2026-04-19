package w2;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22405b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f22406c = m(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f22407d = m(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f22408e = m(Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22409a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final float a() {
            return h.f22406c;
        }

        public final float b() {
            return h.f22407d;
        }

        public final float c() {
            return h.f22408e;
        }
    }

    private /* synthetic */ h(float f10) {
        this.f22409a = f10;
    }

    public static final /* synthetic */ h i(float f10) {
        return new h(f10);
    }

    public static int l(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static float m(float f10) {
        return f10;
    }

    public static boolean n(float f10, Object obj) {
        return (obj instanceof h) && Float.compare(f10, ((h) obj).r()) == 0;
    }

    public static final boolean o(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int p(float f10) {
        return Float.hashCode(f10);
    }

    public static String q(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(h hVar) {
        return j(hVar.r());
    }

    public boolean equals(Object obj) {
        return n(this.f22409a, obj);
    }

    public int hashCode() {
        return p(this.f22409a);
    }

    public int j(float f10) {
        return l(this.f22409a, f10);
    }

    public final /* synthetic */ float r() {
        return this.f22409a;
    }

    public String toString() {
        return q(this.f22409a);
    }
}
