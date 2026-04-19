package b1;

import ae.r;
import t0.c2;
import t0.d2;
import t0.l;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final a b(l lVar, int i10, boolean z10, Object obj) {
        b bVar;
        lVar.e(Integer.rotateLeft(i10, 1));
        Object objF = lVar.f();
        if (objF == l.f20813a.a()) {
            bVar = new b(i10, z10, obj);
            lVar.E(bVar);
        } else {
            r.d(objF, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (b) objF;
            bVar.f(obj);
        }
        lVar.K();
        return bVar;
    }

    public static final a c(int i10, boolean z10, Object obj) {
        return new b(i10, z10, obj);
    }

    public static final int d(int i10) {
        return a(2, i10);
    }

    public static final boolean e(c2 c2Var, c2 c2Var2) {
        if (c2Var != null) {
            if ((c2Var instanceof d2) && (c2Var2 instanceof d2)) {
                d2 d2Var = (d2) c2Var;
                if (!d2Var.s() || r.b(c2Var, c2Var2) || r.b(d2Var.j(), ((d2) c2Var2).j())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int f(int i10) {
        return a(1, i10);
    }
}
