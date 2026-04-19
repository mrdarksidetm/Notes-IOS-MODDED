package androidx.compose.foundation.layout;

import a2.r0;
import b2.w0;
import h0.u;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicHeightElement extends r0<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f2438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.l<w0, i0> f2440d;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicHeightElement(u uVar, boolean z10, zd.l<? super w0, i0> lVar) {
        this.f2438b = uVar;
        this.f2439c = z10;
        this.f2440d = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        if (intrinsicHeightElement == null) {
            return false;
        }
        return this.f2438b == intrinsicHeightElement.f2438b && this.f2439c == intrinsicHeightElement.f2439c;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public h a() {
        return new h(this.f2438b, this.f2439c);
    }

    @Override // a2.r0
    public int hashCode() {
        return (this.f2438b.hashCode() * 31) + Boolean.hashCode(this.f2439c);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(h hVar) {
        hVar.d2(this.f2438b);
        hVar.c2(this.f2439c);
    }
}
