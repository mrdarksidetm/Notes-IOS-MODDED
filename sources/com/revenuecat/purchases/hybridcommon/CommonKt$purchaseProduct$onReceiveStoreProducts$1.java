package com.revenuecat.purchases.hybridcommon;

import ae.s;
import android.app.Activity;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import java.util.Map;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class CommonKt$purchaseProduct$onReceiveStoreProducts$1 extends s implements l<List<? extends StoreProduct>, i0> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $googleBasePlanId;
    final /* synthetic */ Boolean $googleIsPersonalizedPrice;
    final /* synthetic */ String $googleOldProductId;
    final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
    final /* synthetic */ OnResult $onResult;
    final /* synthetic */ Map<String, Object> $presentedOfferingContext;
    final /* synthetic */ String $productIdentifier;
    final /* synthetic */ ProductType $productType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonKt$purchaseProduct$onReceiveStoreProducts$1(Activity activity, Map<String, ? extends Object> map, String str, GoogleReplacementMode googleReplacementMode, Boolean bool, OnResult onResult, String str2, ProductType productType, String str3) {
        super(1);
        this.$activity = activity;
        this.$presentedOfferingContext = map;
        this.$googleOldProductId = str;
        this.$googleReplacementMode = googleReplacementMode;
        this.$googleIsPersonalizedPrice = bool;
        this.$onResult = onResult;
        this.$productIdentifier = str2;
        this.$productType = productType;
        this.$googleBasePlanId = str3;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
        invoke2(list);
        return i0.f15558a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0064 A[EDGE_INSN: B:50:0x0064->B:29:0x0064 BREAK  A[LOOP:0: B:3:0x000f->B:53:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[LOOP:0: B:3:0x000f->B:53:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(java.util.List<? extends com.revenuecat.purchases.models.StoreProduct> r11) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$onReceiveStoreProducts$1.invoke2(java.util.List):void");
    }
}
