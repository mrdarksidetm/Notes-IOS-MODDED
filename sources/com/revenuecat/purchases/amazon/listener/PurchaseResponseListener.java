package com.revenuecat.purchases.amazon.listener;

import ae.r;
import android.app.Activity;
import android.os.Handler;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreProduct;
import md.i0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public interface PurchaseResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        public static void onProductDataResponse(PurchaseResponseListener purchaseResponseListener, ProductDataResponse productDataResponse) {
            r.f(productDataResponse, "response");
        }

        public static void onPurchaseUpdatesResponse(PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponse purchaseUpdatesResponse) {
            r.f(purchaseUpdatesResponse, "response");
        }

        public static void onUserDataResponse(PurchaseResponseListener purchaseResponseListener, UserDataResponse userDataResponse) {
            r.f(userDataResponse, "response");
        }
    }

    void onProductDataResponse(ProductDataResponse productDataResponse);

    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse);

    void onUserDataResponse(UserDataResponse userDataResponse);

    void purchase(Handler handler, Activity activity, String str, StoreProduct storeProduct, p<? super Receipt, ? super UserData, i0> pVar, l<? super PurchasesError, i0> lVar);
}
