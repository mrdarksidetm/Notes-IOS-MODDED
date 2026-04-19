package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.Arrays;
import java.util.Map;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1 extends s implements l<Map<String, ? extends StoreTransaction>, i0> {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ l<PurchasesError, i0> $onError;
    final /* synthetic */ l<CustomerInfo, i0> $onSuccess;
    final /* synthetic */ PostPendingTransactionsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z10, String str, l<? super PurchasesError, i0> lVar, l<? super CustomerInfo, i0> lVar2) {
        super(1);
        this.this$0 = postPendingTransactionsHelper;
        this.$allowSharingPlayStoreAccount = z10;
        this.$appUserID = str;
        this.$onError = lVar;
        this.$onSuccess = lVar2;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends StoreTransaction> map) {
        invoke2((Map<String, StoreTransaction>) map);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, StoreTransaction> map) {
        r.f(map, "purchasesByHashedToken");
        for (Map.Entry<String, StoreTransaction> entry : map.entrySet()) {
            String key = entry.getKey();
            StoreTransaction value = entry.getValue();
            LogIntent logIntent = LogIntent.DEBUG;
            String str = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_HASH, Arrays.copyOf(new Object[]{value.getType(), key}, 2));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
        this.this$0.deviceCache.cleanPreviouslySentTokens(map.keySet());
        this.this$0.postTransactionsWithCompletion(this.this$0.deviceCache.getActivePurchasesNotInCache(map), this.$allowSharingPlayStoreAccount, this.$appUserID, this.$onError, this.$onSuccess);
    }
}
