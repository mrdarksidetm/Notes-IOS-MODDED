package e0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class c implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f10291a = new c();

    private c() {
    }

    @Override // e0.v
    public long a(w2.d dVar, v1.p pVar, long j10) {
        List<v1.b0> listC = pVar.c();
        k1.f fVarD = k1.f.d(k1.f.f14338b.c());
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            fVarD = k1.f.d(k1.f.t(fVarD.x(), listC.get(i10).n()));
        }
        return k1.f.u(fVarD.x(), -dVar.G0(w2.h.m(64)));
    }
}
