package androidx.compose.foundation.layout;

import a2.r0;
import b2.w0;
import h0.y;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
final class PaddingValuesElement extends r0<o> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f2453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.l<w0, i0> f2454c;

    /* JADX WARN: Multi-variable type inference failed */
    public PaddingValuesElement(y yVar, zd.l<? super w0, i0> lVar) {
        this.f2453b = yVar;
        this.f2454c = lVar;
    }

    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return ae.r.b(this.f2453b, paddingValuesElement.f2453b);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public o a() {
        return new o(this.f2453b);
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f2453b.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(o oVar) {
        oVar.b2(this.f2453b);
    }
}
