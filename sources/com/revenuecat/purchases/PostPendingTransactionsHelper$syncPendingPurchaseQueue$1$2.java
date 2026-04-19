package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$2 extends s implements l<PurchasesError, i0> {
    final /* synthetic */ l<PurchasesError, i0> $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$2(l<? super PurchasesError, i0> lVar) {
        super(1);
        this.$onError = lVar;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError purchasesError) {
        r.f(purchasesError, "error");
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, purchasesError.toString());
        l<PurchasesError, i0> lVar = this.$onError;
        if (lVar != null) {
            lVar.invoke(purchasesError);
        }
    }
}
