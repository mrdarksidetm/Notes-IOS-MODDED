package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import md.i0;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1 extends s implements p<StoreTransaction, CustomerInfo, i0> {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(2);
        this.this$0 = purchasesOrchestrator;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        invoke2(storeTransaction, customerInfo);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        r.f(storeTransaction, "storeTransaction");
        r.f(customerInfo, "info");
        PurchaseCallback purchaseCallback = this.this$0.getPurchaseCallback(storeTransaction.getProductIds().get(0));
        if (purchaseCallback != null) {
            this.this$0.dispatch(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1$1(purchaseCallback, storeTransaction, customerInfo));
        }
    }
}
