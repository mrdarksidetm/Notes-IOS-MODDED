package h1;

import a2.k;
import w2.p;
import y1.r;
import y1.s;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(d dVar, long j10) {
        if (!dVar.L0().H1()) {
            return false;
        }
        r rVarI = k.k(dVar).i();
        if (!rVarI.v()) {
            return false;
        }
        long jA = rVarI.a();
        int iG = p.g(jA);
        int iF = p.f(jA);
        long jE = s.e(rVarI);
        float fE = k1.f.e(jE);
        float f10 = k1.f.f(jE);
        float f11 = iG + fE;
        float f12 = iF + f10;
        float fO = k1.f.o(j10);
        if (!(fE <= fO && fO <= f11)) {
            return false;
        }
        float fP = k1.f.p(j10);
        return (f10 > fP ? 1 : (f10 == fP ? 0 : -1)) <= 0 && (fP > f12 ? 1 : (fP == f12 ? 0 : -1)) <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(g gVar, b bVar) {
        gVar.t1(bVar);
        gVar.W(bVar);
    }
}
