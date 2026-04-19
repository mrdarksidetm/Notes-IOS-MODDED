package androidx.compose.foundation.layout;

import a2.r0;
import h0.w;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutWeightElement extends r0<w> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2442c;

    public LayoutWeightElement(float f10, boolean z10) {
        this.f2441b = f10;
        this.f2442c = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return ((this.f2441b > layoutWeightElement.f2441b ? 1 : (this.f2441b == layoutWeightElement.f2441b ? 0 : -1)) == 0) && this.f2442c == layoutWeightElement.f2442c;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public w a() {
        return new w(this.f2441b, this.f2442c);
    }

    @Override // a2.r0
    public int hashCode() {
        return (Float.hashCode(this.f2441b) * 31) + Boolean.hashCode(this.f2442c);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(w wVar) {
        wVar.c2(this.f2441b);
        wVar.b2(this.f2442c);
    }
}
