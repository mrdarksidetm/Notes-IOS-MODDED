package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.g;
import ae.r;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import f1.b;
import h0.c;
import h0.g;
import l1.j0;
import md.i0;
import t0.i;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class CloseButtonKt {
    /* JADX INFO: renamed from: CloseButton-drOMvmE, reason: not valid java name */
    public static final void m144CloseButtondrOMvmE(c cVar, boolean z10, j0 j0Var, boolean z11, a<i0> aVar, l lVar, int i10) {
        int i11;
        l lVar2;
        r.f(cVar, "$this$CloseButton");
        r.f(aVar, "onClick");
        l lVarP = lVar.p(-396768639);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.c(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= lVarP.N(j0Var) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= lVarP.c(z11) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= lVarP.k(aVar) ? 16384 : 8192;
        }
        if ((46811 & i11) == 9362 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(-396768639, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.CloseButton (CloseButton.kt:15)");
            }
            if (z10) {
                e.a aVar2 = e.f2662a;
                b.a aVar3 = b.f11020a;
                e eVarC = cVar.c(aVar2, aVar3.o());
                lVarP.e(-483455358);
                e0 e0VarA = g.a(h0.b.f11594a.h(), aVar3.k(), lVarP, 0);
                lVarP.e(-1323940314);
                int iA = i.a(lVarP, 0);
                w wVarB = lVarP.B();
                g.a aVar4 = a2.g.J;
                a<a2.g> aVarA = aVar4.a();
                q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarC);
                if (!(lVarP.t() instanceof t0.e)) {
                    i.b();
                }
                lVarP.r();
                if (lVarP.l()) {
                    lVarP.O(aVarA);
                } else {
                    lVarP.D();
                }
                l lVarA = u3.a(lVarP);
                u3.b(lVarA, e0VarA, aVar4.e());
                u3.b(lVarA, wVarB, aVar4.g());
                p<a2.g, Integer, i0> pVarB = aVar4.b();
                if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                    lVarA.E(Integer.valueOf(iA));
                    lVarA.Q(Integer.valueOf(iA), pVarB);
                }
                qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
                lVarP.e(2058660585);
                h0.i iVar = h0.i.f11664a;
                InsetSpacersKt.StatusBarSpacer(lVarP, 0);
                lVar2 = lVarP;
                q0.u.a(aVar, null, !z11, null, null, b1.c.b(lVarP, 170484435, true, new CloseButtonKt$CloseButton$1$1(j0Var)), lVarP, ((i11 >> 12) & 14) | 196608, 26);
                lVar2.K();
                lVar2.L();
                lVar2.K();
                lVar2.K();
            } else {
                lVar2 = lVarP;
            }
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new CloseButtonKt$CloseButton$2(cVar, z10, j0Var, z11, aVar, i10));
    }
}
