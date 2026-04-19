package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import i1.a;
import md.i0;
import q0.y;
import t0.l;
import t0.o;
import t0.p3;
import u2.i;
import w2.h;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class PurchaseButtonKt$PurchaseButton$3$3$2$1 extends s implements q<TemplateConfiguration.PackageInfo, l, Integer, i0> {
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ p3<Float> $labelOpacity$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseButtonKt$PurchaseButton$3$3$2$1(TemplateConfiguration.Colors colors, p3<Float> p3Var) {
        super(3);
        this.$colors = colors;
        this.$labelOpacity$delegate = p3Var;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(TemplateConfiguration.PackageInfo packageInfo, l lVar, Integer num) {
        invoke(packageInfo, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(TemplateConfiguration.PackageInfo packageInfo, l lVar, int i10) {
        r.f(packageInfo, "it");
        if (o.I()) {
            o.U(98081200, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButton.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PurchaseButton.kt:139)");
        }
        ProcessedLocalizedConfiguration localization = packageInfo.getLocalization();
        IntroEligibilityStateViewKt.m154IntroEligibilityStateViewQETHhvg(localization.getCallToAction(), localization.getCallToActionWithIntroOffer(), localization.getCallToActionWithMultipleIntroOffers(), PackageExtensionsKt.getIntroEligibility(packageInfo), this.$colors.m224getCallToActionForeground0d7_KjU(), y.f18928a.c(lVar, y.f18929b | 0).o(), n2.i0.f15808b.h(), i.h(i.f21560b.a()), false, a.a(m.k(e.f2662a, 0.0f, h.m(h.m(UIConstant.INSTANCE.m83getDefaultVerticalSpacingD9Ej5fM() * 2) / 3), 1, null), PurchaseButtonKt.PurchaseButton_WH_ejsw$lambda$5$lambda$0(this.$labelOpacity$delegate)), lVar, 102236160, 0);
        if (o.I()) {
            o.T();
        }
    }
}
