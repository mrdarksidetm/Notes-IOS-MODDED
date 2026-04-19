package t0;

import b1.e;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final <T> boolean a(u1 u1Var, u<T> uVar) {
        ae.r.d(uVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return u1Var.containsKey(uVar);
    }

    public static final <T> T b(u1 u1Var, u<T> uVar) {
        ae.r.d(uVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        p3 p3Var = (p3) u1Var.get(uVar);
        if (p3Var != null) {
            return (T) p3Var.getValue();
        }
        return null;
    }

    public static final <T> T c(u1 u1Var, u<T> uVar) {
        return a(u1Var, uVar) ? (T) b(u1Var, uVar) : uVar.a().getValue();
    }

    public static final u1 d(b2<?>[] b2VarArr, u1 u1Var, u1 u1Var2) {
        e.a aVarBuilder = b1.f.a().builder();
        for (b2<?> b2Var : b2VarArr) {
            u<?> uVarB = b2Var.b();
            ae.r.d(uVarB, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            a2 a2Var = (a2) uVarB;
            if (b2Var.a() || !a(u1Var, a2Var)) {
                aVarBuilder.put(a2Var, a2Var.b(b2Var.c(), (p3) u1Var2.get(a2Var)));
            }
        }
        return aVarBuilder.build();
    }

    public static /* synthetic */ u1 e(b2[] b2VarArr, u1 u1Var, u1 u1Var2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            u1Var2 = b1.f.a();
        }
        return d(b2VarArr, u1Var, u1Var2);
    }
}
