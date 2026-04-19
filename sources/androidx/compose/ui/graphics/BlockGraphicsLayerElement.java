package androidx.compose.ui.graphics;

import a2.r0;
import ae.r;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class BlockGraphicsLayerElement extends r0<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<d, i0> f2745b;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(l<? super d, i0> lVar) {
        this.f2745b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && r.b(this.f2745b, ((BlockGraphicsLayerElement) obj).f2745b);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(this.f2745b);
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f2745b.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(a aVar) {
        aVar.c2(this.f2745b);
        aVar.b2();
    }

    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f2745b + ')';
    }
}
