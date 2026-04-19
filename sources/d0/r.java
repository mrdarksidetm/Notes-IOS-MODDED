package d0;

import b2.w0;
import b2.x0;

/* JADX INFO: loaded from: classes.dex */
final class r extends x0 implements i1.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f9292c;

    public r(a aVar, zd.l<? super w0, md.i0> lVar) {
        super(lVar);
        this.f9292c = aVar;
    }

    @Override // i1.j
    public void A(n1.c cVar) {
        cVar.u1();
        this.f9292c.w(cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return ae.r.b(this.f9292c, ((r) obj).f9292c);
        }
        return false;
    }

    public int hashCode() {
        return this.f9292c.hashCode();
    }

    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f9292c + ')';
    }
}
