package g2;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11315d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h f11316e = new h(0.0f, ge.n.b(0.0f, 0.0f), 0, 4, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f11317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ge.e<Float> f11318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11319c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final h a() {
            return h.f11316e;
        }
    }

    public h(float f10, ge.e<Float> eVar, int i10) {
        this.f11317a = f10;
        this.f11318b = eVar;
        this.f11319c = i10;
        if (!(!Float.isNaN(f10))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public /* synthetic */ h(float f10, ge.e eVar, int i10, int i11, ae.j jVar) {
        this(f10, eVar, (i11 & 4) != 0 ? 0 : i10);
    }

    public final float b() {
        return this.f11317a;
    }

    public final ge.e<Float> c() {
        return this.f11318b;
    }

    public final int d() {
        return this.f11319c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return ((this.f11317a > hVar.f11317a ? 1 : (this.f11317a == hVar.f11317a ? 0 : -1)) == 0) && ae.r.b(this.f11318b, hVar.f11318b) && this.f11319c == hVar.f11319c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f11317a) * 31) + this.f11318b.hashCode()) * 31) + this.f11319c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f11317a + ", range=" + this.f11318b + ", steps=" + this.f11319c + ')';
    }
}
