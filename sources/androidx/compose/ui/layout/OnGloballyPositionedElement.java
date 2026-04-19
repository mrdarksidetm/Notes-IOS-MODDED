package androidx.compose.ui.layout;

import a2.r0;
import md.i0;
import y1.r;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class OnGloballyPositionedElement extends r0<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<r, i0> f2824b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(l<? super r, i0> lVar) {
        this.f2824b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return ae.r.b(this.f2824b, ((OnGloballyPositionedElement) obj).f2824b);
        }
        return false;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this.f2824b);
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f2824b.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(c cVar) {
        cVar.a2(this.f2824b);
    }
}
