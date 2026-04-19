package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.g0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class j0 implements i0 {
    j0() {
    }

    private static <K, V> int i(int i10, Object obj, Object obj2) {
        h0 h0Var = (h0) obj;
        g0 g0Var = (g0) obj2;
        int iA = 0;
        if (h0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : h0Var.entrySet()) {
            iA += g0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static <K, V> h0<K, V> j(Object obj, Object obj2) {
        h0<K, V> h0VarP = (h0) obj;
        h0<K, V> h0Var = (h0) obj2;
        if (!h0Var.isEmpty()) {
            if (!h0VarP.j()) {
                h0VarP = h0VarP.p();
            }
            h0VarP.n(h0Var);
        }
        return h0VarP;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public Object b(Object obj) {
        ((h0) obj).m();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public g0.a<?, ?> c(Object obj) {
        return ((g0) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public Map<?, ?> d(Object obj) {
        return (h0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public Object e(Object obj) {
        return h0.f().p();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public int f(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public boolean g(Object obj) {
        return !((h0) obj).j();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public Map<?, ?> h(Object obj) {
        return (h0) obj;
    }
}
