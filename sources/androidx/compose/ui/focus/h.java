package androidx.compose.ui.focus;

import a2.a1;
import a2.e1;
import a2.f0;
import a2.u0;
import a2.w0;
import ae.s;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.f;
import j1.o;
import j1.r;
import md.i0;
import md.q;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2730b;

        static {
            int[] iArr = new int[j1.a.values().length];
            try {
                iArr[j1.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.a.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.a.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j1.a.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2729a = iArr;
            int[] iArr2 = new int[o.values().length];
            try {
                iArr2[o.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[o.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[o.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[o.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f2730b = iArr2;
        }
    }

    static final class b extends s implements zd.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2731a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f2731a = focusTargetNode;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f2731a.f2();
        }
    }

    private static final boolean a(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        FocusTargetNode focusTargetNodeF = i.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return c(focusTargetNodeF, z10, z11);
        }
        return true;
    }

    static /* synthetic */ boolean b(FocusTargetNode focusTargetNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return a(focusTargetNode, z10, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(androidx.compose.ui.focus.FocusTargetNode r3, boolean r4, boolean r5) {
        /*
            j1.o r0 = r3.h2()
            int[] r1 = androidx.compose.ui.focus.h.a.f2730b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L40
            r2 = 2
            if (r0 == r2) goto L33
            r2 = 3
            if (r0 == r2) goto L20
            r3 = 4
            if (r0 != r3) goto L1a
        L18:
            r4 = r1
            goto L48
        L1a:
            md.q r3 = new md.q
            r3.<init>()
            throw r3
        L20:
            boolean r4 = a(r3, r4, r5)
            if (r4 == 0) goto L31
            j1.o r4 = j1.o.Inactive
            r3.k2(r4)
            if (r5 == 0) goto L18
        L2d:
            j1.d.c(r3)
            goto L18
        L31:
            r4 = 0
            goto L48
        L33:
            if (r4 == 0) goto L48
            j1.o r0 = j1.o.Inactive
            r3.k2(r0)
            if (r5 == 0) goto L48
            j1.d.c(r3)
            goto L48
        L40:
            j1.o r4 = j1.o.Inactive
            r3.k2(r4)
            if (r5 == 0) goto L18
            goto L2d
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.h.c(androidx.compose.ui.focus.FocusTargetNode, boolean, boolean):boolean");
    }

    private static final boolean d(FocusTargetNode focusTargetNode) {
        a1.a(focusTargetNode, new b(focusTargetNode));
        int i10 = a.f2730b[focusTargetNode.h2().ordinal()];
        if (i10 != 3 && i10 != 4) {
            return true;
        }
        focusTargetNode.k2(o.Active);
        return true;
    }

    public static final j1.a e(FocusTargetNode focusTargetNode, int i10) {
        int i11 = a.f2730b[focusTargetNode.h2().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return j1.a.Cancelled;
            }
            if (i11 == 3) {
                j1.a aVarE = e(m(focusTargetNode), i10);
                if (aVarE == j1.a.None) {
                    aVarE = null;
                }
                return aVarE == null ? g(focusTargetNode, i10) : aVarE;
            }
            if (i11 != 4) {
                throw new q();
            }
        }
        return j1.a.None;
    }

    private static final j1.a f(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.f2692o) {
            focusTargetNode.f2692o = true;
            try {
                f fVarInvoke = focusTargetNode.f2().o().invoke(androidx.compose.ui.focus.b.i(i10));
                f.a aVar = f.f2723b;
                if (fVarInvoke != aVar.b()) {
                    if (fVarInvoke == aVar.a()) {
                        return j1.a.Cancelled;
                    }
                    return fVarInvoke.c() ? j1.a.Redirected : j1.a.RedirectCancelled;
                }
            } finally {
                focusTargetNode.f2692o = false;
            }
        }
        return j1.a.None;
    }

    private static final j1.a g(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.f2691n) {
            focusTargetNode.f2691n = true;
            try {
                f fVarInvoke = focusTargetNode.f2().k().invoke(androidx.compose.ui.focus.b.i(i10));
                f.a aVar = f.f2723b;
                if (fVarInvoke != aVar.b()) {
                    if (fVarInvoke == aVar.a()) {
                        return j1.a.Cancelled;
                    }
                    return fVarInvoke.c() ? j1.a.Redirected : j1.a.RedirectCancelled;
                }
            } finally {
                focusTargetNode.f2691n = false;
            }
        }
        return j1.a.None;
    }

    public static final j1.a h(FocusTargetNode focusTargetNode, int i10) {
        e.c cVarG;
        androidx.compose.ui.node.a aVarH0;
        int i11 = a.f2730b[focusTargetNode.h2().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return j1.a.None;
        }
        if (i11 == 3) {
            return e(m(focusTargetNode), i10);
        }
        if (i11 != 4) {
            throw new q();
        }
        int iA = w0.a(1024);
        if (!focusTargetNode.L0().H1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        e.c cVarE1 = focusTargetNode.L0().E1();
        f0 f0VarK = a2.k.k(focusTargetNode);
        loop0: while (true) {
            if (f0VarK == null) {
                cVarG = null;
                break;
            }
            if ((f0VarK.h0().k().x1() & iA) != 0) {
                while (cVarE1 != null) {
                    if ((cVarE1.C1() & iA) != 0) {
                        cVarG = cVarE1;
                        v0.d dVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                                int i12 = 0;
                                for (e.c cVarB2 = ((a2.l) cVarG).b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
                                    if ((cVarB2.C1() & iA) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
                                if (i12 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
        if (focusTargetNode2 == null) {
            return j1.a.None;
        }
        int i13 = a.f2730b[focusTargetNode2.h2().ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                return j1.a.Cancelled;
            }
            if (i13 == 3) {
                return h(focusTargetNode2, i10);
            }
            if (i13 != 4) {
                throw new q();
            }
            j1.a aVarH = h(focusTargetNode2, i10);
            j1.a aVar = aVarH == j1.a.None ? null : aVarH;
            if (aVar != null) {
                return aVar;
            }
        }
        return f(focusTargetNode2, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean i(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.h.i(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean j(FocusTargetNode focusTargetNode) {
        j1.s sVarD = r.d(focusTargetNode);
        try {
            if (sVarD.f13821c) {
                sVarD.g();
            }
            sVarD.f();
            int i10 = a.f2729a[h(focusTargetNode, androidx.compose.ui.focus.b.f2698b.b()).ordinal()];
            boolean zI = true;
            if (i10 == 1) {
                zI = i(focusTargetNode);
            } else if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    throw new q();
                }
                zI = false;
            }
            return zI;
        } finally {
            sVarD.h();
        }
    }

    private static final boolean k(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        e.c cVar;
        e.c cVarG;
        androidx.compose.ui.node.a aVarH0;
        androidx.compose.ui.node.a aVarH02;
        int iA = w0.a(1024);
        if (!focusTargetNode2.L0().H1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        e.c cVarE1 = focusTargetNode2.L0().E1();
        f0 f0VarK = a2.k.k(focusTargetNode2);
        loop0: while (true) {
            cVar = null;
            if (f0VarK == null) {
                cVarG = null;
                break;
            }
            if ((f0VarK.h0().k().x1() & iA) != 0) {
                while (cVarE1 != null) {
                    if ((cVarE1.C1() & iA) != 0) {
                        cVarG = cVarE1;
                        v0.d dVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
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
            cVarE1 = (f0VarK == null || (aVarH02 = f0VarK.h0()) == null) ? null : aVarH02.o();
        }
        if (!ae.r.b(cVarG, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int i11 = a.f2730b[focusTargetNode.h2().ordinal()];
        if (i11 == 1) {
            boolean zD = d(focusTargetNode2);
            if (!zD) {
                return zD;
            }
            focusTargetNode.k2(o.ActiveParent);
            return zD;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                m(focusTargetNode);
                if (b(focusTargetNode, false, false, 3, null) && d(focusTargetNode2)) {
                    return true;
                }
            } else {
                if (i11 != 4) {
                    throw new q();
                }
                int iA2 = w0.a(1024);
                if (!focusTargetNode.L0().H1()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                e.c cVarE12 = focusTargetNode.L0().E1();
                f0 f0VarK2 = a2.k.k(focusTargetNode);
                loop4: while (true) {
                    if (f0VarK2 == null) {
                        break;
                    }
                    if ((f0VarK2.h0().k().x1() & iA2) != 0) {
                        while (cVarE12 != null) {
                            if ((cVarE12.C1() & iA2) != 0) {
                                e.c cVarG2 = cVarE12;
                                v0.d dVar2 = null;
                                while (cVarG2 != null) {
                                    if (cVarG2 instanceof FocusTargetNode) {
                                        cVar = cVarG2;
                                        break loop4;
                                    }
                                    if (((cVarG2.C1() & iA2) != 0) && (cVarG2 instanceof a2.l)) {
                                        int i12 = 0;
                                        for (e.c cVarB22 = ((a2.l) cVarG2).b2(); cVarB22 != null; cVarB22 = cVarB22.y1()) {
                                            if ((cVarB22.C1() & iA2) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    cVarG2 = cVarB22;
                                                } else {
                                                    if (dVar2 == null) {
                                                        dVar2 = new v0.d(new e.c[16], 0);
                                                    }
                                                    if (cVarG2 != null) {
                                                        dVar2.b(cVarG2);
                                                        cVarG2 = null;
                                                    }
                                                    dVar2.b(cVarB22);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    cVarG2 = a2.k.g(dVar2);
                                }
                            }
                            cVarE12 = cVarE12.E1();
                        }
                    }
                    f0VarK2 = f0VarK2.k0();
                    cVarE12 = (f0VarK2 == null || (aVarH0 = f0VarK2.h0()) == null) ? null : aVarH0.o();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar;
                if (focusTargetNode3 == null && l(focusTargetNode)) {
                    focusTargetNode.k2(o.Active);
                    return k(focusTargetNode, focusTargetNode2);
                }
                if (focusTargetNode3 != null && k(focusTargetNode3, focusTargetNode)) {
                    boolean zK = k(focusTargetNode, focusTargetNode2);
                    if (!(focusTargetNode.h2() == o.ActiveParent)) {
                        throw new IllegalStateException("Deactivated node is focused".toString());
                    }
                    if (zK) {
                        j1.d.c(focusTargetNode3);
                    }
                    return zK;
                }
            }
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode) {
        f0 f0VarY1;
        e1 e1VarJ0;
        u0 u0VarZ1 = focusTargetNode.z1();
        if (u0VarZ1 == null || (f0VarY1 = u0VarZ1.Y1()) == null || (e1VarJ0 = f0VarY1.j0()) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return e1VarJ0.requestFocus();
    }

    private static final FocusTargetNode m(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeF = i.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return focusTargetNodeF;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child".toString());
    }
}
