package cf;

import ye.j;
import ye.k;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 {
    public static final ye.f a(ye.f fVar, df.c cVar) {
        ye.f fVarA;
        ae.r.f(fVar, "<this>");
        ae.r.f(cVar, "module");
        if (!ae.r.b(fVar.e(), j.a.f24009a)) {
            return fVar.isInline() ? a(fVar.i(0), cVar) : fVar;
        }
        ye.f fVarB = ye.b.b(cVar, fVar);
        return (fVarB == null || (fVarA = a(fVarB, cVar)) == null) ? fVar : fVarA;
    }

    public static final c1 b(bf.a aVar, ye.f fVar) {
        ae.r.f(aVar, "<this>");
        ae.r.f(fVar, "desc");
        ye.j jVarE = fVar.e();
        if (jVarE instanceof ye.d) {
            return c1.POLY_OBJ;
        }
        if (!ae.r.b(jVarE, k.b.f24012a)) {
            if (!ae.r.b(jVarE, k.c.f24013a)) {
                return c1.OBJ;
            }
            ye.f fVarA = a(fVar.i(0), aVar.a());
            ye.j jVarE2 = fVarA.e();
            if ((jVarE2 instanceof ye.e) || ae.r.b(jVarE2, j.b.f24010a)) {
                return c1.MAP;
            }
            if (!aVar.f().b()) {
                throw e0.d(fVarA);
            }
        }
        return c1.LIST;
    }
}
