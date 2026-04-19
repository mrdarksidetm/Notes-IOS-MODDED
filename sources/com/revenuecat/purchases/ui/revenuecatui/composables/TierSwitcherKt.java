package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.g;
import ae.r;
import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.k;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import b0.v;
import b2.k0;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import f1.b;
import h0.b;
import h0.f0;
import h0.g0;
import h0.h0;
import java.util.List;
import l0.g;
import l1.j0;
import md.i0;
import q0.q0;
import q0.y;
import t0.i;
import t0.k1;
import t0.k3;
import t0.l;
import t0.o;
import t0.o2;
import t0.p3;
import t0.q2;
import t0.u3;
import t0.w;
import w2.h;
import y1.e0;
import y1.n0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class TierSwitcherKt {
    /* JADX INFO: renamed from: SelectedTierView-1wkBAMs, reason: not valid java name */
    public static final void m188SelectedTierView1wkBAMs(TemplateConfiguration.TierInfo tierInfo, long j10, long j11, l lVar, int i10) {
        r.f(tierInfo, "selectedTier");
        l lVarP = lVar.p(-474734628);
        if (o.I()) {
            o.U(-474734628, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.SelectedTierView (TierSwitcher.kt:48)");
        }
        e eVarC = c.c(e.f2662a, j10, g.a(50));
        TierSwitcherUIConstants tierSwitcherUIConstants = TierSwitcherUIConstants.INSTANCE;
        e eVarJ = m.j(eVarC, tierSwitcherUIConstants.m194getTierHorizontalPaddingD9Ej5fM(), tierSwitcherUIConstants.m197getTierVerticalPaddingD9Ej5fM());
        lVarP.e(733328855);
        e0 e0VarG = d.g(b.f11020a.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar = a2.g.J;
        a<a2.g> aVarA = aVar.a();
        q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarJ);
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
        u3.b(lVarA, e0VarG, aVar.e());
        u3.b(lVarA, wVarB, aVar.g());
        p<a2.g, Integer, i0> pVarB = aVar.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        q0.b(tierInfo.getName(), null, j11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y.f18928a.c(lVarP, y.f18929b | 0).c(), lVarP, i10 & 896, 0, 65530);
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new TierSwitcherKt$SelectedTierView$2(tierInfo, j10, j11, i10));
    }

    /* JADX INFO: renamed from: TierSwitcher-UFBoNtE, reason: not valid java name */
    public static final void m189TierSwitcherUFBoNtE(List<TemplateConfiguration.TierInfo> list, TemplateConfiguration.TierInfo tierInfo, zd.l<? super TemplateConfiguration.TierInfo, i0> lVar, long j10, long j11, long j12, long j13, l lVar2, int i10) {
        r.f(list, "tiers");
        r.f(tierInfo, "selectedTier");
        r.f(lVar, "onTierSelected");
        l lVarP = lVar2.p(1054819874);
        if (o.I()) {
            o.U(1054819874, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.TierSwitcher (TierSwitcher.kt:74)");
        }
        int iIndexOf = list.indexOf(tierInfo);
        lVarP.e(-492369756);
        Object objF = lVarP.f();
        l.a aVar = l.f20813a;
        if (objF == aVar.a()) {
            objF = k3.e(0, null, 2, null);
            lVarP.E(objF);
        }
        lVarP.K();
        k1 k1Var = (k1) objF;
        lVarP.e(-492369756);
        Object objF2 = lVarP.f();
        if (objF2 == aVar.a()) {
            objF2 = k3.e(h.i(h.m(40)), null, 2, null);
            lVarP.E(objF2);
        }
        lVarP.K();
        k1 k1Var2 = (k1) objF2;
        w2.d dVar = (w2.d) lVarP.P(k0.c());
        UIConstant uIConstant = UIConstant.INSTANCE;
        p3<j0> p3VarA = v.a(j10, uIConstant.getDefaultColorAnimation(), "backgroundColor", null, lVarP, ((i10 >> 9) & 14) | 448, 8);
        p3<j0> p3VarA2 = v.a(j11, uIConstant.getDefaultColorAnimation(), "backgroundSelectedColor", null, lVarP, ((i10 >> 12) & 14) | 448, 8);
        p3<j0> p3VarA3 = v.a(j12, uIConstant.getDefaultColorAnimation(), "foregroundColor", null, lVarP, ((i10 >> 15) & 14) | 448, 8);
        p3<j0> p3VarA4 = v.a(j13, uIConstant.getDefaultColorAnimation(), "foregroundSelectedColor", null, lVarP, ((i10 >> 18) & 14) | 448, 8);
        e.a aVar2 = e.f2662a;
        e eVarG = androidx.compose.foundation.layout.p.g(c.d(i1.g.a(aVar2, l0.g.a(50)), TierSwitcher_UFBoNtE$lambda$7(p3VarA), null, 2, null), 0.0f, 1, null);
        lVarP.e(1157296644);
        boolean zN = lVarP.N(k1Var);
        Object objF3 = lVarP.f();
        if (zN || objF3 == aVar.a()) {
            objF3 = new TierSwitcherKt$TierSwitcher$1$1(k1Var);
            lVarP.E(objF3);
        }
        lVarP.K();
        e eVarA = n0.a(eVarG, (zd.l) objF3);
        lVarP.e(733328855);
        b.a aVar3 = b.f11020a;
        e0 e0VarG = d.g(aVar3.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar4 = a2.g.J;
        a<a2.g> aVarA = aVar4.a();
        q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarA);
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
        u3.b(lVarA, e0VarG, aVar4.e());
        u3.b(lVarA, wVarB, aVar4.g());
        p<a2.g, Integer, i0> pVarB = aVar4.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        Object obj = null;
        float f10 = 0.0f;
        e eVarH = androidx.compose.foundation.layout.p.h(androidx.compose.foundation.layout.p.f(k.b(aVar2, TierSwitcher_UFBoNtE$lambda$19$lambda$13(c0.c.c(h.m(dVar.l0(TierSwitcher_UFBoNtE$lambda$2(k1Var) / list.size()) * iIndexOf), null, "tier_switcher", null, lVarP, 384, 10)), 0.0f, 2, null), 1.0f / list.size()), TierSwitcher_UFBoNtE$lambda$5(k1Var2));
        TierSwitcherUIConstants tierSwitcherUIConstants = TierSwitcherUIConstants.INSTANCE;
        d.a(c.d(i1.g.a(m.i(eVarH, tierSwitcherUIConstants.m193getSelectedTierPaddingD9Ej5fM()), l0.g.a(50)), TierSwitcher_UFBoNtE$lambda$8(p3VarA2), null, 2, null), lVarP, 0);
        b.c cVarI = aVar3.i();
        b.f fVarF = h0.b.f11594a.f();
        lVarP.e(511388516);
        boolean zN2 = lVarP.N(k1Var2) | lVarP.N(dVar);
        Object objF4 = lVarP.f();
        if (zN2 || objF4 == aVar.a()) {
            objF4 = new TierSwitcherKt$TierSwitcher$2$1$1(dVar, k1Var2);
            lVarP.E(objF4);
        }
        lVarP.K();
        e eVarJ = androidx.compose.foundation.layout.p.j(androidx.compose.foundation.layout.i.a(n0.a(aVar2, (zd.l) objF4), h0.u.Max), tierSwitcherUIConstants.m192getMinimumHeightD9Ej5fM(), 0.0f, 2, null);
        lVarP.e(693286680);
        e0 e0VarA = f0.a(fVarF, cVarI, lVarP, 54);
        int i11 = -1323940314;
        lVarP.e(-1323940314);
        int iA2 = i.a(lVarP, 0);
        w wVarB2 = lVarP.B();
        a<a2.g> aVarA2 = aVar4.a();
        q<q2<a2.g>, l, Integer, i0> qVarA2 = u.a(eVarJ);
        if (!(lVarP.t() instanceof t0.e)) {
            i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA2);
        } else {
            lVarP.D();
        }
        l lVarA2 = u3.a(lVarP);
        u3.b(lVarA2, e0VarA, aVar4.e());
        u3.b(lVarA2, wVarB2, aVar4.g());
        p<a2.g, Integer, i0> pVarB2 = aVar4.b();
        if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
            lVarA2.E(Integer.valueOf(iA2));
            lVarA2.Q(Integer.valueOf(iA2), pVarB2);
        }
        qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0 h0Var = h0.f11663a;
        lVarP.e(1145725464);
        for (TemplateConfiguration.TierInfo tierInfo2 : list) {
            f1.b bVarE = f1.b.f11020a.e();
            e.a aVar5 = e.f2662a;
            e eVarC = androidx.compose.foundation.layout.p.c(g0.c(h0Var, aVar5, 1.0f, false, 2, null), f10, 1, obj);
            lVarP.e(-492369756);
            Object objF5 = lVarP.f();
            if (objF5 == l.f20813a.a()) {
                objF5 = g0.l.a();
                lVarP.E(objF5);
            }
            lVarP.K();
            e eVarC2 = androidx.compose.foundation.e.c(eVarC, (g0.m) objF5, null, false, null, null, new TierSwitcherKt$TierSwitcher$2$2$1$2(lVar, tierInfo2), 28, null);
            lVarP.e(733328855);
            e0 e0VarG2 = d.g(bVarE, false, lVarP, 6);
            lVarP.e(i11);
            int iA3 = i.a(lVarP, 0);
            w wVarB3 = lVarP.B();
            g.a aVar6 = a2.g.J;
            a<a2.g> aVarA3 = aVar6.a();
            q<q2<a2.g>, l, Integer, i0> qVarA3 = u.a(eVarC2);
            if (!(lVarP.t() instanceof t0.e)) {
                i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA3);
            } else {
                lVarP.D();
            }
            l lVarA3 = u3.a(lVarP);
            u3.b(lVarA3, e0VarG2, aVar6.e());
            u3.b(lVarA3, wVarB3, aVar6.g());
            p<a2.g, Integer, i0> pVarB3 = aVar6.b();
            if (lVarA3.l() || !r.b(lVarA3.f(), Integer.valueOf(iA3))) {
                lVarA3.E(Integer.valueOf(iA3));
                lVarA3.Q(Integer.valueOf(iA3), pVarB3);
            }
            qVarA3.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar2 = f.f2502a;
            String name = tierInfo2.getName();
            i2.g0 g0VarC = y.f18928a.c(lVarP, y.f18929b | 0).c();
            int iA4 = u2.i.f21560b.a();
            TierSwitcherUIConstants tierSwitcherUIConstants2 = TierSwitcherUIConstants.INSTANCE;
            e eVarJ2 = m.j(aVar5, tierSwitcherUIConstants2.m195getTierTextPaddingHorizontalD9Ej5fM(), tierSwitcherUIConstants2.m196getTierTextPaddingVerticalD9Ej5fM());
            l lVar3 = lVarP;
            q0.b(name, eVarJ2, r.b(tierInfo, tierInfo2) ? TierSwitcher_UFBoNtE$lambda$10(p3VarA4) : TierSwitcher_UFBoNtE$lambda$9(p3VarA3), 0L, null, null, null, 0L, null, u2.i.h(iA4), 0L, 0, false, 0, 0, null, g0VarC, lVar3, 48, 0, 65016);
            lVar3.K();
            lVar3.L();
            lVar3.K();
            lVar3.K();
            lVarP = lVar3;
            obj = null;
            f10 = 0.0f;
            i11 = -1323940314;
        }
        l lVar4 = lVarP;
        lVar4.K();
        lVar4.K();
        lVar4.L();
        lVar4.K();
        lVar4.K();
        lVar4.K();
        lVar4.L();
        lVar4.K();
        lVar4.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVar4.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new TierSwitcherKt$TierSwitcher$3(list, tierInfo, lVar, j10, j11, j12, j13, i10));
    }

    private static final long TierSwitcher_UFBoNtE$lambda$10(p3<j0> p3Var) {
        return p3Var.getValue().E();
    }

    private static final float TierSwitcher_UFBoNtE$lambda$19$lambda$13(p3<h> p3Var) {
        return p3Var.getValue().r();
    }

    private static final int TierSwitcher_UFBoNtE$lambda$2(k1<Integer> k1Var) {
        return k1Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TierSwitcher_UFBoNtE$lambda$3(k1<Integer> k1Var, int i10) {
        k1Var.setValue(Integer.valueOf(i10));
    }

    private static final float TierSwitcher_UFBoNtE$lambda$5(k1<h> k1Var) {
        return k1Var.getValue().r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TierSwitcher_UFBoNtE$lambda$6(k1<h> k1Var, float f10) {
        k1Var.setValue(h.i(f10));
    }

    private static final long TierSwitcher_UFBoNtE$lambda$7(p3<j0> p3Var) {
        return p3Var.getValue().E();
    }

    private static final long TierSwitcher_UFBoNtE$lambda$8(p3<j0> p3Var) {
        return p3Var.getValue().E();
    }

    private static final long TierSwitcher_UFBoNtE$lambda$9(p3<j0> p3Var) {
        return p3Var.getValue().E();
    }
}
