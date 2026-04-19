package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import md.i0;
import t0.e2;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class PurchaseButtonKt$PurchaseButton$2 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseButtonKt$PurchaseButton$2(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, e eVar, float f10, TemplateConfiguration.Colors colors, int i10, int i11) {
        super(2);
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
        this.$childModifier = eVar;
        this.$horizontalPadding = f10;
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
        PurchaseButtonKt.m185PurchaseButtonhGBTI10(this.$state, this.$viewModel, this.$childModifier, this.$horizontalPadding, this.$colors, lVar, e2.a(this.$$changed | 1), this.$$default);
    }
}
