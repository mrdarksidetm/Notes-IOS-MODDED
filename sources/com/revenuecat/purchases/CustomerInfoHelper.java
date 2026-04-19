package com.revenuecat.purchases;

import ae.j;
import ae.r;
import ae.s;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.CustomerInfoHelper;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import java.util.Arrays;
import md.i0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerInfoHelper {
    private final Backend backend;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final Handler handler;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheFetchPolicy.values().length];
            try {
                iArr[CacheFetchPolicy.CACHE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheFetchPolicy.FETCH_CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheFetchPolicy.CACHED_OR_FETCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements zd.a<i0> {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$callback.onReceived(this.$cachedCustomerInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements zd.a<i0> {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCachedOrFetched$1, reason: invalid class name and case insensitive filesystem */
    static final class C05021 extends s implements zd.a<i0> {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05021(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            if (receiveCustomerInfoCallback != null) {
                receiveCustomerInfoCallback.onReceived(this.$cachedCustomerInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1, reason: invalid class name and case insensitive filesystem */
    static final class C05031 extends s implements l<CustomerInfo, i0> {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01831 extends s implements zd.a<i0> {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfo $info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01831(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$info = customerInfo;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onReceived(this.$info);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05031(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            r.f(customerInfo, "info");
            LogWrapperKt.log(LogIntent.RC_SUCCESS, CustomerInfoStrings.CUSTOMERINFO_UPDATED_FROM_NETWORK);
            CustomerInfoHelper.this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
            CustomerInfoHelper.this.customerInfoUpdateHandler.cacheAndNotifyListeners(customerInfo);
            CustomerInfoHelper.this.dispatch(new C01831(this.$callback, customerInfo));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2, reason: invalid class name and case insensitive filesystem */
    static final class C05042 extends s implements p<PurchasesError, Boolean, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements l<CustomerInfo, i0> {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfoHelper this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01841 extends s implements zd.a<i0> {
                final /* synthetic */ ReceiveCustomerInfoCallback $callback;
                final /* synthetic */ CustomerInfo $offlineComputedCustomerInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01841(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                    super(0);
                    this.$callback = receiveCustomerInfoCallback;
                    this.$offlineComputedCustomerInfo = customerInfo;
                }

                @Override // zd.a
                public /* bridge */ /* synthetic */ i0 invoke() {
                    invoke2();
                    return i0.f15558a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                    if (receiveCustomerInfoCallback != null) {
                        receiveCustomerInfoCallback.onReceived(this.$offlineComputedCustomerInfo);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CustomerInfoHelper customerInfoHelper, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = receiveCustomerInfoCallback;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
                invoke2(customerInfo);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo customerInfo) {
                r.f(customerInfo, "offlineComputedCustomerInfo");
                this.this$0.customerInfoUpdateHandler.notifyListeners(customerInfo);
                this.this$0.dispatch(new C01841(this.$callback, customerInfo));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$2, reason: invalid class name and collision with other inner class name */
        static final class C01852 extends s implements l<PurchasesError, i0> {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfoHelper this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends s implements zd.a<i0> {
                final /* synthetic */ PurchasesError $backendError;
                final /* synthetic */ ReceiveCustomerInfoCallback $callback;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                    super(0);
                    this.$callback = receiveCustomerInfoCallback;
                    this.$backendError = purchasesError;
                }

                @Override // zd.a
                public /* bridge */ /* synthetic */ i0 invoke() {
                    invoke2();
                    return i0.f15558a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                    if (receiveCustomerInfoCallback != null) {
                        receiveCustomerInfoCallback.onError(this.$backendError);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01852(CustomerInfoHelper customerInfoHelper, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = receiveCustomerInfoCallback;
                this.$backendError = purchasesError;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError purchasesError) {
                r.f(purchasesError, "it");
                this.this$0.dispatch(new AnonymousClass1(this.$callback, this.$backendError));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends s implements zd.a<i0> {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$backendError = purchasesError;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(this.$backendError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05042(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(2);
            this.$appUserID = str;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
            invoke(purchasesError, bool.booleanValue());
            return i0.f15558a;
        }

        public final void invoke(PurchasesError purchasesError, boolean z10) {
            r.f(purchasesError, "backendError");
            String str = String.format(CustomerInfoStrings.ERROR_FETCHING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{purchasesError}, 1));
            r.e(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
            CustomerInfoHelper.this.deviceCache.clearCustomerInfoCacheTimestamp(this.$appUserID);
            if (CustomerInfoHelper.this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(z10, this.$appUserID)) {
                CustomerInfoHelper.this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(this.$appUserID, new AnonymousClass1(CustomerInfoHelper.this, this.$callback), new C01852(CustomerInfoHelper.this, this.$callback, purchasesError));
            } else {
                CustomerInfoHelper.this.dispatch(new AnonymousClass3(this.$callback, purchasesError));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1, reason: invalid class name and case insensitive filesystem */
    static final class C05051 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05051(String str, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z10;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, this.$callback);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$2, reason: invalid class name and case insensitive filesystem */
    static final class C05062 extends s implements l<CustomerInfo, i0> {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements zd.a<i0> {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$customerInfo = customerInfo;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onReceived(this.$customerInfo);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05062(String str, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z10;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            if (customerInfo == null) {
                CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, this.$callback);
            } else {
                LogWrapperKt.log(LogIntent.RC_SUCCESS, CustomerInfoStrings.CUSTOMERINFO_UPDATED_FROM_SYNCING_PENDING_PURCHASES);
                CustomerInfoHelper.this.dispatch(new AnonymousClass1(this.$callback, customerInfo));
            }
        }
    }

    public CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, Handler handler) {
        r.f(deviceCache, "deviceCache");
        r.f(backend, "backend");
        r.f(offlineEntitlementsManager, "offlineEntitlementsManager");
        r.f(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        r.f(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        r.f(handler, "handler");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.handler = handler;
    }

    public /* synthetic */ CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, Handler handler, int i10, j jVar) {
        this(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, (i10 & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(final zd.a<i0> aVar) {
        if (r.b(Thread.currentThread(), this.handler.getLooper().getThread())) {
            aVar.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: gb.a
                @Override // java.lang.Runnable
                public final void run() {
                    CustomerInfoHelper.dispatch$lambda$0(aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$0(zd.a aVar) {
        r.f(aVar, "$tmp0");
        aVar.invoke();
    }

    private final CustomerInfo getCachedCustomerInfo(String str) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.getOfflineCustomerInfo();
        return offlineCustomerInfo == null ? this.deviceCache.getCachedCustomerInfo(str) : offlineCustomerInfo;
    }

    private final void getCustomerInfoCacheOnly(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        zd.a<i0> anonymousClass2;
        if (receiveCustomerInfoCallback == null) {
            return;
        }
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(str);
        if (cachedCustomerInfo != null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            anonymousClass2 = new AnonymousClass1(receiveCustomerInfoCallback, cachedCustomerInfo);
        } else {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.CustomerInfoError, CustomerInfoStrings.MISSING_CACHED_CUSTOMER_INFO);
            LogUtilsKt.errorLog(purchasesError);
            anonymousClass2 = new AnonymousClass2(receiveCustomerInfoCallback, purchasesError);
        }
        dispatch(anonymousClass2);
    }

    static /* synthetic */ void getCustomerInfoCacheOnly$default(CustomerInfoHelper customerInfoHelper, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCacheOnly(str, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoCachedOrFetched(String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(str);
        if (cachedCustomerInfo == null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.NO_CACHED_CUSTOMERINFO);
            postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, receiveCustomerInfoCallback);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            dispatch(new C05021(receiveCustomerInfoCallback, cachedCustomerInfo));
            updateCachedCustomerInfoIfStale(str, z10, z11);
        }
    }

    static /* synthetic */ void getCustomerInfoCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getCustomerInfoFetchOnly(String str, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.deviceCache.setCustomerInfoCacheTimestampToNow(str);
        this.backend.getCustomerInfo(str, z10, new C05031(receiveCustomerInfoCallback), new C05042(str, receiveCustomerInfoCallback));
    }

    static /* synthetic */ void getCustomerInfoFetchOnly$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoFetchOnly(str, z10, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoNotStaledCachedOrFetched(String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        if (this.deviceCache.isCustomerInfoCacheStale(str, z10)) {
            postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, receiveCustomerInfoCallback);
        } else {
            getCustomerInfoCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
        }
    }

    static /* synthetic */ void getCustomerInfoNotStaledCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoNotStaledCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
    }

    private final void postPendingPurchasesAndFetchCustomerInfo(String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.postPendingTransactionsHelper.syncPendingPurchaseQueue(z11, new C05051(str, z10, receiveCustomerInfoCallback), new C05062(str, z10, receiveCustomerInfoCallback));
    }

    static /* synthetic */ void postPendingPurchasesAndFetchCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, receiveCustomerInfoCallback);
    }

    public static /* synthetic */ void retrieveCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, CacheFetchPolicy cacheFetchPolicy, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.retrieveCustomerInfo(str, cacheFetchPolicy, z10, z11, receiveCustomerInfoCallback);
    }

    private final void updateCachedCustomerInfoIfStale(String str, boolean z10, boolean z11) {
        if (this.deviceCache.isCustomerInfoCacheStale(str, z10)) {
            LogWrapperKt.log(LogIntent.DEBUG, z10 ? CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_BACKGROUND : CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
            postPendingPurchasesAndFetchCustomerInfo$default(this, str, z10, z11, null, 8, null);
        }
    }

    public final void retrieveCustomerInfo(String str, CacheFetchPolicy cacheFetchPolicy, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        r.f(str, "appUserID");
        r.f(cacheFetchPolicy, "fetchPolicy");
        String str2 = String.format(CustomerInfoStrings.RETRIEVING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{cacheFetchPolicy}, 1));
        r.e(str2, "format(this, *args)");
        LogUtilsKt.debugLog(str2);
        int i10 = WhenMappings.$EnumSwitchMapping$0[cacheFetchPolicy.ordinal()];
        if (i10 == 1) {
            getCustomerInfoCacheOnly(str, receiveCustomerInfoCallback);
            return;
        }
        if (i10 == 2) {
            postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, receiveCustomerInfoCallback);
        } else if (i10 == 3) {
            getCustomerInfoCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
        } else {
            if (i10 != 4) {
                return;
            }
            getCustomerInfoNotStaledCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
        }
    }
}
