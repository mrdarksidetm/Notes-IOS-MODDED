package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.r;
import ae.s;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import md.i0;
import q0.y;
import t0.l;
import t0.o;
import u2.i;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class Template4Kt$Template4MainContent$1$1$2 extends s implements q<TemplateConfiguration.PackageInfo, l, Integer, i0> {
    final /* synthetic */ TemplateConfiguration.Colors $colors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template4Kt$Template4MainContent$1$1$2(TemplateConfiguration.Colors colors) {
        super(3);
        this.$colors = colors;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(TemplateConfiguration.PackageInfo packageInfo, l lVar, Integer num) {
        invoke(packageInfo, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(TemplateConfiguration.PackageInfo packageInfo, l lVar, int i10) {
        r.f(packageInfo, "it");
        if (o.I()) {
            o.U(-1316875667, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4MainContent.<anonymous>.<anonymous>.<anonymous> (Template4.kt:188)");
        }
        IntroEligibilityStateViewKt.m154IntroEligibilityStateViewQETHhvg(packageInfo.getLocalization().getOfferDetails(), packageInfo.getLocalization().getOfferDetailsWithIntroOffer(), packageInfo.getLocalization().getOfferDetailsWithMultipleIntroOffers(), PackageExtensionsKt.getIntroEligibility(packageInfo), this.$colors.m227getText10d7_KjU(), y.f18928a.c(lVar, y.f18929b | 0).c(), null, i.h(i.f21560b.a()), false, p.g(e.f2662a, 0.0f, 1, null), lVar, 805306368, 320);
        if (o.I()) {
            o.T();
        }
    }
}
