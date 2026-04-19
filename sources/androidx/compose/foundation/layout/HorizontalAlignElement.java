package androidx.compose.foundation.layout;

import a2.r0;
import f1.b;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalAlignElement extends r0<h0.p> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.InterfaceC0266b f2437b;

    public HorizontalAlignElement(b.InterfaceC0266b interfaceC0266b) {
        this.f2437b = interfaceC0266b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return ae.r.b(this.f2437b, horizontalAlignElement.f2437b);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public h0.p a() {
        return new h0.p(this.f2437b);
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f2437b.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(h0.p pVar) {
        pVar.b2(this.f2437b);
    }
}
