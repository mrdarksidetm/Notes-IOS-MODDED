package androidx.compose.ui.focus;

import a2.f0;
import a2.u0;
import a2.w0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.b;
import j1.o;
import md.q;
import w2.r;
import y1.s;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2733b;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2732a = iArr;
            int[] iArr2 = new int[o.values().length];
            try {
                iArr2[o.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[o.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[o.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[o.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f2733b = iArr2;
        }
    }

    public static final f a(FocusTargetNode focusTargetNode, int i10, r rVar) {
        zd.l<b, f> lVarK;
        f fVarL;
        d dVarF2 = focusTargetNode.f2();
        b.a aVar = b.f2698b;
        if (b.l(i10, aVar.e())) {
            return dVarF2.j();
        }
        if (b.l(i10, aVar.f())) {
            return dVarF2.h();
        }
        if (b.l(i10, aVar.h())) {
            return dVarF2.i();
        }
        if (b.l(i10, aVar.a())) {
            return dVarF2.m();
        }
        if (b.l(i10, aVar.d())) {
            int i11 = a.f2732a[rVar.ordinal()];
            if (i11 == 1) {
                fVarL = dVarF2.d();
            } else {
                if (i11 != 2) {
                    throw new q();
                }
                fVarL = dVarF2.l();
            }
            if (fVarL == f.f2723b.b()) {
                fVarL = null;
            }
            if (fVarL == null) {
                return dVarF2.c();
            }
        } else {
            if (!b.l(i10, aVar.g())) {
                if (b.l(i10, aVar.b())) {
                    lVarK = dVarF2.o();
                } else {
                    if (!b.l(i10, aVar.c())) {
                        throw new IllegalStateException("invalid FocusDirection".toString());
                    }
                    lVarK = dVarF2.k();
                }
                return lVarK.invoke(b.i(i10));
            }
            int i12 = a.f2732a[rVar.ordinal()];
            if (i12 == 1) {
                fVarL = dVarF2.l();
            } else {
                if (i12 != 2) {
                    throw new q();
                }
                fVarL = dVarF2.d();
            }
            if (fVarL == f.f2723b.b()) {
                fVarL = null;
            }
            if (fVarL == null) {
                return dVarF2.f();
            }
        }
        return fVarL;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0065 -> B:18:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode b(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.i.b(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.a aVarH0;
        int iA = w0.a(1024);
        if (!focusTargetNode.L0().H1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        e.c cVarE1 = focusTargetNode.L0().E1();
        f0 f0VarK = a2.k.k(focusTargetNode);
        while (f0VarK != null) {
            if ((f0VarK.h0().k().x1() & iA) != 0) {
                while (cVarE1 != null) {
                    if ((cVarE1.C1() & iA) != 0) {
                        e.c cVarG = cVarE1;
                        v0.d dVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (focusTargetNode2.f2().g()) {
                                    return focusTargetNode2;
                                }
                            } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                                int i10 = 0;
                                for (e.c cVarB2 = ((a2.l) cVarG).b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
                                    if ((cVarB2.C1() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarG = cVarB2;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new v0.d(new e.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                dVar.b(cVarG);
                                                cVarG = null;
                                            }
                                            dVar.b(cVarB2);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarG = a2.k.g(dVar);
                        }
                    }
                    cVarE1 = cVarE1.E1();
                }
            }
            f0VarK = f0VarK.k0();
            cVarE1 = (f0VarK == null || (aVarH0 = f0VarK.h0()) == null) ? null : aVarH0.o();
        }
        return null;
    }

    public static final k1.h d(FocusTargetNode focusTargetNode) {
        k1.h hVarA;
        u0 u0VarZ1 = focusTargetNode.z1();
        return (u0VarZ1 == null || (hVarA = s.d(u0VarZ1).A(u0VarZ1, false)) == null) ? k1.h.f14343e.a() : hVarA;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, int i10, r rVar, zd.l<? super FocusTargetNode, Boolean> lVar) {
        int iG;
        Boolean boolT;
        b.a aVar = b.f2698b;
        if (b.l(i10, aVar.e()) ? true : b.l(i10, aVar.f())) {
            return k.f(focusTargetNode, i10, lVar);
        }
        if (b.l(i10, aVar.d()) ? true : b.l(i10, aVar.g()) ? true : b.l(i10, aVar.h()) ? true : b.l(i10, aVar.a())) {
            boolT = l.t(focusTargetNode, i10, lVar);
            if (boolT == null) {
                return false;
            }
        } else {
            if (!b.l(i10, aVar.b())) {
                if (!b.l(i10, aVar.c())) {
                    throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) b.n(i10))).toString());
                }
                FocusTargetNode focusTargetNodeB = b(focusTargetNode);
                FocusTargetNode focusTargetNodeC = focusTargetNodeB != null ? c(focusTargetNodeB) : null;
                if (focusTargetNodeC == null || ae.r.b(focusTargetNodeC, focusTargetNode)) {
                    return false;
                }
                return lVar.invoke(focusTargetNodeC).booleanValue();
            }
            int i11 = a.f2732a[rVar.ordinal()];
            if (i11 == 1) {
                iG = aVar.g();
            } else {
                if (i11 != 2) {
                    throw new q();
                }
                iG = aVar.d();
            }
            FocusTargetNode focusTargetNodeB2 = b(focusTargetNode);
            if (focusTargetNodeB2 == null || (boolT = l.t(focusTargetNodeB2, iG, lVar)) == null) {
                return false;
            }
        }
        return boolT.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0052 -> B:10:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode f(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.i.f(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        f0 f0VarY1;
        f0 f0VarY12;
        u0 u0VarZ1 = focusTargetNode.z1();
        if ((u0VarZ1 == null || (f0VarY12 = u0VarZ1.Y1()) == null || !f0VarY12.j()) ? false : true) {
            u0 u0VarZ12 = focusTargetNode.z1();
            if ((u0VarZ12 == null || (f0VarY1 = u0VarZ12.Y1()) == null || !f0VarY1.G0()) ? false : true) {
                return true;
            }
        }
        return false;
    }
}
