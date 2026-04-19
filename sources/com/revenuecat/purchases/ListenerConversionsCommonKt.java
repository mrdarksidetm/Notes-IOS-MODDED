package com.revenuecat.purchases;

import ae.r;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import md.i0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class ListenerConversionsCommonKt {
    private static final l<PurchasesError, i0> ON_ERROR_STUB = ListenerConversionsCommonKt$ON_ERROR_STUB$1.INSTANCE;
    private static final p<PurchasesError, Boolean, i0> ON_PURCHASE_ERROR_STUB = ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1.INSTANCE;

    public static final l<PurchasesError, i0> getON_ERROR_STUB() {
        return ON_ERROR_STUB;
    }

    public static final p<PurchasesError, Boolean, i0> getON_PURCHASE_ERROR_STUB() {
        return ON_PURCHASE_ERROR_STUB;
    }

    public static final void getOfferingsWith(Purchases purchases, l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
        r.f(purchases, "<this>");
        r.f(lVar, "onError");
        r.f(lVar2, "onSuccess");
        purchases.getOfferings(receiveOfferingsCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getOfferingsWith$default(Purchases purchases, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getOfferingsWith(purchases, lVar, lVar2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> list, ProductType productType, l<? super PurchasesError, i0> lVar, l<? super List<? extends StoreProduct>, i0> lVar2) {
        r.f(purchases, "<this>");
        r.f(list, "productIds");
        r.f(lVar, "onError");
        r.f(lVar2, "onGetStoreProducts");
        purchases.getProducts(list, productType, getStoreProductsCallback(lVar2, lVar));
    }

    public static final void getProductsWith(Purchases purchases, List<String> list, l<? super PurchasesError, i0> lVar, l<? super List<? extends StoreProduct>, i0> lVar2) {
        r.f(purchases, "<this>");
        r.f(list, "productIds");
        r.f(lVar, "onError");
        r.f(lVar2, "onGetStoreProducts");
        purchases.getProducts(list, getStoreProductsCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, ProductType productType, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, productType, lVar, lVar2);
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, lVar, lVar2);
    }

    public static final GetStoreProductsCallback getStoreProductsCallback(final l<? super List<? extends StoreProduct>, i0> lVar, final l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onReceived");
        r.f(lVar2, "onError");
        return new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.getStoreProductsCallback.1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                lVar2.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> list) {
                r.f(list, "storeProducts");
                lVar.invoke(list);
            }
        };
    }

    public static final PurchaseCallback purchaseCompletedCallback(final p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, final p<? super PurchasesError, ? super Boolean, i0> pVar2) {
        r.f(pVar, "onSuccess");
        r.f(pVar2, "onError");
        return new PurchaseCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.purchaseCompletedCallback.1
            @Override // com.revenuecat.purchases.interfaces.PurchaseCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                r.f(storeTransaction, "storeTransaction");
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

    public static final void purchaseWith(Purchases purchases, PurchaseParams purchaseParams, p<? super PurchasesError, ? super Boolean, i0> pVar, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar2) {
        r.f(purchases, "<this>");
        r.f(purchaseParams, "purchaseParams");
        r.f(pVar, "onError");
        r.f(pVar2, "onSuccess");
        purchases.purchase(purchaseParams, purchaseCompletedCallback(pVar2, pVar));
    }

    public static /* synthetic */ void purchaseWith$default(Purchases purchases, PurchaseParams purchaseParams, p pVar, p pVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = ON_PURCHASE_ERROR_STUB;
        }
        purchaseWith(purchases, purchaseParams, pVar, pVar2);
    }

    public static final ReceiveCustomerInfoCallback receiveCustomerInfoCallback(final l<? super CustomerInfo, i0> lVar, final l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        return new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.receiveCustomerInfoCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                l<PurchasesError, i0> lVar3 = lVar2;
                if (lVar3 != null) {
                    lVar3.invoke(purchasesError);
                }
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                r.f(customerInfo, "customerInfo");
                l<CustomerInfo, i0> lVar3 = lVar;
                if (lVar3 != null) {
                    lVar3.invoke(customerInfo);
                }
            }
        };
    }

    public static final ReceiveOfferingsCallback receiveOfferingsCallback(final l<? super Offerings, i0> lVar, final l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        return new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.receiveOfferingsCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                lVar2.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                r.f(offerings, "offerings");
                lVar.invoke(offerings);
            }
        };
    }

    public static final void restorePurchasesWith(Purchases purchases, l<? super PurchasesError, i0> lVar, l<? super CustomerInfo, i0> lVar2) {
        r.f(purchases, "<this>");
        r.f(lVar, "onError");
        r.f(lVar2, "onSuccess");
        purchases.restorePurchases(receiveCustomerInfoCallback(lVar2, lVar));
    }

    public static /* synthetic */ void restorePurchasesWith$default(Purchases purchases, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ON_ERROR_STUB;
        }
        restorePurchasesWith(purchases, lVar, lVar2);
    }
}
