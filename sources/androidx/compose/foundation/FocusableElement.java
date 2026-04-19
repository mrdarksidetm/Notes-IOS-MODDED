package androidx.compose.foundation;

import a2.r0;
import ae.r;

/* JADX INFO: loaded from: classes.dex */
final class FocusableElement extends r0<k> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0.m f2198b;

    public FocusableElement(g0.m mVar) {
        this.f2198b = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusableElement) && r.b(this.f2198b, ((FocusableElement) obj).f2198b);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public k a() {
        return new k(this.f2198b);
    }

    @Override // a2.r0
    public int hashCode() {
        g0.m mVar = this.f2198b;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(k kVar) {
        kVar.g2(this.f2198b);
    }
}
