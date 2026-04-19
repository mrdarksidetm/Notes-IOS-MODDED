package i2;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u2.o f12406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f12407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u2.g f12408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f12409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f12410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u2.p f12411i;

    private s(int i10, int i11, long j10, u2.o oVar, w wVar, u2.g gVar, int i12, int i13, u2.p pVar) {
        this.f12403a = i10;
        this.f12404b = i11;
        this.f12405c = j10;
        this.f12406d = oVar;
        this.f12407e = wVar;
        this.f12408f = gVar;
        this.f12409g = i12;
        this.f12410h = i13;
        this.f12411i = pVar;
        if (w2.t.e(j10, w2.t.f22428b.a())) {
            return;
        }
        if (w2.t.h(j10) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + w2.t.h(j10) + ')').toString());
    }

    public /* synthetic */ s(int i10, int i11, long j10, u2.o oVar, w wVar, u2.g gVar, int i12, int i13, u2.p pVar, int i14, ae.j jVar) {
        this((i14 & 1) != 0 ? u2.i.f21560b.g() : i10, (i14 & 2) != 0 ? u2.k.f21574b.f() : i11, (i14 & 4) != 0 ? w2.t.f22428b.a() : j10, (i14 & 8) != 0 ? null : oVar, (i14 & 16) != 0 ? null : wVar, (i14 & 32) != 0 ? null : gVar, (i14 & 64) != 0 ? u2.e.f21523a.b() : i12, (i14 & 128) != 0 ? u2.d.f21519a.c() : i13, (i14 & 256) == 0 ? pVar : null, null);
    }

    public /* synthetic */ s(int i10, int i11, long j10, u2.o oVar, w wVar, u2.g gVar, int i12, int i13, u2.p pVar, ae.j jVar) {
        this(i10, i11, j10, oVar, wVar, gVar, i12, i13, pVar);
    }

    public final s a(int i10, int i11, long j10, u2.o oVar, w wVar, u2.g gVar, int i12, int i13, u2.p pVar) {
        return new s(i10, i11, j10, oVar, wVar, gVar, i12, i13, pVar, null);
    }

    public final int c() {
        return this.f12410h;
    }

    public final int d() {
        return this.f12409g;
    }

    public final long e() {
        return this.f12405c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return u2.i.k(this.f12403a, sVar.f12403a) && u2.k.j(this.f12404b, sVar.f12404b) && w2.t.e(this.f12405c, sVar.f12405c) && ae.r.b(this.f12406d, sVar.f12406d) && ae.r.b(this.f12407e, sVar.f12407e) && ae.r.b(this.f12408f, sVar.f12408f) && u2.e.d(this.f12409g, sVar.f12409g) && u2.d.e(this.f12410h, sVar.f12410h) && ae.r.b(this.f12411i, sVar.f12411i);
    }

    public final u2.g f() {
        return this.f12408f;
    }

    public final w g() {
        return this.f12407e;
    }

    public final int h() {
        return this.f12403a;
    }

    public int hashCode() {
        int iL = ((((u2.i.l(this.f12403a) * 31) + u2.k.k(this.f12404b)) * 31) + w2.t.i(this.f12405c)) * 31;
        u2.o oVar = this.f12406d;
        int iHashCode = (iL + (oVar != null ? oVar.hashCode() : 0)) * 31;
        w wVar = this.f12407e;
        int iHashCode2 = (iHashCode + (wVar != null ? wVar.hashCode() : 0)) * 31;
        u2.g gVar = this.f12408f;
        int iHashCode3 = (((((iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31) + u2.e.h(this.f12409g)) * 31) + u2.d.f(this.f12410h)) * 31;
        u2.p pVar = this.f12411i;
        return iHashCode3 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final int i() {
        return this.f12404b;
    }

    public final u2.o j() {
        return this.f12406d;
    }

    public final u2.p k() {
        return this.f12411i;
    }

    public final s l(s sVar) {
        return sVar == null ? this : t.a(this, sVar.f12403a, sVar.f12404b, sVar.f12405c, sVar.f12406d, sVar.f12407e, sVar.f12408f, sVar.f12409g, sVar.f12410h, sVar.f12411i);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) u2.i.m(this.f12403a)) + ", textDirection=" + ((Object) u2.k.l(this.f12404b)) + ", lineHeight=" + ((Object) w2.t.j(this.f12405c)) + ", textIndent=" + this.f12406d + ", platformStyle=" + this.f12407e + ", lineHeightStyle=" + this.f12408f + ", lineBreak=" + ((Object) u2.e.i(this.f12409g)) + ", hyphens=" + ((Object) u2.d.g(this.f12410h)) + ", textMotion=" + this.f12411i + ')';
    }
}
