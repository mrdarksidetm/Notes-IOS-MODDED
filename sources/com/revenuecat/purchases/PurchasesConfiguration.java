package com.revenuecat.purchases;

import ae.r;
import android.content.Context;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.concurrent.ExecutorService;
import je.w;
import md.q;

/* JADX INFO: loaded from: classes2.dex */
public class PurchasesConfiguration {
    private final String apiKey;
    private final String appUserID;
    private final Context context;
    private final DangerousSettings dangerousSettings;
    private final boolean diagnosticsEnabled;
    private final boolean pendingTransactionsForPrepaidPlansEnabled;
    private final PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final ExecutorService service;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final EntitlementVerificationMode verificationMode;

    public static class Builder {
        private final String apiKey;
        private String appUserID;
        private final Context context;
        private DangerousSettings dangerousSettings;
        private boolean diagnosticsEnabled;
        private boolean pendingTransactionsForPrepaidPlansEnabled;
        private PurchasesAreCompletedBy purchasesAreCompletedBy;
        private ExecutorService service;
        private boolean showInAppMessagesAutomatically;
        private Store store;
        private EntitlementVerificationMode verificationMode;

        public Builder(Context context, String str) {
            r.f(context, "context");
            r.f(str, "apiKey");
            this.context = context;
            this.apiKey = str;
            this.purchasesAreCompletedBy = PurchasesAreCompletedBy.REVENUECAT;
            this.showInAppMessagesAutomatically = true;
            this.store = Store.PLAY_STORE;
            this.verificationMode = EntitlementVerificationMode.Companion.getDefault();
            this.dangerousSettings = new DangerousSettings(false, 1, null);
        }

        public final Builder appUserID(String str) {
            this.appUserID = str;
            return this;
        }

        public PurchasesConfiguration build() {
            return new PurchasesConfiguration(this);
        }

        public final Builder dangerousSettings(DangerousSettings dangerousSettings) {
            r.f(dangerousSettings, "dangerousSettings");
            this.dangerousSettings = dangerousSettings;
            return this;
        }

        public final Builder diagnosticsEnabled(boolean z10) {
            this.diagnosticsEnabled = z10;
            return this;
        }

        public final Builder entitlementVerificationMode(EntitlementVerificationMode entitlementVerificationMode) {
            r.f(entitlementVerificationMode, "verificationMode");
            this.verificationMode = entitlementVerificationMode;
            return this;
        }

        public final /* synthetic */ String getApiKey$purchases_defaultsRelease() {
            return this.apiKey;
        }

        public final /* synthetic */ String getAppUserID$purchases_defaultsRelease() {
            return this.appUserID;
        }

        public final /* synthetic */ Context getContext$purchases_defaultsRelease() {
            return this.context;
        }

        public final /* synthetic */ DangerousSettings getDangerousSettings$purchases_defaultsRelease() {
            return this.dangerousSettings;
        }

        public final /* synthetic */ boolean getDiagnosticsEnabled$purchases_defaultsRelease() {
            return this.diagnosticsEnabled;
        }

        public final /* synthetic */ boolean getPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease() {
            return this.pendingTransactionsForPrepaidPlansEnabled;
        }

        public final /* synthetic */ PurchasesAreCompletedBy getPurchasesAreCompletedBy$purchases_defaultsRelease() {
            return this.purchasesAreCompletedBy;
        }

        public final /* synthetic */ ExecutorService getService$purchases_defaultsRelease() {
            return this.service;
        }

        public final /* synthetic */ boolean getShowInAppMessagesAutomatically$purchases_defaultsRelease() {
            return this.showInAppMessagesAutomatically;
        }

        public final /* synthetic */ Store getStore$purchases_defaultsRelease() {
            return this.store;
        }

        public final /* synthetic */ EntitlementVerificationMode getVerificationMode$purchases_defaultsRelease() {
            return this.verificationMode;
        }

