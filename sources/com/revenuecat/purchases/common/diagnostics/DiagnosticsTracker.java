package com.revenuecat.purchases.common.diagnostics;

import ae.j;
import ae.r;
import ae.s;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.IOException;
import md.i0;
import md.x;
import nd.q0;
import nd.r0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class DiagnosticsTracker {

    @Deprecated
    public static final String BACKEND_ERROR_CODE_KEY = "backend_error_code";

    @Deprecated
    public static final String BILLING_DEBUG_MESSAGE = "billing_debug_message";

    @Deprecated
    public static final String BILLING_RESPONSE_CODE = "billing_response_code";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ENDPOINT_NAME_KEY = "endpoint_name";

    @Deprecated
    public static final String ETAG_HIT_KEY = "etag_hit";

    @Deprecated
    public static final String PRODUCT_TYPE_QUERIED_KEY = "product_type_queried";

    @Deprecated
    public static final String RESPONSE_CODE_KEY = "response_code";

    @Deprecated
    public static final String RESPONSE_TIME_MILLIS_KEY = "response_time_millis";

    @Deprecated
    public static final String SUCCESSFUL_KEY = "successful";

    @Deprecated
    public static final String VERIFICATION_RESULT_KEY = "verification_result";
    private final AppConfig appConfig;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final DiagnosticsHelper diagnosticsHelper;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker$checkAndClearDiagnosticsFileIfTooBig$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements a<i0> {
        final /* synthetic */ a<i0> $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(a<i0> aVar) {
            super(0);
            this.$completion = aVar;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (DiagnosticsTracker.this.diagnosticsFileHelper.isDiagnosticsFileTooBig()) {
                LogUtilsKt.verboseLog("Diagnostics file is too big. Deleting it.");
                DiagnosticsTracker.this.diagnosticsHelper.resetDiagnosticsStatus();
                DiagnosticsTracker.trackMaxEventsStoredLimitReached$default(DiagnosticsTracker.this, false, 1, null);
            }
            this.$completion.invoke();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker$trackEvent$1, reason: invalid class name and case insensitive filesystem */
    static final class C05581 extends s implements a<i0> {
        final /* synthetic */ DiagnosticsEntry $diagnosticsEntry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05581(DiagnosticsEntry diagnosticsEntry) {
            super(0);
            this.$diagnosticsEntry = diagnosticsEntry;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DiagnosticsTracker.this.trackEventInCurrentThread$purchases_defaultsRelease(this.$diagnosticsEntry);
        }
    }

    public DiagnosticsTracker(AppConfig appConfig, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsHelper diagnosticsHelper, Dispatcher dispatcher) {
        r.f(appConfig, "appConfig");
        r.f(diagnosticsFileHelper, "diagnosticsFileHelper");
        r.f(diagnosticsHelper, "diagnosticsHelper");
        r.f(dispatcher, "diagnosticsDispatcher");
        this.appConfig = appConfig;
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsHelper = diagnosticsHelper;
        this.diagnosticsDispatcher = dispatcher;
    }

    private final void checkAndClearDiagnosticsFileIfTooBig(a<i0> aVar) {
        enqueue(new AnonymousClass1(aVar));
    }

    private final void enqueue(final a<i0> aVar) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new Runnable() { // from class: lb.b
            @Override // java.lang.Runnable
            public final void run() {
                DiagnosticsTracker.enqueue$lambda$0(aVar);
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$0(a aVar) {
        r.f(aVar, "$tmp0");
        aVar.invoke();
    }

    public static /* synthetic */ void trackMaxEventsStoredLimitReached$default(DiagnosticsTracker diagnosticsTracker, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        diagnosticsTracker.trackMaxEventsStoredLimitReached(z10);
    }

    /* JADX INFO: renamed from: trackAmazonQueryProductDetailsRequest-VtjQ1oo, reason: not valid java name */
    public final void m20trackAmazonQueryProductDetailsRequestVtjQ1oo(long j10, boolean z10) {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.AMAZON_QUERY_PRODUCT_DETAILS_REQUEST, r0.h(x.a(SUCCESSFUL_KEY, Boolean.valueOf(z10)), x.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(ke.a.t(j10)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackAmazonQueryPurchasesRequest-VtjQ1oo, reason: not valid java name */
    public final void m21trackAmazonQueryPurchasesRequestVtjQ1oo(long j10, boolean z10) {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.AMAZON_QUERY_PURCHASES_REQUEST, r0.h(x.a(SUCCESSFUL_KEY, Boolean.valueOf(z10)), x.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(ke.a.t(j10)))), null, null, 12, null));
    }

    public final void trackClearingDiagnosticsAfterFailedSync() {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.CLEARING_DIAGNOSTICS_AFTER_FAILED_SYNC, r0.e(), null, null, 12, null));
    }

    public final void trackCustomerInfoVerificationResultIfNeeded(CustomerInfo customerInfo) {
        r.f(customerInfo, "customerInfo");
        VerificationResult verification = customerInfo.getEntitlements().getVerification();
        if (verification == VerificationResult.NOT_REQUESTED) {
            return;
        }
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.CUSTOMER_INFO_VERIFICATION_RESULT, q0.c(x.a(VERIFICATION_RESULT_KEY, verification.name())), null, null, 12, null));
    }

    public final void trackEnteredOfflineEntitlementsMode() {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.ENTERED_OFFLINE_ENTITLEMENTS_MODE, r0.e(), null, null, 12, null));
    }

    public final void trackErrorEnteringOfflineEntitlementsMode(PurchasesError purchasesError) {
        r.f(purchasesError, "error");
        String str = purchasesError.getCode() == PurchasesErrorCode.UnsupportedError && r.b(purchasesError.getUnderlyingErrorMessage(), OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_UNSUPPORTED_INAPP_PURCHASES) ? "one_time_purchase_found" : "unknown";
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.ERROR_ENTERING_OFFLINE_ENTITLEMENTS_MODE, r0.h(x.a("offline_entitlement_error_reason", str), x.a("error_message", purchasesError.getMessage() + " Underlying error: " + purchasesError.getUnderlyingErrorMessage())), null, null, 12, null));
    }

    public final void trackEvent(DiagnosticsEntry diagnosticsEntry) {
        r.f(diagnosticsEntry, "diagnosticsEntry");
        checkAndClearDiagnosticsFileIfTooBig(new C05581(diagnosticsEntry));
    }

    public final void trackEventInCurrentThread$purchases_defaultsRelease(DiagnosticsEntry diagnosticsEntry) {
        r.f(diagnosticsEntry, "diagnosticsEntry");
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            LogUtilsKt.verboseLog("Tracking diagnostics entry: " + diagnosticsEntry);
            try {
                this.diagnosticsFileHelper.appendEvent(diagnosticsEntry);
            } catch (IOException e10) {
                LogUtilsKt.verboseLog("Error tracking diagnostics entry: " + e10);
            }
        }
    }

    /* JADX INFO: renamed from: trackGoogleQueryProductDetailsRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m22trackGoogleQueryProductDetailsRequestWn2Vu4Y(String str, int i10, String str2, long j10) {
        r.f(str, "productType");
        r.f(str2, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST, r0.h(x.a(PRODUCT_TYPE_QUERIED_KEY, str), x.a(BILLING_RESPONSE_CODE, Integer.valueOf(i10)), x.a(BILLING_DEBUG_MESSAGE, str2), x.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(ke.a.t(j10)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m23trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(String str, int i10, String str2, long j10) {
        r.f(str, "productType");
        r.f(str2, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST, r0.h(x.a(PRODUCT_TYPE_QUERIED_KEY, str), x.a(BILLING_RESPONSE_CODE, Integer.valueOf(i10)), x.a(BILLING_DEBUG_MESSAGE, str2), x.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(ke.a.t(j10)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackGoogleQueryPurchasesRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m24trackGoogleQueryPurchasesRequestWn2Vu4Y(String str, int i10, String str2, long j10) {
        r.f(str, "productType");
        r.f(str2, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.GOOGLE_QUERY_PURCHASES_REQUEST, r0.h(x.a(PRODUCT_TYPE_QUERIED_KEY, str), x.a(BILLING_RESPONSE_CODE, Integer.valueOf(i10)), x.a(BILLING_DEBUG_MESSAGE, str2), x.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(ke.a.t(j10)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackHttpRequestPerformed-nRVORKE, reason: not valid java name */
    public final void m25trackHttpRequestPerformednRVORKE(Endpoint endpoint, long j10, boolean z10, int i10, Integer num, HTTPResult.Origin origin, VerificationResult verificationResult) {
        r.f(endpoint, "endpoint");
        r.f(verificationResult, "verificationResult");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.HTTP_REQUEST_PERFORMED, MapExtensionsKt.filterNotNullValues(r0.h(x.a(ENDPOINT_NAME_KEY, endpoint.getName()), x.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(ke.a.t(j10))), x.a(SUCCESSFUL_KEY, Boolean.valueOf(z10)), x.a(RESPONSE_CODE_KEY, Integer.valueOf(i10)), x.a(BACKEND_ERROR_CODE_KEY, num), x.a(ETAG_HIT_KEY, Boolean.valueOf(origin == HTTPResult.Origin.CACHE)), x.a(VERIFICATION_RESULT_KEY, verificationResult.name()))), null, null, 12, null));
    }

    public final void trackMaxDiagnosticsSyncRetriesReached() {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.MAX_DIAGNOSTICS_SYNC_RETRIES_REACHED, r0.e(), null, null, 12, null));
    }

    public final void trackMaxEventsStoredLimitReached(boolean z10) {
        DiagnosticsEntry diagnosticsEntry = new DiagnosticsEntry(DiagnosticsEntryName.MAX_EVENTS_STORED_LIMIT_REACHED, r0.e(), null, null, 12, null);
        if (z10) {
            trackEventInCurrentThread$purchases_defaultsRelease(diagnosticsEntry);
        } else {
            trackEvent(diagnosticsEntry);
        }
    }

    public final void trackProductDetailsNotSupported(int i10, String str) {
        r.f(str, "billingDebugMessage");
        DiagnosticsEntryName diagnosticsEntryName = DiagnosticsEntryName.PRODUCT_DETAILS_NOT_SUPPORTED;
        md.s[] sVarArr = new md.s[4];
        String playStoreVersionName = this.appConfig.getPlayStoreVersionName();
        if (playStoreVersionName == null) {
            playStoreVersionName = "";
        }
        sVarArr[0] = x.a("play_store_version", playStoreVersionName);
        String playServicesVersionName = this.appConfig.getPlayServicesVersionName();
        sVarArr[1] = x.a("play_services_version", playServicesVersionName != null ? playServicesVersionName : "");
        sVarArr[2] = x.a(BILLING_RESPONSE_CODE, Integer.valueOf(i10));
        sVarArr[3] = x.a(BILLING_DEBUG_MESSAGE, str);
        trackEvent(new DiagnosticsEntry(diagnosticsEntryName, r0.h(sVarArr), null, null, 12, null));
    }
}
