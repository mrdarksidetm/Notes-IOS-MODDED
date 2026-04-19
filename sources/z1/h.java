package z1;

import a2.f0;
import a2.w0;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public interface h extends k, a2.j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [v0.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [v0.d] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // z1.k
    default <T> T p(c<T> cVar) {
        androidx.compose.ui.node.a aVarH0;
        if (!L0().H1()) {
            throw new IllegalArgumentException("ModifierLocal accessed from an unattached node".toString());
        }
        int iA = w0.a(32);
        if (!L0().H1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        e.c cVarE1 = L0().E1();
        f0 f0VarK = a2.k.k(this);
        while (f0VarK != null) {
            if ((f0VarK.h0().k().x1() & iA) != 0) {
                while (cVarE1 != null) {
                    if ((cVarE1.C1() & iA) != 0) {
                        ?? G = cVarE1;
                        ?? dVar = 0;
                        while (G != 0) {
                            if (G instanceof h) {
                                h hVar = (h) G;
                                if (hVar.u0().a(cVar)) {
                                    return (T) hVar.u0().b(cVar);
                                }
                            } else {
                                if (((G.C1() & iA) != 0) && (G instanceof a2.l)) {
                                    e.c cVarB2 = ((a2.l) G).b2();
                                    int i10 = 0;
                                    G = G;
                                    dVar = dVar;
                                    while (cVarB2 != null) {
                                        if ((cVarB2.C1() & iA) != 0) {
                                            i10++;
                                            dVar = dVar;
                                            if (i10 == 1) {
                                                G = cVarB2;
                                            } else {
                                                if (dVar == 0) {
                                                    dVar = new v0.d(new e.c[16], 0);
                                                }
                                                if (G != 0) {
                                                    dVar.b(G);
                                                    G = 0;
                                                }
                                                dVar.b(cVarB2);
                                            }
                                        }
                                        cVarB2 = cVarB2.y1();
                                        G = G;
                                        dVar = dVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            G = a2.k.g(dVar);
                        }
                    }
                    cVarE1 = cVarE1.E1();
                }
            }
            f0VarK = f0VarK.k0();
            cVarE1 = (f0VarK == null || (aVarH0 = f0VarK.h0()) == null) ? null : aVarH0.o();
        }
        return cVar.a().invoke();
    }

    default g u0() {
        return b.f24131a;
    }
}
