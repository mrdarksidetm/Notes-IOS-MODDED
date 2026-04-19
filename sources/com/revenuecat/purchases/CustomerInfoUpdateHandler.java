package com.revenuecat.purchases;

import ae.j;
import ae.r;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.CustomerInfoUpdateHandler;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import md.i0;
import md.s;
import md.x;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerInfoUpdateHandler {
    private final AppConfig appConfig;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTracker;
    private final Handler handler;
    private final IdentityManager identityManager;
    private CustomerInfo lastSentCustomerInfo;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private UpdatedCustomerInfoListener updatedCustomerInfoListener;

    public CustomerInfoUpdateHandler(DeviceCache deviceCache, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker, Handler handler) {
        r.f(deviceCache, "deviceCache");
        r.f(identityManager, "identityManager");
        r.f(offlineEntitlementsManager, "offlineEntitlementsManager");
        r.f(appConfig, "appConfig");
        r.f(handler, "handler");
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.appConfig = appConfig;
        this.diagnosticsTracker = diagnosticsTracker;
        this.handler = handler;
    }

    public /* synthetic */ CustomerInfoUpdateHandler(DeviceCache deviceCache, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker, Handler handler, int i10, j jVar) {
        this(deviceCache, identityManager, offlineEntitlementsManager, appConfig, diagnosticsTracker, (i10 & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    private final void afterSetListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        CustomerInfo cachedCustomerInfo;
        if (updatedCustomerInfoListener != null) {
            LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.LISTENER_SET);
            if (this.appConfig.getCustomEntitlementComputation() || (cachedCustomerInfo = getCachedCustomerInfo(this.identityManager.getCurrentAppUserID())) == null) {
                return;
            }
            notifyListeners(cachedCustomerInfo);
        }
    }

    private final void dispatch(final zd.a<i0> aVar) {
        if (r.b(Thread.currentThread(), this.handler.getLooper().getThread())) {
            aVar.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: gb.b
                @Override // java.lang.Runnable
                public final void run() {
                    CustomerInfoUpdateHandler.dispatch$lambda$5(aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$5(zd.a aVar) {
        r.f(aVar, "$tmp0");
        aVar.invoke();
    }

    private final CustomerInfo getCachedCustomerInfo(String str) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.getOfflineCustomerInfo();
        return offlineCustomerInfo == null ? this.deviceCache.getCachedCustomerInfo(str) : offlineCustomerInfo;
    }

    public final void cacheAndNotifyListeners(CustomerInfo customerInfo) {
        r.f(customerInfo, "customerInfo");
        this.deviceCache.cacheCustomerInfo(this.identityManager.getCurrentAppUserID(), customerInfo);
        notifyListeners(customerInfo);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.updatedCustomerInfoListener;
    }

    public final void notifyListeners(CustomerInfo customerInfo) {
        s sVarA;
        LogIntent logIntent;
        String str;
        DiagnosticsTracker diagnosticsTracker;
        r.f(customerInfo, "customerInfo");
        synchronized (this) {
            sVarA = x.a(this.updatedCustomerInfoListener, this.lastSentCustomerInfo);
        }
        UpdatedCustomerInfoListener updatedCustomerInfoListener = (UpdatedCustomerInfoListener) sVarA.a();
        CustomerInfo customerInfo2 = (CustomerInfo) sVarA.b();
        if (!r.b(customerInfo2, customerInfo) && (diagnosticsTracker = this.diagnosticsTracker) != null) {
            diagnosticsTracker.trackCustomerInfoVerificationResultIfNeeded(customerInfo);
        }
        if (updatedCustomerInfoListener == null || r.b(customerInfo2, customerInfo)) {
            return;
        }
        if (customerInfo2 != null) {
            logIntent = LogIntent.DEBUG;
            str = CustomerInfoStrings.CUSTOMERINFO_UPDATED_NOTIFYING_LISTENER;
        } else {
            logIntent = LogIntent.DEBUG;
            str = CustomerInfoStrings.SENDING_LATEST_CUSTOMERINFO_TO_LISTENER;
        }
        LogWrapperKt.log(logIntent, str);
        synchronized (this) {
            this.lastSentCustomerInfo = customerInfo;
            i0 i0Var = i0.f15558a;
        }
        dispatch(new CustomerInfoUpdateHandler$notifyListeners$2$2(updatedCustomerInfoListener, customerInfo));
    }

    public final void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        synchronized (this) {
            this.updatedCustomerInfoListener = updatedCustomerInfoListener;
            i0 i0Var = i0.f15558a;
        }
        afterSetListener(updatedCustomerInfoListener);
    }
}
