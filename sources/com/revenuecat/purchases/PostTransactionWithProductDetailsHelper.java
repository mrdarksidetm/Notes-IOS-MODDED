package com.revenuecat.purchases;

import ae.r;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import md.i0;
import nd.c0;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class PostTransactionWithProductDetailsHelper {
    private final BillingAbstract billing;
    private final PostReceiptHelper postReceiptHelper;

    public PostTransactionWithProductDetailsHelper(BillingAbstract billingAbstract, PostReceiptHelper postReceiptHelper) {
        r.f(billingAbstract, "billing");
        r.f(postReceiptHelper, "postReceiptHelper");
        this.billing = billingAbstract;
        this.postReceiptHelper = postReceiptHelper;
    }

    public final void postTransactions(List<StoreTransaction> list, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, p<? super StoreTransaction, ? super PurchasesError, i0> pVar2) {
        r.f(list, "transactions");
        r.f(str, "appUserID");
        r.f(postReceiptInitiationSource, "initiationSource");
        for (StoreTransaction storeTransaction : list) {
            if (storeTransaction.getPurchaseState() != PurchaseState.PENDING) {
                this.billing.queryProductDetailsAsync(storeTransaction.getType(), c0.H0(storeTransaction.getProductIds()), new PostTransactionWithProductDetailsHelper$postTransactions$1$1(storeTransaction, this, z10, str, postReceiptInitiationSource, pVar, pVar2), new PostTransactionWithProductDetailsHelper$postTransactions$1$2(this, storeTransaction, z10, str, postReceiptInitiationSource, pVar, pVar2));
            } else if (pVar2 != null) {
                PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PaymentPendingError, null, 2, null);
                LogUtilsKt.errorLog(purchasesError);
                i0 i0Var = i0.f15558a;
                pVar2.invoke(storeTransaction, purchasesError);
            }
        }
    }
}
