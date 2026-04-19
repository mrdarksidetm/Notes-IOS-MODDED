package y1;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final k1.h a(r rVar) {
        k1.h hVarM;
        r rVarS = rVar.S();
        return (rVarS == null || (hVarM = r.M(rVarS, rVar, false, 2, null)) == null) ? new k1.h(0.0f, 0.0f, w2.p.g(rVar.a()), w2.p.f(rVar.a())) : hVarM;
    }

    public static final k1.h b(r rVar) {
        return r.M(d(rVar), rVar, false, 2, null);
    }

    public static final k1.h c(r rVar) {
        r rVarD = d(rVar);
        k1.h hVarB = b(rVar);
        float fG = w2.p.g(rVarD.a());
        float f10 = w2.p.f(rVarD.a());
        float fK = ge.o.k(hVarB.f(), 0.0f, fG);
        float fK2 = ge.o.k(hVarB.i(), 0.0f, f10);
        float fK3 = ge.o.k(hVarB.g(), 0.0f, fG);
        float fK4 = ge.o.k(hVarB.c(), 0.0f, f10);
        if (!(fK == fK3)) {
            if (!(fK2 == fK4)) {
                long jP = rVarD.p(k1.g.a(fK, fK2));
                long jP2 = rVarD.p(k1.g.a(fK3, fK2));
                long jP3 = rVarD.p(k1.g.a(fK3, fK4));
                long jP4 = rVarD.p(k1.g.a(fK, fK4));
                return new k1.h(pd.c.d(k1.f.o(jP), k1.f.o(jP2), k1.f.o(jP4), k1.f.o(jP3)), pd.c.d(k1.f.p(jP), k1.f.p(jP2), k1.f.p(jP4), k1.f.p(jP3)), pd.c.c(k1.f.o(jP), k1.f.o(jP2), k1.f.o(jP4), k1.f.o(jP3)), pd.c.c(k1.f.p(jP), k1.f.p(jP2), k1.f.p(jP4), k1.f.p(jP3)));
            }
        }
        return k1.h.f14343e.a();
    }

    public static final r d(r rVar) {
        r rVar2;
        a2.u0 u0Var;
        do {
            rVar2 = rVar;
            rVar = rVar.S();
        } while (rVar != null);
        a2.u0 u0VarF2 = rVar2 instanceof a2.u0 ? (a2.u0) rVar2 : null;
        if (u0VarF2 == null) {
            return rVar2;
        }
        do {
            u0Var = u0VarF2;
            u0VarF2 = u0VarF2.f2();
        } while (u0VarF2 != null);
        return u0Var;
    }

    public static final long e(r rVar) {
        return rVar.U(k1.f.f14338b.c());
    }
}
