package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.g;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.layout.b;
import d1.v;
import f1.b;
import h0.g0;
import java.util.ArrayList;
import java.util.List;
import md.i0;
import t0.e2;
import t0.f3;
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
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class AdaptiveComposableKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.AdaptiveComposableKt$AdaptiveComposable$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ List<p<l, Integer, i0>> $composables;
        final /* synthetic */ e $modifier;
        final /* synthetic */ g0 $this_AdaptiveComposable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(g0 g0Var, e eVar, List<? extends p<? super l, ? super Integer, i0>> list, int i10, int i11) {
            super(2);
            this.$this_AdaptiveComposable = g0Var;
            this.$modifier = eVar;
            this.$composables = list;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            AdaptiveComposableKt.AdaptiveComposable(this.$this_AdaptiveComposable, this.$modifier, this.$composables, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    public static final void AdaptiveComposable(g0 g0Var, e eVar, List<? extends p<? super l, ? super Integer, i0>> list, l lVar, int i10, int i11) {
        r.f(g0Var, "<this>");
        r.f(list, "composables");
        l lVarP = lVar.p(-1063564770);
        e eVar2 = (i11 & 1) != 0 ? e.f2662a : eVar;
        if (o.I()) {
            o.U(-1063564770, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.AdaptiveComposable (AdaptiveComposable.kt:21)");
        }
        lVarP.e(-492369756);
        Object objF = lVarP.f();
        l.a aVar = l.f20813a;
        ?? r10 = 0;
        if (objF == aVar.a()) {
            objF = k3.e(0, null, 2, null);
            lVarP.E(objF);
        }
        lVarP.K();
        k1 k1Var = (k1) objF;
        lVarP.e(-492369756);
        Object objF2 = lVarP.f();
        Object obj = objF2;
        if (objF2 == aVar.a()) {
            v vVarF = f3.f();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(0);
            }
            vVarF.addAll(arrayList);
            lVarP.E(vVarF);
            obj = vVarF;
        }
        lVarP.K();
        v vVar = (v) obj;
        e eVarG = androidx.compose.foundation.layout.p.g(eVar2, 0.0f, 1, null);
        lVarP.e(1157296644);
        boolean zN = lVarP.N(k1Var);
        Object objF3 = lVarP.f();
        if (zN || objF3 == l.f20813a.a()) {
            objF3 = new AdaptiveComposableKt$AdaptiveComposable$1$1(k1Var);
            lVarP.E(objF3);
        }
        lVarP.K();
        e eVarA = b.a(eVarG, (zd.l) objF3);
        b.a aVar2 = f1.b.f11020a;
        e eVarB = g0Var.b(eVarA, aVar2.i());
        lVarP.e(733328855);
        e0 e0VarG = d.g(aVar2.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar3 = g.J;
        a<g> aVarA = aVar3.a();
        q<q2<g>, l, Integer, i0> qVarA = u.a(eVarB);
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
        u3.b(lVarA, e0VarG, aVar3.e());
        u3.b(lVarA, wVarB, aVar3.g());
        p<g, Integer, i0> pVarB = aVar3.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        e eVarC = fVar.c(androidx.compose.foundation.layout.p.z(androidx.compose.foundation.layout.p.g(c.c(e.f2662a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null), 0.0f, 1, null), null, true, 1, null), aVar2.e());
        lVarP.e(733328855);
        e0 e0VarG2 = d.g(aVar2.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA2 = i.a(lVarP, 0);
        w wVarB2 = lVarP.B();
        a<g> aVarA2 = aVar3.a();
        q<q2<g>, l, Integer, i0> qVarA2 = u.a(eVarC);
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
        u3.b(lVarA2, e0VarG2, aVar3.e());
        u3.b(lVarA2, wVarB2, aVar3.g());
        p<g, Integer, i0> pVarB2 = aVar3.b();
        if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
            lVarA2.E(Integer.valueOf(iA2));
            lVarA2.Q(Integer.valueOf(iA2), pVarB2);
        }
        qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        lVarP.e(-1554483500);
        int i13 = 0;
        for (Object obj2 : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                nd.u.w();
            }
            p pVar = (p) obj2;
            e.a aVar4 = e.f2662a;
            Integer numValueOf = Integer.valueOf(i13);
            lVarP.e(511388516);
            boolean zN2 = lVarP.N(vVar) | lVarP.N(numValueOf);
            Object objF4 = lVarP.f();
            if (zN2 || objF4 == l.f20813a.a()) {
                objF4 = new AdaptiveComposableKt$AdaptiveComposable$2$1$1$1$1(vVar, i13);
                lVarP.E(objF4);
            }
            lVarP.K();
            e eVarA2 = androidx.compose.ui.layout.a.a(aVar4, (q) objF4);
            lVarP.e(733328855);
            e0 e0VarG3 = d.g(f1.b.f11020a.o(), r10, lVarP, r10);
            lVarP.e(-1323940314);
            int iA3 = i.a(lVarP, r10);
            w wVarB3 = lVarP.B();
            g.a aVar5 = g.J;
            a<g> aVarA3 = aVar5.a();
            q<q2<g>, l, Integer, i0> qVarA3 = u.a(eVarA2);
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
            u3.b(lVarA3, e0VarG3, aVar5.e());
            u3.b(lVarA3, wVarB3, aVar5.g());
            p<g, Integer, i0> pVarB3 = aVar5.b();
            if (lVarA3.l() || !r.b(lVarA3.f(), Integer.valueOf(iA3))) {
                lVarA3.E(Integer.valueOf(iA3));
                lVarA3.Q(Integer.valueOf(iA3), pVarB3);
            }
            qVarA3.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar2 = f.f2502a;
            pVar.invoke(lVarP, 0);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            i13 = i14;
            r10 = 0;
        }
        lVarP.K();
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        lVarP.e(-492369756);
        Object objF5 = lVarP.f();
        if (objF5 == l.f20813a.a()) {
            objF5 = f3.e(new AdaptiveComposableKt$AdaptiveComposable$2$selectedIndex$2$1(vVar, k1Var));
            lVarP.E(objF5);
        }
        lVarP.K();
        p3 p3Var = (p3) objF5;
        e.a aVar6 = e.f2662a;
        b.a aVar7 = f1.b.f11020a;
        e eVarC2 = fVar.c(aVar6, aVar7.e());
        lVarP.e(733328855);
        e0 e0VarG4 = d.g(aVar7.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA4 = i.a(lVarP, 0);
        w wVarB4 = lVarP.B();
        g.a aVar8 = g.J;
        a<g> aVarA4 = aVar8.a();
        q<q2<g>, l, Integer, i0> qVarA4 = u.a(eVarC2);
        if (!(lVarP.t() instanceof t0.e)) {
            i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA4);
        } else {
            lVarP.D();
        }
        l lVarA4 = u3.a(lVarP);
        u3.b(lVarA4, e0VarG4, aVar8.e());
        u3.b(lVarA4, wVarB4, aVar8.g());
        p<g, Integer, i0> pVarB4 = aVar8.b();
        if (lVarA4.l() || !r.b(lVarA4.f(), Integer.valueOf(iA4))) {
            lVarA4.E(Integer.valueOf(iA4));
            lVarA4.Q(Integer.valueOf(iA4), pVarB4);
        }
        qVarA4.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar3 = f.f2502a;
        list.get(AdaptiveComposable$lambda$14$lambda$12(p3Var)).invoke(lVarP, 0);
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
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
        o2VarV.a(new AnonymousClass3(g0Var, eVar2, list, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AdaptiveComposable$lambda$1(k1<Integer> k1Var) {
        return k1Var.getValue().intValue();
    }

    private static final int AdaptiveComposable$lambda$14$lambda$12(p3<Integer> p3Var) {
        return p3Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdaptiveComposable$lambda$2(k1<Integer> k1Var, int i10) {
        k1Var.setValue(Integer.valueOf(i10));
    }
}
