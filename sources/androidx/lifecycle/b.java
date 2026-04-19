package androidx.lifecycle;

import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d[] f4306a;

    public b(d[] dVarArr) {
        ae.r.f(dVarArr, "generatedAdapters");
        this.f4306a = dVarArr;
    }

    @Override // androidx.lifecycle.i
    public void s(o4.e eVar, g.a aVar) {
        ae.r.f(eVar, "source");
        ae.r.f(aVar, "event");
        o4.g gVar = new o4.g();
        for (d dVar : this.f4306a) {
            dVar.a(eVar, aVar, false, gVar);
        }
        for (d dVar2 : this.f4306a) {
            dVar2.a(eVar, aVar, true, gVar);
        }
    }
}
