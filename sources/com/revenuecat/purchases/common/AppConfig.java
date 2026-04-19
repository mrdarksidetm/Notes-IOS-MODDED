package com.revenuecat.purchases.common;

import ae.j;
import ae.r;
import android.content.Context;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesAreCompletedByKt;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.ConfigureStrings;
import java.net.URL;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class AppConfig {
    public static final Companion Companion = new Companion(null);
    private static final URL diagnosticsURL = new URL("https://api-diagnostics.revenuecat.com/");
    private static final URL paywallEventsURL = new URL("https://api-paywalls.revenuecat.com/");
    private final URL baseURL;
    private final DangerousSettings dangerousSettings;
    private final boolean enableOfflineEntitlements;
    private boolean finishTransactions;
    private boolean forceServerErrors;
    private boolean forceSigningErrors;
    private final boolean isDebugBuild;
    private final String languageTag;
    private final String packageName;
    private final PlatformInfo platformInfo;
    private final String playServicesVersionName;
    private final String playStoreVersionName;
    private final boolean runningTests;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final String versionName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final URL getDiagnosticsURL() {
            return AppConfig.diagnosticsURL;
        }

        public final URL getPaywallEventsURL() {
            return AppConfig.paywallEventsURL;
        }
    }

    public AppConfig(Context context, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z10, PlatformInfo platformInfo, URL url, Store store, boolean z11, DangerousSettings dangerousSettings, boolean z12, boolean z13, boolean z14) {
        r.f(context, "context");
        r.f(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        r.f(platformInfo, "platformInfo");
        r.f(store, ProductResponseJsonKeys.STORE);
        r.f(dangerousSettings, "dangerousSettings");
        this.showInAppMessagesAutomatically = z10;
        this.platformInfo = platformInfo;
        this.store = store;
        this.isDebugBuild = z11;
        this.dangerousSettings = dangerousSettings;
        this.runningTests = z12;
        this.forceServerErrors = z13;
        this.forceSigningErrors = z14;
        this.enableOfflineEntitlements = true;
        Locale locale = UtilsKt.getLocale(context);
        String languageTag = locale != null ? locale.toLanguageTag() : null;
        this.languageTag = languageTag == null ? "" : languageTag;
        String versionName = UtilsKt.getVersionName(context);
        this.versionName = versionName != null ? versionName : "";
        String packageName = context.getPackageName();
        r.e(packageName, "context.packageName");
        this.packageName = packageName;
        this.finishTransactions = PurchasesAreCompletedByKt.getFinishTransactions(purchasesAreCompletedBy);
        if (url != null) {
            LogWrapperKt.log(LogIntent.INFO, ConfigureStrings.CONFIGURING_PURCHASES_PROXY_URL_SET);
        } else {
            url = new URL("https://api.revenuecat.com/");
        }
        this.baseURL = url;
        this.playStoreVersionName = UtilsKt.getPlayStoreVersionName(context);
        this.playServicesVersionName = UtilsKt.getPlayServicesVersionName(context);
    }

    public /* synthetic */ AppConfig(Context context, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z10, PlatformInfo platformInfo, URL url, Store store, boolean z11, DangerousSettings dangerousSettings, boolean z12, boolean z13, boolean z14, int i10, j jVar) {
        this(context, purchasesAreCompletedBy, z10, platformInfo, url, store, z11, (i10 & 128) != 0 ? new DangerousSettings(true) : dangerousSettings, (i10 & 256) != 0 ? false : z12, (i10 & 512) != 0 ? false : z13, (i10 & 1024) != 0 ? false : z14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r.b(AppConfig.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        r.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.AppConfig");
        AppConfig appConfig = (AppConfig) obj;
        return r.b(this.platformInfo, appConfig.platformInfo) && this.store == appConfig.store && this.isDebugBuild == appConfig.isDebugBuild && r.b(this.dangerousSettings, appConfig.dangerousSettings) && r.b(this.languageTag, appConfig.languageTag) && r.b(this.versionName, appConfig.versionName) && r.b(this.packageName, appConfig.packageName) && this.finishTransactions == appConfig.finishTransactions && getForceServerErrors() == appConfig.getForceServerErrors() && getForceSigningErrors() == appConfig.getForceSigningErrors() && r.b(this.baseURL, appConfig.baseURL) && this.showInAppMessagesAutomatically == appConfig.showInAppMessagesAutomatically;
    }

    public final URL getBaseURL() {
        return this.baseURL;
    }

    public final boolean getCustomEntitlementComputation() {
        return this.dangerousSettings.getCustomEntitlementComputation$purchases_defaultsRelease();
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getEnableOfflineEntitlements() {
        return this.enableOfflineEntitlements;
    }

    public final boolean getFinishTransactions() {
        return this.finishTransactions;
    }

    public final boolean getForceServerErrors() {
        return this.runningTests && this.forceServerErrors;
    }

    public final boolean getForceSigningErrors() {
        return this.runningTests && this.forceSigningErrors;
    }

    public final String getLanguageTag() {
        return this.languageTag;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final PlatformInfo getPlatformInfo() {
        return this.platformInfo;
    }

    public final String getPlayServicesVersionName() {
        return this.playServicesVersionName;
    }

    public final String getPlayStoreVersionName() {
        return this.playStoreVersionName;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.platformInfo.hashCode() * 31) + this.store.hashCode()) * 31) + Boolean.hashCode(this.isDebugBuild)) * 31) + this.dangerousSettings.hashCode()) * 31) + this.languageTag.hashCode()) * 31) + this.versionName.hashCode()) * 31) + this.packageName.hashCode()) * 31) + Boolean.hashCode(this.finishTransactions)) * 31) + Boolean.hashCode(getForceServerErrors())) * 31) + Boolean.hashCode(getForceSigningErrors())) * 31) + this.baseURL.hashCode()) * 31) + Boolean.hashCode(this.showInAppMessagesAutomatically);
    }

    public final boolean isDebugBuild() {
        return this.isDebugBuild;
    }

    public final void setFinishTransactions(boolean z10) {
        this.finishTransactions = z10;
    }

    public final void setForceServerErrors(boolean z10) {
        this.forceServerErrors = z10;
    }

    public final void setForceSigningErrors(boolean z10) {
        this.forceSigningErrors = z10;
    }

    public String toString() {
        return "AppConfig(platformInfo=" + this.platformInfo + ", store=" + this.store + ", isDebugBuild=" + this.isDebugBuild + ", dangerousSettings=" + this.dangerousSettings + ", languageTag='" + this.languageTag + "', versionName='" + this.versionName + "', packageName='" + this.packageName + "', finishTransactions=" + this.finishTransactions + ", showInAppMessagesAutomatically=" + this.showInAppMessagesAutomatically + ", baseURL=" + this.baseURL + ')';
    }
}
