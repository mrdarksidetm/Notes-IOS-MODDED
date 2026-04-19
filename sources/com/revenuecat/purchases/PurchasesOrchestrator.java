package com.revenuecat.purchases;

import ae.d0;
import ae.h0;
import ae.j;
import ae.r;
import ae.s;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.n;
import com.revenuecat.purchases.PurchasesOrchestrator;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.deeplinks.WebPurchaseRedemptionHelper;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEventsManager;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.strings.SyncAttributesAndOfferingsStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CustomActivityLifecycleHandler;
import com.revenuecat.purchases.utils.RateLimiter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import je.w;
import ke.a;
import ke.c;
import ke.d;
import md.i0;
import md.l;
import md.x;
import nd.c0;
import nd.q0;
import nd.r0;
import nd.u;
import nd.x0;
import nd.y0;
import pd.b;
import v6.m;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesOrchestrator implements LifecycleDelegate, CustomActivityLifecycleHandler {
    public static final String frameworkVersion = "8.10.5";
    private static URL proxyURL;
    private AppConfig appConfig;
    private final Application application;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final DiagnosticsSynchronizer diagnosticsSynchronizer;
    private final Dispatcher dispatcher;
    private final IdentityManager identityManager;
    private final PurchasesConfiguration initialConfiguration;
    private final RateLimiter lastSyncAttributesAndOfferingsRateLimiter;
    private final l lifecycleHandler$delegate;
    private final Handler mainHandler;
    private final OfferingsManager offeringsManager;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallEventsManager paywallEventsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;
    private final PostReceiptHelper postReceiptHelper;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;
    private final PurchasesStateCache purchasesStateCache;
    private String storefrontCountryCode;
    private final SubscriberAttributesManager subscriberAttributesManager;
    private final SyncPurchasesHelper syncPurchasesHelper;
    private final WebPurchaseRedemptionHelper webPurchaseRedemptionHelper;
    public static final Companion Companion = new Companion(null);
    private static PlatformInfo platformInfo = new PlatformInfo("native", null);

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements zd.a<i0> {
        AnonymousClass2() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            n.l().getLifecycle().a(PurchasesOrchestrator.this.getLifecycleHandler());
            PurchasesOrchestrator.this.application.registerActivityLifecycleCallbacks(PurchasesOrchestrator.this);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                list = u.m();
            }
            companion.canMakePayments(context, list, callback);
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
            r.f(context, "context");
            r.f(list, "features");
            r.f(callback, "callback");
            com.android.billingclient.api.a aVarA = com.android.billingclient.api.a.h(context).b().d(new m() { // from class: gb.f
                @Override // v6.m
                public final void onPurchasesUpdated(com.android.billingclient.api.e eVar, List list2) {
                    r.f(eVar, "<anonymous parameter 0>");
                }
            }).a();
            aVarA.m(new PurchasesOrchestrator$Companion$canMakePayments$2$1(new Handler(context.getMainLooper()), new AtomicBoolean(false), callback, aVarA, list));
        }

        public final boolean getDebugLogsEnabled() {
            return LogUtilsKt.getDebugLogsEnabled(getLogLevel());
        }

        public final synchronized LogHandler getLogHandler() {
            return LogWrapperKt.getCurrentLogHandler();
        }

        public final LogLevel getLogLevel() {
            return Config.INSTANCE.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.platformInfo;
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.proxyURL;
        }

        public final void setDebugLogsEnabled(boolean z10) {
            setLogLevel(LogUtilsKt.debugLogsEnabled(LogLevel.Companion, z10));
        }

        public final synchronized void setLogHandler(LogHandler logHandler) {
            r.f(logHandler, "value");
            LogWrapperKt.setCurrentLogHandler(logHandler);
        }

        public final void setLogLevel(LogLevel logLevel) {
            r.f(logLevel, "value");
            Config.INSTANCE.setLogLevel(logLevel);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            r.f(platformInfo, "<set-?>");
            PurchasesOrchestrator.platformInfo = platformInfo;
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.proxyURL = url;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$close$2, reason: invalid class name and case insensitive filesystem */
    static final class C05212 extends s implements zd.a<i0> {
        C05212() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            n.l().getLifecycle().c(PurchasesOrchestrator.this.getLifecycleHandler());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$dispatch$1, reason: invalid class name and case insensitive filesystem */
    static final class C05221 extends s implements zd.a<i0> {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ PurchaseErrorCallback $this_dispatch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05221(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
            super(0);
            this.$this_dispatch = purchaseErrorCallback;
            this.$error = purchasesError;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PurchaseErrorCallback purchaseErrorCallback = this.$this_dispatch;
            PurchasesError purchasesError = this.$error;
            purchaseErrorCallback.onError(purchasesError, purchasesError.getCode() == PurchasesErrorCode.PurchaseCancelledError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getAmazonLWAConsentStatus$1, reason: invalid class name and case insensitive filesystem */
    static final class C05231 extends s implements zd.l<AmazonLWAConsentStatus, i0> {
        final /* synthetic */ GetAmazonLWAConsentStatusCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05231(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
            super(1);
            this.$callback = getAmazonLWAConsentStatusCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(AmazonLWAConsentStatus amazonLWAConsentStatus) {
            invoke2(amazonLWAConsentStatus);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AmazonLWAConsentStatus amazonLWAConsentStatus) {
            r.f(amazonLWAConsentStatus, "it");
            this.$callback.onSuccess(amazonLWAConsentStatus);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getAmazonLWAConsentStatus$2, reason: invalid class name and case insensitive filesystem */
    static final class C05242 extends s implements zd.l<PurchasesError, i0> {
        final /* synthetic */ GetAmazonLWAConsentStatusCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05242(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
            super(1);
            this.$callback = getAmazonLWAConsentStatusCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$callback.onError(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getCustomerCenterConfig$1, reason: invalid class name and case insensitive filesystem */
    static final class C05251 extends s implements zd.l<CustomerCenterConfigData, i0> {
        final /* synthetic */ GetCustomerCenterConfigCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05251(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
            super(1);
            this.$callback = getCustomerCenterConfigCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerCenterConfigData customerCenterConfigData) {
            invoke2(customerCenterConfigData);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerCenterConfigData customerCenterConfigData) {
            r.f(customerCenterConfigData, "config");
            this.$callback.onSuccess(customerCenterConfigData);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getCustomerCenterConfig$2, reason: invalid class name and case insensitive filesystem */
    static final class C05262 extends s implements zd.l<PurchasesError, i0> {
        final /* synthetic */ GetCustomerCenterConfigCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05262(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
            super(1);
            this.$callback = getCustomerCenterConfigCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "error");
            this.$callback.onError(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getOfferings$1, reason: invalid class name and case insensitive filesystem */
    static final class C05271 extends s implements zd.l<PurchasesError, i0> {
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05271(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$listener = receiveOfferingsCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$listener.onError(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getOfferings$2, reason: invalid class name and case insensitive filesystem */
    static final class C05282 extends s implements zd.l<Offerings, i0> {
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05282(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$listener = receiveOfferingsCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Offerings offerings) {
            invoke2(offerings);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Offerings offerings) {
            r.f(offerings, "it");
            this.$listener.onReceived(offerings);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements zd.l<CustomerInfo, i0> {
        final /* synthetic */ LogInCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements zd.a<i0> {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LogInCallback logInCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = logInCallback;
                this.$customerInfo = customerInfo;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onReceived(this.$customerInfo, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            r.f(customerInfo, "customerInfo");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, customerInfo));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$4, reason: invalid class name */
    static final class AnonymousClass4 extends s implements zd.l<PurchasesError, i0> {
        final /* synthetic */ LogInCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements zd.a<i0> {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LogInCallback logInCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = logInCallback;
                this.$error = purchasesError;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onError(this.$error);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "error");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logOut$1, reason: invalid class name and case insensitive filesystem */
    static final class C05311 extends s implements zd.l<PurchasesError, i0> {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05311(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesOrchestrator purchasesOrchestrator) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
            this.this$0 = purchasesOrchestrator;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError != null) {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(purchasesError);
                    return;
                }
                return;
            }
            PurchasesOrchestrator purchasesOrchestrator = this.this$0;
            synchronized (purchasesOrchestrator) {
                PurchasesState state$purchases_defaultsRelease = purchasesOrchestrator.getState$purchases_defaultsRelease();
                Map mapEmptyMap = Collections.emptyMap();
                r.e(mapEmptyMap, "emptyMap()");
                purchasesOrchestrator.setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, null, mapEmptyMap, null, false, false, 29, null));
                i0 i0Var = i0.f15558a;
            }
            PurchasesOrchestrator purchasesOrchestrator2 = this.this$0;
            purchasesOrchestrator2.updateAllCaches(purchasesOrchestrator2.identityManager.getCurrentAppUserID(), this.$callback);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$onAppForegrounded$2, reason: invalid class name and case insensitive filesystem */
    static final class C05322 extends s implements zd.a<i0> {
        final /* synthetic */ d0 $firstTimeInForeground;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05322(d0 d0Var) {
            super(0);
            this.$firstTimeInForeground = d0Var;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DiagnosticsSynchronizer diagnosticsSynchronizer;
            if (PurchasesOrchestrator.this.shouldRefreshCustomerInfo(this.$firstTimeInForeground.f699a)) {
                LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
                CustomerInfoHelper.retrieveCustomerInfo$default(PurchasesOrchestrator.this.customerInfoHelper, PurchasesOrchestrator.this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.FETCH_CURRENT, false, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, 16, null);
            }
            PurchasesOrchestrator.this.offeringsManager.onAppForeground(PurchasesOrchestrator.this.identityManager.getCurrentAppUserID());
            PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(PurchasesOrchestrator.this.postPendingTransactionsHelper, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, null, 6, null);
            PurchasesOrchestrator.this.synchronizeSubscriberAttributesIfNeeded();
            OfflineEntitlementsManager.updateProductEntitlementMappingCacheIfStale$default(PurchasesOrchestrator.this.getOfflineEntitlementsManager(), null, 1, null);
            PurchasesOrchestrator.this.flushPaywallEvents();
            if (this.$firstTimeInForeground.f699a && AndroidVersionUtilsKt.isAndroidNOrNewer() && (diagnosticsSynchronizer = PurchasesOrchestrator.this.diagnosticsSynchronizer) != null) {
                diagnosticsSynchronizer.syncDiagnosticsFileIfNeeded();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$2, reason: invalid class name and case insensitive filesystem */
    static final class C05332 extends s implements zd.l<StoreTransaction, i0> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
        final /* synthetic */ Boolean $isPersonalizedPrice;
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ h0<String> $previousProductId;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05332(h0<String> h0Var, PurchasesOrchestrator purchasesOrchestrator, Activity activity, String str, PurchasingData purchasingData, GoogleReplacementMode googleReplacementMode, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
            super(1);
            this.$previousProductId = h0Var;
            this.this$0 = purchasesOrchestrator;
            this.$activity = activity;
            this.$appUserID = str;
            this.$purchasingData = purchasingData;
            this.$googleReplacementMode = googleReplacementMode;
            this.$presentedOfferingContext = presentedOfferingContext;
            this.$isPersonalizedPrice = bool;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction) {
            invoke2(storeTransaction);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StoreTransaction storeTransaction) {
            r.f(storeTransaction, "purchaseRecord");
            LogIntent logIntent = LogIntent.PURCHASE;
            String str = String.format(PurchaseStrings.FOUND_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$previousProductId.f712a}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            this.this$0.billing.makePurchaseAsync(this.$activity, this.$appUserID, this.$purchasingData, new ReplaceProductInfo(storeTransaction, this.$googleReplacementMode), this.$presentedOfferingContext, this.$isPersonalizedPrice);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3, reason: invalid class name and case insensitive filesystem */
    static final class C05343 extends s implements zd.l<PurchasesError, i0> {
        final /* synthetic */ PurchaseErrorCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05343(PurchaseErrorCallback purchaseErrorCallback) {
            super(1);
            this.$listener = purchaseErrorCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "error");
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, purchasesError.toString());
            PurchasesOrchestrator.this.getAndClearProductChangeCallback();
            PurchasesOrchestrator.this.getAndClearAllPurchaseCallbacks();
            PurchasesOrchestrator.this.dispatch(this.$listener, purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C05351 extends s implements zd.l<List<? extends StoreTransaction>, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05351(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, String str) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
            this.$appUserID = str;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreTransaction> list) {
            invoke2((List<StoreTransaction>) list);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<StoreTransaction> list) {
            r.f(list, "allPurchases");
            if (list.isEmpty()) {
                PurchasesOrchestrator.this.getCustomerInfo(this.$callback);
                return;
            }
            List<StoreTransaction> listU0 = c0.u0(list, new Comparator() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return b.a(Long.valueOf(((StoreTransaction) t10).getPurchaseTime()), Long.valueOf(((StoreTransaction) t11).getPurchaseTime()));
                }
            });
            PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
            String str = this.$appUserID;
            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            for (StoreTransaction storeTransaction : listU0) {
                purchasesOrchestrator.postReceiptHelper.postTransactionAndConsumeIfNeeded(storeTransaction, null, true, str, PostReceiptInitiationSource.RESTORE, new PurchasesOrchestrator$restorePurchases$1$2$1$1(storeTransaction, listU0, purchasesOrchestrator, receiveCustomerInfoCallback), new PurchasesOrchestrator$restorePurchases$1$2$1$2(storeTransaction, listU0, purchasesOrchestrator, receiveCustomerInfoCallback));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$2, reason: invalid class name and case insensitive filesystem */
    static final class C05362 extends s implements zd.l<PurchasesError, i0> {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements zd.a<i0> {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$error = purchasesError;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$callback.onError(this.$error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05362(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "error");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$showInAppMessagesIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C05371 extends s implements zd.a<i0> {
        C05371() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PurchasesOrchestrator.syncPurchases$default(PurchasesOrchestrator.this, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$3, reason: invalid class name and case insensitive filesystem */
    static final class C05383 extends s implements zd.l<String, i0> {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ String $isoCurrencyCode;
        final /* synthetic */ Double $price;
        final /* synthetic */ String $receiptID;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements zd.l<CustomerInfo, i0> {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
                invoke2(customerInfo);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo customerInfo) {
                r.f(customerInfo, "it");
                String str = String.format(PurchaseStrings.PURCHASE_SYNCED_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID}, 2));
                r.e(str, "format(this, *args)");
                LogWrapperKt.log(LogIntent.PURCHASE, str);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends s implements zd.l<PurchasesError, i0> {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                String str = String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID, purchasesError}, 3));
                r.e(str, "format(this, *args)");
                LogWrapperKt.log(LogIntent.RC_ERROR, str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05383(Double d10, String str, PurchasesOrchestrator purchasesOrchestrator, String str2, String str3, String str4) {
            super(1);
            this.$price = d10;
            this.$isoCurrencyCode = str;
            this.this$0 = purchasesOrchestrator;
            this.$receiptID = str2;
            this.$amazonUserID = str3;
            this.$appUserID = str4;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(String str) {
            invoke2(str);
            return i0.f15558a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2(java.lang.String r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.String r1 = "normalizedProductID"
                r2 = r23
                ae.r.f(r2, r1)
                java.util.List r3 = nd.s.d(r23)
                java.lang.Double r1 = r0.$price
                r2 = 0
                if (r1 == 0) goto L23
                double r4 = r1.doubleValue()
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L1e
                r4 = 1
                goto L1f
            L1e:
                r4 = 0
            L1f:
                if (r4 != 0) goto L23
                r7 = r1
                goto L24
            L23:
                r7 = r2
            L24:
                java.lang.String r1 = r0.$isoCurrencyCode
                if (r1 == 0) goto L30
                boolean r4 = je.m.v(r1)
                if (r4 != 0) goto L30
                r8 = r1
                goto L31
            L30:
                r8 = r2
            L31:
                r9 = 0
                r10 = 78
                r11 = 0
                com.revenuecat.purchases.common.ReceiptInfo r15 = new com.revenuecat.purchases.common.ReceiptInfo
                r4 = 0
                r5 = 0
                r6 = 0
                r2 = r15
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                com.revenuecat.purchases.PurchasesOrchestrator r1 = r0.this$0
                com.revenuecat.purchases.PostReceiptHelper r12 = com.revenuecat.purchases.PurchasesOrchestrator.access$getPostReceiptHelper$p(r1)
                java.lang.String r13 = r0.$receiptID
                java.lang.String r14 = r0.$amazonUserID
                com.revenuecat.purchases.PurchasesOrchestrator r1 = r0.this$0
                boolean r16 = r1.getAllowSharingPlayStoreAccount()
                java.lang.String r1 = r0.$appUserID
                r18 = 0
                com.revenuecat.purchases.PostReceiptInitiationSource r19 = com.revenuecat.purchases.PostReceiptInitiationSource.RESTORE
                com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$3$1 r2 = new com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$3$1
                java.lang.String r3 = r0.$receiptID
                java.lang.String r4 = r0.$amazonUserID
                r2.<init>(r3, r4)
                com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$3$2 r3 = new com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$3$2
                java.lang.String r4 = r0.$receiptID
                java.lang.String r5 = r0.$amazonUserID
                r3.<init>(r4, r5)
                r17 = r1
                r20 = r2
                r21 = r3
                r12.postTokenWithoutConsuming(r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator.C05383.invoke2(java.lang.String):void");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAmazonPurchase$4, reason: invalid class name and case insensitive filesystem */
    static final class C05394 extends s implements zd.l<PurchasesError, i0> {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $receiptID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05394(String str, String str2) {
            super(1);
            this.$receiptID = str;
            this.$amazonUserID = str2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "error");
            String str = String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID, purchasesError}, 3));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(LogIntent.RC_ERROR, str);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C05401 extends s implements zd.a<i0> {
        final /* synthetic */ PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 $receiveOfferingsCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05401(PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1) {
            super(0);
            this.$receiveOfferingsCallback = purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PurchasesOrchestrator.this.getOfferings(this.$receiveOfferingsCallback, true);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C05411 extends s implements zd.l<CustomerInfo, i0> {
        final /* synthetic */ SyncPurchasesCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05411(SyncPurchasesCallback syncPurchasesCallback) {
            super(1);
            this.$listener = syncPurchasesCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            r.f(customerInfo, "it");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onSuccess(customerInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncPurchases$2, reason: invalid class name and case insensitive filesystem */
    static final class C05422 extends s implements zd.l<PurchasesError, i0> {
        final /* synthetic */ SyncPurchasesCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05422(SyncPurchasesCallback syncPurchasesCallback) {
            super(1);
            this.$listener = syncPurchasesCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onError(purchasesError);
            }
        }
    }

    public PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billingAbstract, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, PaywallEventsManager paywallEventsManager, PaywallPresentedCache paywallPresentedCache, PurchasesStateCache purchasesStateCache, Handler handler, Dispatcher dispatcher, PurchasesConfiguration purchasesConfiguration, WebPurchaseRedemptionHelper webPurchaseRedemptionHelper) {
        r.f(application, "application");
        r.f(backend, "backend");
        r.f(billingAbstract, "billing");
        r.f(deviceCache, "deviceCache");
        r.f(identityManager, "identityManager");
        r.f(subscriberAttributesManager, "subscriberAttributesManager");
        r.f(appConfig, "appConfig");
        r.f(customerInfoHelper, "customerInfoHelper");
        r.f(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        r.f(offlineEntitlementsManager, "offlineEntitlementsManager");
        r.f(postReceiptHelper, "postReceiptHelper");
        r.f(postTransactionWithProductDetailsHelper, "postTransactionWithProductDetailsHelper");
        r.f(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        r.f(syncPurchasesHelper, "syncPurchasesHelper");
        r.f(offeringsManager, "offeringsManager");
        r.f(paywallPresentedCache, "paywallPresentedCache");
        r.f(purchasesStateCache, "purchasesStateCache");
        r.f(dispatcher, "dispatcher");
        r.f(purchasesConfiguration, "initialConfiguration");
        r.f(webPurchaseRedemptionHelper, "webPurchaseRedemptionHelper");
        this.application = application;
        this.backend = backend;
        this.billing = billingAbstract;
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.appConfig = appConfig;
        this.customerInfoHelper = customerInfoHelper;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.diagnosticsSynchronizer = diagnosticsSynchronizer;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.postReceiptHelper = postReceiptHelper;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.syncPurchasesHelper = syncPurchasesHelper;
        this.offeringsManager = offeringsManager;
        this.paywallEventsManager = paywallEventsManager;
        this.paywallPresentedCache = paywallPresentedCache;
        this.purchasesStateCache = purchasesStateCache;
        this.mainHandler = handler;
        this.dispatcher = dispatcher;
        this.initialConfiguration = purchasesConfiguration;
        this.webPurchaseRedemptionHelper = webPurchaseRedemptionHelper;
        this.lifecycleHandler$delegate = md.n.b(new PurchasesOrchestrator$lifecycleHandler$2(this));
        a.C0337a c0337a = ke.a.f14459b;
        this.lastSyncAttributesAndOfferingsRateLimiter = new RateLimiter(5, c.s(60, d.f14469e), null);
        identityManager.configure(str);
        billingAbstract.setStateListener(new BillingAbstract.StateListener() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.1
            @Override // com.revenuecat.purchases.common.BillingAbstract.StateListener
            public void onConnected() {
                PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(PurchasesOrchestrator.this.postPendingTransactionsHelper, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, null, 6, null);
                PurchasesOrchestrator.this.billing.getStorefront(new PurchasesOrchestrator$1$onConnected$1(PurchasesOrchestrator.this), PurchasesOrchestrator$1$onConnected$2.INSTANCE);
            }
        });
        billingAbstract.setPurchasesUpdatedListener(getPurchasesUpdatedListener());
        BillingAbstract.startConnectionOnMainThread$default(billingAbstract, 0L, 1, null);
        dispatch(new AnonymousClass2());
        if (this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            return;
        }
        LogWrapperKt.log(LogIntent.WARNING, ConfigureStrings.AUTO_SYNC_PURCHASES_DISABLED);
    }

    public /* synthetic */ PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billingAbstract, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, PaywallEventsManager paywallEventsManager, PaywallPresentedCache paywallPresentedCache, PurchasesStateCache purchasesStateCache, Handler handler, Dispatcher dispatcher, PurchasesConfiguration purchasesConfiguration, WebPurchaseRedemptionHelper webPurchaseRedemptionHelper, int i10, j jVar) {
        this(application, str, backend, billingAbstract, deviceCache, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, paywallEventsManager, paywallPresentedCache, purchasesStateCache, (i10 & 1048576) != 0 ? new Handler(Looper.getMainLooper()) : handler, dispatcher, purchasesConfiguration, (i10 & 8388608) != 0 ? new WebPurchaseRedemptionHelper(backend, identityManager, offlineEntitlementsManager, customerInfoUpdateHandler, null, 16, null) : webPurchaseRedemptionHelper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
        dispatch(new C05221(purchaseErrorCallback, purchasesError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(final zd.a<i0> aVar) {
        if (r.b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new Runnable() { // from class: gb.e
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesOrchestrator.dispatch$lambda$17(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$17(zd.a aVar) {
        r.f(aVar, "$tmp0");
        aVar.invoke();
    }

    private final void enqueue(final zd.a<i0> aVar) {
        this.dispatcher.enqueue(new Runnable() { // from class: gb.d
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesOrchestrator.enqueue$lambda$12(aVar);
            }
        }, Delay.NONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$12(zd.a aVar) {
        r.f(aVar, "$command");
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushPaywallEvents() {
        PaywallEventsManager paywallEventsManager;
        if (!AndroidVersionUtilsKt.isAndroidNOrNewer() || (paywallEventsManager = this.paywallEventsManager) == null) {
            return;
        }
        paywallEventsManager.flushEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PurchaseCallback> getAndClearAllPurchaseCallbacks() {
        List<PurchaseCallback> listC0;
        synchronized (this) {
            Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId();
            PurchasesState state$purchases_defaultsRelease = getState$purchases_defaultsRelease();
            Map mapEmptyMap = Collections.emptyMap();
            r.e(mapEmptyMap, "emptyMap()");
            setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, null, mapEmptyMap, null, false, false, 29, null));
            listC0 = c0.C0(purchaseCallbacksByProductId.values());
        }
        return listC0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductChangeCallback getAndClearProductChangeCallback() {
        ProductChangeCallback deprecatedProductChangeCallback = getState$purchases_defaultsRelease().getDeprecatedProductChangeCallback();
        setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, null, null, false, false, 27, null));
        return deprecatedProductChangeCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppLifecycleHandler getLifecycleHandler() {
        return (AppLifecycleHandler) this.lifecycleHandler$delegate.getValue();
    }

    public static /* synthetic */ void getOfferings$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveOfferingsCallback receiveOfferingsCallback, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        purchasesOrchestrator.getOfferings(receiveOfferingsCallback, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<p<StoreTransaction, CustomerInfo, i0>, p<StoreTransaction, PurchasesError, i0>> getProductChangeCompletedCallbacks(ProductChangeCallback productChangeCallback) {
        return new Pair<>(new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1(productChangeCallback, this), new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onError$1(productChangeCallback, this));
    }

    public static /* synthetic */ void getProducts$default(PurchasesOrchestrator purchasesOrchestrator, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        purchasesOrchestrator.getProducts(list, productType, getStoreProductsCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getProductsOfTypes(Set<String> set, Set<? extends ProductType> set2, List<? extends StoreProduct> list, GetStoreProductsCallback getStoreProductsCallback) {
        Set setG0 = c0.G0(set2);
        ProductType productType = (ProductType) c0.Z(setG0);
        i0 i0Var = null;
        if (productType != null) {
            setG0.remove(productType);
        } else {
            productType = null;
        }
        if (productType != null) {
            this.billing.queryProductDetailsAsync(productType, set, new PurchasesOrchestrator$getProductsOfTypes$1$1(this, set, setG0, list, getStoreProductsCallback), new PurchasesOrchestrator$getProductsOfTypes$1$2(this, getStoreProductsCallback));
            i0Var = i0.f15558a;
        }
        if (i0Var == null) {
            getStoreProductsCallback.onReceived(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchaseCallback getPurchaseCallback(String str) {
        PurchaseCallback purchaseCallback = getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId().get(str);
        PurchasesState state$purchases_defaultsRelease = getState$purchases_defaultsRelease();
        Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PurchaseCallback> entry : purchaseCallbacksByProductId.entrySet()) {
            if (!r.b(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, null, linkedHashMap, null, false, false, 29, null));
        return purchaseCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<p<StoreTransaction, CustomerInfo, i0>, p<StoreTransaction, PurchasesError, i0>> getPurchaseCompletedCallbacks() {
        return new Pair<>(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(this), new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onError$1(this));
    }

    private final BillingAbstract.PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return new BillingAbstract.PurchasesUpdatedListener() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.getPurchasesUpdatedListener.1
            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesFailedToUpdate(PurchasesError purchasesError) {
                i0 i0Var;
                r.f(purchasesError, "purchasesError");
                PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
                synchronized (purchasesOrchestrator) {
                    ProductChangeCallback andClearProductChangeCallback = purchasesOrchestrator.getAndClearProductChangeCallback();
                    if (andClearProductChangeCallback != null) {
                        purchasesOrchestrator.dispatch(andClearProductChangeCallback, purchasesError);
                        i0Var = i0.f15558a;
                    } else {
                        i0Var = null;
                    }
                    if (i0Var == null) {
                        Iterator it = purchasesOrchestrator.getAndClearAllPurchaseCallbacks().iterator();
                        while (it.hasNext()) {
                            purchasesOrchestrator.dispatch((PurchaseCallback) it.next(), purchasesError);
                        }
                    }
                    i0 i0Var2 = i0.f15558a;
                }
            }

            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesUpdated(List<StoreTransaction> list) {
                Pair productChangeCompletedCallbacks;
                r.f(list, "purchases");
                PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
                synchronized (purchasesOrchestrator) {
                    productChangeCompletedCallbacks = purchasesOrchestrator.getState$purchases_defaultsRelease().getDeprecatedProductChangeCallback() != null ? purchasesOrchestrator.getProductChangeCompletedCallbacks(purchasesOrchestrator.getAndClearProductChangeCallback()) : purchasesOrchestrator.getPurchaseCompletedCallbacks();
                    i0 i0Var = i0.f15558a;
                }
                PurchasesOrchestrator.this.postTransactionWithProductDetailsHelper.postTransactions(list, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), PurchasesOrchestrator.this.getAppUserID(), PostReceiptInitiationSource.PURCHASE, (p) productChangeCompletedCallbacks.first, (p) productChangeCompletedCallbacks.second);
                PurchasesOrchestrator.this.flushPaywallEvents();
            }
        };
    }

    public static /* synthetic */ void logIn$default(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logInCallback = null;
        }
        purchasesOrchestrator.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.logOut(receiveCustomerInfoCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.String] */
    private final void replaceOldPurchaseWithNewProduct(PurchasingData purchasingData, String str, GoogleReplacementMode googleReplacementMode, Activity activity, String str2, PresentedOfferingContext presentedOfferingContext, Boolean bool, PurchaseErrorCallback purchaseErrorCallback) {
        ProductType productType = purchasingData.getProductType();
        ProductType productType2 = ProductType.SUBS;
        if (productType != productType2) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            ProductChangeCallback andClearProductChangeCallback = getAndClearProductChangeCallback();
            if (andClearProductChangeCallback != null) {
                dispatch(andClearProductChangeCallback, purchasesError);
            }
            Iterator<T> it = getAndClearAllPurchaseCallbacks().iterator();
            while (it.hasNext()) {
                dispatch((PurchaseCallback) it.next(), purchasesError);
            }
            return;
        }
        h0 h0Var = new h0();
        h0Var.f712a = str;
        if (w.L(str, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
            h0Var.f712a = w.T0(str, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, 2, null);
            LogUtilsKt.warnLog("Using incorrect oldProductId: " + str + ". The productId should not contain the basePlanId. Using productId: " + ((String) h0Var.f712a) + com.amazon.a.a.o.c.a.b.f7490a);
        }
        this.billing.findPurchaseInPurchaseHistory(str2, productType2, (String) h0Var.f712a, new C05332(h0Var, this, activity, str2, purchasingData, googleReplacementMode, presentedOfferingContext, bool), new C05343(purchaseErrorCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRefreshCustomerInfo(boolean z10) {
        if (this.appConfig.getCustomEntitlementComputation()) {
            return false;
        }
        return z10 || this.deviceCache.isCustomerInfoCacheStale(getAppUserID(), false);
    }

    public static /* synthetic */ void syncPurchases$default(PurchasesOrchestrator purchasesOrchestrator, SyncPurchasesCallback syncPurchasesCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchasesOrchestrator.syncPurchases(syncPurchasesCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void synchronizeSubscriberAttributesIfNeeded() {
        SubscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers$default(this.subscriberAttributesManager, getAppUserID(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAllCaches(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        boolean appInBackground = getState$purchases_defaultsRelease().getAppInBackground();
        this.customerInfoHelper.retrieveCustomerInfo(str, CacheFetchPolicy.FETCH_CURRENT, appInBackground, getAllowSharingPlayStoreAccount(), receiveCustomerInfoCallback);
        OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, str, appInBackground, null, null, 12, null);
    }

    static /* synthetic */ void updateAllCaches$default(PurchasesOrchestrator purchasesOrchestrator, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.updateAllCaches(str, receiveCustomerInfoCallback);
    }

    public final void close() {
        synchronized (this) {
            PurchasesState state$purchases_defaultsRelease = getState$purchases_defaultsRelease();
            Map mapEmptyMap = Collections.emptyMap();
            r.e(mapEmptyMap, "emptyMap()");
            setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, null, mapEmptyMap, null, false, false, 29, null));
            i0 i0Var = i0.f15558a;
        }
        this.backend.close();
        this.billing.close();
        setUpdatedCustomerInfoListener(null);
        dispatch(new C05212());
    }

    public final void collectDeviceIdentifiers() {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"collectDeviceIdentifiers"}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.collectDeviceIdentifiers(getAppUserID(), this.application);
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        Boolean allowSharingPlayStoreAccount;
        allowSharingPlayStoreAccount = getState$purchases_defaultsRelease().getAllowSharingPlayStoreAccount();
        return allowSharingPlayStoreAccount != null ? allowSharingPlayStoreAccount.booleanValue() : this.identityManager.currentUserIsAnonymous();
    }

    public final void getAmazonLWAConsentStatus(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
        r.f(getAmazonLWAConsentStatusCallback, "callback");
        this.billing.getAmazonLWAConsentStatus(new C05231(getAmazonLWAConsentStatusCallback), new C05242(getAmazonLWAConsentStatusCallback));
    }

    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    public final synchronized String getAppUserID() {
        return this.identityManager.getCurrentAppUserID();
    }

    public final PurchasesConfiguration getCurrentConfiguration() {
        return this.initialConfiguration.getAppUserID() == null ? this.initialConfiguration : PurchasesConfiguration.copy$purchases_defaultsRelease$default(this.initialConfiguration, getAppUserID(), null, 2, null);
    }

    public final void getCustomerCenterConfig(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
        r.f(getCustomerCenterConfigCallback, "callback");
        this.backend.getCustomerCenterConfig(this.identityManager.getCurrentAppUserID(), new C05251(getCustomerCenterConfigCallback), new C05262(getCustomerCenterConfigCallback));
    }

    public final void getCustomerInfo(CacheFetchPolicy cacheFetchPolicy, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        r.f(cacheFetchPolicy, "fetchPolicy");
        r.f(receiveCustomerInfoCallback, "callback");
        this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), cacheFetchPolicy, getState$purchases_defaultsRelease().getAppInBackground(), getAllowSharingPlayStoreAccount(), receiveCustomerInfoCallback);
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        r.f(receiveCustomerInfoCallback, "callback");
        getCustomerInfo(CacheFetchPolicy.Companion.m12default(), receiveCustomerInfoCallback);
    }

    public final synchronized boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    public final void getOfferings(ReceiveOfferingsCallback receiveOfferingsCallback, boolean z10) {
        r.f(receiveOfferingsCallback, "listener");
        this.offeringsManager.getOfferings(this.identityManager.getCurrentAppUserID(), getState$purchases_defaultsRelease().getAppInBackground(), new C05271(receiveOfferingsCallback), new C05282(receiveOfferingsCallback), z10);
    }

    public final OfflineEntitlementsManager getOfflineEntitlementsManager() {
        return this.offlineEntitlementsManager;
    }

    public final void getProducts(List<String> list, ProductType productType, final GetStoreProductsCallback getStoreProductsCallback) {
        Set<? extends ProductType> setD;
        r.f(list, "productIds");
        r.f(getStoreProductsCallback, "callback");
        if (productType == null || (setD = x0.a(productType)) == null) {
            setD = y0.d(ProductType.SUBS, ProductType.INAPP);
        }
        getProductsOfTypes(c0.H0(list), setD, new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.getProducts.1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                getStoreProductsCallback.onError(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> list2) {
                r.f(list2, "storeProducts");
                getStoreProductsCallback.onReceived(list2);
            }
        });
    }

    public final void getProductsOfTypes(Set<String> set, Set<? extends ProductType> set2, GetStoreProductsCallback getStoreProductsCallback) {
        r.f(set, "productIds");
        r.f(set2, "types");
        r.f(getStoreProductsCallback, "callback");
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((ProductType) obj) != ProductType.UNKNOWN) {
                arrayList.add(obj);
            }
        }
        getProductsOfTypes(set, c0.H0(arrayList), u.m(), getStoreProductsCallback);
    }

    public final PurchasesState getState$purchases_defaultsRelease() {
        return this.purchasesStateCache.getPurchasesState();
    }

    public final Store getStore() {
        return this.appConfig.getStore();
    }

    public final String getStorefrontCountryCode() {
        return this.storefrontCountryCode;
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.customerInfoUpdateHandler.getUpdatedCustomerInfoListener();
    }

    public final void invalidateCustomerInfoCache() {
        LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.INVALIDATING_CUSTOMERINFO_CACHE);
        this.deviceCache.clearCustomerInfoCache(getAppUserID());
    }

    public final boolean isAnonymous() {
        return this.identityManager.currentUserIsAnonymous();
    }

    public final void logIn(String str, LogInCallback logInCallback) {
        r.f(str, "newAppUserID");
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        i0 i0Var = null;
        if (r.b(currentAppUserID, str)) {
            currentAppUserID = null;
        }
        if (currentAppUserID != null) {
            this.identityManager.logIn(str, new PurchasesOrchestrator$logIn$2$1(this, str, logInCallback), new PurchasesOrchestrator$logIn$2$2(this, logInCallback));
            i0Var = i0.f15558a;
        }
        if (i0Var == null) {
            this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.Companion.m12default(), getState$purchases_defaultsRelease().getAppInBackground(), getAllowSharingPlayStoreAccount(), ListenerConversionsCommonKt.receiveCustomerInfoCallback(new AnonymousClass3(logInCallback), new AnonymousClass4(logInCallback)));
        }
    }

    public final void logOut(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.identityManager.logOut(new C05311(receiveCustomerInfoCallback, this));
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        r.f(activity, "activity");
        if (this.appConfig.getShowInAppMessagesAutomatically()) {
            showInAppMessagesIfNeeded(activity, nd.p.E0(InAppMessageType.values()));
        }
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityStopped(this, activity);
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppBackgrounded() {
        synchronized (this) {
            setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, null, null, true, false, 23, null));
            i0 i0Var = i0.f15558a;
        }
        LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.APP_BACKGROUNDED);
        synchronizeSubscriberAttributesIfNeeded();
        flushPaywallEvents();
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppForegrounded() {
        d0 d0Var = new d0();
        synchronized (this) {
            d0Var.f699a = getState$purchases_defaultsRelease().getFirstTimeInForeground();
            setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, null, null, false, false, 7, null));
            i0 i0Var = i0.f15558a;
        }
        LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.APP_FOREGROUNDED);
        enqueue(new C05322(d0Var));
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback purchaseCallback) {
        i0 i0Var;
        r.f(purchaseParams, "purchaseParams");
        r.f(purchaseCallback, "callback");
        String oldProductId = purchaseParams.getOldProductId();
        if (oldProductId != null) {
            startProductChange(purchaseParams.getActivity$purchases_defaultsRelease(), purchaseParams.getPurchasingData$purchases_defaultsRelease(), purchaseParams.getPresentedOfferingContext$purchases_defaultsRelease(), oldProductId, purchaseParams.getGoogleReplacementMode(), purchaseParams.isPersonalizedPrice(), purchaseCallback);
            i0Var = i0.f15558a;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            startPurchase(purchaseParams.getActivity$purchases_defaultsRelease(), purchaseParams.getPurchasingData$purchases_defaultsRelease(), purchaseParams.getPresentedOfferingContext$purchases_defaultsRelease(), purchaseParams.isPersonalizedPrice(), purchaseCallback);
        }
    }

    public final void redeemWebPurchase(WebPurchaseRedemption webPurchaseRedemption, RedeemWebPurchaseListener redeemWebPurchaseListener) {
        r.f(webPurchaseRedemption, "webPurchaseRedemption");
        r.f(redeemWebPurchaseListener, "listener");
        this.webPurchaseRedemptionHelper.handleRedeemWebPurchase(webPurchaseRedemption, redeemWebPurchaseListener);
    }

    public final void removeUpdatedCustomerInfoListener() {
        setUpdatedCustomerInfoListener(null);
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        r.f(receiveCustomerInfoCallback, "callback");
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.RESTORING_PURCHASE);
        if (!getAllowSharingPlayStoreAccount()) {
            LogWrapperKt.log(LogIntent.WARNING, RestoreStrings.SHARING_ACC_RESTORE_FALSE);
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new C05351(receiveCustomerInfoCallback, currentAppUserID), new C05362(receiveCustomerInfoCallback));
    }

    public final void setAd(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAd"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE, str, getAppUserID());
    }

    public final void setAdGroup(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAdGroup"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE, str, getAppUserID());
    }

    public final void setAdjustID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAdjustID"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Adjust.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAirshipChannelID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAirshipChannelID"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.Airship.INSTANCE, str, getAppUserID());
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z10) {
        setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), Boolean.valueOf(z10), null, null, false, false, 30, null));
    }

    public final void setAppConfig(AppConfig appConfig) {
        r.f(appConfig, "<set-?>");
        this.appConfig = appConfig;
    }

    public final void setAppsflyerID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAppsflyerID"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.AppsFlyer.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAttributes(Map<String, String> map) {
        r.f(map, "attributes");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAttributes"}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttributes(map, getAppUserID());
    }

    public final void setCampaign(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setCampaign"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE, str, getAppUserID());
    }

    public final void setCleverTapID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setCleverTapID"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.CleverTap.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setCreative(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setCreative"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE, str, getAppUserID());
    }

    public final void setDisplayName(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setDisplayName"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.DisplayName.INSTANCE, str, getAppUserID());
    }

    public final void setEmail(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setEmail"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.Email.INSTANCE, str, getAppUserID());
    }

    public final void setFBAnonymousID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setFBAnonymousID"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Facebook.INSTANCE, str, getAppUserID(), this.application);
    }

    public final synchronized void setFinishTransactions(boolean z10) {
        this.appConfig.setFinishTransactions(z10);
    }

    public final void setFirebaseAppInstanceID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setFirebaseAppInstanceID"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.FirebaseAppInstanceId.INSTANCE, str, getAppUserID());
    }

    public final void setKeyword(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"seKeyword"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE, str, getAppUserID());
    }

    public final void setKochavaDeviceID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setKochavaDeviceID"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Kochava.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setMediaSource(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setMediaSource"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE, str, getAppUserID());
    }

    public final void setMixpanelDistinctID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setMixpanelDistinctID"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.MixpanelDistinctId.INSTANCE, str, getAppUserID());
    }

    public final void setMparticleID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setMparticleID"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Mparticle.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setOnesignalID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setOnesignalID"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignal.INSTANCE, str, getAppUserID());
    }

    public final void setOnesignalUserID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setOnesignalUserID"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignalUserId.INSTANCE, str, getAppUserID());
    }

    public final void setPhoneNumber(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setPhoneNumber"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.PhoneNumber.INSTANCE, str, getAppUserID());
    }

    public final void setPushToken(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setPushToken"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.FCMTokens.INSTANCE, str, getAppUserID());
    }

    public final void setState$purchases_defaultsRelease(PurchasesState purchasesState) {
        r.f(purchasesState, "value");
        this.purchasesStateCache.setPurchasesState(purchasesState);
    }

    public final void setTenjinAnalyticsInstallationID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setTenjinAnalyticsInstallationID"}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.TenjinAnalyticsInstallationId.INSTANCE, str, getAppUserID());
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.customerInfoUpdateHandler.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list) {
        r.f(activity, "activity");
        r.f(list, "inAppMessageTypes");
        this.billing.showInAppMessagesIfNeeded(activity, list, new C05371());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ae.j, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void startDeprecatedProductChange(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode, ProductChangeCallback productChangeCallback) {
        String str2;
        i0 i0Var;
        String currentAppUserID;
        ProductChangeCallback productChangeCallback2;
        i0 i0Var2;
        ?? r02;
        String offeringIdentifier;
        r.f(activity, "activity");
        r.f(purchasingData, "purchasingData");
        r.f(str, "oldProductId");
        r.f(productChangeCallback, "listener");
        if (purchasingData.getProductType() != ProductType.SUBS) {
            getAndClearProductChangeCallback();
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            i0 i0Var3 = i0.f15558a;
            dispatch(productChangeCallback, purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        Object[] objArr = new Object[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(' ');
        sb2.append(purchasingData);
        sb2.append(' ');
        if (presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) {
            str2 = null;
        } else {
            str2 = PurchaseStrings.OFFERING + offeringIdentifier;
        }
        sb2.append(str2);
        sb2.append(" oldProductId: ");
        sb2.append(str);
        sb2.append(" googleReplacementMode ");
        sb2.append(googleReplacementMode);
        objArr[0] = sb2.toString();
        String str3 = String.format(PurchaseStrings.PRODUCT_CHANGE_STARTED, Arrays.copyOf(objArr, 1));
        r.e(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent, str3);
        synchronized (this) {
            if (!this.appConfig.getFinishTransactions()) {
                LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
            }
            if (getState$purchases_defaultsRelease().getDeprecatedProductChangeCallback() == null) {
                i0Var = null;
                setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, null, productChangeCallback, false, false, 27, null));
                currentAppUserID = this.identityManager.getCurrentAppUserID();
            } else {
                i0Var = null;
                currentAppUserID = null;
            }
            i0 i0Var4 = i0.f15558a;
        }
        if (currentAppUserID != null) {
            r02 = i0Var;
            productChangeCallback2 = productChangeCallback;
            replaceOldPurchaseWithNewProduct(purchasingData, str, googleReplacementMode, activity, currentAppUserID, presentedOfferingContext, null, productChangeCallback);
            i0Var2 = i0.f15558a;
        } else {
            i0 i0Var5 = i0Var;
            productChangeCallback2 = productChangeCallback;
            i0Var2 = i0Var5;
            r02 = i0Var5;
        }
        if (i0Var2 == null) {
            getAndClearProductChangeCallback();
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, r02, 2, r02);
            LogUtilsKt.errorLog(purchasesError2);
            dispatch(productChangeCallback2, purchasesError2);
        }
    }

    public final void startProductChange(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode, Boolean bool, PurchaseCallback purchaseCallback) {
        String str2;
        String currentAppUserID;
        i0 i0Var;
        String offeringIdentifier;
        r.f(activity, "activity");
        r.f(purchasingData, "purchasingData");
        r.f(str, "oldProductId");
        r.f(googleReplacementMode, "googleReplacementMode");
        r.f(purchaseCallback, "purchaseCallback");
        if (purchasingData.getProductType() != ProductType.SUBS) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            i0 i0Var2 = i0.f15558a;
            dispatch(purchaseCallback, purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        Object[] objArr = new Object[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(' ');
        sb2.append(purchasingData);
        sb2.append(' ');
        if (presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) {
            str2 = null;
        } else {
            str2 = PurchaseStrings.OFFERING + offeringIdentifier;
        }
        sb2.append(str2);
        sb2.append(" oldProductId: ");
        sb2.append(str);
        sb2.append(" googleReplacementMode ");
        sb2.append(googleReplacementMode);
        objArr[0] = sb2.toString();
        String str3 = String.format(PurchaseStrings.PRODUCT_CHANGE_STARTED, Arrays.copyOf(objArr, 1));
        r.e(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent, str3);
        synchronized (this) {
            if (!this.appConfig.getFinishTransactions()) {
                LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
            }
            if (getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                currentAppUserID = null;
            } else {
                setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, r0.l(getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId(), q0.c(x.a(googleReplacementMode == GoogleReplacementMode.DEFERRED ? str : purchasingData.getProductId(), purchaseCallback))), null, false, false, 29, null));
                currentAppUserID = this.identityManager.getCurrentAppUserID();
            }
            i0 i0Var3 = i0.f15558a;
        }
        if (currentAppUserID != null) {
            replaceOldPurchaseWithNewProduct(purchasingData, str, googleReplacementMode, activity, currentAppUserID, presentedOfferingContext, bool, purchaseCallback);
            i0Var = i0.f15558a;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, null, 2, null);
            LogUtilsKt.errorLog(purchasesError2);
            Iterator<T> it = getAndClearAllPurchaseCallbacks().iterator();
            while (it.hasNext()) {
                dispatch((PurchaseCallback) it.next(), purchasesError2);
            }
        }
    }

    public final void startPurchase(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, Boolean bool, PurchaseCallback purchaseCallback) {
        String str;
        String currentAppUserID;
        i0 i0Var;
        String offeringIdentifier;
        r.f(activity, "activity");
        r.f(purchasingData, "purchasingData");
        r.f(purchaseCallback, "listener");
        LogIntent logIntent = LogIntent.PURCHASE;
        Object[] objArr = new Object[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(' ');
        sb2.append(purchasingData);
        sb2.append(' ');
        if (presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) {
            str = null;
        } else {
            str = PurchaseStrings.OFFERING + offeringIdentifier;
        }
        sb2.append(str);
        objArr[0] = sb2.toString();
        String str2 = String.format(PurchaseStrings.PURCHASE_STARTED, Arrays.copyOf(objArr, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        synchronized (this) {
            if (!this.appConfig.getFinishTransactions()) {
                LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
            }
            if (getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                currentAppUserID = null;
            } else {
                setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, r0.l(getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId(), q0.c(x.a(purchasingData.getProductId(), purchaseCallback))), null, false, false, 29, null));
                currentAppUserID = this.identityManager.getCurrentAppUserID();
            }
            i0 i0Var2 = i0.f15558a;
        }
        if (currentAppUserID != null) {
            this.billing.makePurchaseAsync(activity, currentAppUserID, purchasingData, null, presentedOfferingContext, bool);
            i0Var = i0.f15558a;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, null, 2, null);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(purchaseCallback, purchasesError);
        }
    }

    public final void switchUser(String str) {
        r.f(str, "newAppUserID");
        if (!r.b(this.identityManager.getCurrentAppUserID(), str)) {
            this.identityManager.switchUser(str);
            OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, str, getState$purchases_defaultsRelease().getAppInBackground(), null, null, 12, null);
        } else {
            String str2 = String.format(IdentityStrings.SWITCHING_USER_SAME_APP_USER_ID, Arrays.copyOf(new Object[]{str}, 1));
            r.e(str2, "format(this, *args)");
            LogUtilsKt.warnLog(str2);
        }
    }

    public final void syncAmazonPurchase(String str, String str2, String str3, String str4, Double d10) {
        r.f(str, "productID");
        r.f(str2, "receiptID");
        r.f(str3, "amazonUserID");
        LogIntent logIntent = LogIntent.DEBUG;
        String str5 = String.format(PurchaseStrings.SYNCING_PURCHASE_STORE_USER_ID, Arrays.copyOf(new Object[]{str2, str3}, 2));
        r.e(str5, "format(this, *args)");
        LogWrapperKt.log(logIntent, str5);
        Set<String> previouslySentHashedTokens = this.deviceCache.getPreviouslySentHashedTokens();
        if (!previouslySentHashedTokens.contains(UtilsKt.sha1(str2))) {
            previouslySentHashedTokens = null;
        }
        if (previouslySentHashedTokens == null) {
            this.billing.normalizePurchaseData(str, str2, str3, new C05383(d10, str4, this, str2, str3, this.identityManager.getCurrentAppUserID()), new C05394(str2, str3));
            return;
        }
        String str6 = String.format(PurchaseStrings.SYNCING_PURCHASE_SKIPPING, Arrays.copyOf(new Object[]{str2, str3}, 2));
        r.e(str6, "format(this, *args)");
        LogWrapperKt.log(logIntent, str6);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.revenuecat.purchases.PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1, com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback] */
    public final void syncAttributesAndOfferingsIfNeeded(final SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsCallback) {
        r.f(syncAttributesAndOfferingsCallback, "callback");
        ?? r02 = new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1
            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                syncAttributesAndOfferingsCallback.onError(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                r.f(offerings, "offerings");
                syncAttributesAndOfferingsCallback.onSuccess(offerings);
            }
        };
        if (this.lastSyncAttributesAndOfferingsRateLimiter.shouldProceed()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getAppUserID(), new C05401(r02));
            return;
        }
        LogIntent logIntent = LogIntent.WARNING;
        String str = String.format(SyncAttributesAndOfferingsStrings.RATE_LIMIT_REACHED, Arrays.copyOf(new Object[]{Integer.valueOf(this.lastSyncAttributesAndOfferingsRateLimiter.getMaxCallsInPeriod()), Long.valueOf(ke.a.v(this.lastSyncAttributesAndOfferingsRateLimiter.m287getPeriodSecondsUwyO8pc()))}, 2));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        getOfferings$default(this, r02, false, 2, null);
    }

    public final void syncPurchases(SyncPurchasesCallback syncPurchasesCallback) {
        this.syncPurchasesHelper.syncPurchases(getAllowSharingPlayStoreAccount(), getState$purchases_defaultsRelease().getAppInBackground(), new C05411(syncPurchasesCallback), new C05422(syncPurchasesCallback));
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public final void track(PaywallEvent paywallEvent) {
        PaywallEventsManager paywallEventsManager;
        r.f(paywallEvent, "paywallEvent");
        this.paywallPresentedCache.receiveEvent(paywallEvent);
        if (!AndroidVersionUtilsKt.isAndroidNOrNewer() || (paywallEventsManager = this.paywallEventsManager) == null) {
            return;
        }
        paywallEventsManager.track(paywallEvent);
    }
}
