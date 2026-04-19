package ya;

import java.util.List;
import ya.d;

/* JADX INFO: loaded from: classes2.dex */
abstract class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.b f23574b;

    e(List list, d.b bVar) {
        this.f23573a = list;
        this.f23574b = bVar;
    }

    @Override // ya.d
    public final List<d.a> a() {
        return this.f23573a;
    }

    @Override // ya.d
    public final d.b b() {
        return this.f23574b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            List list = this.f23573a;
            if (list != null ? list.equals(dVar.a()) : dVar.a() == null) {
                d.b bVar = this.f23574b;
                d.b bVarB = dVar.b();
                if (bVar != null ? bVar.equals(bVarB) : bVarB == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f23573a;
        int iHashCode = list == null ? 0 : list.hashCode();
        d.b bVar = this.f23574b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        d.b bVar = this.f23574b;
        return "GmsDocumentScanningResult{pages=" + String.valueOf(this.f23573a) + ", pdf=" + String.valueOf(bVar) + "}";
    }
}
