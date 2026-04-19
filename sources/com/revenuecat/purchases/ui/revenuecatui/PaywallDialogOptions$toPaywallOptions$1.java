package com.revenuecat.purchases.ui.revenuecatui;

import ae.s;
import md.i0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class PaywallDialogOptions$toPaywallOptions$1 extends s implements a<i0> {
    final /* synthetic */ a<i0> $dismissRequest;
    final /* synthetic */ PaywallDialogOptions this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallDialogOptions$toPaywallOptions$1(a<i0> aVar, PaywallDialogOptions paywallDialogOptions) {
        super(0);
        this.$dismissRequest = aVar;
        this.this$0 = paywallDialogOptions;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$dismissRequest.invoke();
        a<i0> dismissRequest = this.this$0.getDismissRequest();
        if (dismissRequest != null) {
            dismissRequest.invoke();
        }
    }
}
