package com.revenuecat.purchases.amazon.listener;

import ae.r;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import java.util.List;
import md.i0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public interface PurchaseUpdatesResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        public static void onProductDataResponse(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, ProductDataResponse productDataResponse) {
            r.f(productDataResponse, "response");
        }

        public static void onPurchaseResponse(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, PurchaseResponse purchaseResponse) {
            r.f(purchaseResponse, "response");
        }

        public static void onUserDataResponse(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponse userDataResponse) {
            r.f(userDataResponse, "response");
        }
    }

    void onProductDataResponse(ProductDataResponse productDataResponse);

    void onPurchaseResponse(PurchaseResponse purchaseResponse);

    void onUserDataResponse(UserDataResponse userDataResponse);

    void queryPurchases(p<? super List<Receipt>, ? super UserData, i0> pVar, l<? super PurchasesError, i0> lVar);
}
