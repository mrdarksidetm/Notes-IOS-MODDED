package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import md.i0;
import t0.k1;
import t0.l;
import t0.o;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class PurchaseButtonKt$PurchaseButton$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseButtonKt$PurchaseButton$1(TemplateConfiguration.Colors colors, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, float f10, e eVar, int i10) {
        super(2);
        this.$colors = colors;
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
        this.$horizontalPadding = f10;
        this.$childModifier = eVar;
        this.$$dirty = i10;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.s()) {
            lVar.x();
            return;
        }
        if (o.I()) {
            o.U(22366153, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButton.<anonymous> (PurchaseButton.kt:55)");
        }
        TemplateConfiguration.Colors colors = this.$colors;
        TemplateConfiguration.PackageConfiguration packages = this.$state.getTemplateConfiguration().getPackages();
        k1<TemplateConfiguration.PackageInfo> selectedPackage = this.$state.getSelectedPackage();
        PaywallViewModel paywallViewModel = this.$viewModel;
        float f10 = this.$horizontalPadding;
        e eVar = this.$childModifier;
        int i11 = this.$$dirty;
        PurchaseButtonKt.m184PurchaseButtonWHejsw(colors, packages, selectedPackage, paywallViewModel, f10, eVar, lVar, ((i11 >> 12) & 14) | ((i11 << 6) & 7168) | (57344 & (i11 << 3)) | ((i11 << 9) & 458752), 0);
        if (o.I()) {
            o.T();
        }
    }
}
