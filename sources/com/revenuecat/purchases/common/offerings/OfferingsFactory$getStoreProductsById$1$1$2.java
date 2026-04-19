package com.revenuecat.purchases.common.offerings;

import ae.r;
import ae.s;
import com.revenuecat.purchases.PurchasesError;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class OfferingsFactory$getStoreProductsById$1$1$2 extends s implements l<PurchasesError, i0> {
    final /* synthetic */ l<PurchasesError, i0> $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OfferingsFactory$getStoreProductsById$1$1$2(l<? super PurchasesError, i0> lVar) {
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
        r.f(purchasesError, "it");
        this.$onError.invoke(purchasesError);
    }
}
