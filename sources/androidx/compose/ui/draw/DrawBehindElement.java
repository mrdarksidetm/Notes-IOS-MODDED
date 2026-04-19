package androidx.compose.ui.draw;

import a2.r0;
import ae.r;
import i1.h;
import md.i0;
import n1.f;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class DrawBehindElement extends r0<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<f, i0> f2640b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(l<? super f, i0> lVar) {
        this.f2640b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && r.b(this.f2640b, ((DrawBehindElement) obj).f2640b);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public h a() {
        return new h(this.f2640b);
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f2640b.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(h hVar) {
        hVar.a2(this.f2640b);
    }

    public String toString() {
        return "DrawBehindElement(onDraw=" + this.f2640b + ')';
    }
}
