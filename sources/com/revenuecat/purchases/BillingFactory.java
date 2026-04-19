package com.revenuecat.purchases;

import ae.r;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.google.BillingWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingFactory {
    public static final BillingFactory INSTANCE = new BillingFactory();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.AMAZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BillingFactory() {
    }

    public final BillingAbstract createBilling(Store store, Application application, BackendHelper backendHelper, DeviceCache deviceCache, boolean z10, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, boolean z11) {
        r.f(store, ProductResponseJsonKeys.STORE);
        r.f(application, "application");
        r.f(backendHelper, "backendHelper");
        r.f(deviceCache, "cache");
        r.f(purchasesStateProvider, "stateProvider");
        int i10 = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i10 == 1) {
            return new BillingWrapper(new BillingWrapper.ClientFactory(application, z11), new Handler(application.getMainLooper()), deviceCache, diagnosticsTracker, purchasesStateProvider, null, 32, null);
        }
        if (i10 == 2) {
            try {
                Context applicationContext = application.getApplicationContext();
                r.e(applicationContext, "application.applicationContext");
                return new AmazonBilling(applicationContext, deviceCache, z10, new Handler(application.getMainLooper()), backendHelper, purchasesStateProvider, diagnosticsTracker);
            } catch (NoClassDefFoundError e10) {
                LogUtilsKt.errorLog("Make sure purchases-amazon is added as dependency", e10);
                throw e10;
            }
        }
        LogUtilsKt.errorLog$default("Incompatible store (" + store + ") used", null, 2, null);
        throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}
