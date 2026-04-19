package da;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface d {
    default <T> T a(Class<T> cls) {
        return (T) f(d0.b(cls));
    }

    default <T> Set<T> b(d0<T> d0Var) {
        return e(d0Var).get();
    }

    default <T> ma.b<T> c(Class<T> cls) {
        return g(d0.b(cls));
    }

    default <T> Set<T> d(Class<T> cls) {
        return b(d0.b(cls));
    }

    <T> ma.b<Set<T>> e(d0<T> d0Var);

    default <T> T f(d0<T> d0Var) {
        ma.b<T> bVarG = g(d0Var);
        if (bVarG == null) {
            return null;
        }
        return bVarG.get();
    }

    <T> ma.b<T> g(d0<T> d0Var);
}
