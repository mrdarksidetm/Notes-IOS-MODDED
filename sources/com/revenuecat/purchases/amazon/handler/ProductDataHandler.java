package com.revenuecat.purchases.amazon.handler;

import ae.j;
import ae.r;
import android.os.Handler;
import com.amazon.a.a.o.b;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.StoreProductConversionsKt;
import com.revenuecat.purchases.amazon.handler.ProductDataHandler;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import md.i0;
import nd.c0;
import nd.r0;
import org.json.JSONException;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductDataHandler implements ProductDataResponseListener {
    public static final Companion Companion = new Companion(null);
    private static final long GET_PRODUCT_DATA_TIMEOUT_MILLIS = 10000;
    private final Handler mainHandler;
    private final Map<String, Product> productDataCache;
    private final Map<RequestId, Request> productDataRequests;
    private final PurchasingServiceProvider purchasingServiceProvider;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    private static final class Request {
        private final String marketplace;
        private final l<PurchasesError, i0> onError;
        private final l<List<? extends StoreProduct>, i0> onReceive;
        private final List<String> skuList;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(List<String> list, String str, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
            r.f(list, "skuList");
            r.f(str, b.f7439m);
            r.f(lVar, "onReceive");
            r.f(lVar2, "onError");
            this.skuList = list;
            this.marketplace = str;
            this.onReceive = lVar;
            this.onError = lVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Request copy$default(Request request, List list, String str, l lVar, l lVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = request.skuList;
            }
            if ((i10 & 2) != 0) {
                str = request.marketplace;
            }
            if ((i10 & 4) != 0) {
                lVar = request.onReceive;
            }
            if ((i10 & 8) != 0) {
                lVar2 = request.onError;
            }
            return request.copy(list, str, lVar, lVar2);
        }

        public final List<String> component1() {
            return this.skuList;
        }

        public final String component2() {
            return this.marketplace;
        }

        public final l<List<? extends StoreProduct>, i0> component3() {
            return this.onReceive;
        }

        public final l<PurchasesError, i0> component4() {
            return this.onError;
        }

        public final Request copy(List<String> list, String str, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
            r.f(list, "skuList");
            r.f(str, b.f7439m);
            r.f(lVar, "onReceive");
            r.f(lVar2, "onError");
            return new Request(list, str, lVar, lVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return r.b(this.skuList, request.skuList) && r.b(this.marketplace, request.marketplace) && r.b(this.onReceive, request.onReceive) && r.b(this.onError, request.onError);
        }

        public final String getMarketplace() {
            return this.marketplace;
        }

        public final l<PurchasesError, i0> getOnError() {
            return this.onError;
        }

        public final l<List<? extends StoreProduct>, i0> getOnReceive() {
            return this.onReceive;
        }

        public final List<String> getSkuList() {
            return this.skuList;
        }

        public int hashCode() {
            return (((((this.skuList.hashCode() * 31) + this.marketplace.hashCode()) * 31) + this.onReceive.hashCode()) * 31) + this.onError.hashCode();
        }

        public String toString() {
            return "Request(skuList=" + this.skuList + ", marketplace=" + this.marketplace + ", onReceive=" + this.onReceive + ", onError=" + this.onError + ')';
        }
    }

    public ProductDataHandler(PurchasingServiceProvider purchasingServiceProvider, Handler handler) {
        r.f(purchasingServiceProvider, "purchasingServiceProvider");
        r.f(handler, "mainHandler");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.mainHandler = handler;
        this.productDataRequests = new LinkedHashMap();
        this.productDataCache = new LinkedHashMap();
    }

    private final void addTimeoutToProductDataRequest(final RequestId requestId) {
        this.mainHandler.postDelayed(new Runnable() { // from class: ib.a
            @Override // java.lang.Runnable
            public final void run() {
                ProductDataHandler.addTimeoutToProductDataRequest$lambda$6(this.f12623a, requestId);
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addTimeoutToProductDataRequest$lambda$6(ProductDataHandler productDataHandler, RequestId requestId) {
        r.f(productDataHandler, "this$0");
        r.f(requestId, "$requestId");
        Request request = productDataHandler.getRequest(requestId);
        if (request == null) {
            return;
        }
        PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
        String str = String.format(AmazonStrings.ERROR_TIMEOUT_GETTING_PRODUCT_DATA, Arrays.copyOf(new Object[]{request.getSkuList().toString()}, 1));
        r.e(str, "format(this, *args)");
        request.getOnError().invoke(new PurchasesError(purchasesErrorCode, str));
    }

    private final synchronized Request getRequest(RequestId requestId) {
        return this.productDataRequests.remove(requestId);
    }

    private final void handleSuccessfulProductDataResponse(Map<String, Product> map, String str, l<? super List<? extends StoreProduct>, i0> lVar) throws JSONException {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AmazonStrings.RETRIEVED_PRODUCT_DATA, Arrays.copyOf(new Object[]{map}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        if (map.isEmpty()) {
            LogWrapperKt.log(logIntent, AmazonStrings.RETRIEVED_PRODUCT_DATA_EMPTY);
        }
        Collection<Product> collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            StoreProduct storeProduct = StoreProductConversionsKt.toStoreProduct((Product) it.next(), str);
            if (storeProduct != null) {
                arrayList.add(storeProduct);
            }
        }
        lVar.invoke(arrayList);
    }

    private final void handleUnsuccessfulProductDataResponse(ProductDataResponse productDataResponse, l<? super PurchasesError, i0> lVar) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, productDataResponse.getRequestStatus() == ProductDataResponse.RequestStatus.NOT_SUPPORTED ? "Couldn't fetch product data, since it's not supported." : "Error when fetching product data."));
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener
    public void getProductData(Set<String> set, String str, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2) throws JSONException {
        Map mapT;
        r.f(set, b.O);
        r.f(str, b.f7439m);
        r.f(lVar, "onReceive");
        r.f(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AmazonStrings.REQUESTING_PRODUCTS, Arrays.copyOf(new Object[]{c0.h0(set, null, null, null, 0, null, null, 63, null)}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        synchronized (this) {
            mapT = r0.t(this.productDataCache);
        }
        if (!mapT.keySet().containsAll(set)) {
            RequestId productData = this.purchasingServiceProvider.getProductData(set);
            Request request = new Request(c0.C0(set), str, lVar, lVar2);
            synchronized (this) {
                this.productDataRequests.put(productData, request);
                addTimeoutToProductDataRequest(productData);
                i0 i0Var = i0.f15558a;
            }
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapT.entrySet()) {
            if (set.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        handleSuccessfulProductDataResponse(linkedHashMap, str, lVar);
    }

    public final synchronized Map<String, Product> getProductDataCache$purchases_defaultsRelease() {
        return this.productDataCache;
    }

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse productDataResponse) throws Exception {
        r.f(productDataResponse, "response");
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            boolean z10 = true;
            String str = String.format(AmazonStrings.PRODUCTS_REQUEST_FINISHED, Arrays.copyOf(new Object[]{productDataResponse.getRequestStatus().name()}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            r.e(productDataResponse.getUnavailableSkus(), "response.unavailableSkus");
            if (!r1.isEmpty()) {
                String str2 = String.format(AmazonStrings.PRODUCTS_REQUEST_UNAVAILABLE, Arrays.copyOf(new Object[]{productDataResponse.getUnavailableSkus()}, 1));
                r.e(str2, "format(this, *args)");
                LogWrapperKt.log(logIntent, str2);
            }
            RequestId requestId = productDataResponse.getRequestId();
            r.e(requestId, b.B);
            Request request = getRequest(requestId);
            if (request == null) {
                return;
            }
            if (productDataResponse.getRequestStatus() != ProductDataResponse.RequestStatus.SUCCESSFUL) {
                z10 = false;
            }
            if (!z10) {
                handleUnsuccessfulProductDataResponse(productDataResponse, request.getOnError());
                return;
            }
            synchronized (this) {
                Map<String, Product> map = this.productDataCache;
                Map<String, Product> productData = productDataResponse.getProductData();
                r.e(productData, "response.productData");
                map.putAll(productData);
                i0 i0Var = i0.f15558a;
            }
            Map<String, Product> productData2 = productDataResponse.getProductData();
            r.e(productData2, "response.productData");
            handleSuccessfulProductDataResponse(productData2, request.getMarketplace(), request.getOnReceive());
        } catch (Exception e10) {
            LogUtilsKt.errorLog("Exception in onProductDataResponse", e10);
            throw e10;
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        ProductDataResponseListener.DefaultImpls.onPurchaseResponse(this, purchaseResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        ProductDataResponseListener.DefaultImpls.onPurchaseUpdatesResponse(this, purchaseUpdatesResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse userDataResponse) {
        ProductDataResponseListener.DefaultImpls.onUserDataResponse(this, userDataResponse);
    }
}
