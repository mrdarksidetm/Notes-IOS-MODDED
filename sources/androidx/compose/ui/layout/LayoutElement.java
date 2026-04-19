package androidx.compose.ui.layout;

import a2.r0;
import ae.r;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.w;
import zd.q;

/* JADX INFO: loaded from: classes.dex */
final class LayoutElement extends r0<w> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q<g0, d0, w2.b, f0> f2823b;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(q<? super g0, ? super d0, ? super w2.b, ? extends f0> qVar) {
        this.f2823b = qVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && r.b(this.f2823b, ((LayoutElement) obj).f2823b);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public w a() {
        return new w(this.f2823b);
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f2823b.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(w wVar) {
        wVar.a2(this.f2823b);
    }

    public String toString() {
        return "LayoutElement(measure=" + this.f2823b + ')';
    }
}
