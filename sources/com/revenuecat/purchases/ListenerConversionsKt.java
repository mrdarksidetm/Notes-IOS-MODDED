package com.revenuecat.purchases;

import ae.r;
import android.app.Activity;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import md.i0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class ListenerConversionsKt {
    public static final GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusListener(final l<? super AmazonLWAConsentStatus, i0> lVar, final l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        return new GetAmazonLWAConsentStatusCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.getAmazonLWAConsentStatusListener.1
            @Override // com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                lVar2.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback
            public void onSuccess(AmazonLWAConsentStatus amazonLWAConsentStatus) {
                r.f(amazonLWAConsentStatus, "consentStatus");
                lVar.invoke(amazonLWAConsentStatus);
            }
        };
    }

    public static final void getAmazonLWAConsentStatusWith(Purchases purchases, l<? super PurchasesError, i0> lVar, l<? super AmazonLWAConsentStatus, i0> lVar2) {
        r.f(purchases, "<this>");
        r.f(lVar, "onError");
        r.f(lVar2, "onSuccess");
        purchases.getAmazonLWAConsentStatus(getAmazonLWAConsentStatusListener(lVar2, lVar));
    }

    public static /* synthetic */ void getAmazonLWAConsentStatusWith$default(Purchases purchases, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getAmazonLWAConsentStatusWith(purchases, lVar, lVar2);
    }

    public static final GetCustomerCenterConfigCallback getCustomerCenterConfigDataListener(final l<? super CustomerCenterConfigData, i0> lVar, final l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        return new GetCustomerCenterConfigCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.getCustomerCenterConfigDataListener.1
            @Override // com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                lVar2.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback
            public void onSuccess(CustomerCenterConfigData customerCenterConfigData) {
                r.f(customerCenterConfigData, "customerCenterConfig");
                lVar.invoke(customerCenterConfigData);
            }
        };
    }

    public static final void getCustomerInfoWith(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, l<? super PurchasesError, i0> lVar, l<? super CustomerInfo, i0> lVar2) {
        r.f(purchases, "<this>");
        r.f(cacheFetchPolicy, "fetchPolicy");
        r.f(lVar, "onError");
        r.f(lVar2, "onSuccess");
        purchases.getCustomerInfo(cacheFetchPolicy, ListenerConversionsCommonKt.receiveCustomerInfoCallback(lVar2, lVar));
    }

    public static final void getCustomerInfoWith(Purchases purchases, l<? super PurchasesError, i0> lVar, l<? super CustomerInfo, i0> lVar2) {
        r.f(purchases, "<this>");
        r.f(lVar, "onError");
        r.f(lVar2, "onSuccess");
        purchases.getCustomerInfo(ListenerConversionsCommonKt.receiveCustomerInfoCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, cacheFetchPolicy, lVar, lVar2);
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, lVar, lVar2);
    }

    public static final void getNonSubscriptionSkusWith(Purchases purchases, List<String> list, l<? super PurchasesError, i0> lVar, l<? super List<? extends StoreProduct>, i0> lVar2) {
        r.f(purchases, "<this>");
        r.f(list, b.O);
        r.f(lVar, "onError");
        r.f(lVar2, "onReceiveSkus");
        purchases.getProducts(list, ProductType.INAPP, ListenerConversionsCommonKt.getStoreProductsCallback(lVar2, lVar));
    }

    public static final void getSubscriptionSkusWith(Purchases purchases, List<String> list, l<? super PurchasesError, i0> lVar, l<? super List<? extends StoreProduct>, i0> lVar2) {
        r.f(purchases, "<this>");
        r.f(list, b.O);
        r.f(lVar, "onError");
        r.f(lVar2, "onReceiveSkus");
        purchases.getProducts(list, ProductType.SUBS, ListenerConversionsCommonKt.getStoreProductsCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getSubscriptionSkusWith$default(Purchases purchases, List list, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getSubscriptionSkusWith(purchases, list, lVar, lVar2);
    }

    public static final LogInCallback logInSuccessListener(final p<? super CustomerInfo, ? super Boolean, i0> pVar, final l<? super PurchasesError, i0> lVar) {
        r.f(pVar, "onSuccess");
        r.f(lVar, "onError");
        return new LogInCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.logInSuccessListener.1
            @Override // com.revenuecat.purchases.interfaces.LogInCallback
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                l<PurchasesError, i0> lVar2 = lVar;
                if (lVar2 != null) {
                    lVar2.invoke(purchasesError);
                }
            }

            @Override // com.revenuecat.purchases.interfaces.LogInCallback
            public void onReceived(CustomerInfo customerInfo, boolean z10) {
                r.f(customerInfo, "customerInfo");
                p<CustomerInfo, Boolean, i0> pVar2 = pVar;
                if (pVar2 != null) {
                    pVar2.invoke(customerInfo, Boolean.valueOf(z10));
                }
            }
        };
    }

    public static final void logInWith(Purchases purchases, String str, l<? super PurchasesError, i0> lVar, p<? super CustomerInfo, ? super Boolean, i0> pVar) {
        r.f(purchases, "<this>");
        r.f(str, "appUserID");
        r.f(lVar, "onError");
        r.f(pVar, "onSuccess");
        purchases.logIn(str, logInSuccessListener(pVar, lVar));
    }

    public static /* synthetic */ void logInWith$default(Purchases purchases, String str, l lVar, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logInWith(purchases, str, lVar, pVar);
    }

    public static final void logOutWith(Purchases purchases, l<? super PurchasesError, i0> lVar, l<? super CustomerInfo, i0> lVar2) {
        r.f(purchases, "<this>");
        r.f(lVar, "onError");
        r.f(lVar2, "onSuccess");
        purchases.logOut(ListenerConversionsCommonKt.receiveCustomerInfoCallback(lVar2, lVar));
    }

    public static /* synthetic */ void logOutWith$default(Purchases purchases, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logOutWith(purchases, lVar, lVar2);
    }

    public static final ProductChangeCallback productChangeCompletedListener(final p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, final p<? super PurchasesError, ? super Boolean, i0> pVar2) {
        r.f(pVar, "onSuccess");
        r.f(pVar2, "onError");
        return new ProductChangeCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.productChangeCompletedListener.1
            @Override // com.revenuecat.purchases.interfaces.ProductChangeCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                r.f(customerInfo, "customerInfo");
                pVar.invoke(storeTransaction, customerInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError purchasesError, boolean z10) {
                r.f(purchasesError, "error");
                pVar2.invoke(purchasesError, Boolean.valueOf(z10));
            }
        };
    }

    public static final void purchasePackageWith(Purchases purchases, Activity activity, Package r32, p<? super PurchasesError, ? super Boolean, i0> pVar, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar2) {
        r.f(purchases, "<this>");
        r.f(activity, "activity");
        r.f(r32, "packageToPurchase");
        r.f(pVar, "onError");
        r.f(pVar2, "onSuccess");
        purchases.purchasePackage(activity, r32, ListenerConversionsCommonKt.purchaseCompletedCallback(pVar2, pVar));
    }

    public static /* synthetic */ void purchasePackageWith$default(Purchases purchases, Activity activity, Package r22, p pVar, p pVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            pVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchasePackageWith(purchases, activity, r22, pVar, pVar2);
    }

    public static final void purchaseProductWith(Purchases purchases, Activity activity, StoreProduct storeProduct, p<? super PurchasesError, ? super Boolean, i0> pVar, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar2) {
        r.f(purchases, "<this>");
        r.f(activity, "activity");
        r.f(storeProduct, "storeProduct");
        r.f(pVar, "onError");
        r.f(pVar2, "onSuccess");
        purchases.purchaseProduct(activity, storeProduct, ListenerConversionsCommonKt.purchaseCompletedCallback(pVar2, pVar));
    }

    public static /* synthetic */ void purchaseProductWith$default(Purchases purchases, Activity activity, StoreProduct storeProduct, p pVar, p pVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            pVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchaseProductWith(purchases, activity, storeProduct, pVar, pVar2);
    }

    public static final void syncAttributesAndOfferingsIfNeededWith(Purchases purchases, l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
        r.f(purchases, "<this>");
        r.f(lVar, "onError");
        r.f(lVar2, "onSuccess");
        purchases.syncAttributesAndOfferingsIfNeeded(syncAttributesAndOfferingsListener(lVar2, lVar));
    }

    public static /* synthetic */ void syncAttributesAndOfferingsIfNeededWith$default(Purchases purchases, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        syncAttributesAndOfferingsIfNeededWith(purchases, lVar, lVar2);
    }

    public static final SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsListener(final l<? super Offerings, i0> lVar, final l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        return new SyncAttributesAndOfferingsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.syncAttributesAndOfferingsListener.1
            @Override // com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                lVar2.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback
            public void onSuccess(Offerings offerings) {
                r.f(offerings, "offerings");
                lVar.invoke(offerings);
            }
        };
    }

    public static final SyncPurchasesCallback syncPurchasesListener(final l<? super CustomerInfo, i0> lVar, final l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        return new SyncPurchasesCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.syncPurchasesListener.1
            @Override // com.revenuecat.purchases.interfaces.SyncPurchasesCallback
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                lVar2.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.SyncPurchasesCallback
            public void onSuccess(CustomerInfo customerInfo) {
                r.f(customerInfo, "customerInfo");
                lVar.invoke(customerInfo);
            }
        };
    }

    public static final void syncPurchasesWith(Purchases purchases, l<? super PurchasesError, i0> lVar, l<? super CustomerInfo, i0> lVar2) {
        r.f(purchases, "<this>");
        r.f(lVar, "onError");
        r.f(lVar2, "onSuccess");
        purchases.syncPurchases(syncPurchasesListener(lVar2, lVar));
    }

    public static /* synthetic */ void syncPurchasesWith$default(Purchases purchases, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        syncPurchasesWith(purchases, lVar, lVar2);
    }
}
