package pe;

import ae.n0;
import qe.l0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final <T, V> Object b(qd.g gVar, V v10, Object obj, zd.p<? super V, ? super qd.d<? super T>, ? extends Object> pVar, qd.d<? super T> dVar) {
        Object objC = l0.c(gVar, obj);
        try {
            Object objInvoke = ((zd.p) n0.e(pVar, 2)).invoke(v10, new u(dVar, gVar));
            l0.a(gVar, objC);
            if (objInvoke == rd.d.e()) {
                sd.f.c(dVar);
            }
            return objInvoke;
        } catch (Throwable th) {
            l0.a(gVar, objC);
            throw th;
        }
    }

    public static /* synthetic */ Object c(qd.g gVar, Object obj, Object obj2, zd.p pVar, qd.d dVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = l0.b(gVar);
        }
        return b(gVar, obj, obj2, pVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> oe.f<T> d(oe.f<? super T> fVar, qd.g gVar) {
        return fVar instanceof t ? true : fVar instanceof o ? fVar : new w(fVar, gVar);
    }
}
