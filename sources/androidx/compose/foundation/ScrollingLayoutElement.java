package androidx.compose.foundation;

import a2.r0;
import ae.r;
import d0.n0;
import d0.o0;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLayoutElement extends r0<o0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f2204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f2206d;

    public ScrollingLayoutElement(n0 n0Var, boolean z10, boolean z11) {
        this.f2204b = n0Var;
        this.f2205c = z10;
        this.f2206d = z11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return r.b(this.f2204b, scrollingLayoutElement.f2204b) && this.f2205c == scrollingLayoutElement.f2205c && this.f2206d == scrollingLayoutElement.f2206d;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public o0 a() {
        return new o0(this.f2204b, this.f2205c, this.f2206d);
    }

    @Override // a2.r0
    public int hashCode() {
        return (((this.f2204b.hashCode() * 31) + Boolean.hashCode(this.f2205c)) * 31) + Boolean.hashCode(this.f2206d);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(o0 o0Var) {
        o0Var.e2(this.f2204b);
        o0Var.d2(this.f2205c);
        o0Var.f2(this.f2206d);
    }
}
