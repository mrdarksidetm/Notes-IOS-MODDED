package bf;

import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class n {
    public static final a a(a aVar, zd.l<? super d, i0> lVar) {
        ae.r.f(aVar, "from");
        ae.r.f(lVar, "builderAction");
        d dVar = new d(aVar);
        lVar.invoke(dVar);
        return new m(dVar.a(), dVar.b());
    }

    public static /* synthetic */ a b(a aVar, zd.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = a.f5793d;
        }
        return a(aVar, lVar);
    }
}
