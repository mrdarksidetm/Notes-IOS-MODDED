package a2;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {
    public static final void a(e.c cVar) {
        if (!cVar.H1()) {
            throw new IllegalStateException("autoInvalidateInsertedNode called on unattached node".toString());
        }
        b(cVar, -1, 1);
    }

    public static final void b(e.c cVar, int i10, int i11) {
        if (!(cVar instanceof l)) {
            c(cVar, i10 & cVar.C1(), i11);
            return;
        }
        l lVar = (l) cVar;
        c(cVar, lVar.c2() & i10, i11);
        int i12 = (~lVar.c2()) & i10;
        for (e.c cVarB2 = lVar.b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
            b(cVarB2, i12, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(e.c cVar, int i10, int i11) {
        if (i11 != 0 || cVar.F1()) {
            if (((w0.a(2) & i10) != 0) && (cVar instanceof a0)) {
                d0.b((a0) cVar);
                if (i11 == 2) {
                    k.h(cVar, w0.a(2)).y2();
                }
            }
            if (((w0.a(256) & i10) != 0) && (cVar instanceof s)) {
                k.k(cVar).C0();
            }
            if (((w0.a(4) & i10) != 0) && (cVar instanceof q)) {
                r.a((q) cVar);
            }
            if (((w0.a(8) & i10) != 0) && (cVar instanceof n1)) {
                o1.b((n1) cVar);
            }
            if (((w0.a(64) & i10) != 0) && (cVar instanceof h1)) {
                i1.a((h1) cVar);
            }
            if (((w0.a(1024) & i10) != 0) && (cVar instanceof FocusTargetNode)) {
                if (i11 == 2) {
                    cVar.M1();
                } else {
                    k.l(cVar).getFocusOwner().b((FocusTargetNode) cVar);
                }
            }
            if (((w0.a(2048) & i10) != 0) && (cVar instanceof j1.j)) {
                j1.j jVar = (j1.j) cVar;
                if (k(jVar)) {
                    if (i11 == 2) {
                        j(jVar);
                    } else {
                        j1.k.a(jVar);
                    }
                }
            }
            if (((i10 & w0.a(4096)) != 0) && (cVar instanceof j1.c)) {
                j1.d.b((j1.c) cVar);
            }
        }
    }

    public static final void d(e.c cVar) {
        if (!cVar.H1()) {
            throw new IllegalStateException("autoInvalidateRemovedNode called on unattached node".toString());
        }
        b(cVar, -1, 2);
    }

    public static final void e(e.c cVar) {
        if (!cVar.H1()) {
            throw new IllegalStateException("autoInvalidateUpdatedNode called on unattached node".toString());
        }
        b(cVar, -1, 0);
    }

    public static final int f(e.b bVar) {
        int iA = w0.a(1);
        if (bVar instanceof y1.v) {
            iA |= w0.a(2);
        }
        if (bVar instanceof i1.j) {
            iA |= w0.a(4);
        }
        if (bVar instanceof g2.n) {
            iA |= w0.a(8);
        }
        if (bVar instanceof v1.i0) {
            iA |= w0.a(16);
        }
        if ((bVar instanceof z1.d) || (bVar instanceof z1.j)) {
            iA |= w0.a(32);
        }
        if (bVar instanceof j1.b) {
            iA |= w0.a(4096);
        }
        if (bVar instanceof j1.h) {
            iA |= w0.a(2048);
        }
        if (bVar instanceof y1.k0) {
            iA |= w0.a(256);
        }
        if (bVar instanceof y1.q0) {
            iA |= w0.a(64);
        }
        return ((bVar instanceof y1.l0) || (bVar instanceof y1.m0)) ? iA | w0.a(128) : iA;
    }

    public static final int g(e.c cVar) {
        if (cVar.C1() != 0) {
            return cVar.C1();
        }
        int iA = w0.a(1);
        if (cVar instanceof a0) {
            iA |= w0.a(2);
        }
        if (cVar instanceof q) {
            iA |= w0.a(4);
        }
        if (cVar instanceof n1) {
            iA |= w0.a(8);
        }
        if (cVar instanceof j1) {
            iA |= w0.a(16);
        }
        if (cVar instanceof z1.h) {
            iA |= w0.a(32);
        }
        if (cVar instanceof h1) {
            iA |= w0.a(64);
        }
        if (cVar instanceof z) {
            iA |= w0.a(128);
        }
        if (cVar instanceof s) {
            iA |= w0.a(256);
        }
        if (cVar instanceof y1.l) {
            iA |= w0.a(512);
        }
        if (cVar instanceof FocusTargetNode) {
            iA |= w0.a(1024);
        }
        if (cVar instanceof j1.j) {
            iA |= w0.a(2048);
        }
        if (cVar instanceof j1.c) {
            iA |= w0.a(4096);
        }
        if (cVar instanceof t1.e) {
            iA |= w0.a(8192);
        }
        if (cVar instanceof x1.a) {
            iA |= w0.a(16384);
        }
        if (cVar instanceof h) {
            iA |= w0.a(32768);
        }
        if (cVar instanceof t1.g) {
            iA |= w0.a(131072);
        }
        return cVar instanceof s1 ? iA | w0.a(262144) : iA;
    }

    public static final int h(e.c cVar) {
        if (!(cVar instanceof l)) {
            return g(cVar);
        }
        l lVar = (l) cVar;
        int iC2 = lVar.c2();
        for (e.c cVarB2 = lVar.b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
            iC2 |= h(cVarB2);
        }
        return iC2;
    }

    public static final boolean i(int i10) {
        return (i10 & w0.a(128)) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void j(j1.j r10) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = a2.w0.a(r0)
            androidx.compose.ui.e$c r1 = r10.L0()
            boolean r1 = r1.H1()
            if (r1 == 0) goto Lb1
            v0.d r1 = new v0.d
            r2 = 16
            androidx.compose.ui.e$c[] r3 = new androidx.compose.ui.e.c[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.e$c r3 = r10.L0()
            androidx.compose.ui.e$c r3 = r3.y1()
            if (r3 != 0) goto L2c
            androidx.compose.ui.e$c r10 = r10.L0()
        L28:
            a2.k.a(r1, r10)
            goto L2f
        L2c:
            r1.b(r3)
        L2f:
            boolean r10 = r1.s()
            if (r10 == 0) goto Lb0
            int r10 = r1.o()
            r3 = 1
            int r10 = r10 - r3
            java.lang.Object r10 = r1.x(r10)
            androidx.compose.ui.e$c r10 = (androidx.compose.ui.e.c) r10
            int r5 = r10.x1()
            r5 = r5 & r0
            if (r5 != 0) goto L49
            goto L28
        L49:
            if (r10 == 0) goto L2f
            int r5 = r10.C1()
            r5 = r5 & r0
            if (r5 == 0) goto Lab
            r5 = 0
            r6 = r5
        L54:
            if (r10 == 0) goto L2f
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L60
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            j1.r.c(r10)
            goto La6
        L60:
            int r7 = r10.C1()
            r7 = r7 & r0
            if (r7 == 0) goto L69
            r7 = r3
            goto L6a
        L69:
            r7 = r4
        L6a:
            if (r7 == 0) goto La6
            boolean r7 = r10 instanceof a2.l
            if (r7 == 0) goto La6
            r7 = r10
            a2.l r7 = (a2.l) r7
            androidx.compose.ui.e$c r7 = r7.b2()
            r8 = r4
        L78:
            if (r7 == 0) goto La3
            int r9 = r7.C1()
            r9 = r9 & r0
            if (r9 == 0) goto L83
            r9 = r3
            goto L84
        L83:
            r9 = r4
        L84:
            if (r9 == 0) goto L9e
            int r8 = r8 + 1
            if (r8 != r3) goto L8c
            r10 = r7
            goto L9e
        L8c:
            if (r6 != 0) goto L95
            v0.d r6 = new v0.d
            androidx.compose.ui.e$c[] r9 = new androidx.compose.ui.e.c[r2]
            r6.<init>(r9, r4)
        L95:
            if (r10 == 0) goto L9b
            r6.b(r10)
            r10 = r5
        L9b:
            r6.b(r7)
        L9e:
            androidx.compose.ui.e$c r7 = r7.y1()
            goto L78
        La3:
            if (r8 != r3) goto La6
            goto L54
        La6:
            androidx.compose.ui.e$c r10 = a2.k.b(r6)
            goto L54
        Lab:
            androidx.compose.ui.e$c r10 = r10.y1()
            goto L49
        Lb0:
            return
        Lb1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.x0.j(j1.j):void");
    }

    private static final boolean k(j1.j jVar) {
        e eVar = e.f63a;
        eVar.b();
        jVar.S(eVar);
        return eVar.a();
    }
}
