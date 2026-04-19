package t0;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {
    public static final c1 a(qd.g gVar) {
        c1 c1Var = (c1) gVar.get(c1.W);
        if (c1Var != null) {
            return c1Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final <R> Object b(zd.l<? super Long, ? extends R> lVar, qd.d<? super R> dVar) {
        return a(dVar.getContext()).M(lVar, dVar);
    }
}
