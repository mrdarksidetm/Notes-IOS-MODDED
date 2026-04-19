package a2;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(v0.d<e.c> dVar, e.c cVar) {
        v0.d<f0> dVarS0 = k(cVar).s0();
        int iO = dVarS0.o();
        if (iO > 0) {
            int i10 = iO - 1;
            f0[] f0VarArrN = dVarS0.n();
            do {
                dVar.b(f0VarArrN[i10].h0().k());
                i10--;
            } while (i10 >= 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final a0 d(e.c cVar) {
        if (!((w0.a(2) & cVar.C1()) != 0)) {
            return null;
        }
        if (cVar instanceof a0) {
            return (a0) cVar;
        }
        if (cVar instanceof l) {
            loop0: while (true) {
                cVar = ((l) cVar).b2();
                while (cVar != 0) {
                    if (cVar instanceof a0) {
                        return (a0) cVar;
                    }
                    if (cVar instanceof l) {
                        if ((w0.a(2) & cVar.C1()) != 0) {
                            break;
                        }
                    }
                    cVar = cVar.y1();
                }
            }
        }
        return null;
    }

    public static final boolean e(j jVar, int i10) {
        return (jVar.L0().x1() & i10) != 0;
    }

    public static final boolean f(j jVar) {
        return jVar.L0() == jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.c g(v0.d<e.c> dVar) {
        if (dVar == null || dVar.r()) {
            return null;
        }
        return dVar.x(dVar.o() - 1);
    }

    public static final u0 h(j jVar, int i10) {
        u0 u0VarZ1 = jVar.L0().z1();
        ae.r.c(u0VarZ1);
        if (u0VarZ1.d2() != jVar || !x0.i(i10)) {
            return u0VarZ1;
        }
        u0 u0VarE2 = u0VarZ1.e2();
        ae.r.c(u0VarE2);
        return u0VarE2;
    }

    public static final w2.d i(j jVar) {
        return k(jVar).I();
    }

    public static final w2.r j(j jVar) {
        return k(jVar).getLayoutDirection();
    }

    public static final f0 k(j jVar) {
        u0 u0VarZ1 = jVar.L0().z1();
        if (u0VarZ1 != null) {
            return u0VarZ1.Y1();
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
    }

    public static final e1 l(j jVar) {
        e1 e1VarJ0 = k(jVar).j0();
        if (e1VarJ0 != null) {
            return e1VarJ0;
        }
        throw new IllegalStateException("This node does not have an owner.".toString());
    }
}
