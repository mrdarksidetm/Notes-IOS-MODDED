package j1;

import a2.f0;
import a2.w0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13805a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13805a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00b5 -> B:44:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final j1.n a(j1.c r12) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.d.a(j1.c):j1.n");
    }

    public static final void b(c cVar) {
        a2.k.l(cVar).getFocusOwner().k(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    public static final void c(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.a aVarH0;
        int iA = w0.a(4096);
        int iA2 = w0.a(1024);
        e.c cVarL0 = focusTargetNode.L0();
        int i10 = iA | iA2;
        if (!focusTargetNode.L0().H1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        e.c cVarL02 = focusTargetNode.L0();
        f0 f0VarK = a2.k.k(focusTargetNode);
        while (f0VarK != null) {
            if ((f0VarK.h0().k().x1() & i10) != 0) {
                while (cVarL02 != null) {
                    if ((cVarL02.C1() & i10) != 0) {
                        if (cVarL02 != cVarL0) {
                            if ((cVarL02.C1() & iA2) != 0) {
                                return;
                            }
                        }
                        if ((cVarL02.C1() & iA) != 0) {
                            e.c cVarG = cVarL02;
                            v0.d dVar = null;
                            while (cVarG != 0) {
                                if (cVarG instanceof c) {
                                    c cVar = (c) cVarG;
                                    cVar.s(a(cVar));
                                } else {
                                    if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                                        e.c cVarB2 = ((a2.l) cVarG).b2();
                                        int i11 = 0;
                                        cVarG = cVarG;
                                        while (cVarB2 != null) {
                                            if ((cVarB2.C1() & iA) != 0) {
                                                i11++;
                                                if (i11 == 1) {
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
                                        if (i11 == 1) {
                                        }
                                    }
                                }
                                cVarG = a2.k.g(dVar);
                            }
                        }
                    }
                    cVarL02 = cVarL02.E1();
                }
            }
            f0VarK = f0VarK.k0();
            cVarL02 = (f0VarK == null || (aVarH0 = f0VarK.h0()) == null) ? null : aVarH0.o();
        }
    }
}
