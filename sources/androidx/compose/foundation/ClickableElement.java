package androidx.compose.foundation;

import a2.r0;
import ae.r;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends r0<f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0.m f2193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f2195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g2.i f2196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zd.a<i0> f2197f;

    private ClickableElement(g0.m mVar, boolean z10, String str, g2.i iVar, zd.a<i0> aVar) {
        this.f2193b = mVar;
        this.f2194c = z10;
        this.f2195d = str;
        this.f2196e = iVar;
        this.f2197f = aVar;
    }

    public /* synthetic */ ClickableElement(g0.m mVar, boolean z10, String str, g2.i iVar, zd.a aVar, ae.j jVar) {
        this(mVar, z10, str, iVar, aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return r.b(this.f2193b, clickableElement.f2193b) && this.f2194c == clickableElement.f2194c && r.b(this.f2195d, clickableElement.f2195d) && r.b(this.f2196e, clickableElement.f2196e) && r.b(this.f2197f, clickableElement.f2197f);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public f a() {
        return new f(this.f2193b, this.f2194c, this.f2195d, this.f2196e, this.f2197f, null);
    }

    @Override // a2.r0
    public int hashCode() {
        int iHashCode = ((this.f2193b.hashCode() * 31) + Boolean.hashCode(this.f2194c)) * 31;
        String str = this.f2195d;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        g2.i iVar = this.f2196e;
        return ((iHashCode2 + (iVar != null ? g2.i.l(iVar.n()) : 0)) * 31) + this.f2197f.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(f fVar) {
        fVar.m2(this.f2193b, this.f2194c, this.f2195d, this.f2196e, this.f2197f);
    }
}
