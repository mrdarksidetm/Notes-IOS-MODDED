package com.revenuecat.purchases.ui.revenuecatui.data;

import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.PurchaseResult;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
public interface PurchasesType {

    public static final class DefaultImpls {
        public static /* synthetic */ Object awaitCustomerInfo$default(PurchasesType purchasesType, CacheFetchPolicy cacheFetchPolicy, d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitCustomerInfo");
            }
            if ((i10 & 1) != 0) {
                cacheFetchPolicy = CacheFetchPolicy.Companion.m12default();
            }
            return purchasesType.awaitCustomerInfo(cacheFetchPolicy, dVar);
        }
    }

    Object awaitCustomerCenterConfigData(d<? super CustomerCenterConfigData> dVar);

    Object awaitCustomerInfo(CacheFetchPolicy cacheFetchPolicy, d<? super CustomerInfo> dVar);

    Object awaitOfferings(d<? super Offerings> dVar);

    Object awaitPurchase(PurchaseParams.Builder builder, d<? super PurchaseResult> dVar);

    Object awaitRestore(d<? super CustomerInfo> dVar);

    PurchasesAreCompletedBy getPurchasesAreCompletedBy();

    String getStorefrontCountryCode();

    void syncPurchases();

    void track(PaywallEvent paywallEvent);
}
