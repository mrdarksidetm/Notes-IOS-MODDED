package com.revenuecat.purchases.ui.revenuecatui;

import ae.r;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;

/* JADX INFO: loaded from: classes2.dex */
public interface PaywallListener {

    public static final class DefaultImpls {
        public static void onPurchaseCancelled(PaywallListener paywallListener) {
        }

        public static void onPurchaseCompleted(PaywallListener paywallListener, CustomerInfo customerInfo, StoreTransaction storeTransaction) {
            r.f(customerInfo, "customerInfo");
            r.f(storeTransaction, "storeTransaction");
        }

        public static void onPurchaseError(PaywallListener paywallListener, PurchasesError purchasesError) {
            r.f(purchasesError, "error");
        }

        public static void onPurchaseStarted(PaywallListener paywallListener, Package r12) {
            r.f(r12, "rcPackage");
        }

        public static void onRestoreCompleted(PaywallListener paywallListener, CustomerInfo customerInfo) {
            r.f(customerInfo, "customerInfo");
        }

        public static void onRestoreError(PaywallListener paywallListener, PurchasesError purchasesError) {
            r.f(purchasesError, "error");
        }

        public static void onRestoreStarted(PaywallListener paywallListener) {
        }
    }

    void onPurchaseCancelled();

    void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction);

    void onPurchaseError(PurchasesError purchasesError);

    void onPurchaseStarted(Package r12);

    void onRestoreCompleted(CustomerInfo customerInfo);

    void onRestoreError(PurchasesError purchasesError);

    void onRestoreStarted();
}
