package androidx.compose.ui.semantics;

import a2.r0;
import ae.r;
import g2.d;
import g2.n;
import g2.x;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class AppendedSemanticsElement extends r0<d> implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l<x, i0> f3118c;

    /* JADX WARN: Multi-variable type inference failed */
    public AppendedSemanticsElement(boolean z10, l<? super x, i0> lVar) {
        this.f3117b = z10;
        this.f3118c = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f3117b == appendedSemanticsElement.f3117b && r.b(this.f3118c, appendedSemanticsElement.f3118c);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d a() {
        return new d(this.f3117b, false, this.f3118c);
    }

    @Override // a2.r0
    public int hashCode() {
        return (Boolean.hashCode(this.f3117b) * 31) + this.f3118c.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(d dVar) {
        dVar.a2(this.f3117b);
        dVar.b2(this.f3118c);
    }

    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f3117b + ", properties=" + this.f3118c + ')';
    }

    @Override // g2.n
    public g2.l y() {
        g2.l lVar = new g2.l();
        lVar.x(this.f3117b);
        this.f3118c.invoke(lVar);
        return lVar;
    }
}
