package com.revenuecat.purchases.common;

import ae.j;
import ae.m0;
import ae.r;
import bf.n;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.PostReceiptResponse;
import com.revenuecat.purchases.common.networking.PostReceiptResponseKt;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.CustomerCenterRoot;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.events.PaywallEventRequest;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.i0;
import md.s;
import md.x;
import nd.c0;
import nd.q0;
import nd.r0;
import nd.t;
import nd.u;
import nd.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import we.g;
import zd.a;
import zd.l;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class Backend {
    private static final String APP_USER_ID = "app_user_id";
    private static final String FETCH_TOKEN = "fetch_token";
    private static final String NEW_APP_USER_ID = "new_app_user_id";
    private final AppConfig appConfig;
    private final BackendHelper backendHelper;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<s<l<CustomerInfo, i0>, p<PurchasesError, Boolean, i0>>>> callbacks;
    private volatile Map<String, List<s<l<CustomerCenterConfigData, i0>, l<PurchasesError, i0>>>> customerCenterCallbacks;
    private volatile Map<List<String>, List<s<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>>> diagnosticsCallbacks;
    private final Dispatcher dispatcher;
    private final Dispatcher eventsDispatcher;
    private final HTTPClient httpClient;
    private volatile Map<List<String>, List<s<p<CustomerInfo, Boolean, i0>, l<PurchasesError, i0>>>> identifyCallbacks;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<s<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>>> offeringsCallbacks;
    private volatile Map<List<String>, List<s<a<i0>, p<PurchasesError, Boolean, i0>>>> paywallEventsCallbacks;
    private volatile Map<List<String>, List<s<l<PostReceiptResponse, i0>, q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0>>>> postReceiptCallbacks;
    private volatile Map<String, List<s<l<ProductEntitlementMapping, i0>, l<PurchasesError, i0>>>> productEntitlementCallbacks;
    private volatile Map<String, List<l<RedeemWebPurchaseListener.Result, i0>>> redeemWebPurchaseCallbacks;
    public static final Companion Companion = new Companion(null);
    private static final bf.a json = n.b(null, Backend$Companion$json$1.INSTANCE, 1, null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ void getJson$purchases_defaultsRelease$annotations() {
        }

        public final bf.a getJson$purchases_defaultsRelease() {
            return Backend.json;
        }
    }

    public Backend(AppConfig appConfig, Dispatcher dispatcher, Dispatcher dispatcher2, HTTPClient hTTPClient, BackendHelper backendHelper) {
        r.f(appConfig, "appConfig");
        r.f(dispatcher, "dispatcher");
        r.f(dispatcher2, "eventsDispatcher");
        r.f(hTTPClient, "httpClient");
        r.f(backendHelper, "backendHelper");
        this.appConfig = appConfig;
        this.dispatcher = dispatcher;
        this.eventsDispatcher = dispatcher2;
        this.httpClient = hTTPClient;
        this.backendHelper = backendHelper;
        this.callbacks = new LinkedHashMap();
        this.postReceiptCallbacks = new LinkedHashMap();
        this.offeringsCallbacks = new LinkedHashMap();
        this.identifyCallbacks = new LinkedHashMap();
        this.diagnosticsCallbacks = new LinkedHashMap();
        this.paywallEventsCallbacks = new LinkedHashMap();
        this.productEntitlementCallbacks = new LinkedHashMap();
        this.customerCenterCallbacks = new LinkedHashMap();
        this.redeemWebPurchaseCallbacks = new LinkedHashMap();
    }

    private final synchronized <S, E> void addBackgroundAwareCallback(Map<BackgroundAwareCallbackCacheKey, List<s<S, E>>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, s<? extends S, ? extends E> sVar, Delay delay) {
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2;
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKeyCopy$default = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, false, 1, null);
        boolean zContainsKey = map.containsKey(backgroundAwareCallbackCacheKeyCopy$default);
        if (backgroundAwareCallbackCacheKey.getAppInBackground() && zContainsKey) {
            String str = String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITHOUT_JITTER, Arrays.copyOf(new Object[]{backgroundAwareCallbackCacheKeyCopy$default}, 1));
            r.e(str, "format(this, *args)");
            LogUtilsKt.debugLog(str);
            backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKeyCopy$default;
        } else {
            backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
        }
        addCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey2, sVar, delay);
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKeyCopy$default2 = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, true, 1, null);
        boolean zContainsKey2 = map.containsKey(backgroundAwareCallbackCacheKeyCopy$default);
        if (!backgroundAwareCallbackCacheKey.getAppInBackground() && zContainsKey2) {
            String str2 = String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITH_JITTER, Arrays.copyOf(new Object[]{backgroundAwareCallbackCacheKeyCopy$default}, 1));
            r.e(str2, "format(this, *args)");
            LogUtilsKt.debugLog(str2);
            List<s<S, E>> listRemove = map.remove(backgroundAwareCallbackCacheKeyCopy$default2);
            if (listRemove != null) {
                List<s<S, E>> list = listRemove.isEmpty() ^ true ? listRemove : null;
                if (list != null) {
                    if (map.containsKey(backgroundAwareCallbackCacheKey)) {
                        List<s<S, E>> list2 = map.get(backgroundAwareCallbackCacheKey);
                        if (list2 != null) {
                            list2.addAll(list);
                        }
                    } else {
                        map.put(backgroundAwareCallbackCacheKey, list);
                    }
                }
            }
        }
    }

    static /* synthetic */ void addBackgroundAwareCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, s sVar, Delay delay, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addBackgroundAwareCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey, sVar, delay);
    }

    private final <K, F> void addCallback(Map<K, List<F>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, K k10, F f10, Delay delay) {
        if (!map.containsKey(k10)) {
            map.put(k10, u.s(f10));
            this.backendHelper.enqueue(asyncCall, dispatcher, delay);
            return;
        }
        m0 m0Var = m0.f720a;
        String str = String.format(NetworkStrings.SAME_CALL_ALREADY_IN_PROGRESS, Arrays.copyOf(new Object[]{k10}, 1));
        r.e(str, "format(format, *args)");
        LogUtilsKt.debugLog(str);
        List<F> list = map.get(k10);
        r.c(list);
        list.add(f10);
    }

    static /* synthetic */ void addCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Object obj, Object obj2, Delay delay, int i10, Object obj3) {
        if ((i10 & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addCallback(map, asyncCall, dispatcher, obj, obj2, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostReceiptErrorHandlingBehavior determinePostReceiptErrorHandlingBehavior(int i10, PurchasesError purchasesError) {
        return RCHTTPStatusCodes.INSTANCE.isServerError(i10) ? PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME : purchasesError.getCode() == PurchasesErrorCode.UnsupportedError ? PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME : PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED;
    }

    public final void clearCaches() {
        this.httpClient.clearCaches();
    }

    public final void close() {
        this.dispatcher.close();
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<s<l<CustomerInfo, i0>, p<PurchasesError, Boolean, i0>>>> getCallbacks() {
        return this.callbacks;
    }

    public final synchronized Map<String, List<s<l<CustomerCenterConfigData, i0>, l<PurchasesError, i0>>>> getCustomerCenterCallbacks() {
        return this.customerCenterCallbacks;
    }

    public final void getCustomerCenterConfig(String str, l<? super CustomerCenterConfigData, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "appUserID");
        r.f(lVar, "onSuccessHandler");
        r.f(lVar2, "onErrorHandler");
        final Endpoint.GetCustomerCenterConfig getCustomerCenterConfig = new Endpoint.GetCustomerCenterConfig(str);
        final String path = getCustomerCenterConfig.getPath();
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getCustomerCenterConfig$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getCustomerCenterConfig, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<s<l<CustomerCenterConfigData, i0>, l<PurchasesError, i0>>> listRemove;
                PurchasesError purchasesError;
                r.f(hTTPResult, "result");
                Backend backend = this.this$0;
                String str2 = path;
                synchronized (backend) {
                    listRemove = backend.getCustomerCenterCallbacks().remove(str2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        s sVar = (s) it.next();
                        l lVar3 = (l) sVar.a();
                        l lVar4 = (l) sVar.b();
                        if (BackendHelperKt.isSuccessful(hTTPResult)) {
                            try {
                                bf.a json$purchases_defaultsRelease = Backend.Companion.getJson$purchases_defaultsRelease();
                                String payload = hTTPResult.getPayload();
                                json$purchases_defaultsRelease.a();
                                lVar3.invoke(((CustomerCenterRoot) json$purchases_defaultsRelease.d(CustomerCenterRoot.Companion.serializer(), payload)).getCustomerCenter());
                            } catch (g | IllegalArgumentException e10) {
                                purchasesError = ErrorsKt.toPurchasesError(e10);
                                LogUtilsKt.errorLog(purchasesError);
                                lVar4.invoke(purchasesError);
                            }
                        } else {
                            purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                        }
                        LogUtilsKt.errorLog(purchasesError);
                        lVar4.invoke(purchasesError);
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<s<l<CustomerCenterConfigData, i0>, l<PurchasesError, i0>>> listRemove;
                r.f(purchasesError, "error");
                Backend backend = this.this$0;
                String str2 = path;
                synchronized (backend) {
                    listRemove = backend.getCustomerCenterCallbacks().remove(str2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((l) ((s) it.next()).b()).invoke(purchasesError);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.customerCenterCallbacks, asyncCall, this.dispatcher, path, x.a(lVar, lVar2), Delay.NONE);
            i0 i0Var = i0.f15558a;
        }
    }

    public final void getCustomerInfo(String str, boolean z10, l<? super CustomerInfo, i0> lVar, p<? super PurchasesError, ? super Boolean, i0> pVar) {
        final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey;
        r.f(str, "appUserID");
        r.f(lVar, "onSuccess");
        r.f(pVar, "onError");
        final Endpoint.GetCustomerInfo getCustomerInfo = new Endpoint.GetCustomerInfo(str);
        String path = getCustomerInfo.getPath();
        synchronized (this) {
            backgroundAwareCallbackCacheKey = this.postReceiptCallbacks.isEmpty() ? new BackgroundAwareCallbackCacheKey(t.d(path), z10) : new BackgroundAwareCallbackCacheKey(c0.o0(t.d(path), String.valueOf(this.callbacks.size())), z10);
        }
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getCustomerInfo$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getCustomerInfo, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<s<l<CustomerInfo, i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                r.f(hTTPResult, "result");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        s sVar = (s) it.next();
                        l lVar2 = (l) sVar.a();
                        p pVar2 = (p) sVar.b();
                        try {
                            if (BackendHelperKt.isSuccessful(hTTPResult)) {
                                lVar2.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult));
                            } else {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                                LogUtilsKt.errorLog(purchasesError);
                                pVar2.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult.getResponseCode())));
                            }
                        } catch (JSONException e10) {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e10);
                            LogUtilsKt.errorLog(purchasesError2);
                            pVar2.invoke(purchasesError2, Boolean.FALSE);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<s<l<CustomerInfo, i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                r.f(purchasesError, "error");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((p) ((s) it.next()).b()).invoke(purchasesError, Boolean.FALSE);
                    }
                }
            }
        };
        synchronized (this) {
            addBackgroundAwareCallback(this.callbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey, x.a(lVar, pVar), z10 ? Delay.DEFAULT : Delay.NONE);
            i0 i0Var = i0.f15558a;
        }
    }

    public final synchronized Map<List<String>, List<s<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>>> getDiagnosticsCallbacks() {
        return this.diagnosticsCallbacks;
    }

    public final synchronized Map<List<String>, List<s<p<CustomerInfo, Boolean, i0>, l<PurchasesError, i0>>>> getIdentifyCallbacks() {
        return this.identifyCallbacks;
    }

    public final void getOfferings(String str, boolean z10, l<? super JSONObject, i0> lVar, p<? super PurchasesError, ? super Boolean, i0> pVar) {
        r.f(str, "appUserID");
        r.f(lVar, "onSuccess");
        r.f(pVar, "onError");
        final Endpoint.GetOfferings getOfferings = new Endpoint.GetOfferings(str);
        final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(t.d(getOfferings.getPath()), z10);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getOfferings$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getOfferings, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<s<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                PurchasesError purchasesError;
                Boolean boolValueOf;
                r.f(hTTPResult, "result");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        s sVar = (s) it.next();
                        l lVar2 = (l) sVar.a();
                        p pVar2 = (p) sVar.b();
                        if (BackendHelperKt.isSuccessful(hTTPResult)) {
                            try {
                                lVar2.invoke(hTTPResult.getBody());
                            } catch (JSONException e10) {
                                purchasesError = ErrorsKt.toPurchasesError(e10);
                                LogUtilsKt.errorLog(purchasesError);
                                boolValueOf = Boolean.FALSE;
                                pVar2.invoke(purchasesError, boolValueOf);
                            }
                        } else {
                            purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                            LogUtilsKt.errorLog(purchasesError);
                            boolValueOf = Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult.getResponseCode()));
                        }
                        pVar2.invoke(purchasesError, boolValueOf);
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<s<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                r.f(purchasesError, "error");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((p) ((s) it.next()).b()).invoke(purchasesError, Boolean.FALSE);
                    }
                }
            }
        };
        synchronized (this) {
            addBackgroundAwareCallback(this.offeringsCallbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey, x.a(lVar, pVar), z10 ? Delay.DEFAULT : Delay.NONE);
            i0 i0Var = i0.f15558a;
        }
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<s<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>>> getOfferingsCallbacks() {
        return this.offeringsCallbacks;
    }

    public final synchronized Map<List<String>, List<s<a<i0>, p<PurchasesError, Boolean, i0>>>> getPaywallEventsCallbacks() {
        return this.paywallEventsCallbacks;
    }

    public final synchronized Map<List<String>, List<s<l<PostReceiptResponse, i0>, q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0>>>> getPostReceiptCallbacks() {
        return this.postReceiptCallbacks;
    }

    public final synchronized Map<String, List<s<l<ProductEntitlementMapping, i0>, l<PurchasesError, i0>>>> getProductEntitlementCallbacks() {
        return this.productEntitlementCallbacks;
    }

    public final void getProductEntitlementMapping(l<? super ProductEntitlementMapping, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccessHandler");
        r.f(lVar2, "onErrorHandler");
        final Endpoint.GetProductEntitlementMapping getProductEntitlementMapping = Endpoint.GetProductEntitlementMapping.INSTANCE;
        final String path = getProductEntitlementMapping.getPath();
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getProductEntitlementMapping$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getProductEntitlementMapping, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<s<l<ProductEntitlementMapping, i0>, l<PurchasesError, i0>>> listRemove;
                PurchasesError purchasesError;
                r.f(hTTPResult, "result");
                Backend backend = this.this$0;
                String str = path;
                synchronized (backend) {
                    listRemove = backend.getProductEntitlementCallbacks().remove(str);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        s sVar = (s) it.next();
                        l lVar3 = (l) sVar.a();
                        l lVar4 = (l) sVar.b();
                        if (BackendHelperKt.isSuccessful(hTTPResult)) {
                            try {
                                lVar3.invoke(ProductEntitlementMapping.Companion.fromJson(hTTPResult.getBody()));
                            } catch (JSONException e10) {
                                purchasesError = ErrorsKt.toPurchasesError(e10);
                                LogUtilsKt.errorLog(purchasesError);
                                lVar4.invoke(purchasesError);
                            }
                        } else {
                            purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                        }
                        LogUtilsKt.errorLog(purchasesError);
                        lVar4.invoke(purchasesError);
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<s<l<ProductEntitlementMapping, i0>, l<PurchasesError, i0>>> listRemove;
                r.f(purchasesError, "error");
                Backend backend = this.this$0;
                String str = path;
                synchronized (backend) {
                    listRemove = backend.getProductEntitlementCallbacks().remove(str);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((l) ((s) it.next()).b()).invoke(purchasesError);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.productEntitlementCallbacks, asyncCall, this.dispatcher, path, x.a(lVar, lVar2), Delay.LONG);
            i0 i0Var = i0.f15558a;
        }
    }

    public final synchronized Map<String, List<l<RedeemWebPurchaseListener.Result, i0>>> getRedeemWebPurchaseCallbacks() {
        return this.redeemWebPurchaseCallbacks;
    }

    public final SignatureVerificationMode getVerificationMode() {
        return this.httpClient.getSigningManager().getSignatureVerificationMode();
    }

    public final void logIn(final String str, final String str2, p<? super CustomerInfo, ? super Boolean, i0> pVar, l<? super PurchasesError, i0> lVar) {
        r.f(str, "appUserID");
        r.f(str2, "newAppUserID");
        r.f(pVar, "onSuccessHandler");
        r.f(lVar, "onErrorHandler");
        final List listR = u.r(str, str2);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$logIn$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.httpClient, this.appConfig.getBaseURL(), Endpoint.LogIn.INSTANCE, r0.h(x.a("app_user_id", str), x.a("new_app_user_id", str2)), u.p(x.a("app_user_id", str), x.a("new_app_user_id", str2)), this.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<s<p<CustomerInfo, Boolean, i0>, l<PurchasesError, i0>>> listRemove;
                r.f(hTTPResult, "result");
                if (!BackendHelperKt.isSuccessful(hTTPResult)) {
                    PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                    LogUtilsKt.errorLog(purchasesError);
                    onError(purchasesError);
                    return;
                }
                Backend backend = this;
                List<String> list = listR;
                synchronized (backend) {
                    listRemove = backend.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        s sVar = (s) it.next();
                        p pVar2 = (p) sVar.a();
                        l lVar2 = (l) sVar.b();
                        boolean z10 = hTTPResult.getResponseCode() == 201;
                        if (hTTPResult.getBody().length() > 0) {
                            pVar2.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult), Boolean.valueOf(z10));
                        } else {
                            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.UnknownError, null, 2, null);
                            LogUtilsKt.errorLog(purchasesError2);
                            lVar2.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<s<p<CustomerInfo, Boolean, i0>, l<PurchasesError, i0>>> listRemove;
                r.f(purchasesError, "error");
                Backend backend = this;
                List<String> list = listR;
                synchronized (backend) {
                    listRemove = backend.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((l) ((s) it.next()).b()).invoke(purchasesError);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback$default(this, this.identifyCallbacks, asyncCall, this.dispatcher, listR, x.a(pVar, lVar), null, 16, null);
            i0 i0Var = i0.f15558a;
        }
    }

    public final void postDiagnostics(List<? extends JSONObject> list, l<? super JSONObject, i0> lVar, p<? super PurchasesError, ? super Boolean, i0> pVar) {
        r.f(list, "diagnosticsList");
        r.f(lVar, "onSuccessHandler");
        r.f(pVar, "onErrorHandler");
        final ArrayList arrayList = new ArrayList(v.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((JSONObject) it.next()).hashCode()));
        }
        final Map mapC = q0.c(x.a("entries", new JSONArray((Collection) list)));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postDiagnostics$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, AppConfig.Companion.getDiagnosticsURL(), Endpoint.PostDiagnostics.INSTANCE, mapC, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<s<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                r.f(hTTPResult, "result");
                Backend backend = this.this$0;
                List<String> list2 = arrayList;
                synchronized (backend) {
                    listRemove = backend.getDiagnosticsCallbacks().remove(list2);
                }
                if (listRemove != null) {
                    Iterator<T> it2 = listRemove.iterator();
                    while (it2.hasNext()) {
                        s sVar = (s) it2.next();
                        l lVar2 = (l) sVar.a();
                        p pVar2 = (p) sVar.b();
                        if (BackendHelperKt.isSuccessful(hTTPResult)) {
                            lVar2.invoke(hTTPResult.getBody());
                        } else {
                            PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                            pVar2.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult.getResponseCode()) || purchasesError.getCode() == PurchasesErrorCode.NetworkError));
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<s<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                r.f(purchasesError, "error");
                Backend backend = this.this$0;
                List<String> list2 = arrayList;
                synchronized (backend) {
                    listRemove = backend.getDiagnosticsCallbacks().remove(list2);
                }
                if (listRemove != null) {
                    Iterator<T> it2 = listRemove.iterator();
                    while (it2.hasNext()) {
                        ((p) ((s) it2.next()).b()).invoke(purchasesError, Boolean.valueOf(purchasesError.getCode() == PurchasesErrorCode.NetworkError));
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.diagnosticsCallbacks, asyncCall, this.eventsDispatcher, arrayList, x.a(lVar, pVar), Delay.LONG);
            i0 i0Var = i0.f15558a;
        }
    }

    public final void postPaywallEvents(final PaywallEventRequest paywallEventRequest, a<i0> aVar, p<? super PurchasesError, ? super Boolean, i0> pVar) {
        r.f(paywallEventRequest, "paywallEventRequest");
        r.f(aVar, "onSuccessHandler");
        r.f(pVar, "onErrorHandler");
        PaywallEventRequest.Companion companion = PaywallEventRequest.Companion;
        bf.a json2 = companion.getJson();
        json2.a();
        final Map<String, Object> mapAsMap = JsonElementExtensionsKt.asMap(json2.e(companion.serializer(), paywallEventRequest));
        if (mapAsMap == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, "Error encoding paywall event request");
            LogUtilsKt.errorLog(purchasesError);
            pVar.invoke(purchasesError, Boolean.TRUE);
        } else {
            Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postPaywallEvents$call$1
                @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                public HTTPResult call() {
                    return HTTPClient.performRequest$default(this.this$0.httpClient, AppConfig.Companion.getPaywallEventsURL(), Endpoint.PostPaywallEvents.INSTANCE, mapAsMap, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
                }

                @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                public void onCompletion(HTTPResult hTTPResult) {
                    List<s<a<i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                    r.f(hTTPResult, "result");
                    Backend backend = this.this$0;
                    PaywallEventRequest paywallEventRequest2 = paywallEventRequest;
                    synchronized (backend) {
                        listRemove = backend.getPaywallEventsCallbacks().remove(paywallEventRequest2.getCacheKey());
                    }
                    if (listRemove != null) {
                        Iterator<T> it = listRemove.iterator();
                        while (it.hasNext()) {
                            s sVar = (s) it.next();
                            a aVar2 = (a) sVar.a();
                            p pVar2 = (p) sVar.b();
                            if (BackendHelperKt.isSuccessful(hTTPResult)) {
                                aVar2.invoke();
                            } else {
                                pVar2.invoke(ErrorsKt.toPurchasesError(hTTPResult), Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isSynced(hTTPResult.getResponseCode())));
                            }
                        }
                    }
                }

                @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                public void onError(PurchasesError purchasesError2) {
                    List<s<a<i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                    r.f(purchasesError2, "error");
                    Backend backend = this.this$0;
                    PaywallEventRequest paywallEventRequest2 = paywallEventRequest;
                    synchronized (backend) {
                        listRemove = backend.getPaywallEventsCallbacks().remove(paywallEventRequest2.getCacheKey());
                    }
                    if (listRemove != null) {
                        Iterator<T> it = listRemove.iterator();
                        while (it.hasNext()) {
                            ((p) ((s) it.next()).b()).invoke(purchasesError2, Boolean.FALSE);
                        }
                    }
                }
            };
            synchronized (this) {
                addCallback(this.paywallEventsCallbacks, asyncCall, this.eventsDispatcher, paywallEventRequest.getCacheKey(), x.a(aVar, pVar), Delay.LONG);
                i0 i0Var = i0.f15558a;
            }
        }
    }

    public final void postReceiptData(String str, String str2, boolean z10, boolean z11, Map<String, ? extends Map<String, ? extends Object>> map, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, PaywallPostReceiptData paywallPostReceiptData, l<? super PostReceiptResponse, i0> lVar, q<? super PurchasesError, ? super PostReceiptErrorHandlingBehavior, ? super JSONObject, i0> qVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Price price;
        LegacyProrationMode asLegacyProrationMode;
        PresentedOfferingContext.TargetingContext targetingContext;
        r.f(str, "purchaseToken");
        r.f(str2, "appUserID");
        Map<String, ? extends Map<String, ? extends Object>> map2 = map;
        r.f(map2, "subscriberAttributes");
        r.f(receiptInfo, "receiptInfo");
        r.f(postReceiptInitiationSource, "initiationSource");
        r.f(lVar, "onSuccess");
        r.f(qVar, "onError");
        final List listR = u.r(str, str2, String.valueOf(z10), String.valueOf(z11), map.toString(), receiptInfo.toString(), str3);
        s[] sVarArr = new s[18];
        sVarArr[0] = x.a(FETCH_TOKEN, str);
        sVarArr[1] = x.a("product_ids", receiptInfo.getProductIDs());
        List<PlatformProductId> platformProductIds$purchases_defaultsRelease = receiptInfo.getPlatformProductIds$purchases_defaultsRelease();
        String formatted = null;
        if (platformProductIds$purchases_defaultsRelease != null) {
            arrayList = new ArrayList(v.x(platformProductIds$purchases_defaultsRelease, 10));
            Iterator<T> it = platformProductIds$purchases_defaultsRelease.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlatformProductId) it.next()).getAsMap());
            }
        } else {
            arrayList = null;
        }
        sVarArr[2] = x.a("platform_product_ids", arrayList);
        sVarArr[3] = x.a(APP_USER_ID, str2);
        sVarArr[4] = x.a("is_restore", Boolean.valueOf(z10));
        PresentedOfferingContext presentedOfferingContext = receiptInfo.getPresentedOfferingContext();
        sVarArr[5] = x.a("presented_offering_identifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = receiptInfo.getPresentedOfferingContext();
        sVarArr[6] = x.a("presented_placement_identifier", presentedOfferingContext2 != null ? presentedOfferingContext2.getPlacementIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext3 = receiptInfo.getPresentedOfferingContext();
        sVarArr[7] = x.a("applied_targeting_rule", (presentedOfferingContext3 == null || (targetingContext = presentedOfferingContext3.getTargetingContext()) == null) ? null : r0.h(x.a("revision", Integer.valueOf(targetingContext.getRevision())), x.a("rule_id", targetingContext.getRuleId())));
        sVarArr[8] = x.a("observer_mode", Boolean.valueOf(!z11));
        sVarArr[9] = x.a(b.f7450x, receiptInfo.getPrice());
        sVarArr[10] = x.a(b.f7421a, receiptInfo.getCurrency());
        if (map.isEmpty() || this.appConfig.getCustomEntitlementComputation()) {
            map2 = null;
        }
        sVarArr[11] = x.a("attributes", map2);
        sVarArr[12] = x.a("normal_duration", receiptInfo.getDuration());
        sVarArr[13] = x.a("store_user_id", str3);
        List<PricingPhase> pricingPhases = receiptInfo.getPricingPhases();
        if (pricingPhases != null) {
            arrayList2 = new ArrayList(v.x(pricingPhases, 10));
            Iterator<T> it2 = pricingPhases.iterator();
            while (it2.hasNext()) {
                arrayList2.add(BackendKt.toMap((PricingPhase) it2.next()));
            }
        } else {
            arrayList2 = null;
        }
        sVarArr[14] = x.a("pricing_phases", arrayList2);
        ReplacementMode replacementMode = receiptInfo.getReplacementMode();
        GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
        sVarArr[15] = x.a("proration_mode", (googleReplacementMode == null || (asLegacyProrationMode = BackendKt.getAsLegacyProrationMode(googleReplacementMode)) == null) ? null : asLegacyProrationMode.name());
        sVarArr[16] = x.a("initiation_source", postReceiptInitiationSource.getPostReceiptFieldValue());
        sVarArr[17] = x.a("paywall", paywallPostReceiptData != null ? paywallPostReceiptData.toMap() : null);
        final Map mapFilterNotNullValues = MapExtensionsKt.filterNotNullValues(r0.h(sVarArr));
        final List listP = u.p(x.a(APP_USER_ID, str2), x.a(FETCH_TOKEN, str));
        s[] sVarArr2 = new s[2];
        StoreProduct storeProduct = receiptInfo.getStoreProduct();
        if (storeProduct != null && (price = storeProduct.getPrice()) != null) {
            formatted = price.getFormatted();
        }
        sVarArr2[0] = x.a("price_string", formatted);
        sVarArr2[1] = x.a(b.f7439m, str4);
        final Map mapFilterNotNullValues2 = MapExtensionsKt.filterNotNullValues(r0.h(sVarArr2));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postReceiptData$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), Endpoint.PostReceipt.INSTANCE, mapFilterNotNullValues, listP, r0.l(this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), mapFilterNotNullValues2), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<s<l<PostReceiptResponse, i0>, q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0>>> listRemove;
                r.f(hTTPResult, "result");
                Backend backend = this.this$0;
                List<String> list = listR;
                synchronized (backend) {
                    listRemove = backend.getPostReceiptCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Backend backend2 = this.this$0;
                    Iterator<T> it3 = listRemove.iterator();
                    while (it3.hasNext()) {
                        s sVar = (s) it3.next();
                        l lVar2 = (l) sVar.a();
                        q qVar2 = (q) sVar.b();
                        try {
                            if (BackendHelperKt.isSuccessful(hTTPResult)) {
                                lVar2.invoke(PostReceiptResponseKt.buildPostReceiptResponse(hTTPResult));
                            } else {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                                LogUtilsKt.errorLog(purchasesError);
                                qVar2.invoke(purchasesError, backend2.determinePostReceiptErrorHandlingBehavior(hTTPResult.getResponseCode(), purchasesError), hTTPResult.getBody());
                            }
                        } catch (JSONException e10) {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e10);
                            LogUtilsKt.errorLog(purchasesError2);
                            qVar2.invoke(purchasesError2, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<s<l<PostReceiptResponse, i0>, q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0>>> listRemove;
                r.f(purchasesError, "error");
                Backend backend = this.this$0;
                List<String> list = listR;
                synchronized (backend) {
                    listRemove = backend.getPostReceiptCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it3 = listRemove.iterator();
                    while (it3.hasNext()) {
                        ((q) ((s) it3.next()).b()).invoke(purchasesError, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback$default(this, this.postReceiptCallbacks, asyncCall, this.dispatcher, listR, x.a(lVar, qVar), null, 16, null);
            i0 i0Var = i0.f15558a;
        }
    }

    public final void postRedeemWebPurchase(String str, String str2, l<? super RedeemWebPurchaseListener.Result, i0> lVar) {
        r.f(str, "appUserID");
        r.f(str2, "redemptionToken");
        r.f(lVar, "onResultHandler");
        final Endpoint.PostRedeemWebPurchase postRedeemWebPurchase = Endpoint.PostRedeemWebPurchase.INSTANCE;
        final String path = postRedeemWebPurchase.getPath();
        final Map mapH = r0.h(x.a("redemption_token", str2), x.a(APP_USER_ID, str));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postRedeemWebPurchase$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), postRedeemWebPurchase, mapH, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<l<RedeemWebPurchaseListener.Result, i0>> listRemove;
                RedeemWebPurchaseListener.Result error;
                r.f(hTTPResult, "result");
                Backend backend = this.this$0;
                String str3 = path;
                synchronized (backend) {
                    listRemove = backend.getRedeemWebPurchaseCallbacks().remove(str3);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        l lVar2 = (l) it.next();
                        if (BackendHelperKt.isSuccessful(hTTPResult)) {
                            error = new RedeemWebPurchaseListener.Result.Success(CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult));
                        } else {
                            Integer backendErrorCode = hTTPResult.getBackendErrorCode();
                            int value = BackendErrorCode.BackendInvalidWebRedemptionToken.getValue();
                            if (backendErrorCode != null && backendErrorCode.intValue() == value) {
                                error = RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE;
                            } else {
                                int value2 = BackendErrorCode.BackendExpiredWebRedemptionToken.getValue();
                                if (backendErrorCode != null && backendErrorCode.intValue() == value2) {
                                    JSONObject body = hTTPResult.getBody();
                                    JSONObject jSONObjectOptJSONObject = body.optJSONObject("purchase_redemption_error_info");
                                    String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("obfuscated_email") : null;
                                    if (strOptString == null) {
                                        LogUtilsKt.errorLog$default("Error parsing expired redemption token response: " + body, null, 2, null);
                                        error = new RedeemWebPurchaseListener.Result.Error(ErrorsKt.toPurchasesError(hTTPResult));
                                    } else {
                                        error = new RedeemWebPurchaseListener.Result.Expired(strOptString);
                                    }
                                } else {
                                    error = (backendErrorCode != null && backendErrorCode.intValue() == BackendErrorCode.BackendPurchaseBelongsToOtherUser.getValue()) ? RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE : new RedeemWebPurchaseListener.Result.Error(ErrorsKt.toPurchasesError(hTTPResult));
                                }
                            }
                        }
                        lVar2.invoke(error);
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<l<RedeemWebPurchaseListener.Result, i0>> listRemove;
                r.f(purchasesError, "error");
                Backend backend = this.this$0;
                String str3 = path;
                synchronized (backend) {
                    listRemove = backend.getRedeemWebPurchaseCallbacks().remove(str3);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).invoke(new RedeemWebPurchaseListener.Result.Error(purchasesError));
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.redeemWebPurchaseCallbacks, asyncCall, this.dispatcher, path, lVar, Delay.NONE);
            i0 i0Var = i0.f15558a;
        }
    }

    public final synchronized void setCallbacks(Map<BackgroundAwareCallbackCacheKey, List<s<l<CustomerInfo, i0>, p<PurchasesError, Boolean, i0>>>> map) {
        r.f(map, "<set-?>");
        this.callbacks = map;
    }

    public final synchronized void setCustomerCenterCallbacks(Map<String, List<s<l<CustomerCenterConfigData, i0>, l<PurchasesError, i0>>>> map) {
        r.f(map, "<set-?>");
        this.customerCenterCallbacks = map;
    }

    public final synchronized void setDiagnosticsCallbacks(Map<List<String>, List<s<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>>> map) {
        r.f(map, "<set-?>");
        this.diagnosticsCallbacks = map;
    }

    public final synchronized void setIdentifyCallbacks(Map<List<String>, List<s<p<CustomerInfo, Boolean, i0>, l<PurchasesError, i0>>>> map) {
        r.f(map, "<set-?>");
        this.identifyCallbacks = map;
    }

    public final synchronized void setOfferingsCallbacks(Map<BackgroundAwareCallbackCacheKey, List<s<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>>> map) {
        r.f(map, "<set-?>");
        this.offeringsCallbacks = map;
    }

    public final synchronized void setPaywallEventsCallbacks(Map<List<String>, List<s<a<i0>, p<PurchasesError, Boolean, i0>>>> map) {
        r.f(map, "<set-?>");
        this.paywallEventsCallbacks = map;
    }

    public final synchronized void setPostReceiptCallbacks(Map<List<String>, List<s<l<PostReceiptResponse, i0>, q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0>>>> map) {
        r.f(map, "<set-?>");
        this.postReceiptCallbacks = map;
    }

    public final synchronized void setProductEntitlementCallbacks(Map<String, List<s<l<ProductEntitlementMapping, i0>, l<PurchasesError, i0>>>> map) {
        r.f(map, "<set-?>");
        this.productEntitlementCallbacks = map;
    }

    public final synchronized void setRedeemWebPurchaseCallbacks(Map<String, List<l<RedeemWebPurchaseListener.Result, i0>>> map) {
        r.f(map, "<set-?>");
        this.redeemWebPurchaseCallbacks = map;
    }
}