        @ExperimentalPreviewRevenueCatPurchasesAPI
        public final /* synthetic */ Builder informationalVerificationModeAndDiagnosticsEnabled(boolean z10) {
            boolean z11;
            if (z10) {
                this.verificationMode = EntitlementVerificationMode.INFORMATIONAL;
                z11 = true;
            } else {
                this.verificationMode = EntitlementVerificationMode.DISABLED;
                z11 = false;
            }
            this.diagnosticsEnabled = z11;
            return this;
        }

        public final Builder observerMode(boolean z10) {
            purchasesAreCompletedBy(z10 ? PurchasesAreCompletedBy.MY_APP : PurchasesAreCompletedBy.REVENUECAT);
            return this;
        }

        public final Builder pendingTransactionsForPrepaidPlansEnabled(boolean z10) {
            this.pendingTransactionsForPrepaidPlansEnabled = z10;
            return this;
        }

        public final Builder purchasesAreCompletedBy(PurchasesAreCompletedBy purchasesAreCompletedBy) {
            r.f(purchasesAreCompletedBy, "purchasesAreCompletedBy");
            this.purchasesAreCompletedBy = purchasesAreCompletedBy;
            return this;
        }

        public final Builder service(ExecutorService executorService) {
            r.f(executorService, "service");
            this.service = executorService;
            return this;
        }

        public final /* synthetic */ void setAppUserID$purchases_defaultsRelease(String str) {
            this.appUserID = str;
        }

        public final /* synthetic */ void setDangerousSettings$purchases_defaultsRelease(DangerousSettings dangerousSettings) {
            r.f(dangerousSettings, "<set-?>");
            this.dangerousSettings = dangerousSettings;
        }

        public final /* synthetic */ void setDiagnosticsEnabled$purchases_defaultsRelease(boolean z10) {
            this.diagnosticsEnabled = z10;
        }

        public final /* synthetic */ void setPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease(boolean z10) {
            this.pendingTransactionsForPrepaidPlansEnabled = z10;
        }

        public final /* synthetic */ void setPurchasesAreCompletedBy$purchases_defaultsRelease(PurchasesAreCompletedBy purchasesAreCompletedBy) {
            r.f(purchasesAreCompletedBy, "<set-?>");
            this.purchasesAreCompletedBy = purchasesAreCompletedBy;
        }

        public final /* synthetic */ void setService$purchases_defaultsRelease(ExecutorService executorService) {
            this.service = executorService;
        }

        public final /* synthetic */ void setShowInAppMessagesAutomatically$purchases_defaultsRelease(boolean z10) {
            this.showInAppMessagesAutomatically = z10;
        }

        public final /* synthetic */ void setStore$purchases_defaultsRelease(Store store) {
            r.f(store, "<set-?>");
            this.store = store;
        }

        public final /* synthetic */ void setVerificationMode$purchases_defaultsRelease(EntitlementVerificationMode entitlementVerificationMode) {
            r.f(entitlementVerificationMode, "<set-?>");
            this.verificationMode = entitlementVerificationMode;
        }

        public final Builder showInAppMessagesAutomatically(boolean z10) {
            this.showInAppMessagesAutomatically = z10;
            return this;
        }

