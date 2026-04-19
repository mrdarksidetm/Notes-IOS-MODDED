package com.revenuecat.purchases.ui.revenuecatui;

import ae.s;
import md.i0;
import t0.k1;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class PaywallDialogKt$PaywallDialog$dismissRequest$1$1 extends s implements a<i0> {
    final /* synthetic */ k1<Boolean> $shouldDisplayDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallDialogKt$PaywallDialog$dismissRequest$1$1(k1<Boolean> k1Var) {
        super(0);
        this.$shouldDisplayDialog$delegate = k1Var;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PaywallDialogKt.PaywallDialog$lambda$2(this.$shouldDisplayDialog$delegate, false);
    }
}
