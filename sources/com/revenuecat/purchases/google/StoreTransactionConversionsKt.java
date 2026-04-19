package com.revenuecat.purchases.google;

import ae.r;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreTransactionConversionsKt {
    public static final Purchase getOriginalGooglePurchase(StoreTransaction storeTransaction) {
        r.f(storeTransaction, "<this>");
        String signature = storeTransaction.getSignature();
        if (signature == null) {
            return null;
        }
        if (!(storeTransaction.getPurchaseType() == PurchaseType.GOOGLE_PURCHASE)) {
            signature = null;
        }
        if (signature != null) {
            return new Purchase(storeTransaction.getOriginalJson().toString(), signature);
        }
        return null;
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode) {
        r.f(purchase, "<this>");
        r.f(productType, "productType");
        String strA = purchase.a();
        List<String> listC = purchase.c();
        r.e(listC, "this.products");
        long jE = purchase.e();
        String strF = purchase.f();
        r.e(strF, "this.purchaseToken");
        return new StoreTransaction(strA, listC, productType, jE, strF, PurchaseStateConversionsKt.toRevenueCatPurchaseState(purchase.d()), Boolean.valueOf(purchase.i()), purchase.g(), new JSONObject(purchase.b()), presentedOfferingContext, (String) null, PurchaseType.GOOGLE_PURCHASE, (String) null, str, googleReplacementMode);
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, PurchaseContext purchaseContext) {
        r.f(purchase, "<this>");
        r.f(purchaseContext, "purchaseContext");
        return toStoreTransaction(purchase, purchaseContext.getProductType(), purchaseContext.getPresentedOfferingContext(), purchaseContext.getSelectedSubscriptionOptionId(), purchaseContext.getReplacementMode());
    }

    public static final StoreTransaction toStoreTransaction(PurchaseHistoryRecord purchaseHistoryRecord, ProductType productType) {
        r.f(purchaseHistoryRecord, "<this>");
        r.f(productType, "type");
        List<String> listB = purchaseHistoryRecord.b();
        r.e(listB, "this.products");
        long jC = purchaseHistoryRecord.c();
        String strD = purchaseHistoryRecord.d();
        r.e(strD, "this.purchaseToken");
        return new StoreTransaction((String) null, listB, productType, jC, strD, PurchaseState.UNSPECIFIED_STATE, (Boolean) null, purchaseHistoryRecord.e(), new JSONObject(purchaseHistoryRecord.a()), (PresentedOfferingContext) null, (String) null, PurchaseType.GOOGLE_RESTORED_PURCHASE, (String) null, (String) null, (ReplacementMode) null);
    }

    public static /* synthetic */ StoreTransaction toStoreTransaction$default(Purchase purchase, ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            presentedOfferingContext = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            googleReplacementMode = null;
        }
        return toStoreTransaction(purchase, productType, presentedOfferingContext, str, googleReplacementMode);
    }
}
