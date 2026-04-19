package com.revenuecat.purchases;

import ae.j;
import ae.o;
import ae.r;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import com.revenuecat.purchases.PurchasesFactory;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offerings.OfferingsFactory;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.offlineentitlements.PurchasedProductsFetcher;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEventsManager;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CoilImageDownloader;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.IsDebugBuildProvider;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import je.v;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesFactory {
    private final APIKeyValidator apiKeyValidator;
    private final IsDebugBuildProvider isDebugBuild;

    /* JADX INFO: Access modifiers changed from: private */
    static final class LowPriorityThreadFactory implements ThreadFactory {
        private final String threadName;

        public LowPriorityThreadFactory(String str) {
            r.f(str, "threadName");
            this.threadName = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void newThread$lambda$1(Runnable runnable) {
            if (runnable != null) {
                Process.setThreadPriority(19);
                runnable.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() { // from class: com.revenuecat.purchases.a
                @Override // java.lang.Runnable
                public final void run() {
                    PurchasesFactory.LowPriorityThreadFactory.newThread$lambda$1(runnable);
                }
            }, this.threadName);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesFactory$createPaywallEventsManager$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends o implements l<String, PaywallStoredEvent> {
        AnonymousClass1(Object obj) {
            super(1, obj, PaywallStoredEvent.Companion.class, "fromString", "fromString(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", 0);
        }

        @Override // zd.l
        public final PaywallStoredEvent invoke(String str) {
            r.f(str, "p0");
            return ((PaywallStoredEvent.Companion) this.receiver).fromString(str);
        }
    }

    public PurchasesFactory(IsDebugBuildProvider isDebugBuildProvider, APIKeyValidator aPIKeyValidator) {
        r.f(isDebugBuildProvider, "isDebugBuild");
        r.f(aPIKeyValidator, "apiKeyValidator");
        this.isDebugBuild = isDebugBuildProvider;
        this.apiKeyValidator = aPIKeyValidator;
    }

    public /* synthetic */ PurchasesFactory(IsDebugBuildProvider isDebugBuildProvider, APIKeyValidator aPIKeyValidator, int i10, j jVar) {
        this(isDebugBuildProvider, (i10 & 2) != 0 ? new APIKeyValidator() : aPIKeyValidator);
    }

    private final ExecutorService createDefaultExecutor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        r.e(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private final ExecutorService createEventsExecutor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new LowPriorityThreadFactory("revenuecat-events-thread"));
        r.e(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduled…venuecat-events-thread\"))");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private final PaywallEventsManager createPaywallEventsManager(Context context, IdentityManager identityManager, Dispatcher dispatcher, Backend backend) {
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            return new PaywallEventsManager(new EventsFileHelper(new FileHelper(context), PaywallEventsManager.PAYWALL_EVENTS_FILE_PATH, new AnonymousClass1(PaywallStoredEvent.Companion)), identityManager, dispatcher, backend);
        }
        LogUtilsKt.debugLog("Paywall events are only supported on Android N or newer.");
        return null;
    }

    private final Application getApplication(Context context) {
        Context applicationContext = context.getApplicationContext();
        r.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    private final boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public final Purchases createPurchases(PurchasesConfiguration purchasesConfiguration, PlatformInfo platformInfo, URL url, BillingAbstract billingAbstract, boolean z10, boolean z11, boolean z12) {
        DiagnosticsHelper diagnosticsHelper;
        DiagnosticsFileHelper diagnosticsFileHelper;
        DiagnosticsTracker diagnosticsTracker;
        PurchasesStateCache purchasesStateCache;
        BillingAbstract billingAbstractCreateBilling;
        r.f(purchasesConfiguration, "configuration");
        r.f(platformInfo, "platformInfo");
        validateConfiguration(purchasesConfiguration);
        Application application = getApplication(purchasesConfiguration.getContext());
        AppConfig appConfig = new AppConfig(purchasesConfiguration.getContext(), purchasesConfiguration.getPurchasesAreCompletedBy(), purchasesConfiguration.getShowInAppMessagesAutomatically(), platformInfo, url, purchasesConfiguration.getStore(), this.isDebugBuild.invoke(), purchasesConfiguration.getDangerousSettings(), z12, z10, z11);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(application);
        ETagManager eTagManager = new ETagManager(purchasesConfiguration.getContext(), null, null, 6, null);
        Dispatcher dispatcher = new Dispatcher(createDefaultExecutor(), null, z12, 2, null);
        ExecutorService service = purchasesConfiguration.getService();
        if (service == null) {
            service = createDefaultExecutor();
        }
        Dispatcher dispatcher2 = new Dispatcher(service, null, z12, 2, null);
        Dispatcher dispatcher3 = new Dispatcher(createEventsExecutor(), null, z12, 2, null);
        if (purchasesConfiguration.getDiagnosticsEnabled() && AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            DiagnosticsFileHelper diagnosticsFileHelper2 = new DiagnosticsFileHelper(new FileHelper(purchasesConfiguration.getContext()));
            DiagnosticsHelper diagnosticsHelper2 = new DiagnosticsHelper(purchasesConfiguration.getContext(), diagnosticsFileHelper2, null, 4, null);
            diagnosticsFileHelper = diagnosticsFileHelper2;
            diagnosticsHelper = diagnosticsHelper2;
            diagnosticsTracker = new DiagnosticsTracker(appConfig, diagnosticsFileHelper2, diagnosticsHelper2, dispatcher3);
        } else {
            if (purchasesConfiguration.getDiagnosticsEnabled()) {
                LogUtilsKt.warnLog("Diagnostics are only supported on Android N or newer.");
            }
            diagnosticsHelper = null;
            diagnosticsFileHelper = null;
            diagnosticsTracker = null;
        }
        SigningManager signingManager = new SigningManager(SignatureVerificationMode.Companion.fromEntitlementVerificationMode$default(SignatureVerificationMode.Companion, purchasesConfiguration.getVerificationMode(), null, 2, null), appConfig, purchasesConfiguration.getApiKey());
        r.e(defaultSharedPreferences, "prefs");
        DeviceCache deviceCache = new DeviceCache(defaultSharedPreferences, purchasesConfiguration.getApiKey(), null, 4, null);
        HTTPClient hTTPClient = new HTTPClient(appConfig, eTagManager, diagnosticsTracker, signingManager, deviceCache, null, null, null, 224, null);
        BackendHelper backendHelper = new BackendHelper(purchasesConfiguration.getApiKey(), dispatcher2, appConfig, hTTPClient);
        Backend backend = new Backend(appConfig, dispatcher2, dispatcher3, hTTPClient, backendHelper);
        PurchasesStateCache purchasesStateCache2 = new PurchasesStateCache(new PurchasesState(null, null, null, false, false, 31, null));
        if (billingAbstract == null) {
            purchasesStateCache = purchasesStateCache2;
            billingAbstractCreateBilling = BillingFactory.INSTANCE.createBilling(purchasesConfiguration.getStore(), application, backendHelper, deviceCache, PurchasesAreCompletedByKt.getFinishTransactions(purchasesConfiguration.getPurchasesAreCompletedBy()), diagnosticsTracker, purchasesStateCache2, purchasesConfiguration.getPendingTransactionsForPrepaidPlansEnabled());
        } else {
            purchasesStateCache = purchasesStateCache2;
            billingAbstractCreateBilling = billingAbstract;
        }
        SubscriberAttributesPoster subscriberAttributesPoster = new SubscriberAttributesPoster(backendHelper);
        DeviceIdentifiersFetcher deviceIdentifiersFetcherCreateAttributionFetcher = AttributionFetcherFactory.INSTANCE.createAttributionFetcher(purchasesConfiguration.getStore(), dispatcher2);
        SubscriberAttributesCache subscriberAttributesCache = new SubscriberAttributesCache(deviceCache);
        SubscriberAttributesManager subscriberAttributesManager = new SubscriberAttributesManager(subscriberAttributesCache, subscriberAttributesPoster, deviceIdentifiersFetcherCreateAttributionFetcher);
        OfflineEntitlementsManager offlineEntitlementsManager = new OfflineEntitlementsManager(backend, new OfflineCustomerInfoCalculator(new PurchasedProductsFetcher(deviceCache, billingAbstractCreateBilling, null, 4, null), appConfig, diagnosticsTracker, null, 8, null), deviceCache, appConfig, diagnosticsTracker);
        OfferingsCache offeringsCache = new OfferingsCache(deviceCache, null, null, 6, null);
        IdentityManager identityManager = new IdentityManager(deviceCache, subscriberAttributesCache, subscriberAttributesManager, offeringsCache, backend, offlineEntitlementsManager, dispatcher);
        CustomerInfoUpdateHandler customerInfoUpdateHandler = new CustomerInfoUpdateHandler(deviceCache, identityManager, offlineEntitlementsManager, appConfig, diagnosticsTracker, null, 32, null);
        PaywallPresentedCache paywallPresentedCache = new PaywallPresentedCache();
        BillingAbstract billingAbstract2 = billingAbstractCreateBilling;
        PostReceiptHelper postReceiptHelper = new PostReceiptHelper(appConfig, backend, billingAbstract2, customerInfoUpdateHandler, deviceCache, subscriberAttributesManager, offlineEntitlementsManager, paywallPresentedCache);
        PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper = new PostTransactionWithProductDetailsHelper(billingAbstractCreateBilling, postReceiptHelper);
        PostPendingTransactionsHelper postPendingTransactionsHelper = new PostPendingTransactionsHelper(appConfig, deviceCache, billingAbstract2, dispatcher2, identityManager, postTransactionWithProductDetailsHelper);
        CustomerInfoHelper customerInfoHelper = new CustomerInfoHelper(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, null, 32, null);
        OfferingParser offeringParserCreateOfferingParser = OfferingParserFactory.INSTANCE.createOfferingParser(purchasesConfiguration.getStore());
        DiagnosticsSynchronizer diagnosticsSynchronizer = (diagnosticsFileHelper == null || diagnosticsHelper == null || diagnosticsTracker == null || !AndroidVersionUtilsKt.isAndroidNOrNewer()) ? null : new DiagnosticsSynchronizer(diagnosticsHelper, diagnosticsFileHelper, diagnosticsTracker, backend, dispatcher3);
        SyncPurchasesHelper syncPurchasesHelper = new SyncPurchasesHelper(billingAbstractCreateBilling, identityManager, customerInfoHelper, postReceiptHelper);
        OfferingsManager offeringsManager = new OfferingsManager(offeringsCache, backend, new OfferingsFactory(billingAbstractCreateBilling, offeringParserCreateOfferingParser, dispatcher), new OfferingImagePreDownloader(false, new CoilImageDownloader(application), 1, null), null, 16, null);
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, ConfigureStrings.DEBUG_ENABLED);
        String str = String.format(ConfigureStrings.SDK_VERSION, Arrays.copyOf(new Object[]{Purchases.Companion.getFrameworkVersion()}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        String str2 = String.format(ConfigureStrings.PACKAGE_NAME, Arrays.copyOf(new Object[]{appConfig.getPackageName()}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        LogIntent logIntent2 = LogIntent.USER;
        String str3 = String.format(ConfigureStrings.INITIAL_APP_USER_ID, Arrays.copyOf(new Object[]{purchasesConfiguration.getAppUserID()}, 1));
        r.e(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent2, str3);
        String str4 = String.format(ConfigureStrings.VERIFICATION_MODE_SELECTED, Arrays.copyOf(new Object[]{purchasesConfiguration.getVerificationMode().name()}, 1));
        r.e(str4, "format(this, *args)");
        LogWrapperKt.log(logIntent, str4);
        return new Purchases(new PurchasesOrchestrator(application, purchasesConfiguration.getAppUserID(), backend, billingAbstractCreateBilling, deviceCache, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, createPaywallEventsManager(application, identityManager, dispatcher3, backend), paywallPresentedCache, purchasesStateCache, null, dispatcher, purchasesConfiguration, null, 9437184, null));
    }

    public final void validateConfiguration(PurchasesConfiguration purchasesConfiguration) {
        r.f(purchasesConfiguration, "configuration");
        if (!hasPermission(purchasesConfiguration.getContext(), "android.permission.INTERNET")) {
            throw new IllegalArgumentException("Purchases requires INTERNET permission.".toString());
        }
        if (!(!v.v(purchasesConfiguration.getApiKey()))) {
            throw new IllegalArgumentException("API key must be set. Get this from the RevenueCat web app".toString());
        }
        if (!(purchasesConfiguration.getContext().getApplicationContext() instanceof Application)) {
            throw new IllegalArgumentException("Needs an application context.".toString());
        }
        this.apiKeyValidator.validateAndLog(purchasesConfiguration.getApiKey(), purchasesConfiguration.getStore());
    }
}
