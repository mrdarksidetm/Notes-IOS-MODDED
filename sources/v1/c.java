package v1;

import b2.x1;

/* JADX INFO: loaded from: classes.dex */
public interface c extends w2.d {
    static /* synthetic */ <T> Object C(c cVar, long j10, zd.p<? super c, ? super qd.d<? super T>, ? extends Object> pVar, qd.d<? super T> dVar) {
        return pVar.invoke(cVar, dVar);
    }

    static /* synthetic */ Object G(c cVar, r rVar, qd.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            rVar = r.Main;
        }
        return cVar.J(rVar, dVar);
    }

    static /* synthetic */ <T> Object g1(c cVar, long j10, zd.p<? super c, ? super qd.d<? super T>, ? extends Object> pVar, qd.d<? super T> dVar) {
        return pVar.invoke(cVar, dVar);
    }

    Object J(r rVar, qd.d<? super p> dVar);

    p K();

    default long O0() {
        return k1.l.f14359b.b();
    }

    default <T> Object P(long j10, zd.p<? super c, ? super qd.d<? super T>, ? extends Object> pVar, qd.d<? super T> dVar) {
        return C(this, j10, pVar, dVar);
    }

    default <T> Object P0(long j10, zd.p<? super c, ? super qd.d<? super T>, ? extends Object> pVar, qd.d<? super T> dVar) {
        return g1(this, j10, pVar, dVar);
    }

    long a();

    x1 getViewConfiguration();
}
