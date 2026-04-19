package androidx.compose.foundation.layout;

import a2.r0;
import b2.w0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
final class SizeElement extends r0<q> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f2456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f2457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f2458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f2459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zd.l<w0, i0> f2460g;

    /* JADX WARN: Multi-variable type inference failed */
    private SizeElement(float f10, float f11, float f12, float f13, boolean z10, zd.l<? super w0, i0> lVar) {
        this.f2455b = f10;
        this.f2456c = f11;
        this.f2457d = f12;
        this.f2458e = f13;
        this.f2459f = z10;
        this.f2460g = lVar;
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, zd.l lVar, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? w2.h.f22405b.c() : f10, (i10 & 2) != 0 ? w2.h.f22405b.c() : f11, (i10 & 4) != 0 ? w2.h.f22405b.c() : f12, (i10 & 8) != 0 ? w2.h.f22405b.c() : f13, z10, lVar, null);
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, zd.l lVar, ae.j jVar) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return w2.h.o(this.f2455b, sizeElement.f2455b) && w2.h.o(this.f2456c, sizeElement.f2456c) && w2.h.o(this.f2457d, sizeElement.f2457d) && w2.h.o(this.f2458e, sizeElement.f2458e) && this.f2459f == sizeElement.f2459f;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public q a() {
        return new q(this.f2455b, this.f2456c, this.f2457d, this.f2458e, this.f2459f, null);
    }

    @Override // a2.r0
    public int hashCode() {
        return (((((((w2.h.p(this.f2455b) * 31) + w2.h.p(this.f2456c)) * 31) + w2.h.p(this.f2457d)) * 31) + w2.h.p(this.f2458e)) * 31) + Boolean.hashCode(this.f2459f);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(q qVar) {
        qVar.f2(this.f2455b);
        qVar.e2(this.f2456c);
        qVar.d2(this.f2457d);
        qVar.c2(this.f2458e);
        qVar.b2(this.f2459f);
    }
}
