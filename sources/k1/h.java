package k1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14343e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f14344f = new h(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f14345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f14346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f14347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f14348d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final h a() {
            return h.f14344f;
        }
    }

    public h(float f10, float f11, float f12, float f13) {
        this.f14345a = f10;
        this.f14346b = f11;
        this.f14347c = f12;
        this.f14348d = f13;
    }

    public final boolean b(long j10) {
        return f.o(j10) >= this.f14345a && f.o(j10) < this.f14347c && f.p(j10) >= this.f14346b && f.p(j10) < this.f14348d;
    }

    public final float c() {
        return this.f14348d;
    }

    public final long d() {
        return g.a(this.f14345a + (k() / 2.0f), this.f14346b + (e() / 2.0f));
    }

    public final float e() {
        return this.f14348d - this.f14346b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f14345a, hVar.f14345a) == 0 && Float.compare(this.f14346b, hVar.f14346b) == 0 && Float.compare(this.f14347c, hVar.f14347c) == 0 && Float.compare(this.f14348d, hVar.f14348d) == 0;
    }

    public final float f() {
        return this.f14345a;
    }

    public final float g() {
        return this.f14347c;
    }

    public final long h() {
        return m.a(k(), e());
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f14345a) * 31) + Float.hashCode(this.f14346b)) * 31) + Float.hashCode(this.f14347c)) * 31) + Float.hashCode(this.f14348d);
    }

    public final float i() {
        return this.f14346b;
    }

    public final long j() {
        return g.a(this.f14345a, this.f14346b);
    }

    public final float k() {
        return this.f14347c - this.f14345a;
    }

    public final h l(float f10, float f11, float f12, float f13) {
        return new h(Math.max(this.f14345a, f10), Math.max(this.f14346b, f11), Math.min(this.f14347c, f12), Math.min(this.f14348d, f13));
    }

    public final h m(h hVar) {
        return new h(Math.max(this.f14345a, hVar.f14345a), Math.max(this.f14346b, hVar.f14346b), Math.min(this.f14347c, hVar.f14347c), Math.min(this.f14348d, hVar.f14348d));
    }

    public final boolean n() {
        return this.f14345a >= this.f14347c || this.f14346b >= this.f14348d;
    }

    public final boolean o(h hVar) {
        return this.f14347c > hVar.f14345a && hVar.f14347c > this.f14345a && this.f14348d > hVar.f14346b && hVar.f14348d > this.f14346b;
    }

    public final h p(float f10, float f11) {
        return new h(this.f14345a + f10, this.f14346b + f11, this.f14347c + f10, this.f14348d + f11);
    }

    public final h q(long j10) {
        return new h(this.f14345a + f.o(j10), this.f14346b + f.p(j10), this.f14347c + f.o(j10), this.f14348d + f.p(j10));
    }

    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.f14345a, 1) + ", " + c.a(this.f14346b, 1) + ", " + c.a(this.f14347c, 1) + ", " + c.a(this.f14348d, 1) + ')';
    }
}
