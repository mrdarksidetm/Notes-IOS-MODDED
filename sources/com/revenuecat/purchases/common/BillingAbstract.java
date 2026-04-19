package com.revenuecat.purchases.common;

import ae.r;
import android.app.Activity;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import java.util.Map;
import java.util.Set;
import md.i0;
import zd.a;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BillingAbstract {
    private final PurchasesStateProvider purchasesStateProvider;
    private volatile PurchasesUpdatedListener purchasesUpdatedListener;
    private volatile StateListener stateListener;

    public interface PurchasesUpdatedListener {
        void onPurchasesFailedToUpdate(PurchasesError purchasesError);

        void onPurchasesUpdated(List<StoreTransaction> list);
    }

    public interface StateListener {
        void onConnected();
    }

    public BillingAbstract(PurchasesStateProvider purchasesStateProvider) {
        r.f(purchasesStateProvider, "purchasesStateProvider");
        this.purchasesStateProvider = purchasesStateProvider;
    }

    public static /* synthetic */ void makePurchaseAsync$default(BillingAbstract billingAbstract, Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makePurchaseAsync");
        }
        if ((i10 & 32) != 0) {
            bool = null;
        }
        billingAbstract.makePurchaseAsync(activity, str, purchasingData, replaceProductInfo, presentedOfferingContext, bool);
    }

    public static /* synthetic */ void startConnectionOnMainThread$default(BillingAbstract billingAbstract, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startConnectionOnMainThread");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        billingAbstract.startConnectionOnMainThread(j10);
    }

    public final void close() {
        this.purchasesUpdatedListener = null;
        endConnection();
    }

    public abstract void consumeAndSave(boolean z10, StoreTransaction storeTransaction, boolean z11, PostReceiptInitiationSource postReceiptInitiationSource);

    protected abstract void endConnection();

    public abstract void findPurchaseInPurchaseHistory(String str, ProductType productType, String str2, l<? super StoreTransaction, i0> lVar, l<? super PurchasesError, i0> lVar2);

    public void getAmazonLWAConsentStatus(l<? super AmazonLWAConsentStatus, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        lVar.invoke(AmazonLWAConsentStatus.UNAVAILABLE);
    }

    protected final PurchasesStateProvider getPurchasesStateProvider() {
        return this.purchasesStateProvider;
    }

    public final synchronized PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return this.purchasesUpdatedListener;
    }

    public final synchronized StateListener getStateListener() {
        return this.stateListener;
    }

    public abstract void getStorefront(l<? super String, i0> lVar, l<? super PurchasesError, i0> lVar2);

    public abstract boolean isConnected();

    public abstract void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool);

    public void normalizePurchaseData(String str, String str2, String str3, l<? super String, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "productID");
        r.f(str2, "purchaseToken");
        r.f(str3, "storeUserID");
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        lVar.invoke(str);
    }

    public abstract void queryAllPurchases(String str, l<? super List<StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2);

    public abstract void queryProductDetailsAsync(ProductType productType, Set<String> set, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2);

    public abstract void queryPurchases(String str, l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2);

    public final void setPurchasesUpdatedListener(PurchasesUpdatedListener purchasesUpdatedListener) {
        this.purchasesUpdatedListener = purchasesUpdatedListener;
    }

    public final synchronized void setStateListener(StateListener stateListener) {
        this.stateListener = stateListener;
    }

    public abstract void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list, a<i0> aVar);

    public abstract void startConnection();

    public abstract void startConnectionOnMainThread(long j10);
}
