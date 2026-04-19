package com.revenuecat.purchases.hybridcommon.ui;

import ae.r;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.hybridcommon.mappers.StoreTransactionMapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PaywallListenerWrapper implements PaywallListener {
    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseCancelled() {
        PaywallListener.DefaultImpls.onPurchaseCancelled(this);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
        r.f(customerInfo, "customerInfo");
        r.f(storeTransaction, "storeTransaction");
        onPurchaseCompleted(CustomerInfoMapperKt.map(customerInfo), StoreTransactionMapperKt.map(storeTransaction));
    }

    public abstract void onPurchaseCompleted(Map<String, ? extends Object> map, Map<String, ? extends Object> map2);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseError(PurchasesError purchasesError) {
        r.f(purchasesError, "error");
        onPurchaseError((Map<String, ? extends Object>) PurchasesErrorKt.map$default(purchasesError, null, 1, null).getInfo());
    }

    public abstract void onPurchaseError(Map<String, ? extends Object> map);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseStarted(Package r22) {
        r.f(r22, "rcPackage");
        onPurchaseStarted(OfferingsMapperKt.map(r22));
    }

    public abstract void onPurchaseStarted(Map<String, ? extends Object> map);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onRestoreCompleted(CustomerInfo customerInfo) {
        r.f(customerInfo, "customerInfo");
        onRestoreCompleted(CustomerInfoMapperKt.map(customerInfo));
    }

    public abstract void onRestoreCompleted(Map<String, ? extends Object> map);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onRestoreError(PurchasesError purchasesError) {
        r.f(purchasesError, "error");
        onRestoreError((Map<String, ? extends Object>) PurchasesErrorKt.map$default(purchasesError, null, 1, null).getInfo());
    }

    public abstract void onRestoreError(Map<String, ? extends Object> map);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onRestoreStarted() {
        PaywallListener.DefaultImpls.onRestoreStarted(this);
    }
}
