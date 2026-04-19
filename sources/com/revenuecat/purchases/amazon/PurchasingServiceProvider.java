package com.revenuecat.purchases.amazon;

import android.content.Context;
import android.os.Parcelable;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface PurchasingServiceProvider extends Parcelable {
    RequestId getProductData(Set<String> set);

    RequestId getPurchaseUpdates(boolean z10);

    RequestId getUserData();

    void notifyFulfillment(String str, FulfillmentResult fulfillmentResult);

    RequestId purchase(String str);

    void registerListener(Context context, PurchasingListener purchasingListener);
}
