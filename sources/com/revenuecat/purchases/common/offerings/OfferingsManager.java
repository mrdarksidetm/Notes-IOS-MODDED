package com.revenuecat.purchases.common.offerings;

import ae.j;
import ae.r;
import ae.s;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import java.util.Arrays;
import md.i0;
import nd.y0;
import org.json.JSONObject;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class OfferingsManager {
    private final Backend backend;
    private final Handler mainHandler;
    private final OfferingImagePreDownloader offeringImagePreDownloader;
    private final OfferingsCache offeringsCache;
    private final OfferingsFactory offeringsFactory;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super PurchasesError, i0> lVar) {
            super(1);
            this.$onError = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "error");
            OfferingsManager.this.handleErrorFetchingOfferings(purchasesError, this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements l<Offerings, i0> {
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ l<Offerings, i0> $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2$2, reason: invalid class name and collision with other inner class name */
        static final class C01972 extends s implements zd.a<i0> {
            final /* synthetic */ Offerings $offerings;
            final /* synthetic */ l<Offerings, i0> $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01972(l<? super Offerings, i0> lVar, Offerings offerings) {
                super(0);
                this.$onSuccess = lVar;
                this.$offerings = offerings;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                l<Offerings, i0> lVar = this.$onSuccess;
                if (lVar != null) {
                    lVar.invoke(this.$offerings);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(JSONObject jSONObject, l<? super Offerings, i0> lVar) {
            super(1);
            this.$offeringsJSON = jSONObject;
            this.$onSuccess = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Offerings offerings) {
            invoke2(offerings);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Offerings offerings) {
            r.f(offerings, "offerings");
            Offering current = offerings.getCurrent();
            if (current != null) {
                OfferingsManager.this.offeringImagePreDownloader.preDownloadOfferingImages(current);
            }
            OfferingsManager.this.offeringsCache.cacheOfferings(offerings, this.$offeringsJSON);
            OfferingsManager.this.dispatch(new C01972(this.$onSuccess, offerings));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$1, reason: invalid class name and case insensitive filesystem */
    static final class C05611 extends s implements l<JSONObject, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<Offerings, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05611(l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
            super(1);
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JSONObject jSONObject) {
            r.f(jSONObject, "it");
            OfferingsManager.this.createAndCacheOfferings(jSONObject, this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$2, reason: invalid class name and case insensitive filesystem */
    static final class C05622 extends s implements p<PurchasesError, Boolean, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<Offerings, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05622(l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
            super(2);
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
            invoke(purchasesError, bool.booleanValue());
            return i0.f15558a;
        }

        public final void invoke(PurchasesError purchasesError, boolean z10) {
            JSONObject cachedOfferingsResponse;
            r.f(purchasesError, "backendError");
            if (!z10 || (cachedOfferingsResponse = OfferingsManager.this.offeringsCache.getCachedOfferingsResponse()) == null) {
                OfferingsManager.this.handleErrorFetchingOfferings(purchasesError, this.$onError);
            } else {
                LogUtilsKt.warnLog(OfferingStrings.ERROR_FETCHING_OFFERINGS_USING_DISK_CACHE);
                OfferingsManager.this.createAndCacheOfferings(cachedOfferingsResponse, this.$onError, this.$onSuccess);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$1, reason: invalid class name and case insensitive filesystem */
    static final class C05631 extends s implements zd.a<i0> {
        final /* synthetic */ Offerings $cachedOfferings;
        final /* synthetic */ l<Offerings, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05631(l<? super Offerings, i0> lVar, Offerings offerings) {
            super(0);
            this.$onSuccess = lVar;
            this.$cachedOfferings = offerings;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            l<Offerings, i0> lVar = this.$onSuccess;
            if (lVar != null) {
                lVar.invoke(this.$cachedOfferings);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$handleErrorFetchingOfferings$1, reason: invalid class name and case insensitive filesystem */
    static final class C05641 extends s implements zd.a<i0> {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ l<PurchasesError, i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05641(l<? super PurchasesError, i0> lVar, PurchasesError purchasesError) {
            super(0);
            this.$onError = lVar;
            this.$error = purchasesError;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            l<PurchasesError, i0> lVar = this.$onError;
            if (lVar != null) {
                lVar.invoke(this.$error);
            }
        }
    }

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, Handler handler) {
        r.f(offeringsCache, "offeringsCache");
        r.f(backend, "backend");
        r.f(offeringsFactory, "offeringsFactory");
        r.f(offeringImagePreDownloader, "offeringImagePreDownloader");
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offeringsFactory = offeringsFactory;
        this.offeringImagePreDownloader = offeringImagePreDownloader;
        this.mainHandler = handler;
    }

    public /* synthetic */ OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, Handler handler, int i10, j jVar) {
        this(offeringsCache, backend, offeringsFactory, offeringImagePreDownloader, (i10 & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndCacheOfferings(JSONObject jSONObject, l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
        this.offeringsFactory.createOfferings(jSONObject, new AnonymousClass1(lVar), new AnonymousClass2(jSONObject, lVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void createAndCacheOfferings$default(OfferingsManager offeringsManager, JSONObject jSONObject, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar2 = null;
        }
        offeringsManager.createAndCacheOfferings(jSONObject, lVar, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(final zd.a<i0> aVar) {
        if (r.b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new Runnable() { // from class: mb.a
            @Override // java.lang.Runnable
            public final void run() {
                OfferingsManager.dispatch$lambda$0(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$0(zd.a aVar) {
        r.f(aVar, "$tmp0");
        aVar.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchAndCacheOfferings$default(OfferingsManager offeringsManager, String str, boolean z10, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        if ((i10 & 8) != 0) {
            lVar2 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z10, lVar, lVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getOfferings$default(OfferingsManager offeringsManager, String str, boolean z10, l lVar, l lVar2, boolean z11, int i10, Object obj) {
        l lVar3 = (i10 & 4) != 0 ? null : lVar;
        l lVar4 = (i10 & 8) != 0 ? null : lVar2;
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        offeringsManager.getOfferings(str, z10, lVar3, lVar4, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleErrorFetchingOfferings(PurchasesError purchasesError, l<? super PurchasesError, i0> lVar) {
        LogIntent logIntent = y0.d(PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError).contains(purchasesError.getCode()) ? LogIntent.RC_ERROR : LogIntent.GOOGLE_ERROR;
        String str = String.format(OfferingStrings.FETCHING_OFFERINGS_ERROR, Arrays.copyOf(new Object[]{purchasesError}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.offeringsCache.clearOfferingsCacheTimestamp();
        dispatch(new C05641(lVar, purchasesError));
    }

    public final void fetchAndCacheOfferings(String str, boolean z10, l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
        r.f(str, "appUserID");
        LogWrapperKt.log(LogIntent.RC_SUCCESS, OfferingStrings.OFFERINGS_START_UPDATE_FROM_NETWORK);
        this.backend.getOfferings(str, z10, new C05611(lVar, lVar2), new C05622(lVar, lVar2));
    }

    public final void getOfferings(String str, boolean z10, l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2, boolean z11) {
        LogIntent logIntent;
        String str2;
        r.f(str, "appUserID");
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (cachedOfferings == null) {
            logIntent = LogIntent.DEBUG;
            str2 = OfferingStrings.NO_CACHED_OFFERINGS_FETCHING_NETWORK;
        } else {
            if (!z11) {
                LogIntent logIntent2 = LogIntent.DEBUG;
                LogWrapperKt.log(logIntent2, OfferingStrings.VENDING_OFFERINGS_CACHE);
                dispatch(new C05631(lVar2, cachedOfferings));
                if (this.offeringsCache.isOfferingsCacheStale(z10)) {
                    LogWrapperKt.log(logIntent2, z10 ? OfferingStrings.OFFERINGS_STALE_UPDATING_IN_BACKGROUND : OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
                    fetchAndCacheOfferings$default(this, str, z10, null, null, 12, null);
                    return;
                }
                return;
            }
            logIntent = LogIntent.DEBUG;
            str2 = OfferingStrings.FORCE_OFFERINGS_FETCHING_NETWORK;
        }
        LogWrapperKt.log(logIntent, str2);
        fetchAndCacheOfferings(str, z10, lVar, lVar2);
    }

    public final void onAppForeground(String str) {
        r.f(str, "appUserID");
        if (this.offeringsCache.isOfferingsCacheStale(false)) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, str, false, null, null, 12, null);
        }
    }
}
