package a2;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    public static final <T extends s1> void a(T t10, zd.l<? super T, Boolean> lVar) {
        androidx.compose.ui.node.a aVarH0;
        int iA = w0.a(262144);
        if (!t10.L0().H1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        e.c cVarE1 = t10.L0().E1();
        f0 f0VarK = k.k(t10);
        while (f0VarK != null) {
            if ((f0VarK.h0().k().x1() & iA) != 0) {
                while (cVarE1 != null) {
                    if ((cVarE1.C1() & iA) != 0) {
                        e.c cVarG = cVarE1;
                        v0.d dVar = null;
                        while (cVarG != 0) {
                            boolean zBooleanValue = true;
                            if (cVarG instanceof s1) {
                                s1 s1Var = (s1) cVarG;
                                if (ae.r.b(t10.I(), s1Var.I()) && f1.a.a(t10, s1Var)) {
                                    zBooleanValue = lVar.invoke(s1Var).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((cVarG.C1() & iA) != 0) && (cVarG instanceof l)) {
                                    e.c cVarB2 = ((l) cVarG).b2();
                                    int i10 = 0;
                                    cVarG = cVarG;
                                    while (cVarB2 != null) {
                                        if ((cVarB2.C1() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVarG = cVarB2;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new v0.d(new e.c[16], 0);
                                                }
                                                if (cVarG != 0) {
                                                    dVar.b(cVarG);
                                                    cVarG = 0;
                                                }
                                                dVar.b(cVarB2);
                                            }
                                        }
                                        cVarB2 = cVarB2.y1();
                                        cVarG = cVarG;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            cVarG = k.g(dVar);
                        }
                    }
                    cVarE1 = cVarE1.E1();
                }
            }
            f0VarK = f0VarK.k0();
            cVarE1 = (f0VarK == null || (aVarH0 = f0VarK.h0()) == null) ? null : aVarH0.o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends a2.s1> void b(T r11, zd.l<? super T, java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.t1.b(a2.s1, zd.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0049 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(a2.j r12, java.lang.Object r13, zd.l<? super a2.s1, ? extends a2.r1> r14) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.t1.c(a2.j, java.lang.Object, zd.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0049 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends a2.s1> void d(T r13, zd.l<? super T, ? extends a2.r1> r14) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.t1.d(a2.s1, zd.l):void");
    }
}
