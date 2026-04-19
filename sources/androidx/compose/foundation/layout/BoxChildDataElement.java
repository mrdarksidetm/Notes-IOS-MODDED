package androidx.compose.foundation.layout;

import a2.r0;
import b2.w0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
final class BoxChildDataElement extends r0<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f1.b f2430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.l<w0, i0> f2432d;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(f1.b bVar, boolean z10, zd.l<? super w0, i0> lVar) {
        this.f2430b = bVar;
        this.f2431c = z10;
        this.f2432d = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return ae.r.b(this.f2430b, boxChildDataElement.f2430b) && this.f2431c == boxChildDataElement.f2431c;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this.f2430b, this.f2431c);
    }

    @Override // a2.r0
    public int hashCode() {
        return (this.f2430b.hashCode() * 31) + Boolean.hashCode(this.f2431c);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(c cVar) {
        cVar.d2(this.f2430b);
        cVar.e2(this.f2431c);
    }
}
