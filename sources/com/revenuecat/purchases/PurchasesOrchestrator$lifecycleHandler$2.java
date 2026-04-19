package com.revenuecat.purchases;

import ae.s;

/* JADX INFO: loaded from: classes2.dex */
final class PurchasesOrchestrator$lifecycleHandler$2 extends s implements zd.a<AppLifecycleHandler> {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$lifecycleHandler$2(PurchasesOrchestrator purchasesOrchestrator) {
        super(0);
        this.this$0 = purchasesOrchestrator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zd.a
    public final AppLifecycleHandler invoke() {
        return new AppLifecycleHandler(this.this$0);
    }
}
