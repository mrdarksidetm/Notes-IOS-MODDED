package androidx.compose.foundation.layout;

import a2.r0;
import f1.b;
import h0.n0;

/* JADX INFO: loaded from: classes.dex */
public final class VerticalAlignElement extends r0<n0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.c f2463b;

    public VerticalAlignElement(b.c cVar) {
        this.f2463b = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return ae.r.b(this.f2463b, verticalAlignElement.f2463b);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public n0 a() {
        return new n0(this.f2463b);
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f2463b.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(n0 n0Var) {
        n0Var.b2(this.f2463b);
    }
}
