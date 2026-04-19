package a2;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends e.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f232n = x0.g(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e.c f233o;

    private final void d2(int i10, boolean z10) {
        e.c cVarY1;
        int iC1 = C1();
        U1(i10);
        if (iC1 != i10) {
            if (k.f(this)) {
                Q1(i10);
            }
            if (H1()) {
                e.c cVarL0 = L0();
                e.c cVarE1 = this;
                while (cVarE1 != null) {
                    i10 |= cVarE1.C1();
                    cVarE1.U1(i10);
                    if (cVarE1 == cVarL0) {
                        break;
                    } else {
                        cVarE1 = cVarE1.E1();
                    }
                }
                if (z10 && cVarE1 == cVarL0) {
                    i10 = x0.h(cVarL0);
                    cVarL0.U1(i10);
                }
                int iX1 = i10 | ((cVarE1 == null || (cVarY1 = cVarE1.y1()) == null) ? 0 : cVarY1.x1());
                while (cVarE1 != null) {
                    iX1 |= cVarE1.C1();
                    cVarE1.Q1(iX1);
                    cVarE1 = cVarE1.E1();
                }
            }
        }
    }

    private final void e2(int i10, e.c cVar) {
        int iC1 = C1();
        if ((i10 & w0.a(2)) != 0) {
            if (!((w0.a(2) & iC1) != 0) || (this instanceof a0)) {
                return;
            }
            throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar).toString());
        }
    }

    @Override // androidx.compose.ui.e.c
    public void I1() {
        super.I1();
        for (e.c cVarB2 = b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
            cVarB2.Z1(z1());
            if (!cVarB2.H1()) {
                cVarB2.I1();
            }
        }
    }

    @Override // androidx.compose.ui.e.c
    public void J1() {
        for (e.c cVarB2 = b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
            cVarB2.J1();
        }
        super.J1();
    }

    @Override // androidx.compose.ui.e.c
    public void N1() {
        super.N1();
        for (e.c cVarB2 = b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
            cVarB2.N1();
        }
    }

    @Override // androidx.compose.ui.e.c
    public void O1() {
        for (e.c cVarB2 = b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
            cVarB2.O1();
        }
        super.O1();
    }

    @Override // androidx.compose.ui.e.c
    public void P1() {
        super.P1();
        for (e.c cVarB2 = b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
            cVarB2.P1();
        }
    }

    @Override // androidx.compose.ui.e.c
    public void Z1(u0 u0Var) {
        super.Z1(u0Var);
        for (e.c cVarB2 = b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
            cVarB2.Z1(u0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final <T extends a2.j> T a2(T r9) {
        /*
            r8 = this;
            androidx.compose.ui.e$c r0 = r9.L0()
            r1 = 1
            r2 = 0
            if (r0 == r9) goto La
            r3 = r1
            goto Lb
        La:
            r3 = r2
        Lb:
            r4 = 0
            if (r3 == 0) goto L3a
            boolean r3 = r9 instanceof androidx.compose.ui.e.c
            if (r3 == 0) goto L16
            r3 = r9
            androidx.compose.ui.e$c r3 = (androidx.compose.ui.e.c) r3
            goto L17
        L16:
            r3 = r4
        L17:
            if (r3 == 0) goto L1d
            androidx.compose.ui.e$c r4 = r3.E1()
        L1d:
            androidx.compose.ui.e$c r3 = r8.L0()
            if (r0 != r3) goto L2a
            boolean r0 = ae.r.b(r4, r8)
            if (r0 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r2
        L2b:
            if (r1 == 0) goto L2e
            return r9
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot delegate to an already delegated node"
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L3a:
            boolean r3 = r0.H1()
            r3 = r3 ^ r1
            if (r3 == 0) goto Laa
            androidx.compose.ui.e$c r3 = r8.L0()
            r0.R1(r3)
            int r3 = r8.C1()
            int r5 = a2.x0.h(r0)
            r0.U1(r5)
            r8.e2(r5, r0)
            androidx.compose.ui.e$c r6 = r8.f233o
            r0.S1(r6)
            r8.f233o = r0
            r0.W1(r8)
            int r6 = r8.C1()
            r6 = r6 | r5
            r8.d2(r6, r2)
            boolean r6 = r8.H1()
            if (r6 == 0) goto La9
            r6 = 2
            int r7 = a2.w0.a(r6)
            r5 = r5 & r7
            if (r5 == 0) goto L78
            r5 = r1
            goto L79
        L78:
            r5 = r2
        L79:
            if (r5 == 0) goto L99
            int r5 = a2.w0.a(r6)
            r3 = r3 & r5
            if (r3 == 0) goto L83
            goto L84
        L83:
            r1 = r2
        L84:
            if (r1 != 0) goto L99
            a2.f0 r1 = a2.k.k(r8)
            androidx.compose.ui.node.a r1 = r1.h0()
            androidx.compose.ui.e$c r2 = r8.L0()
            r2.Z1(r4)
            r1.C()
            goto La0
        L99:
            a2.u0 r1 = r8.z1()
            r8.Z1(r1)
        La0:
            r0.I1()
            r0.O1()
            a2.x0.a(r0)
        La9:
            return r9
        Laa:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot delegate to an already attached node"
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.l.a2(a2.j):a2.j");
    }

    public final e.c b2() {
        return this.f233o;
    }

    public final int c2() {
        return this.f232n;
    }
}
