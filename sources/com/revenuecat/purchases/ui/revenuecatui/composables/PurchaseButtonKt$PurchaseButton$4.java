package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import md.i0;
import t0.e2;
import t0.k1;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class PurchaseButtonKt$PurchaseButton$4 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ TemplateConfiguration.PackageConfiguration $packages;
    final /* synthetic */ k1<TemplateConfiguration.PackageInfo> $selectedPackage;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseButtonKt$PurchaseButton$4(TemplateConfiguration.Colors colors, TemplateConfiguration.PackageConfiguration packageConfiguration, k1<TemplateConfiguration.PackageInfo> k1Var, PaywallViewModel paywallViewModel, float f10, e eVar, int i10, int i11) {
        super(2);
        this.$colors = colors;
        this.$packages = packageConfiguration;
        this.$selectedPackage = k1Var;
        this.$viewModel = paywallViewModel;
        this.$horizontalPadding = f10;
        this.$childModifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        PurchaseButtonKt.m184PurchaseButtonWHejsw(this.$colors, this.$packages, this.$selectedPackage, this.$viewModel, this.$horizontalPadding, this.$childModifier, lVar, e2.a(this.$$changed | 1), this.$$default);
    }
}
