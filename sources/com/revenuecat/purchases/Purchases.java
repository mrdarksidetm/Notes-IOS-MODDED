package com.revenuecat.purchases;

import ae.j;
import ae.r;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.deeplinks.DeepLinkParser;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.utils.DefaultIsDebugBuildProvider;
import java.net.URL;
import java.util.List;
import java.util.Map;
import md.h0;
import md.q;
import nd.c0;
import nd.t;
import nd.u;
import nd.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class Purchases implements LifecycleDelegate {
    private static /* synthetic */ Purchases backingFieldSharedInstance;
    private final PurchasesOrchestrator purchasesOrchestrator;
    public static final Companion Companion = new Companion(null);
    private static final String frameworkVersion = "8.10.5";

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

        public static /* synthetic */ void getDebugLogsEnabled$annotations() {
        }

        public static /* synthetic */ void getFrameworkVersion$annotations() {
        }

        public static /* synthetic */ void getLogHandler$annotations() {
        }

        public static /* synthetic */ void getLogLevel$annotations() {
        }

        public static /* synthetic */ void getPlatformInfo$annotations() {
        }

        public static /* synthetic */ void getProxyURL$annotations() {
        }

        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        public static /* synthetic */ void isConfigured$annotations() {
        }

        public final void canMakePayments(Context context, Callback<Boolean> callback) {
            r.f(context, "context");
            r.f(callback, "callback");
            canMakePayments$default(this, context, null, callback, 2, null);
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
            r.f(context, "context");
            r.f(list, "features");
            r.f(callback, "callback");
            if (getSharedInstance().getPurchasesOrchestrator$purchases_defaultsRelease().getAppConfig().getStore() == Store.PLAY_STORE) {
                PurchasesOrchestrator.Companion.canMakePayments(context, list, callback);
            } else {
                LogWrapperKt.log(LogIntent.RC_ERROR, BillingStrings.CANNOT_CALL_CAN_MAKE_PAYMENTS);
                callback.onReceived(Boolean.TRUE);
            }
        }

        public final Purchases configure(PurchasesConfiguration purchasesConfiguration) {
            PurchasesOrchestrator purchasesOrchestrator$purchases_defaultsRelease;
            r.f(purchasesConfiguration, "configuration");
            APIKeyValidator aPIKeyValidator = null;
            byte b10 = 0;
            if (isConfigured()) {
                Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
                if (r.b((backingFieldSharedInstance$purchases_defaultsRelease == null || (purchasesOrchestrator$purchases_defaultsRelease = backingFieldSharedInstance$purchases_defaultsRelease.getPurchasesOrchestrator$purchases_defaultsRelease()) == null) ? null : purchasesOrchestrator$purchases_defaultsRelease.getCurrentConfiguration(), purchasesConfiguration)) {
                    LogUtilsKt.infoLog(ConfigureStrings.INSTANCE_ALREADY_EXISTS_WITH_SAME_CONFIG);
                    return getSharedInstance();
                }
                LogUtilsKt.infoLog(ConfigureStrings.INSTANCE_ALREADY_EXISTS);
            }
            Purchases purchasesCreatePurchases = new PurchasesFactory(new DefaultIsDebugBuildProvider(purchasesConfiguration.getContext()), aPIKeyValidator, 2, b10 == true ? 1 : 0).createPurchases(purchasesConfiguration, getPlatformInfo(), getProxyURL(), (R.styleable.AppCompatTheme_windowFixedHeightMajor & 8) != 0 ? null : null, (R.styleable.AppCompatTheme_windowFixedHeightMajor & 16) != 0 ? false : false, (R.styleable.AppCompatTheme_windowFixedHeightMajor & 32) != 0 ? false : false, (R.styleable.AppCompatTheme_windowFixedHeightMajor & 64) != 0 ? false : false);
            Purchases.Companion.setSharedInstance$purchases_defaultsRelease(purchasesCreatePurchases);
            return purchasesCreatePurchases;
        }

        public final Purchases getBackingFieldSharedInstance$purchases_defaultsRelease() {
            return Purchases.backingFieldSharedInstance;
        }

        public final boolean getDebugLogsEnabled() {
            return PurchasesOrchestrator.Companion.getDebugLogsEnabled();
        }

        public final String getFrameworkVersion() {
            return Purchases.frameworkVersion;
        }

        public final synchronized LogHandler getLogHandler() {
            return PurchasesOrchestrator.Companion.getLogHandler();
        }

        public final LogLevel getLogLevel() {
            return PurchasesOrchestrator.Companion.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.Companion.getPlatformInfo();
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.Companion.getProxyURL();
        }

        public final Purchases getSharedInstance() {
            Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
            if (backingFieldSharedInstance$purchases_defaultsRelease != null) {
                return backingFieldSharedInstance$purchases_defaultsRelease;
            }
            throw new h0(ConfigureStrings.NO_SINGLETON_INSTANCE);
        }

        public final boolean isConfigured() {
            return getBackingFieldSharedInstance$purchases_defaultsRelease() != null;
        }

        @ExperimentalPreviewRevenueCatPurchasesAPI
        public final WebPurchaseRedemption parseAsWebPurchaseRedemption(Intent intent) {
            r.f(intent, "intent");
            Uri data = intent.getData();
            if (data == null) {
                return null;
            }
            return DeepLinkParser.INSTANCE.parseWebPurchaseRedemption(data);
        }

        public final void setBackingFieldSharedInstance$purchases_defaultsRelease(Purchases purchases) {
            Purchases.backingFieldSharedInstance = purchases;
        }

        public final void setDebugLogsEnabled(boolean z10) {
            PurchasesOrchestrator.Companion.setDebugLogsEnabled(z10);
        }

        public final synchronized void setLogHandler(LogHandler logHandler) {
            r.f(logHandler, "value");
            PurchasesOrchestrator.Companion.setLogHandler(logHandler);
        }

        public final void setLogLevel(LogLevel logLevel) {
            r.f(logLevel, "value");
            PurchasesOrchestrator.Companion.setLogLevel(logLevel);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            r.f(platformInfo, "value");
            PurchasesOrchestrator.Companion.setPlatformInfo(platformInfo);
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.Companion.setProxyURL(url);
        }

        public final void setSharedInstance$purchases_defaultsRelease(Purchases purchases) {
            r.f(purchases, "value");
            Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
            if (backingFieldSharedInstance$purchases_defaultsRelease != null) {
                backingFieldSharedInstance$purchases_defaultsRelease.close();
            }
            setBackingFieldSharedInstance$purchases_defaultsRelease(purchases);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesAreCompletedBy.values().length];
            try {
                iArr[PurchasesAreCompletedBy.REVENUECAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasesAreCompletedBy.MY_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Purchases(PurchasesOrchestrator purchasesOrchestrator) {
        r.f(purchasesOrchestrator, "purchasesOrchestrator");
        this.purchasesOrchestrator = purchasesOrchestrator;
    }

    public static final void canMakePayments(Context context, Callback<Boolean> callback) {
        Companion.canMakePayments(context, callback);
    }

    public static final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
        Companion.canMakePayments(context, list, callback);
    }

    public static final Purchases configure(PurchasesConfiguration purchasesConfiguration) {
        return Companion.configure(purchasesConfiguration);
    }

    public static /* synthetic */ void getAllowSharingPlayStoreAccount$annotations() {
    }

    public static final boolean getDebugLogsEnabled() {
        return Companion.getDebugLogsEnabled();
    }

    public static /* synthetic */ void getFinishTransactions$annotations() {
    }

    public static final String getFrameworkVersion() {
        return Companion.getFrameworkVersion();
    }

    public static final synchronized LogHandler getLogHandler() {
        return Companion.getLogHandler();
    }

    public static final LogLevel getLogLevel() {
        return Companion.getLogLevel();
    }

    public static final PlatformInfo getPlatformInfo() {
        return Companion.getPlatformInfo();
    }

    public static /* synthetic */ void getProducts$default(Purchases purchases, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        purchases.getProducts(list, productType, getStoreProductsCallback);
    }

    public static final URL getProxyURL() {
        return Companion.getProxyURL();
    }

    public static final Purchases getSharedInstance() {
        return Companion.getSharedInstance();
    }

    public static final boolean isConfigured() {
        return Companion.isConfigured();
    }

    public static /* synthetic */ void logIn$default(Purchases purchases, String str, LogInCallback logInCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logInCallback = null;
        }
        purchases.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(Purchases purchases, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchases.logOut(receiveCustomerInfoCallback);
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public static final WebPurchaseRedemption parseAsWebPurchaseRedemption(Intent intent) {
        return Companion.parseAsWebPurchaseRedemption(intent);
    }

    public static final void setDebugLogsEnabled(boolean z10) {
        Companion.setDebugLogsEnabled(z10);
    }

    public static final synchronized void setLogHandler(LogHandler logHandler) {
        Companion.setLogHandler(logHandler);
    }

    public static final void setLogLevel(LogLevel logLevel) {
        Companion.setLogLevel(logLevel);
    }

    public static final void setPlatformInfo(PlatformInfo platformInfo) {
        Companion.setPlatformInfo(platformInfo);
    }

    public static final void setProxyURL(URL url) {
        Companion.setProxyURL(url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Purchases purchases, Activity activity, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = t.d(InAppMessageType.BILLING_ISSUES);
        }
        purchases.showInAppMessagesIfNeeded(activity, list);
    }

    public static /* synthetic */ void syncPurchases$default(Purchases purchases, SyncPurchasesCallback syncPurchasesCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchases.syncPurchases(syncPurchasesCallback);
    }

    public final void close() {
        this.purchasesOrchestrator.close();
    }

    public final void collectDeviceIdentifiers() {
        this.purchasesOrchestrator.collectDeviceIdentifiers();
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        return this.purchasesOrchestrator.getAllowSharingPlayStoreAccount();
    }

    public final void getAmazonLWAConsentStatus(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
        r.f(getAmazonLWAConsentStatusCallback, "callback");
        this.purchasesOrchestrator.getAmazonLWAConsentStatus(getAmazonLWAConsentStatusCallback);
    }

    public final synchronized String getAppUserID() {
        return this.purchasesOrchestrator.getAppUserID();
    }

    public final PurchasesConfiguration getCurrentConfiguration() {
        return this.purchasesOrchestrator.getCurrentConfiguration();
    }

    public final void getCustomerCenterConfigData$purchases_defaultsRelease(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
        r.f(getCustomerCenterConfigCallback, "callback");
        this.purchasesOrchestrator.getCustomerCenterConfig(getCustomerCenterConfigCallback);
    }

    public final void getCustomerInfo(CacheFetchPolicy cacheFetchPolicy, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        r.f(cacheFetchPolicy, "fetchPolicy");
        r.f(receiveCustomerInfoCallback, "callback");
        this.purchasesOrchestrator.getCustomerInfo(cacheFetchPolicy, receiveCustomerInfoCallback);
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        r.f(receiveCustomerInfoCallback, "callback");
        this.purchasesOrchestrator.getCustomerInfo(CacheFetchPolicy.Companion.m12default(), receiveCustomerInfoCallback);
    }

    public final synchronized boolean getFinishTransactions() {
        return this.purchasesOrchestrator.getFinishTransactions();
    }

    public final void getNonSubscriptionSkus(List<String> list, GetStoreProductsCallback getStoreProductsCallback) {
        r.f(list, "productIds");
        r.f(getStoreProductsCallback, "callback");
        this.purchasesOrchestrator.getProductsOfTypes(c0.H0(list), x0.a(ProductType.INAPP), getStoreProductsCallback);
    }

    public final void getOfferings(ReceiveOfferingsCallback receiveOfferingsCallback) {
        r.f(receiveOfferingsCallback, "listener");
        PurchasesOrchestrator.getOfferings$default(this.purchasesOrchestrator, receiveOfferingsCallback, false, 2, null);
    }

    public final void getProducts(List<String> list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback) {
        r.f(list, "productIds");
        r.f(getStoreProductsCallback, "callback");
        this.purchasesOrchestrator.getProducts(list, productType, getStoreProductsCallback);
    }

    public final void getProducts(List<String> list, GetStoreProductsCallback getStoreProductsCallback) {
        r.f(list, "productIds");
        r.f(getStoreProductsCallback, "callback");
        getProducts(list, null, getStoreProductsCallback);
    }

    public final synchronized PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesOrchestrator.getFinishTransactions() ? PurchasesAreCompletedBy.REVENUECAT : PurchasesAreCompletedBy.MY_APP;
    }

    public final /* synthetic */ PurchasesOrchestrator getPurchasesOrchestrator$purchases_defaultsRelease() {
        return this.purchasesOrchestrator;
    }

    public final Store getStore() {
        return this.purchasesOrchestrator.getStore();
    }

    public final synchronized String getStorefrontCountryCode() {
        return this.purchasesOrchestrator.getStorefrontCountryCode();
    }

    public final void getSubscriptionSkus(List<String> list, GetStoreProductsCallback getStoreProductsCallback) {
        r.f(list, "productIds");
        r.f(getStoreProductsCallback, "callback");
        this.purchasesOrchestrator.getProductsOfTypes(c0.H0(list), x0.a(ProductType.SUBS), getStoreProductsCallback);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.purchasesOrchestrator.getUpdatedCustomerInfoListener();
    }

    public final void invalidateCustomerInfoCache() {
        this.purchasesOrchestrator.invalidateCustomerInfoCache();
    }

    public final boolean isAnonymous() {
        return this.purchasesOrchestrator.isAnonymous();
    }

    public final void logIn(String str) {
        r.f(str, "newAppUserID");
        logIn$default(this, str, null, 2, null);
    }

    public final void logIn(String str, LogInCallback logInCallback) {
        r.f(str, "newAppUserID");
        this.purchasesOrchestrator.logIn(str, logInCallback);
    }

    public final void logOut() {
        logOut$default(this, null, 1, null);
    }

    public final void logOut(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.purchasesOrchestrator.logOut(receiveCustomerInfoCallback);
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppBackgrounded() {
        this.purchasesOrchestrator.onAppBackgrounded();
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppForegrounded() {
        this.purchasesOrchestrator.onAppForegrounded();
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback purchaseCallback) {
        r.f(purchaseParams, "purchaseParams");
        r.f(purchaseCallback, "callback");
        this.purchasesOrchestrator.purchase(purchaseParams, purchaseCallback);
    }

    public final void purchasePackage(Activity activity, Package r92, PurchaseCallback purchaseCallback) {
        r.f(activity, "activity");
        r.f(r92, "packageToPurchase");
        r.f(purchaseCallback, "listener");
        this.purchasesOrchestrator.startPurchase(activity, r92.getProduct().getPurchasingData(), r92.getPresentedOfferingContext(), null, purchaseCallback);
    }

    public final void purchaseProduct(Activity activity, StoreProduct storeProduct, PurchaseCallback purchaseCallback) {
        r.f(activity, "activity");
        r.f(storeProduct, "storeProduct");
        r.f(purchaseCallback, "callback");
        this.purchasesOrchestrator.startPurchase(activity, storeProduct.getPurchasingData(), null, null, purchaseCallback);
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public final void redeemWebPurchase(WebPurchaseRedemption webPurchaseRedemption, RedeemWebPurchaseListener redeemWebPurchaseListener) {
        r.f(webPurchaseRedemption, "webPurchaseRedemption");
        r.f(redeemWebPurchaseListener, "listener");
        this.purchasesOrchestrator.redeemWebPurchase(webPurchaseRedemption, redeemWebPurchaseListener);
    }

    public final void removeUpdatedCustomerInfoListener() {
        this.purchasesOrchestrator.removeUpdatedCustomerInfoListener();
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        r.f(receiveCustomerInfoCallback, "callback");
        this.purchasesOrchestrator.restorePurchases(receiveCustomerInfoCallback);
    }

    public final void setAd(String str) {
        this.purchasesOrchestrator.setAd(str);
    }

    public final void setAdGroup(String str) {
        this.purchasesOrchestrator.setAdGroup(str);
    }

    public final void setAdjustID(String str) {
        this.purchasesOrchestrator.setAdjustID(str);
    }

    public final void setAirshipChannelID(String str) {
        this.purchasesOrchestrator.setAirshipChannelID(str);
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z10) {
        this.purchasesOrchestrator.setAllowSharingPlayStoreAccount(z10);
    }

    public final void setAppsflyerID(String str) {
        this.purchasesOrchestrator.setAppsflyerID(str);
    }

    public final void setAttributes(Map<String, String> map) {
        r.f(map, "attributes");
        this.purchasesOrchestrator.setAttributes(map);
    }

    public final void setCampaign(String str) {
        this.purchasesOrchestrator.setCampaign(str);
    }

    public final void setCleverTapID(String str) {
        this.purchasesOrchestrator.setCleverTapID(str);
    }

    public final void setCreative(String str) {
        this.purchasesOrchestrator.setCreative(str);
    }

    public final void setDisplayName(String str) {
        this.purchasesOrchestrator.setDisplayName(str);
    }

    public final void setEmail(String str) {
        this.purchasesOrchestrator.setEmail(str);
    }

    public final void setFBAnonymousID(String str) {
        this.purchasesOrchestrator.setFBAnonymousID(str);
    }

    public final synchronized void setFinishTransactions(boolean z10) {
        this.purchasesOrchestrator.setFinishTransactions(z10);
    }

    public final void setFirebaseAppInstanceID(String str) {
        this.purchasesOrchestrator.setFirebaseAppInstanceID(str);
    }

    public final void setKeyword(String str) {
        this.purchasesOrchestrator.setKeyword(str);
    }

    public final void setKochavaDeviceID(String str) {
        this.purchasesOrchestrator.setKochavaDeviceID(str);
    }

    public final void setMediaSource(String str) {
        this.purchasesOrchestrator.setMediaSource(str);
    }

    public final void setMixpanelDistinctID(String str) {
        this.purchasesOrchestrator.setMixpanelDistinctID(str);
    }

    public final void setMparticleID(String str) {
        this.purchasesOrchestrator.setMparticleID(str);
    }

    public final void setOnesignalID(String str) {
        this.purchasesOrchestrator.setOnesignalID(str);
    }

    public final void setOnesignalUserID(String str) {
        this.purchasesOrchestrator.setOnesignalUserID(str);
    }

    public final void setPhoneNumber(String str) {
        this.purchasesOrchestrator.setPhoneNumber(str);
    }

    public final synchronized void setPurchasesAreCompletedBy(PurchasesAreCompletedBy purchasesAreCompletedBy) {
        r.f(purchasesAreCompletedBy, "value");
        PurchasesOrchestrator purchasesOrchestrator = this.purchasesOrchestrator;
        int i10 = WhenMappings.$EnumSwitchMapping$0[purchasesAreCompletedBy.ordinal()];
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new q();
            }
            z10 = false;
        }
        purchasesOrchestrator.setFinishTransactions(z10);
    }

    public final void setPushToken(String str) {
        this.purchasesOrchestrator.setPushToken(str);
    }

    public final void setTenjinAnalyticsInstallationID(String str) {
        this.purchasesOrchestrator.setTenjinAnalyticsInstallationID(str);
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.purchasesOrchestrator.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity) {
        r.f(activity, "activity");
        showInAppMessagesIfNeeded$default(this, activity, null, 2, null);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list) {
        r.f(activity, "activity");
        r.f(list, "inAppMessageTypes");
        this.purchasesOrchestrator.showInAppMessagesIfNeeded(activity, list);
    }

    public final void syncAmazonPurchase(String str, String str2, String str3, String str4, Double d10) {
        r.f(str, "productID");
        r.f(str2, "receiptID");
        r.f(str3, "amazonUserID");
        this.purchasesOrchestrator.syncAmazonPurchase(str, str2, str3, str4, d10);
    }

    public final void syncAttributesAndOfferingsIfNeeded(SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsCallback) {
        r.f(syncAttributesAndOfferingsCallback, "callback");
        this.purchasesOrchestrator.syncAttributesAndOfferingsIfNeeded(syncAttributesAndOfferingsCallback);
    }

    public final void syncObserverModeAmazonPurchase(String str, String str2, String str3, String str4, Double d10) {
        r.f(str, "productID");
        r.f(str2, "receiptID");
        r.f(str3, "amazonUserID");
        syncAmazonPurchase(str, str2, str3, str4, d10);
    }

    public final void syncPurchases() {
        syncPurchases$default(this, null, 1, null);
    }

    public final void syncPurchases(SyncPurchasesCallback syncPurchasesCallback) {
        this.purchasesOrchestrator.syncPurchases(syncPurchasesCallback);
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public final /* synthetic */ void track(PaywallEvent paywallEvent) {
        r.f(paywallEvent, "paywallEvent");
        this.purchasesOrchestrator.track(paywallEvent);
    }
}
