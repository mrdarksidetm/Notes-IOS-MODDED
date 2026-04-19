package androidx.compose.ui.draw;

import a2.r0;
import ae.r;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithContentElement extends r0<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<n1.c, i0> f2642b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(l<? super n1.c, i0> lVar) {
        this.f2642b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && r.b(this.f2642b, ((DrawWithContentElement) obj).f2642b);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this.f2642b);
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f2642b.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(c cVar) {
        cVar.a2(this.f2642b);
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.f2642b + ')';
    }
}
