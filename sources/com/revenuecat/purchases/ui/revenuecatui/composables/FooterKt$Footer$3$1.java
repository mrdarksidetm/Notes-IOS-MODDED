package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import md.i0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class FooterKt$Footer$3$1 extends s implements a<i0> {
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FooterKt$Footer$3$1(PaywallViewModel paywallViewModel) {
        super(0);
        this.$viewModel = paywallViewModel;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.restorePurchases();
    }
}
