package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.models.StoreTransaction;
import md.i0;
import md.t;
import qd.d;
import zd.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesExtensionsCommonKt$awaitPurchase$2$1 extends s implements p<StoreTransaction, CustomerInfo, i0> {
    final /* synthetic */ d<PurchaseResult> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutinesExtensionsCommonKt$awaitPurchase$2$1(d<? super PurchaseResult> dVar) {
        super(2);
        this.$continuation = dVar;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        invoke2(storeTransaction, customerInfo);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        r.f(storeTransaction, "storeTransaction");
        r.f(customerInfo, "customerInfo");
        d<PurchaseResult> dVar = this.$continuation;
        t.a aVar = t.f15576b;
        dVar.resumeWith(t.b(new PurchaseResult(storeTransaction, customerInfo)));
    }
}
