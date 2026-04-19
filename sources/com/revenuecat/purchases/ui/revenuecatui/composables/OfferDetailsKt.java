package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.g;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import f1.b;
import md.i0;
import q0.y;
import t0.e2;
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
public final class OfferDetailsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt$OfferDetails$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.Colors colors, int i10, int i11) {
            super(2);
            this.$state = legacy;
            this.$colors = colors;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            OfferDetailsKt.OfferDetails(this.$state, this.$colors, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt$OfferDetails$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ long $color;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaywallState.Loaded.Legacy legacy, long j10, int i10) {
            super(2);
            this.$state = legacy;
            this.$color = j10;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            OfferDetailsKt.m177OfferDetailsRPmYEkk(this.$state, this.$color, lVar, e2.a(this.$$changed | 1));
        }
    }

    public static final void OfferDetails(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.Colors colors, l lVar, int i10, int i11) {
        r.f(legacy, "state");
        l lVarP = lVar.p(-2001121712);
        if ((i11 & 2) != 0) {
            colors = legacy.getTemplateConfiguration().getCurrentColors(lVarP, 8);
        }
        if (o.I()) {
            o.U(-2001121712, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetails (OfferDetails.kt:22)");
        }
        m177OfferDetailsRPmYEkk(legacy, colors.m227getText10d7_KjU(), lVarP, 8);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(legacy, colors, i10, i11));
    }

    /* JADX INFO: renamed from: OfferDetails-RPmYEkk, reason: not valid java name */
    public static final void m177OfferDetailsRPmYEkk(PaywallState.Loaded.Legacy legacy, long j10, l lVar, int i10) {
        r.f(legacy, "state");
        l lVarP = lVar.p(683762235);
        if (o.I()) {
            o.U(683762235, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetails (OfferDetails.kt:34)");
        }
        e.a aVar = e.f2662a;
        e eVarM = m.m(aVar, 0.0f, 0.0f, 0.0f, UIConstant.INSTANCE.m83getDefaultVerticalSpacingD9Ej5fM(), 7, null);
        lVarP.e(733328855);
        e0 e0VarG = d.g(b.f11020a.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar2 = g.J;
        a<g> aVarA = aVar2.a();
        q<q2<g>, l, Integer, i0> qVarA = u.a(eVarM);
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
        u3.b(lVarA, e0VarG, aVar2.e());
        u3.b(lVarA, wVarB, aVar2.g());
        p<g, Integer, i0> pVarB = aVar2.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        IntroEligibilityStateViewKt.m154IntroEligibilityStateViewQETHhvg(PaywallStateKt.getSelectedLocalization(legacy).getOfferDetails(), PaywallStateKt.getSelectedLocalization(legacy).getOfferDetailsWithIntroOffer(), PaywallStateKt.getSelectedLocalization(legacy).getOfferDetailsWithMultipleIntroOffers(), PackageExtensionsKt.getIntroEligibility(legacy.getSelectedPackage().getValue()), j10, y.f18928a.c(lVarP, 0 | y.f18929b).c(), n2.i0.f15808b.g(), u2.i.h(u2.i.f21560b.a()), false, androidx.compose.foundation.layout.p.g(aVar, 0.0f, 1, null), lVarP, 806879232 | (57344 & (i10 << 9)), 256);
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
        o2VarV.a(new AnonymousClass3(legacy, j10, i10));
    }
}
