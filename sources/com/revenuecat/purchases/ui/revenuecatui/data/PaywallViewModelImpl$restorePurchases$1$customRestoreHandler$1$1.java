package com.revenuecat.purchases.ui.revenuecatui.data;

import ae.o;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ui.revenuecatui.PurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult;
import qd.d;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
/* synthetic */ class PaywallViewModelImpl$restorePurchases$1$customRestoreHandler$1$1 extends o implements p<CustomerInfo, d<? super PurchaseLogicResult>, Object> {
    PaywallViewModelImpl$restorePurchases$1$customRestoreHandler$1$1(Object obj) {
        super(2, obj, PurchaseLogic.class, "performRestore", "performRestore(Lcom/revenuecat/purchases/CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // zd.p
    public final Object invoke(CustomerInfo customerInfo, d<? super PurchaseLogicResult> dVar) {
        return ((PurchaseLogic) this.receiver).performRestore(customerInfo, dVar);
    }
}
