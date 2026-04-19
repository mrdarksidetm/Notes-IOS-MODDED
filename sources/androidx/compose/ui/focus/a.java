package androidx.compose.ui.focus;

import a2.f0;
import a2.w0;
import ae.r;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.b;
import y1.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final <T> T a(FocusTargetNode focusTargetNode, int i10, zd.l<? super c.a, ? extends T> lVar) {
        e.c cVarG;
        y1.c cVarG2;
        int iC;
        androidx.compose.ui.node.a aVarH0;
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
                                int i11 = 0;
                                for (e.c cVarB2 = ((a2.l) cVarG).b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
                                    if ((cVarB2.C1() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
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
        if ((focusTargetNode2 != null && r.b(focusTargetNode2.g2(), focusTargetNode.g2())) || (cVarG2 = focusTargetNode.g2()) == null) {
            return null;
        }
        b.a aVar = b.f2698b;
        if (b.l(i10, aVar.h())) {
            iC = c.b.f23214a.a();
        } else if (b.l(i10, aVar.a())) {
            iC = c.b.f23214a.d();
        } else if (b.l(i10, aVar.d())) {
            iC = c.b.f23214a.e();
        } else if (b.l(i10, aVar.g())) {
            iC = c.b.f23214a.f();
        } else if (b.l(i10, aVar.e())) {
            iC = c.b.f23214a.b();
        } else {
            if (!b.l(i10, aVar.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            iC = c.b.f23214a.c();
        }
        return (T) cVarG2.a(iC, lVar);
    }
}
