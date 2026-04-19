package androidx.compose.ui.focus;

import a2.f0;
import a2.w0;
import ae.s;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.b;
import j1.o;
import md.q;
import y1.c;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2735a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.Active.ordinal()] = 2;
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
            f2735a = iArr;
        }
    }

    static final class b extends s implements zd.l<c.a, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.l<FocusTargetNode, Boolean> f2739d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, zd.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f2736a = focusTargetNode;
            this.f2737b = focusTargetNode2;
            this.f2738c = i10;
            this.f2739d = lVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(c.a aVar) {
            Boolean boolValueOf = Boolean.valueOf(k.i(this.f2736a, this.f2737b, this.f2738c, this.f2739d));
            if (boolValueOf.booleanValue() || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, zd.l<? super FocusTargetNode, Boolean> lVar) {
        o oVarH2 = focusTargetNode.h2();
        int[] iArr = a.f2735a;
        int i10 = iArr[oVarH2.ordinal()];
        if (i10 == 1) {
            FocusTargetNode focusTargetNodeF = i.f(focusTargetNode);
            if (focusTargetNodeF == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            int i11 = iArr[focusTargetNodeF.h2().ordinal()];
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    return d(focusTargetNode, focusTargetNodeF, androidx.compose.ui.focus.b.f2698b.f(), lVar);
                }
                if (i11 != 4) {
                    throw new q();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            if (!b(focusTargetNodeF, lVar) && !d(focusTargetNode, focusTargetNodeF, androidx.compose.ui.focus.b.f2698b.f(), lVar) && (!focusTargetNodeF.f2().g() || !lVar.invoke(focusTargetNodeF).booleanValue())) {
                return false;
            }
        } else {
            if (i10 == 2 || i10 == 3) {
                return g(focusTargetNode, lVar);
            }
            if (i10 != 4) {
                throw new q();
            }
            if (!g(focusTargetNode, lVar)) {
                if (!(focusTargetNode.f2().g() ? lVar.invoke(focusTargetNode).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean c(FocusTargetNode focusTargetNode, zd.l<? super FocusTargetNode, Boolean> lVar) {
        int i10 = a.f2735a[focusTargetNode.h2().ordinal()];
        if (i10 == 1) {
            FocusTargetNode focusTargetNodeF = i.f(focusTargetNode);
            if (focusTargetNodeF != null) {
                return c(focusTargetNodeF, lVar) || d(focusTargetNode, focusTargetNodeF, androidx.compose.ui.focus.b.f2698b.e(), lVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 != 4) {
                throw new q();
            }
            if (focusTargetNode.f2().g()) {
                return lVar.invoke(focusTargetNode).booleanValue();
            }
        }
        return h(focusTargetNode, lVar);
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, zd.l<? super FocusTargetNode, Boolean> lVar) {
        if (i(focusTargetNode, focusTargetNode2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i10, new b(focusTargetNode, focusTargetNode2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusTargetNode focusTargetNode) {
        e.c cVar;
        androidx.compose.ui.node.a aVarH0;
        int iA = w0.a(1024);
        if (!focusTargetNode.L0().H1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        e.c cVarE1 = focusTargetNode.L0().E1();
        f0 f0VarK = a2.k.k(focusTargetNode);
        loop0: while (true) {
            cVar = null;
            if (f0VarK == null) {
                break;
            }
            if ((f0VarK.h0().k().x1() & iA) != 0) {
                while (cVarE1 != null) {
                    if ((cVarE1.C1() & iA) != 0) {
                        e.c cVarG = cVarE1;
                        v0.d dVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                cVar = cVarG;
                                break loop0;
                            }
                            if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
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
        return cVar == null;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i10, zd.l<? super FocusTargetNode, Boolean> lVar) {
        b.a aVar = androidx.compose.ui.focus.b.f2698b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.e())) {
            return c(focusTargetNode, lVar);
        }
        if (androidx.compose.ui.focus.b.l(i10, aVar.f())) {
            return b(focusTargetNode, lVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:7:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean g(androidx.compose.ui.focus.FocusTargetNode r11, zd.l<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.k.g(androidx.compose.ui.focus.FocusTargetNode, zd.l):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:7:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean h(androidx.compose.ui.focus.FocusTargetNode r11, zd.l<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.k.h(androidx.compose.ui.focus.FocusTargetNode, zd.l):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005a -> B:12:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean i(androidx.compose.ui.focus.FocusTargetNode r12, androidx.compose.ui.focus.FocusTargetNode r13, int r14, zd.l<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.k.i(androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusTargetNode, int, zd.l):boolean");
    }
}
