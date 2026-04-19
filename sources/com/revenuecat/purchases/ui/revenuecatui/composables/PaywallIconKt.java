package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.g;
import ae.s;
import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import d0.g;
import f1.b;
import i0.a;
import i0.b0;
import i0.q;
import l1.j0;
import md.i0;
import q0.v;
import t0.e2;
import t0.i;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import w2.h;
import y1.e0;
import y1.u;
import zd.a;
import zd.l;
import zd.p;
import zd.r;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallIconKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt$PaywallIconPreview$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<b0, i0> {
        final /* synthetic */ PaywallIconName[] $icons;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt$PaywallIconPreview$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02101 extends s implements r<q, Integer, t0.l, Integer, i0> {
            final /* synthetic */ PaywallIconName[] $icons;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02101(PaywallIconName[] paywallIconNameArr) {
                super(4);
                this.$icons = paywallIconNameArr;
            }

            @Override // zd.r
            public /* bridge */ /* synthetic */ i0 invoke(q qVar, Integer num, t0.l lVar, Integer num2) {
                invoke(qVar, num.intValue(), lVar, num2.intValue());
                return i0.f15558a;
            }

            public final void invoke(q qVar, int i10, t0.l lVar, int i11) {
                int i12;
                ae.r.f(qVar, "$this$items");
                if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                    i12 = (lVar.h(i10) ? 32 : 16) | i11;
                } else {
                    i12 = i11;
                }
                if ((i12 & 721) == 144 && lVar.s()) {
                    lVar.x();
                    return;
                }
                if (o.I()) {
                    o.U(-320278688, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconPreview.<anonymous>.<anonymous> (PaywallIcon.kt:154)");
                }
                e.a aVar = e.f2662a;
                j0.a aVar2 = j0.f14524b;
                e eVarG = g.g(c.d(aVar, aVar2.k(), null, 2, null), h.m(1), aVar2.a(), null, 4, null);
                PaywallIconName[] paywallIconNameArr = this.$icons;
                lVar.e(733328855);
                e0 e0VarG = d.g(b.f11020a.o(), false, lVar, 0);
                lVar.e(-1323940314);
                int iA = i.a(lVar, 0);
                w wVarB = lVar.B();
                g.a aVar3 = a2.g.J;
                a<a2.g> aVarA = aVar3.a();
                zd.q<q2<a2.g>, t0.l, Integer, i0> qVarA = u.a(eVarG);
                if (!(lVar.t() instanceof t0.e)) {
                    i.b();
                }
                lVar.r();
                if (lVar.l()) {
                    lVar.O(aVarA);
                } else {
                    lVar.D();
                }
                t0.l lVarA = u3.a(lVar);
                u3.b(lVarA, e0VarG, aVar3.e());
                u3.b(lVarA, wVarB, aVar3.g());
                p<a2.g, Integer, i0> pVarB = aVar3.b();
                if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
                    lVarA.E(Integer.valueOf(iA));
                    lVarA.Q(Integer.valueOf(iA), pVarB);
                }
                qVarA.invoke(q2.a(q2.b(lVar)), lVar, 0);
                lVar.e(2058660585);
                f fVar = f.f2502a;
                PaywallIconKt.m179PaywallIconFNF3uiM(paywallIconNameArr[i10], null, aVar2.a(), lVar, 384, 2);
                lVar.K();
                lVar.L();
                lVar.K();
                lVar.K();
                if (o.I()) {
                    o.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallIconName[] paywallIconNameArr) {
            super(1);
            this.$icons = paywallIconNameArr;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(b0 b0Var) {
            invoke2(b0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b0 b0Var) {
            ae.r.f(b0Var, "$this$LazyVerticalGrid");
            PaywallIconName[] paywallIconNameArr = this.$icons;
            b0.a(b0Var, paywallIconNameArr.length, null, null, null, b1.c.c(-320278688, true, new C02101(paywallIconNameArr)), 14, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt$PaywallIconPreview$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<t0.l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            PaywallIconKt.PaywallIconPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: PaywallIcon-FNF3uiM, reason: not valid java name */
    public static final void m179PaywallIconFNF3uiM(PaywallIconName paywallIconName, e eVar, long j10, t0.l lVar, int i10, int i11) {
        int i12;
        ae.r.f(paywallIconName, "icon");
        t0.l lVarP = lVar.p(269660957);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.N(paywallIconName) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.N(eVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= lVarP.i(j10) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = e.f2662a;
            }
            if (o.I()) {
                o.U(269660957, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIcon (PaywallIcon.kt:19)");
            }
            v.a(f2.c.d(paywallIconName.drawable$revenuecatui_defaultsRelease(), lVarP, 0), null, androidx.compose.foundation.layout.p.e(androidx.compose.foundation.layout.a.b(e.f2662a, 1.0f, false, 2, null), 0.0f, 1, null).h(eVar), j10, lVarP, ((i12 << 3) & 7168) | 56, 0);
            if (o.I()) {
                o.T();
            }
        }
        e eVar2 = eVar;
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new PaywallIconKt$PaywallIcon$1(paywallIconName, eVar2, j10, i10, i11));
    }

    public static final void PaywallIconPreview(t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(1356053803);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1356053803, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconPreview (PaywallIcon.kt:150)");
            }
            i0.h.a(new a.C0294a(h.m(40), null), null, null, null, false, null, null, null, false, new AnonymousClass1(PaywallIconName.values()), lVarP, 0, 510);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass2(i10));
    }
}
