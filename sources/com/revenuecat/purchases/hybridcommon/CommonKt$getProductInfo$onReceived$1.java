package com.revenuecat.purchases.hybridcommon;

import ae.r;
import ae.s;
import com.revenuecat.purchases.hybridcommon.mappers.StoreProductMapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class CommonKt$getProductInfo$onReceived$1 extends s implements l<List<? extends StoreProduct>, i0> {
    final /* synthetic */ OnResultList $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonKt$getProductInfo$onReceived$1(OnResultList onResultList) {
        super(1);
        this.$onResult = onResultList;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
        invoke2(list);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends StoreProduct> list) {
        r.f(list, "it");
        this.$onResult.onReceived(StoreProductMapperKt.map(list));
    }
}
