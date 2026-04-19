package t0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f20970a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a0<s> f20971b = new a();

    public static final class a implements a0<s> {
        a() {
        }
    }

    public static final p a(e<?> eVar, q qVar) {
        return new s(qVar, eVar, null, 4, null);
    }

    public static final m2 b(e<?> eVar, q qVar) {
        return new s(qVar, eVar, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> void e(v0.a<K, v0.b<V>> aVar, K k10, V v10) {
        if (aVar.c(k10)) {
            v0.b<V> bVarF = aVar.f(k10);
            if (bVarF != null) {
                bVarF.add(v10);
                return;
            }
            return;
        }
        v0.b<V> bVar = new v0.b<>();
        bVar.add(v10);
        md.i0 i0Var = md.i0.f15558a;
        aVar.l(k10, bVar);
    }
}
