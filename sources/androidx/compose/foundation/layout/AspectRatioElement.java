package androidx.compose.foundation.layout;

import a2.r0;
import b2.w0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
final class AspectRatioElement extends r0<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.l<w0, i0> f2429d;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectRatioElement(float f10, boolean z10, zd.l<? super w0, i0> lVar) {
        this.f2427b = f10;
        this.f2428c = z10;
        this.f2429d = lVar;
        if (f10 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f10 + " must be > 0").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null) {
            return false;
        }
        return ((this.f2427b > aspectRatioElement.f2427b ? 1 : (this.f2427b == aspectRatioElement.f2427b ? 0 : -1)) == 0) && this.f2428c == ((AspectRatioElement) obj).f2428c;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this.f2427b, this.f2428c);
    }

    @Override // a2.r0
    public int hashCode() {
        return (Float.hashCode(this.f2427b) * 31) + Boolean.hashCode(this.f2428c);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(b bVar) {
        bVar.b2(this.f2427b);
        bVar.c2(this.f2428c);
    }
}
