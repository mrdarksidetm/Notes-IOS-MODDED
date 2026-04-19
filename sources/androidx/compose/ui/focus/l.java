package androidx.compose.ui.focus;

import ae.r;
import ae.s;
import androidx.compose.ui.focus.b;
import j1.o;
import md.q;
import y1.c;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2740a;

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
            f2740a = iArr;
        }
    }

    static final class b extends s implements zd.l<c.a, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.l<FocusTargetNode, Boolean> f2744d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, zd.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f2741a = focusTargetNode;
            this.f2742b = focusTargetNode2;
            this.f2743c = i10;
            this.f2744d = lVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(c.a aVar) {
            Boolean boolValueOf = Boolean.valueOf(l.r(this.f2741a, this.f2742b, this.f2743c, this.f2744d));
            if (boolValueOf.booleanValue() || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (!(focusTargetNode.h2() == o.ActiveParent)) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
        }
        FocusTargetNode focusTargetNodeB = i.b(focusTargetNode);
        if (focusTargetNodeB != null) {
            return focusTargetNodeB;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    private static final boolean c(k1.h hVar, k1.h hVar2, k1.h hVar3, int i10) {
        if (d(hVar3, i10, hVar) || !d(hVar2, i10, hVar)) {
            return false;
        }
        if (e(hVar3, i10, hVar)) {
            b.a aVar = androidx.compose.ui.focus.b.f2698b;
            if (!androidx.compose.ui.focus.b.l(i10, aVar.d()) && !androidx.compose.ui.focus.b.l(i10, aVar.g()) && f(hVar2, i10, hVar) >= g(hVar3, i10, hVar)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean d(k1.h hVar, int i10, k1.h hVar2) {
        b.a aVar = androidx.compose.ui.focus.b.f2698b;
        if (!(androidx.compose.ui.focus.b.l(i10, aVar.d()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.g()))) {
            if (!(androidx.compose.ui.focus.b.l(i10, aVar.h()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (hVar.g() > hVar2.f() && hVar.f() < hVar2.g()) {
                return true;
            }
        } else if (hVar.c() > hVar2.i() && hVar.i() < hVar2.c()) {
            return true;
        }
        return false;
    }

    private static final boolean e(k1.h hVar, int i10, k1.h hVar2) {
        b.a aVar = androidx.compose.ui.focus.b.f2698b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.d())) {
            if (hVar2.f() >= hVar.g()) {
                return true;
            }
        } else if (androidx.compose.ui.focus.b.l(i10, aVar.g())) {
            if (hVar2.g() <= hVar.f()) {
                return true;
            }
        } else if (androidx.compose.ui.focus.b.l(i10, aVar.h())) {
            if (hVar2.i() >= hVar.c()) {
                return true;
            }
        } else {
            if (!androidx.compose.ui.focus.b.l(i10, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (hVar2.c() <= hVar.i()) {
                return true;
            }
        }
        return false;
    }

    private static final float f(k1.h hVar, int i10, k1.h hVar2) {
        float fI;
        float fC;
        float fI2;
        float fC2;
        float f10;
        b.a aVar = androidx.compose.ui.focus.b.f2698b;
        if (!androidx.compose.ui.focus.b.l(i10, aVar.d())) {
            if (androidx.compose.ui.focus.b.l(i10, aVar.g())) {
                fI = hVar.f();
                fC = hVar2.g();
            } else if (androidx.compose.ui.focus.b.l(i10, aVar.h())) {
                fI2 = hVar2.i();
                fC2 = hVar.c();
            } else {
                if (!androidx.compose.ui.focus.b.l(i10, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                fI = hVar.i();
                fC = hVar2.c();
            }
            f10 = fI - fC;
            return Math.max(0.0f, f10);
        }
        fI2 = hVar2.f();
        fC2 = hVar.g();
        f10 = fI2 - fC2;
        return Math.max(0.0f, f10);
    }

    private static final float g(k1.h hVar, int i10, k1.h hVar2) {
        float fC;
        float fC2;
        float fI;
        float fI2;
        float f10;
        b.a aVar = androidx.compose.ui.focus.b.f2698b;
        if (!androidx.compose.ui.focus.b.l(i10, aVar.d())) {
            if (androidx.compose.ui.focus.b.l(i10, aVar.g())) {
                fC = hVar.g();
                fC2 = hVar2.g();
            } else if (androidx.compose.ui.focus.b.l(i10, aVar.h())) {
                fI = hVar2.i();
                fI2 = hVar.i();
            } else {
                if (!androidx.compose.ui.focus.b.l(i10, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                fC = hVar.c();
                fC2 = hVar2.c();
            }
            f10 = fC - fC2;
            return Math.max(1.0f, f10);
        }
        fI = hVar2.f();
        fI2 = hVar.f();
        f10 = fI - fI2;
        return Math.max(1.0f, f10);
    }

    private static final k1.h h(k1.h hVar) {
        return new k1.h(hVar.g(), hVar.c(), hVar.g(), hVar.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void i(a2.j r10, v0.d<androidx.compose.ui.focus.FocusTargetNode> r11) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.l.i(a2.j, v0.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final androidx.compose.ui.focus.FocusTargetNode j(v0.d<androidx.compose.ui.focus.FocusTargetNode> r7, k1.h r8, int r9) {
        /*
            androidx.compose.ui.focus.b$a r0 = androidx.compose.ui.focus.b.f2698b
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.b.l(r9, r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            float r0 = r8.k()
            float r1 = (float) r3
            float r0 = r0 + r1
        L14:
            k1.h r0 = r8.p(r0, r2)
            goto L52
        L19:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.b.l(r9, r1)
            if (r1 == 0) goto L2b
            float r0 = r8.k()
            float r1 = (float) r3
            float r0 = r0 + r1
            float r0 = -r0
            goto L14
        L2b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.b.l(r9, r1)
            if (r1 == 0) goto L40
            float r0 = r8.e()
            float r1 = (float) r3
            float r0 = r0 + r1
        L3b:
            k1.h r0 = r8.p(r2, r0)
            goto L52
        L40:
            int r0 = r0.a()
            boolean r0 = androidx.compose.ui.focus.b.l(r9, r0)
            if (r0 == 0) goto L79
            float r0 = r8.e()
            float r1 = (float) r3
            float r0 = r0 + r1
            float r0 = -r0
            goto L3b
        L52:
            r1 = 0
            int r2 = r7.o()
            if (r2 <= 0) goto L78
            r3 = 0
            java.lang.Object[] r7 = r7.n()
        L5e:
            r4 = r7[r3]
            androidx.compose.ui.focus.FocusTargetNode r4 = (androidx.compose.ui.focus.FocusTargetNode) r4
            boolean r5 = androidx.compose.ui.focus.i.g(r4)
            if (r5 == 0) goto L74
            k1.h r5 = androidx.compose.ui.focus.i.d(r4)
            boolean r6 = m(r5, r0, r8, r9)
            if (r6 == 0) goto L74
            r1 = r4
            r0 = r5
        L74:
            int r3 = r3 + 1
            if (r3 < r2) goto L5e
        L78:
            return r1
        L79:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "This function should only be used for 2-D focus search"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.l.j(v0.d, k1.h, int):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i10, zd.l<? super FocusTargetNode, Boolean> lVar) {
        k1.h hVarH;
        v0.d dVar = new v0.d(new FocusTargetNode[16], 0);
        i(focusTargetNode, dVar);
        if (dVar.o() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (dVar.r() ? null : dVar.n()[0]);
            if (focusTargetNode2 != null) {
                return lVar.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        b.a aVar = androidx.compose.ui.focus.b.f2698b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.b())) {
            i10 = aVar.g();
        }
        if (androidx.compose.ui.focus.b.l(i10, aVar.g()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.a())) {
            hVarH = s(i.d(focusTargetNode));
        } else {
            if (!(androidx.compose.ui.focus.b.l(i10, aVar.d()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.h()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            hVarH = h(i.d(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeJ = j(dVar, hVarH, i10);
        if (focusTargetNodeJ != null) {
            return lVar.invoke(focusTargetNodeJ).booleanValue();
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, zd.l<? super FocusTargetNode, Boolean> lVar) {
        if (r(focusTargetNode, focusTargetNode2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i10, new b(focusTargetNode, focusTargetNode2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean m(k1.h hVar, k1.h hVar2, k1.h hVar3, int i10) {
        if (n(hVar, i10, hVar3)) {
            if (!n(hVar2, i10, hVar3) || c(hVar3, hVar, hVar2, i10)) {
                return true;
            }
            if (!c(hVar3, hVar2, hVar, i10) && q(i10, hVar3, hVar) < q(i10, hVar3, hVar2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean n(k1.h hVar, int i10, k1.h hVar2) {
        b.a aVar = androidx.compose.ui.focus.b.f2698b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.d())) {
            if ((hVar2.g() > hVar.g() || hVar2.f() >= hVar.g()) && hVar2.f() > hVar.f()) {
                return true;
            }
        } else if (androidx.compose.ui.focus.b.l(i10, aVar.g())) {
            if ((hVar2.f() < hVar.f() || hVar2.g() <= hVar.f()) && hVar2.g() < hVar.g()) {
                return true;
            }
        } else if (androidx.compose.ui.focus.b.l(i10, aVar.h())) {
            if ((hVar2.c() > hVar.c() || hVar2.i() >= hVar.c()) && hVar2.i() > hVar.i()) {
                return true;
            }
        } else {
            if (!androidx.compose.ui.focus.b.l(i10, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if ((hVar2.i() < hVar.i() || hVar2.c() <= hVar.i()) && hVar2.c() < hVar.c()) {
                return true;
            }
        }
        return false;
    }

    private static final float o(k1.h hVar, int i10, k1.h hVar2) {
        float fI;
        float fC;
        float fI2;
        float fC2;
        float f10;
        b.a aVar = androidx.compose.ui.focus.b.f2698b;
        if (!androidx.compose.ui.focus.b.l(i10, aVar.d())) {
            if (androidx.compose.ui.focus.b.l(i10, aVar.g())) {
                fI = hVar.f();
                fC = hVar2.g();
            } else if (androidx.compose.ui.focus.b.l(i10, aVar.h())) {
                fI2 = hVar2.i();
                fC2 = hVar.c();
            } else {
                if (!androidx.compose.ui.focus.b.l(i10, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                fI = hVar.i();
                fC = hVar2.c();
            }
            f10 = fI - fC;
            return Math.max(0.0f, f10);
        }
        fI2 = hVar2.f();
        fC2 = hVar.g();
        f10 = fI2 - fC2;
        return Math.max(0.0f, f10);
    }

    private static final float p(k1.h hVar, int i10, k1.h hVar2) {
        float f10;
        float f11;
        float f12;
        float fK;
        b.a aVar = androidx.compose.ui.focus.b.f2698b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.d()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.g())) {
            f10 = 2;
            f11 = hVar2.i() + (hVar2.e() / f10);
            f12 = hVar.i();
            fK = hVar.e();
        } else {
            if (!(androidx.compose.ui.focus.b.l(i10, aVar.h()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f10 = 2;
            f11 = hVar2.f() + (hVar2.k() / f10);
            f12 = hVar.f();
            fK = hVar.k();
        }
        return f11 - (f12 + (fK / f10));
    }

    private static final long q(int i10, k1.h hVar, k1.h hVar2) {
        long jAbs = (long) Math.abs(o(hVar2, i10, hVar));
        long jAbs2 = (long) Math.abs(p(hVar2, i10, hVar));
        return (((long) 13) * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:7:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean r(androidx.compose.ui.focus.FocusTargetNode r11, androidx.compose.ui.focus.FocusTargetNode r12, int r13, zd.l<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.l.r(androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusTargetNode, int, zd.l):boolean");
    }

    private static final k1.h s(k1.h hVar) {
        return new k1.h(hVar.f(), hVar.i(), hVar.f(), hVar.i());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i10, zd.l<? super FocusTargetNode, Boolean> lVar) {
        boolean zL;
        o oVarH2 = focusTargetNode.h2();
        int[] iArr = a.f2740a;
        int i11 = iArr[oVarH2.ordinal()];
        if (i11 == 1) {
            FocusTargetNode focusTargetNodeF = i.f(focusTargetNode);
            if (focusTargetNodeF == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            int i12 = iArr[focusTargetNodeF.h2().ordinal()];
            if (i12 == 1) {
                Boolean boolT = t(focusTargetNodeF, i10, lVar);
                if (!r.b(boolT, Boolean.FALSE)) {
                    return boolT;
                }
                focusTargetNodeF = b(focusTargetNodeF);
            } else if (i12 != 2 && i12 != 3) {
                if (i12 != 4) {
                    throw new q();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            zL = l(focusTargetNode, focusTargetNodeF, i10, lVar);
        } else {
            if (i11 != 2 && i11 != 3) {
                if (i11 == 4) {
                    return focusTargetNode.f2().g() ? lVar.invoke(focusTargetNode) : Boolean.FALSE;
                }
                throw new q();
            }
            zL = k(focusTargetNode, i10, lVar);
        }
        return Boolean.valueOf(zL);
    }
}
