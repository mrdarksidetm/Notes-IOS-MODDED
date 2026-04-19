package le;

import md.t;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {
    public static final <T> Object a(Object obj, qd.d<? super T> dVar) {
        if (obj instanceof c0) {
            t.a aVar = md.t.f15576b;
            obj = md.u.a(((c0) obj).f14990a);
        }
        return md.t.b(obj);
    }

    public static final <T> Object b(Object obj, o<?> oVar) {
        Throwable thE = md.t.e(obj);
        return thE == null ? obj : new c0(thE, false, 2, null);
    }

    public static final <T> Object c(Object obj, zd.l<? super Throwable, md.i0> lVar) {
        Throwable thE = md.t.e(obj);
        return thE == null ? lVar != null ? new d0(obj, lVar) : obj : new c0(thE, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, zd.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