        public final Builder store(Store store) {
            r.f(store, ProductResponseJsonKeys.STORE);
            this.store = store;
            return this;
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

    public PurchasesConfiguration(Builder builder) {
        r.f(builder, "builder");
        Context applicationContext = builder.getContext$purchases_defaultsRelease().getApplicationContext();
        r.e(applicationContext, "builder.context.applicationContext");
        this.context = applicationContext;
        this.apiKey = w.W0(builder.getApiKey$purchases_defaultsRelease()).toString();
        this.appUserID = builder.getAppUserID$purchases_defaultsRelease();
        this.purchasesAreCompletedBy = builder.getPurchasesAreCompletedBy$purchases_defaultsRelease();
        this.service = builder.getService$purchases_defaultsRelease();
        this.store = builder.getStore$purchases_defaultsRelease();
        this.diagnosticsEnabled = builder.getDiagnosticsEnabled$purchases_defaultsRelease();
        this.verificationMode = builder.getVerificationMode$purchases_defaultsRelease();
        this.dangerousSettings = builder.getDangerousSettings$purchases_defaultsRelease();
        this.showInAppMessagesAutomatically = builder.getShowInAppMessagesAutomatically$purchases_defaultsRelease();
        this.pendingTransactionsForPrepaidPlansEnabled = builder.getPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease();
    }

    public static /* synthetic */ PurchasesConfiguration copy$purchases_defaultsRelease$default(PurchasesConfiguration purchasesConfiguration, String str, ExecutorService executorService, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            str = purchasesConfiguration.appUserID;
        }
        if ((i10 & 2) != 0) {
            executorService = purchasesConfiguration.service;
        }
        return purchasesConfiguration.copy$purchases_defaultsRelease(str, executorService);
    }

    public static /* synthetic */ void getObserverMode$annotations() {
    }

    public final PurchasesConfiguration copy$purchases_defaultsRelease(String str, ExecutorService executorService) {
        Builder builderPendingTransactionsForPrepaidPlansEnabled = new Builder(this.context, this.apiKey).appUserID(str).purchasesAreCompletedBy(this.purchasesAreCompletedBy).store(this.store).diagnosticsEnabled(this.diagnosticsEnabled).entitlementVerificationMode(this.verificationMode).dangerousSettings(this.dangerousSettings).showInAppMessagesAutomatically(this.showInAppMessagesAutomatically).pendingTransactionsForPrepaidPlansEnabled(this.pendingTransactionsForPrepaidPlansEnabled);
        if (executorService != null) {
            builderPendingTransactionsForPrepaidPlansEnabled = builderPendingTransactionsForPrepaidPlansEnabled.service(executorService);
        }
        return builderPendingTransactionsForPrepaidPlansEnabled.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r.b(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        r.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.PurchasesConfiguration");
        PurchasesConfiguration purchasesConfiguration = (PurchasesConfiguration) obj;
        return r.b(this.apiKey, purchasesConfiguration.apiKey) && r.b(this.appUserID, purchasesConfiguration.appUserID) && this.purchasesAreCompletedBy == purchasesConfiguration.purchasesAreCompletedBy && this.showInAppMessagesAutomatically == purchasesConfiguration.showInAppMessagesAutomatically && this.store == purchasesConfiguration.store && this.diagnosticsEnabled == purchasesConfiguration.diagnosticsEnabled && r.b(this.dangerousSettings, purchasesConfiguration.dangerousSettings) && this.verificationMode == purchasesConfiguration.verificationMode && this.pendingTransactionsForPrepaidPlansEnabled == purchasesConfiguration.pendingTransactionsForPrepaidPlansEnabled;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final Context getContext() {
        return this.context;
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getDiagnosticsEnabled() {
        return this.diagnosticsEnabled;
    }

    public final boolean getObserverMode() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.purchasesAreCompletedBy.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        throw new q();
    }

    public final boolean getPendingTransactionsForPrepaidPlansEnabled() {
        return this.pendingTransactionsForPrepaidPlansEnabled;
    }

    public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final ExecutorService getService() {
        return this.service;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final EntitlementVerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    public int hashCode() {
        int iHashCode = this.apiKey.hashCode() * 31;
        String str = this.appUserID;
        return ((((((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.purchasesAreCompletedBy.hashCode()) * 31) + Boolean.hashCode(this.showInAppMessagesAutomatically)) * 31) + this.store.hashCode()) * 31) + Boolean.hashCode(this.diagnosticsEnabled)) * 31) + this.dangerousSettings.hashCode()) * 31) + this.verificationMode.hashCode()) * 31) + Boolean.hashCode(this.pendingTransactionsForPrepaidPlansEnabled);
    }
}
