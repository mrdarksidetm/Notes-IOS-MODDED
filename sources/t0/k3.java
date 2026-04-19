package t0;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class k3 {
    public static final <T> d1.v<T> a() {
        return new d1.v<>();
    }

    public static final <T> d1.v<T> b(T... tArr) {
        d1.v<T> vVar = new d1.v<>();
        vVar.addAll(nd.p.E0(tArr));
        return vVar;
    }

    public static final <K, V> d1.x<K, V> c() {
        return new d1.x<>();
    }

    public static final <T> k1<T> d(T t10, e3<T> e3Var) {
        return b.d(t10, e3Var);
    }

    public static /* synthetic */ k1 e(Object obj, e3 e3Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            e3Var = f3.q();
        }
        return f3.i(obj, e3Var);
    }

    public static final <T> p3<T> f(T t10, l lVar, int i10) {
        lVar.e(-1058319986);
        if (o.I()) {
            o.U(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:303)");
        }
        lVar.e(-492369756);
        Object objF = lVar.f();
        if (objF == l.f20813a.a()) {
            objF = e(t10, null, 2, null);
            lVar.E(objF);
        }
        lVar.K();
        k1 k1Var = (k1) objF;
        k1Var.setValue(t10);
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return k1Var;
    }
}
