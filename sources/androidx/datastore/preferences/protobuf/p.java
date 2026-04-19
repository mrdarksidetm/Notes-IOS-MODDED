package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t.b;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class p<T extends t.b<T>> {
    p() {
    }

    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(o oVar, n0 n0Var, int i10);

    abstract t<T> c(Object obj);

    abstract t<T> d(Object obj);

    abstract boolean e(n0 n0Var);

    abstract void f(Object obj);

    abstract <UT, UB> UB g(y0 y0Var, Object obj, o oVar, t<T> tVar, UB ub2, f1<UT, UB> f1Var);

    abstract void h(y0 y0Var, Object obj, o oVar, t<T> tVar);

    abstract void i(g gVar, Object obj, o oVar, t<T> tVar);

    abstract void j(l1 l1Var, Map.Entry<?, ?> entry);
}
