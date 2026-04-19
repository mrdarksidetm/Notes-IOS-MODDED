package e0;

import md.i0;

/* JADX INFO: loaded from: classes.dex */
public interface z {
    static /* synthetic */ Object f(z zVar, d0.c0 c0Var, zd.p pVar, qd.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i10 & 1) != 0) {
            c0Var = d0.c0.Default;
        }
        return zVar.e(c0Var, pVar, dVar);
    }

    default boolean a() {
        return true;
    }

    boolean b();

    default boolean c() {
        return true;
    }

    float d(float f10);

    Object e(d0.c0 c0Var, zd.p<? super x, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super i0> dVar);
}
