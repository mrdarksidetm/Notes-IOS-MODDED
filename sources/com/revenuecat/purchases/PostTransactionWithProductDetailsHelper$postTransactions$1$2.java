package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.models.StoreTransaction;
import md.i0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class PostTransactionWithProductDetailsHelper$postTransactions$1$2 extends s implements l<PurchasesError, i0> {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ p<StoreTransaction, PurchasesError, i0> $transactionPostError;
    final /* synthetic */ p<StoreTransaction, CustomerInfo, i0> $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PostTransactionWithProductDetailsHelper$postTransactions$1$2(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, StoreTransaction storeTransaction, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, p<? super StoreTransaction, ? super PurchasesError, i0> pVar2) {
        super(1);
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$transaction = storeTransaction;
        this.$allowSharingPlayStoreAccount = z10;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$transactionPostSuccess = pVar;
        this.$transactionPostError = pVar2;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError purchasesError) {
        r.f(purchasesError, "it");
        this.this$0.postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, null, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
