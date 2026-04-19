package androidx.compose.foundation;

import a2.r0;
import ae.r;

/* JADX INFO: loaded from: classes.dex */
final class HoverableElement extends r0<o> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0.m f2203b;

    public HoverableElement(g0.m mVar) {
        this.f2203b = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && r.b(((HoverableElement) obj).f2203b, this.f2203b);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public o a() {
        return new o(this.f2203b);
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f2203b.hashCode() * 31;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(o oVar) {
        oVar.d2(this.f2203b);
    }
}
