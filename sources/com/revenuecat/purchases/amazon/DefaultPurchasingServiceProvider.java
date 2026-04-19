package com.revenuecat.purchases.amazon;

import ae.r;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultPurchasingServiceProvider implements PurchasingServiceProvider {
    public static final Parcelable.Creator<DefaultPurchasingServiceProvider> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DefaultPurchasingServiceProvider> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultPurchasingServiceProvider createFromParcel(Parcel parcel) {
            r.f(parcel, "parcel");
            parcel.readInt();
            return new DefaultPurchasingServiceProvider();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultPurchasingServiceProvider[] newArray(int i10) {
            return new DefaultPurchasingServiceProvider[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public RequestId getProductData(Set<String> set) {
        r.f(set, b.O);
        RequestId productData = PurchasingService.getProductData(set);
        r.e(productData, "getProductData(skus)");
        return productData;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public RequestId getPurchaseUpdates(boolean z10) {
        RequestId purchaseUpdates = PurchasingService.getPurchaseUpdates(z10);
        r.e(purchaseUpdates, "getPurchaseUpdates(reset)");
        return purchaseUpdates;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public RequestId getUserData() {
        RequestId userData = PurchasingService.getUserData(UserDataRequest.newBuilder().setFetchLWAConsentStatus(true).build());
        r.e(userData, "getUserData(UserDataRequ…sentStatus(true).build())");
        return userData;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public void notifyFulfillment(String str, FulfillmentResult fulfillmentResult) {
        r.f(str, b.E);
        r.f(fulfillmentResult, "fulfillmentResult");
        PurchasingService.notifyFulfillment(str, fulfillmentResult);
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public RequestId purchase(String str) {
        r.f(str, "sku");
        RequestId requestIdPurchase = PurchasingService.purchase(str);
        r.e(requestIdPurchase, "purchase(sku)");
        return requestIdPurchase;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public void registerListener(Context context, PurchasingListener purchasingListener) {
        r.f(context, "context");
        r.f(purchasingListener, "listener");
        PurchasingService.registerListener(context, purchasingListener);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "out");
        parcel.writeInt(1);
    }
}
