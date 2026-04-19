package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import g2.v;
import g2.x;
import i2.d;
import md.i0;
import t0.k1;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PurchaseButtonKt$PurchaseButton$3$1$1 extends s implements l<x, i0> {
    final /* synthetic */ k1<TemplateConfiguration.PackageInfo> $selectedPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseButtonKt$PurchaseButton$3$1$1(k1<TemplateConfiguration.PackageInfo> k1Var) {
        super(1);
        this.$selectedPackage = k1Var;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(x xVar) {
        invoke2(xVar);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(x xVar) {
        r.f(xVar, "$this$semantics");
        TemplateConfiguration.PackageInfo value = this.$selectedPackage.getValue();
        v.C(xVar, new d(IntroEligibilityStateViewKt.introEligibilityText(PackageExtensionsKt.getIntroEligibility(value), value.getLocalization().getCallToActionWithIntroOffer(), value.getLocalization().getCallToActionWithMultipleIntroOffers(), value.getLocalization().getCallToAction()), null, null, 6, null));
    }
}
