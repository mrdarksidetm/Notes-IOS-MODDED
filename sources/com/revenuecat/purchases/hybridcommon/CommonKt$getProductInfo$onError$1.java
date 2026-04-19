package com.revenuecat.purchases.hybridcommon;

import ae.r;
import ae.s;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class CommonKt$getProductInfo$onError$1 extends s implements l<PurchasesError, i0> {
    final /* synthetic */ OnResultList $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonKt$getProductInfo$onError$1(OnResultList onResultList) {
        super(1);
        this.$onResult = onResultList;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError purchasesError) {
        r.f(purchasesError, "it");
        this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
    }
}
