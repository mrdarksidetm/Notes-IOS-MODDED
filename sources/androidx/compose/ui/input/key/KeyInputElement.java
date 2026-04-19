package androidx.compose.ui.input.key;

import a2.r0;
import ae.r;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends r0<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<t1.b, Boolean> f2809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l<t1.b, Boolean> f2810c;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(l<? super t1.b, Boolean> lVar, l<? super t1.b, Boolean> lVar2) {
        this.f2809b = lVar;
        this.f2810c = lVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return r.b(this.f2809b, keyInputElement.f2809b) && r.b(this.f2810c, keyInputElement.f2810c);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this.f2809b, this.f2810c);
    }

    @Override // a2.r0
    public int hashCode() {
        l<t1.b, Boolean> lVar = this.f2809b;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l<t1.b, Boolean> lVar2 = this.f2810c;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(b bVar) {
        bVar.a2(this.f2809b);
        bVar.b2(this.f2810c);
    }

    public String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f2809b + ", onPreKeyEvent=" + this.f2810c + ')';
    }
}
