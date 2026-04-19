package androidx.compose.ui.input.pointer;

import a2.r0;
import ae.r;
import v1.v;
import v1.w;

/* JADX INFO: loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends r0<v> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f2813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2814c;

    public PointerHoverIconModifierElement(w wVar, boolean z10) {
        this.f2813b = wVar;
        this.f2814c = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return r.b(this.f2813b, pointerHoverIconModifierElement.f2813b) && this.f2814c == pointerHoverIconModifierElement.f2814c;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public v a() {
        return new v(this.f2813b, this.f2814c);
    }

    @Override // a2.r0
    public int hashCode() {
        return (this.f2813b.hashCode() * 31) + Boolean.hashCode(this.f2814c);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(v vVar) {
        vVar.l2(this.f2813b);
        vVar.m2(this.f2814c);
    }

    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f2813b + ", overrideDescendants=" + this.f2814c + ')';
    }
}
