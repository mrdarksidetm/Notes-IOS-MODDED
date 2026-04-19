package com.revenuecat.purchases.google;

import ae.r;
import ae.s;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class BillingWrapper$onPurchasesUpdated$1$1 extends s implements l<StoreTransaction, i0> {
    final /* synthetic */ List<Purchase> $notNullPurchasesList;
    final /* synthetic */ List<StoreTransaction> $storeTransactions;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BillingWrapper$onPurchasesUpdated$1$1(List<StoreTransaction> list, List<? extends Purchase> list2, BillingWrapper billingWrapper) {
        super(1);
        this.$storeTransactions = list;
        this.$notNullPurchasesList = list2;
        this.this$0 = billingWrapper;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction) {
        invoke2(storeTransaction);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StoreTransaction storeTransaction) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
        r.f(storeTransaction, "storeTxn");
        this.$storeTransactions.add(storeTransaction);
        if (this.$storeTransactions.size() != this.$notNullPurchasesList.size() || (purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener()) == null) {
            return;
        }
        purchasesUpdatedListener.onPurchasesUpdated(this.$storeTransactions);
    }
}
