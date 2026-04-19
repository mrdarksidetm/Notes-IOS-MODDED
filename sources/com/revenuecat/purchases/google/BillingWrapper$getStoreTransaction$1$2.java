package com.revenuecat.purchases.google;

import ae.r;
import ae.s;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.StoreTransaction;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class BillingWrapper$getStoreTransaction$1$2 extends s implements l<ProductType, i0> {
    final /* synthetic */ l<StoreTransaction, i0> $completion;
    final /* synthetic */ Purchase $purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BillingWrapper$getStoreTransaction$1$2(l<? super StoreTransaction, i0> lVar, Purchase purchase) {
        super(1);
        this.$completion = lVar;
        this.$purchase = purchase;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(ProductType productType) {
        invoke2(productType);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductType productType) {
        r.f(productType, "type");
        this.$completion.invoke(StoreTransactionConversionsKt.toStoreTransaction$default(this.$purchase, productType, null, null, null, 14, null));
    }
}
