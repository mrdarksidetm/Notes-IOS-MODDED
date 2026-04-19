package com.revenuecat.purchases.common.offlineentitlements;

import ae.r;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.i0;
import md.s;
import md.x;
import nd.c0;
import nd.t;
import nd.u;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class OfflineEntitlementsManager {
    private CustomerInfo _offlineCustomerInfo;
    private final AppConfig appConfig;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTracker;
    private final OfflineCustomerInfoCalculator offlineCustomerInfoCalculator;
    private final Map<String, List<s<l<CustomerInfo, i0>, l<PurchasesError, i0>>>> offlineCustomerInfoCallbackCache;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$2, reason: invalid class name */
    static final class AnonymousClass2 extends ae.s implements l<CustomerInfo, i0> {
        final /* synthetic */ String $appUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(1);
            this.$appUserId = str;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            r.f(customerInfo, "customerInfo");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                LogUtilsKt.warnLog(OfflineEntitlementsStrings.USING_OFFLINE_ENTITLEMENTS_CUSTOMER_INFO);
                DiagnosticsTracker diagnosticsTracker = offlineEntitlementsManager.diagnosticsTracker;
                if (diagnosticsTracker != null) {
                    diagnosticsTracker.trackEnteredOfflineEntitlementsMode();
                }
                offlineEntitlementsManager._offlineCustomerInfo = customerInfo;
                String cachedAppUserID = offlineEntitlementsManager.deviceCache.getCachedAppUserID();
                if (cachedAppUserID != null) {
                    offlineEntitlementsManager.deviceCache.clearCustomerInfoCache(cachedAppUserID);
                }
                List list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((l) ((s) it.next()).a()).invoke(customerInfo);
                    }
                }
                i0 i0Var = i0.f15558a;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$3, reason: invalid class name */
    static final class AnonymousClass3 extends ae.s implements l<PurchasesError, i0> {
        final /* synthetic */ String $appUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str) {
            super(1);
            this.$appUserId = str;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                List list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((l) ((s) it.next()).b()).invoke(purchasesError);
                    }
                }
                i0 i0Var = i0.f15558a;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$1, reason: invalid class name */
    static final class AnonymousClass1 extends ae.s implements l<ProductEntitlementMapping, i0> {
        final /* synthetic */ l<PurchasesError, i0> $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super PurchasesError, i0> lVar) {
            super(1);
            this.$completion = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(ProductEntitlementMapping productEntitlementMapping) {
            invoke2(productEntitlementMapping);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ProductEntitlementMapping productEntitlementMapping) {
            r.f(productEntitlementMapping, "productEntitlementMapping");
            OfflineEntitlementsManager.this.deviceCache.cacheProductEntitlementMapping(productEntitlementMapping);
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.SUCCESSFULLY_UPDATED_PRODUCT_ENTITLEMENTS);
            l<PurchasesError, i0> lVar = this.$completion;
            if (lVar != null) {
                lVar.invoke(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$2, reason: invalid class name and case insensitive filesystem */
    static final class C05652 extends ae.s implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05652(l<? super PurchasesError, i0> lVar) {
            super(1);
            this.$completion = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "e");
            String str = String.format(OfflineEntitlementsStrings.ERROR_UPDATING_PRODUCT_ENTITLEMENTS, Arrays.copyOf(new Object[]{purchasesError}, 1));
            r.e(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
            l<PurchasesError, i0> lVar = this.$completion;
            if (lVar != null) {
                lVar.invoke(purchasesError);
            }
        }
    }

    public OfflineEntitlementsManager(Backend backend, OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, DeviceCache deviceCache, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker) {
        r.f(backend, "backend");
        r.f(offlineCustomerInfoCalculator, "offlineCustomerInfoCalculator");
        r.f(deviceCache, "deviceCache");
        r.f(appConfig, "appConfig");
        this.backend = backend;
        this.offlineCustomerInfoCalculator = offlineCustomerInfoCalculator;
        this.deviceCache = deviceCache;
        this.appConfig = appConfig;
        this.diagnosticsTracker = diagnosticsTracker;
        this.offlineCustomerInfoCallbackCache = new LinkedHashMap();
    }

    private final boolean isOfflineEntitlementsEnabled() {
        return this.appConfig.getFinishTransactions() && this.appConfig.getEnableOfflineEntitlements() && !this.appConfig.getCustomEntitlementComputation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateProductEntitlementMappingCacheIfStale$default(OfflineEntitlementsManager offlineEntitlementsManager, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        offlineEntitlementsManager.updateProductEntitlementMappingCacheIfStale(lVar);
    }

    public final void calculateAndCacheOfflineCustomerInfo(String str, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "appUserId");
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        if (!this.appConfig.getEnableOfflineEntitlements()) {
            lVar2.invoke(new PurchasesError(PurchasesErrorCode.UnsupportedError, OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_NOT_ENABLED));
            return;
        }
        synchronized (this) {
            boolean zContainsKey = this.offlineCustomerInfoCallbackCache.containsKey(str);
            List<s<l<CustomerInfo, i0>, l<PurchasesError, i0>>> listM = this.offlineCustomerInfoCallbackCache.get(str);
            if (listM == null) {
                listM = u.m();
            }
            this.offlineCustomerInfoCallbackCache.put(str, c0.n0(listM, t.d(x.a(lVar, lVar2))));
            if (!zContainsKey) {
                i0 i0Var = i0.f15558a;
                this.offlineCustomerInfoCalculator.computeOfflineCustomerInfo(str, new AnonymousClass2(str), new AnonymousClass3(str));
            } else {
                String str2 = String.format(OfflineEntitlementsStrings.ALREADY_CALCULATING_OFFLINE_CUSTOMER_INFO, Arrays.copyOf(new Object[]{str}, 1));
                r.e(str2, "format(this, *args)");
                LogUtilsKt.debugLog(str2);
            }
        }
    }

    public final CustomerInfo getOfflineCustomerInfo() {
        return this._offlineCustomerInfo;
    }

    public final synchronized void resetOfflineCustomerInfoCache() {
        if (this._offlineCustomerInfo != null) {
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.RESETTING_OFFLINE_CUSTOMER_INFO_CACHE);
            this._offlineCustomerInfo = null;
        }
    }

    public final boolean shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(boolean z10, String str) {
        r.f(str, "appUserId");
        return z10 && isOfflineEntitlementsEnabled() && this.deviceCache.getCachedCustomerInfo(str) == null;
    }

    public final boolean shouldCalculateOfflineCustomerInfoInPostReceipt(boolean z10) {
        return z10 && isOfflineEntitlementsEnabled();
    }

    public final void updateProductEntitlementMappingCacheIfStale(l<? super PurchasesError, i0> lVar) {
        if (isOfflineEntitlementsEnabled() && this.deviceCache.isProductEntitlementMappingCacheStale()) {
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.UPDATING_PRODUCT_ENTITLEMENT_MAPPING);
            this.backend.getProductEntitlementMapping(new AnonymousClass1(lVar), new C05652(lVar));
        } else if (lVar != null) {
            lVar.invoke(null);
        }
    }
}
