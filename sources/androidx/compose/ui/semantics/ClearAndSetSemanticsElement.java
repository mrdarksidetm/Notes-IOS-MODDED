package androidx.compose.ui.semantics;

import a2.r0;
import ae.r;
import g2.d;
import g2.n;
import g2.x;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends r0<d> implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<x, i0> f3119b;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(l<? super x, i0> lVar) {
        this.f3119b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && r.b(this.f3119b, ((ClearAndSetSemanticsElement) obj).f3119b);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d a() {
        return new d(false, true, this.f3119b);
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f3119b.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(d dVar) {
        dVar.b2(this.f3119b);
    }

    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f3119b + ')';
    }

    @Override // g2.n
    public g2.l y() {
        g2.l lVar = new g2.l();
        lVar.x(false);
        lVar.w(true);
        this.f3119b.invoke(lVar);
        return lVar;
    }
}
