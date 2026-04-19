package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.Iterator;
import java.util.List;
import md.i0;
import nd.c0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class PostTransactionWithProductDetailsHelper$postTransactions$1$1 extends s implements l<List<? extends StoreProduct>, i0> {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ p<StoreTransaction, PurchasesError, i0> $transactionPostError;
    final /* synthetic */ p<StoreTransaction, CustomerInfo, i0> $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PostTransactionWithProductDetailsHelper$postTransactions$1$1(StoreTransaction storeTransaction, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, p<? super StoreTransaction, ? super PurchasesError, i0> pVar2) {
        super(1);
        this.$transaction = storeTransaction;
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$allowSharingPlayStoreAccount = z10;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$transactionPostSuccess = pVar;
        this.$transactionPostError = pVar2;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
        invoke2(list);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends StoreProduct> list) {
        r.f(list, "storeProducts");
        Object obj = null;
        if (this.$transaction.getType() != ProductType.SUBS || this.$transaction.getMarketplace() != null) {
            StoreTransaction storeTransaction = this.$transaction;
            for (Object obj2 : list) {
                if (r.b(((StoreProduct) obj2).getId(), c0.a0(storeTransaction.getProductIds()))) {
                    obj = obj2;
                    break;
                }
            }
        } else {
            StoreTransaction storeTransaction2 = this.$transaction;
            for (Object obj22 : list) {
                SubscriptionOptions subscriptionOptions = ((StoreProduct) obj22).getSubscriptionOptions();
                boolean z10 = false;
                if (subscriptionOptions != null && !subscriptionOptions.isEmpty()) {
                    Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (r.b(it.next().getId(), storeTransaction2.getSubscriptionOptionId())) {
                                z10 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z10) {
                    obj = obj22;
                    break;
                }
            }
        }
        StoreProduct storeProduct = (StoreProduct) obj;
        LogUtilsKt.debugLog("Store product found for transaction: " + storeProduct);
        this.this$0.postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, storeProduct, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
