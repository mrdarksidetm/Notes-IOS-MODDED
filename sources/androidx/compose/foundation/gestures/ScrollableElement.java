package androidx.compose.foundation.gestures;

import a2.r0;
import d0.j0;
import e0.p;
import e0.r;
import e0.z;
import g0.m;

/* JADX INFO: loaded from: classes.dex */
final class ScrollableElement extends r0<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f2280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f2281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j0 f2282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f2283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f2284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f2285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f2286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e0.f f2287i;

    public ScrollableElement(z zVar, r rVar, j0 j0Var, boolean z10, boolean z11, p pVar, m mVar, e0.f fVar) {
        this.f2280b = zVar;
        this.f2281c = rVar;
        this.f2282d = j0Var;
        this.f2283e = z10;
        this.f2284f = z11;
        this.f2285g = pVar;
        this.f2286h = mVar;
        this.f2287i = fVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return ae.r.b(this.f2280b, scrollableElement.f2280b) && this.f2281c == scrollableElement.f2281c && ae.r.b(this.f2282d, scrollableElement.f2282d) && this.f2283e == scrollableElement.f2283e && this.f2284f == scrollableElement.f2284f && ae.r.b(this.f2285g, scrollableElement.f2285g) && ae.r.b(this.f2286h, scrollableElement.f2286h) && ae.r.b(this.f2287i, scrollableElement.f2287i);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public g a() {
        return new g(this.f2280b, this.f2281c, this.f2282d, this.f2283e, this.f2284f, this.f2285g, this.f2286h, this.f2287i);
    }

    @Override // a2.r0
    public int hashCode() {
        int iHashCode = ((this.f2280b.hashCode() * 31) + this.f2281c.hashCode()) * 31;
        j0 j0Var = this.f2282d;
        int iHashCode2 = (((((iHashCode + (j0Var != null ? j0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f2283e)) * 31) + Boolean.hashCode(this.f2284f)) * 31;
        p pVar = this.f2285g;
        int iHashCode3 = (iHashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        m mVar = this.f2286h;
        return ((iHashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31) + this.f2287i.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(g gVar) {
        gVar.g2(this.f2280b, this.f2281c, this.f2282d, this.f2283e, this.f2284f, this.f2285g, this.f2286h, this.f2287i);
    }
}
