package le;

import md.t;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 {
    public static final <T> void a(a1<? super T> a1Var, int i10) {
        qd.d<? super T> dVarC = a1Var.c();
        boolean z10 = i10 == 4;
        if (z10 || !(dVarC instanceof qe.j) || b(i10) != b(a1Var.f14979c)) {
            d(a1Var, dVarC, z10);
            return;
        }
        j0 j0Var = ((qe.j) dVarC).f19062d;
        qd.g context = dVarC.getContext();
        if (j0Var.i0(context)) {
            j0Var.g0(context, a1Var);
        } else {
            e(a1Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(a1<? super T> a1Var, qd.d<? super T> dVar, boolean z10) {
        Object objG;
        Object objI = a1Var.i();
        Throwable thE = a1Var.e(objI);
        if (thE != null) {
            t.a aVar = md.t.f15576b;
            objG = md.u.a(thE);
        } else {
            t.a aVar2 = md.t.f15576b;
            objG = a1Var.g(objI);
        }
        Object objB = md.t.b(objG);
        if (!z10) {
            dVar.resumeWith(objB);
            return;
        }
        ae.r.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        qe.j jVar = (qe.j) dVar;
        qd.d<T> dVar2 = jVar.f19063e;
        Object obj = jVar.f19065g;
        qd.g context = dVar2.getContext();
        Object objC = qe.l0.c(context, obj);
        e3<?> e3VarG = objC != qe.l0.f19070a ? i0.g(dVar2, context, objC) : null;
        try {
            jVar.f19063e.resumeWith(objB);
            md.i0 i0Var = md.i0.f15558a;
        } finally {
            if (e3VarG == null || e3VarG.S0()) {
                qe.l0.a(context, objC);
            }
        }
    }

    private static final void e(a1<?> a1Var) {
        j1 j1VarB = y2.f15128a.b();
        if (j1VarB.r0()) {
            j1VarB.n0(a1Var);
            return;
        }
        j1VarB.p0(true);
        try {
            d(a1Var, a1Var.c(), true);
            do {
            } while (j1VarB.u0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
