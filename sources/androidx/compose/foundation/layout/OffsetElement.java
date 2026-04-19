package androidx.compose.foundation.layout;

import a2.r0;
import b2.w0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
final class OffsetElement extends r0<l> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f2444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f2445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zd.l<w0, i0> f2446e;

    /* JADX WARN: Multi-variable type inference failed */
    private OffsetElement(float f10, float f11, boolean z10, zd.l<? super w0, i0> lVar) {
        this.f2443b = f10;
        this.f2444c = f11;
        this.f2445d = z10;
        this.f2446e = lVar;
    }

    public /* synthetic */ OffsetElement(float f10, float f11, boolean z10, zd.l lVar, ae.j jVar) {
        this(f10, f11, z10, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return w2.h.o(this.f2443b, offsetElement.f2443b) && w2.h.o(this.f2444c, offsetElement.f2444c) && this.f2445d == offsetElement.f2445d;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public l a() {
        return new l(this.f2443b, this.f2444c, this.f2445d, null);
    }

    @Override // a2.r0
    public int hashCode() {
        return (((w2.h.p(this.f2443b) * 31) + w2.h.p(this.f2444c)) * 31) + Boolean.hashCode(this.f2445d);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(l lVar) {
        lVar.e2(this.f2443b);
        lVar.f2(this.f2444c);
        lVar.d2(this.f2445d);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) w2.h.q(this.f2443b)) + ", y=" + ((Object) w2.h.q(this.f2444c)) + ", rtlAware=" + this.f2445d + ')';
    }
}
