package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import md.i0;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class PurchasesOrchestrator$getProductChangeCompletedCallbacks$onError$1 extends s implements p<StoreTransaction, PurchasesError, i0> {
    final /* synthetic */ ProductChangeCallback $productChangeListener;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$getProductChangeCompletedCallbacks$onError$1(ProductChangeCallback productChangeCallback, PurchasesOrchestrator purchasesOrchestrator) {
        super(2);
        this.$productChangeListener = productChangeCallback;
        this.this$0 = purchasesOrchestrator;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
        invoke2(storeTransaction, purchasesError);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StoreTransaction storeTransaction, PurchasesError purchasesError) {
        r.f(storeTransaction, "<anonymous parameter 0>");
        r.f(purchasesError, "error");
        ProductChangeCallback productChangeCallback = this.$productChangeListener;
        if (productChangeCallback != null) {
            this.this$0.dispatch(productChangeCallback, purchasesError);
        }
    }
}
