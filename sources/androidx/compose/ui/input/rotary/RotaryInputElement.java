package androidx.compose.ui.input.rotary;

import a2.r0;
import ae.r;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends r0<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<x1.b, Boolean> f2819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l<x1.b, Boolean> f2820c;

    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputElement(l<? super x1.b, Boolean> lVar, l<? super x1.b, Boolean> lVar2) {
        this.f2819b = lVar;
        this.f2820c = lVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return r.b(this.f2819b, rotaryInputElement.f2819b) && r.b(this.f2820c, rotaryInputElement.f2820c);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this.f2819b, this.f2820c);
    }

    @Override // a2.r0
    public int hashCode() {
        l<x1.b, Boolean> lVar = this.f2819b;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l<x1.b, Boolean> lVar2 = this.f2820c;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(b bVar) {
        bVar.a2(this.f2819b);
        bVar.b2(this.f2820c);
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f2819b + ", onPreRotaryScrollEvent=" + this.f2820c + ')';
    }
}
