package com.revenuecat.purchases.ui.revenuecatui.views;

import ae.s;
import md.i0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class PaywallFooterView$paywallOptionsState$1 extends s implements a<i0> {
    final /* synthetic */ PaywallFooterView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallFooterView$paywallOptionsState$1(PaywallFooterView paywallFooterView) {
        super(0);
        this.this$0 = paywallFooterView;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        a aVar = this.this$0.dismissHandler;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
