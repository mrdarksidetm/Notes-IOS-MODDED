package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import android.app.Activity;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import md.i0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class PurchaseButtonKt$PurchaseButton$3$2 extends s implements a<i0> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseButtonKt$PurchaseButton$3$2(PaywallViewModel paywallViewModel, Activity activity) {
        super(0);
        this.$viewModel = paywallViewModel;
        this.$activity = activity;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.purchaseSelectedPackage(this.$activity);
    }
}
