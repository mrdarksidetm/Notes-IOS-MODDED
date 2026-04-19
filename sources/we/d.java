package we;

import ae.i0;
import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final <T> a<T> a(af.b<T> bVar, ze.c cVar, String str) {
        r.f(bVar, "<this>");
        r.f(cVar, "decoder");
        a<T> aVarC = bVar.c(cVar, str);
        if (aVarC != null) {
            return aVarC;
        }
        af.c.b(str, bVar.e());
        throw new md.i();
    }

    public static final <T> h<T> b(af.b<T> bVar, ze.f fVar, T t10) {
        r.f(bVar, "<this>");
        r.f(fVar, "encoder");
        r.f(t10, "value");
        h<T> hVarD = bVar.d(fVar, t10);
        if (hVarD != null) {
            return hVarD;
        }
        af.c.a(i0.b(t10.getClass()), bVar.e());
        throw new md.i();
    }
}
