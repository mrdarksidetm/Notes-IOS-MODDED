package com.revenuecat.purchases.amazon.listener;

import ae.r;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PurchasesError;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public interface UserDataResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        public static void onProductDataResponse(UserDataResponseListener userDataResponseListener, ProductDataResponse productDataResponse) {
            r.f(productDataResponse, "response");
        }

        public static void onPurchaseResponse(UserDataResponseListener userDataResponseListener, PurchaseResponse purchaseResponse) {
            r.f(purchaseResponse, "response");
        }

        public static void onPurchaseUpdatesResponse(UserDataResponseListener userDataResponseListener, PurchaseUpdatesResponse purchaseUpdatesResponse) {
            r.f(purchaseUpdatesResponse, "response");
        }
    }

    void getUserData(l<? super UserData, i0> lVar, l<? super PurchasesError, i0> lVar2);

    void onProductDataResponse(ProductDataResponse productDataResponse);

    void onPurchaseResponse(PurchaseResponse purchaseResponse);

    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse);
}
