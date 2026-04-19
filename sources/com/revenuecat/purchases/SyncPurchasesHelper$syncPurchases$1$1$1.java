package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.SyncPurchasesHelper;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.List;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class SyncPurchasesHelper$syncPurchases$1$1$1 extends s implements l<CustomerInfo, i0> {
    final /* synthetic */ boolean $appInBackground;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ List<PurchasesError> $errors;
    final /* synthetic */ boolean $isRestore;
    final /* synthetic */ StoreTransaction $lastPurchase;
    final /* synthetic */ l<PurchasesError, i0> $onError;
    final /* synthetic */ l<CustomerInfo, i0> $onSuccess;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ SyncPurchasesHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SyncPurchasesHelper$syncPurchases$1$1$1(StoreTransaction storeTransaction, StoreTransaction storeTransaction2, List<PurchasesError> list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z10, boolean z11, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        super(1);
        this.$purchase = storeTransaction;
        this.$lastPurchase = storeTransaction2;
        this.$errors = list;
        this.this$0 = syncPurchasesHelper;
        this.$appUserID = str;
        this.$appInBackground = z10;
        this.$isRestore = z11;
        this.$onSuccess = lVar;
        this.$onError = lVar2;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
        invoke2(customerInfo);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CustomerInfo customerInfo) {
        r.f(customerInfo, "it");
        LogIntent logIntent = LogIntent.PURCHASE;
        String str = String.format(PurchaseStrings.PURCHASE_SYNCED, Arrays.copyOf(new Object[]{this.$purchase}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        SyncPurchasesHelper.C05431.invoke$handleLastPurchase(this.$errors, this.this$0, this.$appUserID, this.$appInBackground, this.$isRestore, this.$onSuccess, this.$onError, this.$purchase, this.$lastPurchase);
    }
}
