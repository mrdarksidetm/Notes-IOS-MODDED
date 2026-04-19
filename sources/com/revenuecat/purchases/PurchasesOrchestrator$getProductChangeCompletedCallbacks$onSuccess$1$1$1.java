package com.revenuecat.purchases;

import ae.s;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import md.i0;

/* JADX INFO: loaded from: classes2.dex */
final class PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1$1$1 extends s implements zd.a<i0> {
    final /* synthetic */ CustomerInfo $info;
    final /* synthetic */ ProductChangeCallback $productChangeCallback;
    final /* synthetic */ StoreTransaction $storeTransaction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1$1$1(ProductChangeCallback productChangeCallback, StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        super(0);
        this.$productChangeCallback = productChangeCallback;
        this.$storeTransaction = storeTransaction;
        this.$info = customerInfo;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$productChangeCallback.onCompleted(this.$storeTransaction, this.$info);
    }
}
