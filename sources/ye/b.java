package ye;

import ae.r;
import af.i1;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final he.c<?> a(f fVar) {
        r.f(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f23976b;
        }
        if (fVar instanceof i1) {
            return a(((i1) fVar).k());
        }
        return null;
    }

    public static final f b(df.c cVar, f fVar) {
        we.b bVarC;
        r.f(cVar, "<this>");
        r.f(fVar, "descriptor");
        he.c<?> cVarA = a(fVar);
        if (cVarA == null || (bVarC = df.c.c(cVar, cVarA, null, 2, null)) == null) {
            return null;
        }
        return bVarC.getDescriptor();
    }
}
