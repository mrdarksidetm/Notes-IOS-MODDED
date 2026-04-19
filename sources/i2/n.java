package i2;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f12393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f12398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f12399g;

    public n(m mVar, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f12393a = mVar;
        this.f12394b = i10;
        this.f12395c = i11;
        this.f12396d = i12;
        this.f12397e = i13;
        this.f12398f = f10;
        this.f12399g = f11;
    }

    public final float a() {
        return this.f12399g;
    }

    public final int b() {
        return this.f12395c;
    }

    public final int c() {
        return this.f12397e;
    }

    public final int d() {
        return this.f12395c - this.f12394b;
    }

    public final m e() {
        return this.f12393a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return ae.r.b(this.f12393a, nVar.f12393a) && this.f12394b == nVar.f12394b && this.f12395c == nVar.f12395c && this.f12396d == nVar.f12396d && this.f12397e == nVar.f12397e && Float.compare(this.f12398f, nVar.f12398f) == 0 && Float.compare(this.f12399g, nVar.f12399g) == 0;
    }

    public final int f() {
        return this.f12394b;
    }

    public final int g() {
        return this.f12396d;
    }

    public final float h() {
        return this.f12398f;
    }

    public int hashCode() {
        return (((((((((((this.f12393a.hashCode() * 31) + Integer.hashCode(this.f12394b)) * 31) + Integer.hashCode(this.f12395c)) * 31) + Integer.hashCode(this.f12396d)) * 31) + Integer.hashCode(this.f12397e)) * 31) + Float.hashCode(this.f12398f)) * 31) + Float.hashCode(this.f12399g);
    }

    public final k1.h i(k1.h hVar) {
        return hVar.q(k1.g.a(0.0f, this.f12398f));
    }

    public final int j(int i10) {
        return i10 + this.f12394b;
    }

    public final int k(int i10) {
        return i10 + this.f12396d;
    }

    public final float l(float f10) {
        return f10 + this.f12398f;
    }

    public final long m(long j10) {
        return k1.g.a(k1.f.o(j10), k1.f.p(j10) - this.f12398f);
    }

    public final int n(int i10) {
        return ge.o.l(i10, this.f12394b, this.f12395c) - this.f12394b;
    }

    public final int o(int i10) {
        return i10 - this.f12396d;
    }

    public final float p(float f10) {
        return f10 - this.f12398f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f12393a + ", startIndex=" + this.f12394b + ", endIndex=" + this.f12395c + ", startLineIndex=" + this.f12396d + ", endLineIndex=" + this.f12397e + ", top=" + this.f12398f + ", bottom=" + this.f12399g + ')';
    }
}
