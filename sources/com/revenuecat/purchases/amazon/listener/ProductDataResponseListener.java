package com.revenuecat.purchases.amazon.listener;

import ae.r;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import java.util.Set;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public interface ProductDataResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        public static void onPurchaseResponse(ProductDataResponseListener productDataResponseListener, PurchaseResponse purchaseResponse) {
            r.f(purchaseResponse, "response");
        }

        public static void onPurchaseUpdatesResponse(ProductDataResponseListener productDataResponseListener, PurchaseUpdatesResponse purchaseUpdatesResponse) {
            r.f(purchaseUpdatesResponse, "response");
        }

        public static void onUserDataResponse(ProductDataResponseListener productDataResponseListener, UserDataResponse userDataResponse) {
            r.f(userDataResponse, "response");
        }
    }

    void getProductData(Set<String> set, String str, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2);

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    void onPurchaseResponse(PurchaseResponse purchaseResponse);

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse);

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    void onUserDataResponse(UserDataResponse userDataResponse);
}
