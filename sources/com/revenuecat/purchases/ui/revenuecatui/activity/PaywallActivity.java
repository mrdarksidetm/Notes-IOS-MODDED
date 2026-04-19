package com.revenuecat.purchases.ui.revenuecatui.activity;

import a2.g;
import ae.j;
import ae.r;
import ae.s;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import b1.c;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.EntitlementVerificationMode;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.PaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.GoogleFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFont;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import com.revenuecat.purchases.ui.revenuecatui.fonts.TypographyType;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import f1.b;
import h0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.i0;
import n2.t;
import nd.q0;
import nd.v;
import o2.c;
import q0.h0;
import q0.z;
import t0.i;
import t0.l;
import t0.o;
import t0.q2;
import t0.u3;
import t0.w;
import y1.e0;
import y1.u;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallActivity extends a implements PaywallListener {
    public static final String ARGS_EXTRA = "paywall_args";
    public static final Companion Companion = new Companion(null);
    public static final String RESULT_EXTRA = "paywall_result";
    public static final String SDK_CONFIG_EXTRA = "sdk_config_args";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    private static final class SdkConfigArgs implements Parcelable {
        public static final Parcelable.Creator<SdkConfigArgs> CREATOR = new Creator();
        private final String apiKey;
        private final String appUserId;
        private final DangerousSettings dangerousSettings;
        private final boolean diagnosticsEnabled;
        private final boolean pendingTransactionsForPrepaidPlansEnabled;
        private final PurchasesAreCompletedBy purchasesAreCompletedBy;
        private final boolean showInAppMessagesAutomatically;
        private final Store store;
        private final EntitlementVerificationMode verificationMode;

        public static final class Creator implements Parcelable.Creator<SdkConfigArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SdkConfigArgs createFromParcel(Parcel parcel) {
                r.f(parcel, "parcel");
                return new SdkConfigArgs(parcel.readString(), parcel.readString(), PurchasesAreCompletedBy.valueOf(parcel.readString()), parcel.readInt() != 0, Store.valueOf(parcel.readString()), parcel.readInt() != 0, EntitlementVerificationMode.valueOf(parcel.readString()), (DangerousSettings) parcel.readParcelable(SdkConfigArgs.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SdkConfigArgs[] newArray(int i10) {
                return new SdkConfigArgs[i10];
            }
        }

        public SdkConfigArgs(String str, String str2, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z10, Store store, boolean z11, EntitlementVerificationMode entitlementVerificationMode, DangerousSettings dangerousSettings, boolean z12) {
            r.f(str, "apiKey");
            r.f(purchasesAreCompletedBy, "purchasesAreCompletedBy");
            r.f(store, ProductResponseJsonKeys.STORE);
            r.f(entitlementVerificationMode, "verificationMode");
            r.f(dangerousSettings, "dangerousSettings");
            this.apiKey = str;
            this.appUserId = str2;
            this.purchasesAreCompletedBy = purchasesAreCompletedBy;
            this.showInAppMessagesAutomatically = z10;
            this.store = store;
            this.diagnosticsEnabled = z11;
            this.verificationMode = entitlementVerificationMode;
            this.dangerousSettings = dangerousSettings;
            this.pendingTransactionsForPrepaidPlansEnabled = z12;
        }

        public final String component1() {
            return this.apiKey;
        }

        public final String component2() {
            return this.appUserId;
        }

        public final PurchasesAreCompletedBy component3() {
            return this.purchasesAreCompletedBy;
        }

        public final boolean component4() {
            return this.showInAppMessagesAutomatically;
        }

        public final Store component5() {
            return this.store;
        }

        public final boolean component6() {
            return this.diagnosticsEnabled;
        }

        public final EntitlementVerificationMode component7() {
            return this.verificationMode;
        }

        public final DangerousSettings component8() {
            return this.dangerousSettings;
        }

        public final boolean component9() {
            return this.pendingTransactionsForPrepaidPlansEnabled;
        }

        public final SdkConfigArgs copy(String str, String str2, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z10, Store store, boolean z11, EntitlementVerificationMode entitlementVerificationMode, DangerousSettings dangerousSettings, boolean z12) {
            r.f(str, "apiKey");
            r.f(purchasesAreCompletedBy, "purchasesAreCompletedBy");
            r.f(store, ProductResponseJsonKeys.STORE);
            r.f(entitlementVerificationMode, "verificationMode");
            r.f(dangerousSettings, "dangerousSettings");
            return new SdkConfigArgs(str, str2, purchasesAreCompletedBy, z10, store, z11, entitlementVerificationMode, dangerousSettings, z12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SdkConfigArgs)) {
                return false;
            }
            SdkConfigArgs sdkConfigArgs = (SdkConfigArgs) obj;
            return r.b(this.apiKey, sdkConfigArgs.apiKey) && r.b(this.appUserId, sdkConfigArgs.appUserId) && this.purchasesAreCompletedBy == sdkConfigArgs.purchasesAreCompletedBy && this.showInAppMessagesAutomatically == sdkConfigArgs.showInAppMessagesAutomatically && this.store == sdkConfigArgs.store && this.diagnosticsEnabled == sdkConfigArgs.diagnosticsEnabled && this.verificationMode == sdkConfigArgs.verificationMode && r.b(this.dangerousSettings, sdkConfigArgs.dangerousSettings) && this.pendingTransactionsForPrepaidPlansEnabled == sdkConfigArgs.pendingTransactionsForPrepaidPlansEnabled;
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getAppUserId() {
            return this.appUserId;
        }

        public final DangerousSettings getDangerousSettings() {
            return this.dangerousSettings;
        }

        public final boolean getDiagnosticsEnabled() {
            return this.diagnosticsEnabled;
        }

        public final boolean getPendingTransactionsForPrepaidPlansEnabled() {
            return this.pendingTransactionsForPrepaidPlansEnabled;
        }

        public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
            return this.purchasesAreCompletedBy;
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10, types: [int] */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v6, types: [int] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iHashCode = this.apiKey.hashCode() * 31;
            String str = this.appUserId;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.purchasesAreCompletedBy.hashCode()) * 31;
            boolean z10 = this.showInAppMessagesAutomatically;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            int iHashCode3 = (((iHashCode2 + r12) * 31) + this.store.hashCode()) * 31;
            boolean z11 = this.diagnosticsEnabled;
            ?? r13 = z11;
            if (z11) {
                r13 = 1;
            }
            int iHashCode4 = (((((iHashCode3 + r13) * 31) + this.verificationMode.hashCode()) * 31) + this.dangerousSettings.hashCode()) * 31;
            boolean z12 = this.pendingTransactionsForPrepaidPlansEnabled;
            return iHashCode4 + (z12 ? 1 : z12);
        }

        public String toString() {
            return "SdkConfigArgs(apiKey=" + this.apiKey + ", appUserId=" + this.appUserId + ", purchasesAreCompletedBy=" + this.purchasesAreCompletedBy + ", showInAppMessagesAutomatically=" + this.showInAppMessagesAutomatically + ", store=" + this.store + ", diagnosticsEnabled=" + this.diagnosticsEnabled + ", verificationMode=" + this.verificationMode + ", dangerousSettings=" + this.dangerousSettings + ", pendingTransactionsForPrepaidPlansEnabled=" + this.pendingTransactionsForPrepaidPlansEnabled + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            r.f(parcel, "out");
            parcel.writeString(this.apiKey);
            parcel.writeString(this.appUserId);
            parcel.writeString(this.purchasesAreCompletedBy.name());
            parcel.writeInt(this.showInAppMessagesAutomatically ? 1 : 0);
            parcel.writeString(this.store.name());
            parcel.writeInt(this.diagnosticsEnabled ? 1 : 0);
            parcel.writeString(this.verificationMode.name());
            parcel.writeParcelable(this.dangerousSettings, i10);
            parcel.writeInt(this.pendingTransactionsForPrepaidPlansEnabled ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity$onCreate$1, reason: invalid class name and case insensitive filesystem */
    static final class C06211 extends s implements p<l, Integer, i0> {
        final /* synthetic */ PaywallOptions $paywallOptions;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02061 extends s implements p<l, Integer, i0> {
            final /* synthetic */ PaywallOptions $paywallOptions;

            /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C02071 extends s implements q<y, l, Integer, i0> {
                final /* synthetic */ PaywallOptions $paywallOptions;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02071(PaywallOptions paywallOptions) {
                    super(3);
                    this.$paywallOptions = paywallOptions;
                }

                @Override // zd.q
                public /* bridge */ /* synthetic */ i0 invoke(y yVar, l lVar, Integer num) {
                    invoke(yVar, lVar, num.intValue());
                    return i0.f15558a;
                }

                public final void invoke(y yVar, l lVar, int i10) {
                    int i11;
                    r.f(yVar, "paddingValues");
                    if ((i10 & 14) == 0) {
                        i11 = (lVar.N(yVar) ? 4 : 2) | i10;
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 91) == 18 && lVar.s()) {
                        lVar.x();
                        return;
                    }
                    if (o.I()) {
                        o.U(2025926559, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaywallActivity.kt:122)");
                    }
                    e eVarH = m.h(androidx.compose.foundation.layout.p.e(e.f2662a, 0.0f, 1, null), yVar);
                    PaywallOptions paywallOptions = this.$paywallOptions;
                    lVar.e(733328855);
                    e0 e0VarG = d.g(b.f11020a.o(), false, lVar, 0);
                    lVar.e(-1323940314);
                    int iA = i.a(lVar, 0);
                    w wVarB = lVar.B();
                    g.a aVar = g.J;
                    zd.a<g> aVarA = aVar.a();
                    q<q2<g>, l, Integer, i0> qVarA = u.a(eVarH);
                    if (!(lVar.t() instanceof t0.e)) {
                        i.b();
                    }
                    lVar.r();
                    if (lVar.l()) {
                        lVar.O(aVarA);
                    } else {
                        lVar.D();
                    }
                    l lVarA = u3.a(lVar);
                    u3.b(lVarA, e0VarG, aVar.e());
                    u3.b(lVarA, wVarB, aVar.g());
                    p<g, Integer, i0> pVarB = aVar.b();
                    if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                        lVarA.E(Integer.valueOf(iA));
                        lVarA.Q(Integer.valueOf(iA), pVarB);
                    }
                    qVarA.invoke(q2.a(q2.b(lVar)), lVar, 0);
                    lVar.e(2058660585);
                    f fVar = f.f2502a;
                    PaywallKt.Paywall(paywallOptions, lVar, 0);
                    lVar.K();
                    lVar.L();
                    lVar.K();
                    lVar.K();
                    if (o.I()) {
                        o.T();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02061(PaywallOptions paywallOptions) {
                super(2);
                this.$paywallOptions = paywallOptions;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
                invoke(lVar, num.intValue());
                return i0.f15558a;
            }

            public final void invoke(l lVar, int i10) {
                if ((i10 & 11) == 2 && lVar.s()) {
                    lVar.x();
                    return;
                }
                if (o.I()) {
                    o.U(-588670640, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity.onCreate.<anonymous>.<anonymous> (PaywallActivity.kt:121)");
                }
                h0.b(null, null, null, null, null, 0, 0L, 0L, null, c.b(lVar, 2025926559, true, new C02071(this.$paywallOptions)), lVar, 805306368, 511);
                if (o.I()) {
                    o.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06211(PaywallOptions paywallOptions) {
            super(2);
            this.$paywallOptions = paywallOptions;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (o.I()) {
                o.U(2032214180, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity.onCreate.<anonymous> (PaywallActivity.kt:120)");
            }
            z.a(null, null, null, c.b(lVar, -588670640, true, new C02061(this.$paywallOptions)), lVar, 3072, 7);
            if (o.I()) {
                o.T();
            }
        }
    }

    private final void configureSdkWithSavedData(Bundle bundle) {
        SdkConfigArgs sdkConfigArgs = getSdkConfigArgs(bundle);
        if (sdkConfigArgs == null) {
            Logger.INSTANCE.e("Missing SDK configuration arguments while restoring PaywallActivity");
        } else {
            Purchases.Companion.configure(new PurchasesConfiguration.Builder(this, sdkConfigArgs.getApiKey()).appUserID(sdkConfigArgs.getAppUserId()).purchasesAreCompletedBy(sdkConfigArgs.getPurchasesAreCompletedBy()).showInAppMessagesAutomatically(sdkConfigArgs.getShowInAppMessagesAutomatically()).store(sdkConfigArgs.getStore()).diagnosticsEnabled(sdkConfigArgs.getDiagnosticsEnabled()).entitlementVerificationMode(sdkConfigArgs.getVerificationMode()).dangerousSettings(sdkConfigArgs.getDangerousSettings()).pendingTransactionsForPrepaidPlansEnabled(sdkConfigArgs.getPendingTransactionsForPrepaidPlansEnabled()).build());
        }
    }

    private final Intent createResultIntent(PaywallResult paywallResult) {
        Intent intentPutExtra = new Intent().putExtra(RESULT_EXTRA, paywallResult);
        r.e(intentPutExtra, "Intent().putExtra(RESULT_EXTRA, result)");
        return intentPutExtra;
    }

    private final PaywallActivityArgs getArgs() {
        return (PaywallActivityArgs) (Build.VERSION.SDK_INT >= 33 ? getIntent().getParcelableExtra(ARGS_EXTRA, PaywallActivityArgs.class) : getIntent().getParcelableExtra(ARGS_EXTRA));
    }

    private final FontProvider getFontProvider() {
        Map<TypographyType, PaywallFontFamily> fonts;
        ArrayList arrayList;
        List<PaywallFont> fonts2;
        n2.s sVarA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PaywallActivityArgs args = getArgs();
        if (args == null || (fonts = args.getFonts()) == null) {
            return null;
        }
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(fonts.size()));
        Iterator<T> it = fonts.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            PaywallFontFamily paywallFontFamily = (PaywallFontFamily) entry.getValue();
            if (paywallFontFamily == null || (fonts2 = paywallFontFamily.getFonts()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(v.x(fonts2, 10));
                for (PaywallFont paywallFont : fonts2) {
                    if (paywallFont instanceof PaywallFont.ResourceFont) {
                        PaywallFont.ResourceFont resourceFont = (PaywallFont.ResourceFont) paywallFont;
                        sVarA = n2.y.b(resourceFont.getResourceId(), resourceFont.getFontWeight(), n2.e0.d(resourceFont.getFontStyle()), 0, 8, null);
                    } else if (paywallFont instanceof PaywallFont.AssetFont) {
                        PaywallFont.AssetFont assetFont = (PaywallFont.AssetFont) paywallFont;
                        String path = assetFont.getPath();
                        AssetManager assets = getAssets();
                        r.e(assets, "assets");
                        sVarA = n2.c.b(path, assets, assetFont.getFontWeight(), n2.e0.d(assetFont.getFontStyle()), null, 16, null);
                    } else {
                        if (!(paywallFont instanceof PaywallFont.GoogleFont)) {
                            throw new md.q();
                        }
                        PaywallFont.GoogleFont googleFont = (PaywallFont.GoogleFont) paywallFont;
                        GoogleFontProvider fontProvider = googleFont.getFontProvider();
                        Object googleProvider = linkedHashMap.get(fontProvider);
                        if (googleProvider == null) {
                            googleProvider = fontProvider.toGoogleProvider();
                            linkedHashMap.put(fontProvider, googleProvider);
                        }
                        sVarA = o2.e.a(new o2.c(googleFont.getFontName(), false, 2, null), (c.a) googleProvider, googleFont.getFontWeight(), n2.e0.d(googleFont.getFontStyle()));
                    }
                    arrayList.add(sVarA);
                }
            }
            linkedHashMap2.put(key, arrayList != null ? n2.u.a(arrayList) : null);
        }
        return new FontProvider() { // from class: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity.getFontProvider.1
            @Override // com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider
            public t getFont(TypographyType typographyType) {
                r.f(typographyType, "type");
                return linkedHashMap2.get(typographyType);
            }
        };
    }

    private final SdkConfigArgs getSdkConfigArgs(Bundle bundle) {
        return (SdkConfigArgs) bundle.getParcelable(SDK_CONFIG_EXTRA);
    }

    @Override // androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        if (!Purchases.Companion.isConfigured() && bundle != null) {
            configureSdkWithSavedData(bundle);
        }
        PaywallActivityArgs args = getArgs();
        f.b.b(this, null, b1.c.c(2032214180, true, new C06211(new PaywallOptions.Builder(new PaywallActivity$onCreate$paywallOptions$1(this)).setOfferingId$revenuecatui_defaultsRelease(args != null ? args.getOfferingId() : null).setFontProvider(getFontProvider()).setShouldDisplayDismissButton(args != null ? args.getShouldDisplayDismissButton() : true).setListener(this).build())), 1, null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseCancelled() {
        PaywallListener.DefaultImpls.onPurchaseCancelled(this);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
        r.f(customerInfo, "customerInfo");
        r.f(storeTransaction, "storeTransaction");
        setResult(-1, createResultIntent(new PaywallResult.Purchased(customerInfo)));
        finish();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseError(PurchasesError purchasesError) {
        r.f(purchasesError, "error");
        setResult(-1, createResultIntent(purchasesError.getCode() == PurchasesErrorCode.PurchaseCancelledError ? PaywallResult.Cancelled.INSTANCE : new PaywallResult.Error(purchasesError)));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseStarted(Package r12) {
        PaywallListener.DefaultImpls.onPurchaseStarted(this, r12);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onRestoreCompleted(CustomerInfo customerInfo) {
        String requiredEntitlementIdentifier;
        r.f(customerInfo, "customerInfo");
        setResult(-1, createResultIntent(new PaywallResult.Restored(customerInfo)));
        PaywallActivityArgs args = getArgs();
        if (args == null || (requiredEntitlementIdentifier = args.getRequiredEntitlementIdentifier()) == null || !customerInfo.getEntitlements().getActive().containsKey(requiredEntitlementIdentifier)) {
            return;
        }
        finish();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onRestoreError(PurchasesError purchasesError) {
        r.f(purchasesError, "error");
        setResult(-1, createResultIntent(new PaywallResult.Error(purchasesError)));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onRestoreStarted() {
        PaywallListener.DefaultImpls.onRestoreStarted(this);
    }

    @Override // androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        r.f(bundle, "outState");
        Purchases.Companion companion = Purchases.Companion;
        if (companion.isConfigured()) {
            PurchasesConfiguration currentConfiguration = companion.getSharedInstance().getCurrentConfiguration();
            bundle.putParcelable(SDK_CONFIG_EXTRA, new SdkConfigArgs(currentConfiguration.getApiKey(), currentConfiguration.getAppUserID(), currentConfiguration.getPurchasesAreCompletedBy(), currentConfiguration.getShowInAppMessagesAutomatically(), currentConfiguration.getStore(), currentConfiguration.getDiagnosticsEnabled(), currentConfiguration.getVerificationMode(), currentConfiguration.getDangerousSettings(), currentConfiguration.getPendingTransactionsForPrepaidPlansEnabled()));
        }
        super.onSaveInstanceState(bundle);
    }
}
