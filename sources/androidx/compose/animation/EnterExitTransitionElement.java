package androidx.compose.animation;

import a2.r0;
import ae.r;
import b0.q;
import c0.f1;
import c0.n;
import w2.p;

/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionElement extends r0<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f1<b0.l> f2047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f1<b0.l>.a<p, n> f2048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f1<b0.l>.a<w2.n, n> f2049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f1<b0.l>.a<w2.n, n> f2050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f2051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j f2052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f2053h;

    public EnterExitTransitionElement(f1<b0.l> f1Var, f1<b0.l>.a<p, n> aVar, f1<b0.l>.a<w2.n, n> aVar2, f1<b0.l>.a<w2.n, n> aVar3, h hVar, j jVar, q qVar) {
        this.f2047b = f1Var;
        this.f2048c = aVar;
        this.f2049d = aVar2;
        this.f2050e = aVar3;
        this.f2051f = hVar;
        this.f2052g = jVar;
        this.f2053h = qVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return r.b(this.f2047b, enterExitTransitionElement.f2047b) && r.b(this.f2048c, enterExitTransitionElement.f2048c) && r.b(this.f2049d, enterExitTransitionElement.f2049d) && r.b(this.f2050e, enterExitTransitionElement.f2050e) && r.b(this.f2051f, enterExitTransitionElement.f2051f) && r.b(this.f2052g, enterExitTransitionElement.f2052g) && r.b(this.f2053h, enterExitTransitionElement.f2053h);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public g a() {
        return new g(this.f2047b, this.f2048c, this.f2049d, this.f2050e, this.f2051f, this.f2052g, this.f2053h);
    }

    @Override // a2.r0
    public int hashCode() {
        int iHashCode = this.f2047b.hashCode() * 31;
        f1<b0.l>.a<p, n> aVar = this.f2048c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        f1<b0.l>.a<w2.n, n> aVar2 = this.f2049d;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        f1<b0.l>.a<w2.n, n> aVar3 = this.f2050e;
        return ((((((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.f2051f.hashCode()) * 31) + this.f2052g.hashCode()) * 31) + this.f2053h.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(g gVar) {
        gVar.k2(this.f2047b);
        gVar.i2(this.f2048c);
        gVar.h2(this.f2049d);
        gVar.j2(this.f2050e);
        gVar.d2(this.f2051f);
        gVar.e2(this.f2052g);
        gVar.f2(this.f2053h);
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.f2047b + ", sizeAnimation=" + this.f2048c + ", offsetAnimation=" + this.f2049d + ", slideAnimation=" + this.f2050e + ", enter=" + this.f2051f + ", exit=" + this.f2052g + ", graphicsLayerBlock=" + this.f2053h + ')';
    }
}
