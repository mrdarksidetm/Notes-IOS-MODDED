package com.revenuecat.purchases.google;

import ae.j;
import ae.o;
import ae.r;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.d;
import com.android.billingclient.api.e;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingWrapper;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.BillingClientUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.utils.Result;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import md.i0;
import md.q;
import md.s;
import md.x;
import nd.c0;
import nd.t;
import nd.u;
import nd.v;
import v6.c;
import v6.h;
import v6.i;
import v6.m;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingWrapper extends BillingAbstract implements m, c {
    private volatile com.android.billingclient.api.a billingClient;
    private final ClientFactory clientFactory;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Handler mainHandler;
    private final Map<String, PurchaseContext> purchaseContext;
    private long reconnectMilliseconds;
    private boolean reconnectionAlreadyScheduled;
    private final ConcurrentLinkedQueue<s<l<PurchasesError, i0>, Long>> serviceRequests;

    public static final class ClientFactory {
        private final Context context;
        private final boolean pendingTransactionsForPrepaidPlansEnabled;

        public ClientFactory(Context context, boolean z10) {
            r.f(context, "context");
            this.context = context;
            this.pendingTransactionsForPrepaidPlansEnabled = z10;
        }

        public final com.android.billingclient.api.a buildClient(m mVar) {
            r.f(mVar, "listener");
            g.a aVarB = g.c().b();
            if (this.pendingTransactionsForPrepaidPlansEnabled) {
                aVarB.c();
            }
            g gVarA = aVarB.a();
            r.e(gVarA, "newBuilder()\n           …\n                .build()");
            com.android.billingclient.api.a aVarA = com.android.billingclient.api.a.h(this.context).c(gVarA).d(mVar).a();
            r.e(aVarA, "newBuilder(context).enab…\n                .build()");
            return aVarA;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends o implements l<String, i0> {
        AnonymousClass1(Object obj) {
            super(1, obj, DeviceCache.class, "addSuccessfullyPostedToken", "addSuccessfullyPostedToken(Ljava/lang/String;)V", 0);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(String str) {
            invoke2(str);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            r.f(str, "p0");
            ((DeviceCache) this.receiver).addSuccessfullyPostedToken(str);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends o implements l<String, i0> {
        AnonymousClass2(Object obj) {
            super(1, obj, DeviceCache.class, "addSuccessfullyPostedToken", "addSuccessfullyPostedToken(Ljava/lang/String;)V", 0);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(String str) {
            invoke2(str);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            r.f(str, "p0");
            ((DeviceCache) this.receiver).addSuccessfullyPostedToken(str);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends o implements l<String, i0> {
        AnonymousClass3(Object obj) {
            super(1, obj, DeviceCache.class, "addSuccessfullyPostedToken", "addSuccessfullyPostedToken(Ljava/lang/String;)V", 0);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(String str) {
            invoke2(str);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            r.f(str, "p0");
            ((DeviceCache) this.receiver).addSuccessfullyPostedToken(str);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getStorefront$1, reason: invalid class name and case insensitive filesystem */
    static final class C05671 extends ae.s implements l<com.android.billingclient.api.c, i0> {
        final /* synthetic */ l<String, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05671(l<? super String, i0> lVar) {
            super(1);
            this.$onSuccess = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.c cVar) {
            invoke2(cVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.c cVar) {
            r.f(cVar, "billingConfig");
            l<String, i0> lVar = this.$onSuccess;
            String strA = cVar.a();
            r.e(strA, "billingConfig.countryCode");
            lVar.invoke(strA);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getStorefront$2, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C05682 extends o implements l<l<? super com.android.billingclient.api.a, ? extends i0>, i0> {
        C05682(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(l<? super com.android.billingclient.api.a, ? extends i0> lVar) {
            invoke2((l<? super com.android.billingclient.api.a, i0>) lVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(l<? super com.android.billingclient.api.a, i0> lVar) {
            r.f(lVar, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(lVar);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getStorefront$3, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C05693 extends o implements p<Long, l<? super PurchasesError, ? extends i0>, i0> {
        C05693(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(Long l10, l<? super PurchasesError, ? extends i0> lVar) {
            invoke2(l10, (l<? super PurchasesError, i0>) lVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Long l10, l<? super PurchasesError, i0> lVar) {
            r.f(lVar, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l10, lVar);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$launchBillingFlow$1, reason: invalid class name and case insensitive filesystem */
    static final class C05701 extends ae.s implements l<com.android.billingclient.api.a, i0> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ d $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05701(Activity activity, d dVar) {
            super(1);
            this.$activity = activity;
            this.$params = dVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.a aVar) {
            r.f(aVar, "$this$withConnectedClient");
            e eVarG = aVar.g(this.$activity, this.$params);
            if (!(eVarG.b() != 0)) {
                eVarG = null;
            }
            if (eVarG != null) {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                String str = String.format(BillingStrings.BILLING_INTENT_FAILED, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(eVarG)}, 1));
                r.e(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$makePurchaseAsync$2, reason: invalid class name and case insensitive filesystem */
    static final class C05712 extends ae.s implements l<PurchasesError, i0> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Boolean $isPersonalizedPrice;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ ReplaceProductInfo $replaceProductInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05712(PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool, Activity activity) {
            super(1);
            this.$purchasingData = purchasingData;
            this.$replaceProductInfo = replaceProductInfo;
            this.$appUserID = str;
            this.$isPersonalizedPrice = bool;
            this.$activity = activity;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
            Result resultBuildPurchaseParams = BillingWrapper.this.buildPurchaseParams((GooglePurchasingData) this.$purchasingData, this.$replaceProductInfo, this.$appUserID, this.$isPersonalizedPrice);
            if (resultBuildPurchaseParams instanceof Result.Success) {
                BillingWrapper.this.launchBillingFlow(this.$activity, (d) ((Result.Success) resultBuildPurchaseParams).getValue());
            } else {
                if (!(resultBuildPurchaseParams instanceof Result.Error) || (purchasesUpdatedListener = BillingWrapper.this.getPurchasesUpdatedListener()) == null) {
                    return;
                }
                purchasesUpdatedListener.onPurchasesFailedToUpdate((PurchasesError) ((Result.Error) resultBuildPurchaseParams).getValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C05721 extends ae.s implements l<List<? extends PurchaseHistoryRecord>, i0> {
        final /* synthetic */ l<List<StoreTransaction>, i0> $onReceivePurchaseHistory;
        final /* synthetic */ l<PurchasesError, i0> $onReceivePurchaseHistoryError;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01981 extends ae.s implements l<List<? extends PurchaseHistoryRecord>, i0> {
            final /* synthetic */ l<List<StoreTransaction>, i0> $onReceivePurchaseHistory;
            final /* synthetic */ List<PurchaseHistoryRecord> $subsPurchasesList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01981(l<? super List<StoreTransaction>, i0> lVar, List<? extends PurchaseHistoryRecord> list) {
                super(1);
                this.$onReceivePurchaseHistory = lVar;
                this.$subsPurchasesList = list;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(List<? extends PurchaseHistoryRecord> list) {
                invoke2(list);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends PurchaseHistoryRecord> list) {
                r.f(list, "inAppPurchasesList");
                l<List<StoreTransaction>, i0> lVar = this.$onReceivePurchaseHistory;
                List<PurchaseHistoryRecord> list2 = this.$subsPurchasesList;
                ArrayList arrayList = new ArrayList(v.x(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(StoreTransactionConversionsKt.toStoreTransaction((PurchaseHistoryRecord) it.next(), ProductType.SUBS));
                }
                ArrayList arrayList2 = new ArrayList(v.x(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(StoreTransactionConversionsKt.toStoreTransaction((PurchaseHistoryRecord) it2.next(), ProductType.INAPP));
                }
                lVar.invoke(c0.n0(arrayList, arrayList2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05721(l<? super PurchasesError, i0> lVar, l<? super List<StoreTransaction>, i0> lVar2) {
            super(1);
            this.$onReceivePurchaseHistoryError = lVar;
            this.$onReceivePurchaseHistory = lVar2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(List<? extends PurchaseHistoryRecord> list) {
            invoke2(list);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends PurchaseHistoryRecord> list) {
            r.f(list, "subsPurchasesList");
            BillingWrapper.this.queryPurchaseHistoryAsync("inapp", new C01981(this.$onReceivePurchaseHistory, list), this.$onReceivePurchaseHistoryError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$1, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C05731 extends o implements l<l<? super com.android.billingclient.api.a, ? extends i0>, i0> {
        C05731(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(l<? super com.android.billingclient.api.a, ? extends i0> lVar) {
            invoke2((l<? super com.android.billingclient.api.a, i0>) lVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(l<? super com.android.billingclient.api.a, i0> lVar) {
            r.f(lVar, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(lVar);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$2, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C05742 extends o implements p<Long, l<? super PurchasesError, ? extends i0>, i0> {
        C05742(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(Long l10, l<? super PurchasesError, ? extends i0> lVar) {
            invoke2(l10, (l<? super PurchasesError, i0>) lVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Long l10, l<? super PurchasesError, i0> lVar) {
            r.f(lVar, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l10, lVar);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$1, reason: invalid class name and case insensitive filesystem */
    static final class C05751 extends ae.s implements l<Map<String, ? extends StoreTransaction>, i0> {
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ l<Boolean, i0> $resultHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05751(l<? super Boolean, i0> lVar, String str) {
            super(1);
            this.$resultHandler = lVar;
            this.$purchaseToken = str;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends StoreTransaction> map) {
            invoke2((Map<String, StoreTransaction>) map);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, StoreTransaction> map) {
            r.f(map, "purchases");
            l<Boolean, i0> lVar = this.$resultHandler;
            Collection<StoreTransaction> collectionValues = map.values();
            String str = this.$purchaseToken;
            boolean z10 = false;
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator<T> it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (r.b(((StoreTransaction) it.next()).getPurchaseToken(), str)) {
                        z10 = true;
                        break;
                    }
                }
            }
            lVar.invoke(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$2, reason: invalid class name and case insensitive filesystem */
    static final class C05762 extends ae.s implements l<PurchasesError, i0> {
        final /* synthetic */ l<ProductType, i0> $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05762(l<? super ProductType, i0> lVar) {
            super(1);
            this.$listener = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "error");
            LogUtilsKt.errorLog(purchasesError);
            this.$listener.invoke(ProductType.UNKNOWN);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$3, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C05773 extends o implements l<l<? super com.android.billingclient.api.a, ? extends i0>, i0> {
        C05773(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(l<? super com.android.billingclient.api.a, ? extends i0> lVar) {
            invoke2((l<? super com.android.billingclient.api.a, i0>) lVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(l<? super com.android.billingclient.api.a, i0> lVar) {
            r.f(lVar, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(lVar);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 extends o implements p<Long, l<? super PurchasesError, ? extends i0>, i0> {
        AnonymousClass4(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(Long l10, l<? super PurchasesError, ? extends i0> lVar) {
            invoke2(l10, (l<? super PurchasesError, i0>) lVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Long l10, l<? super PurchasesError, i0> lVar) {
            r.f(lVar, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l10, lVar);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C05781 extends o implements l<l<? super com.android.billingclient.api.a, ? extends i0>, i0> {
        C05781(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(l<? super com.android.billingclient.api.a, ? extends i0> lVar) {
            invoke2((l<? super com.android.billingclient.api.a, i0>) lVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(l<? super com.android.billingclient.api.a, i0> lVar) {
            r.f(lVar, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(lVar);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchases$2, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C05792 extends o implements p<Long, l<? super PurchasesError, ? extends i0>, i0> {
        C05792(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(Long l10, l<? super PurchasesError, ? extends i0> lVar) {
            invoke2(l10, (l<? super PurchasesError, i0>) lVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Long l10, l<? super PurchasesError, i0> lVar) {
            r.f(lVar, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l10, lVar);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C05801 extends ae.s implements l<PurchasesError, i0> {
        final /* synthetic */ f $inAppMessageParams;
        final /* synthetic */ zd.a<i0> $subscriptionStatusChange;
        final /* synthetic */ WeakReference<Activity> $weakActivity;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01991 extends ae.s implements l<com.android.billingclient.api.a, i0> {
            final /* synthetic */ f $inAppMessageParams;
            final /* synthetic */ zd.a<i0> $subscriptionStatusChange;
            final /* synthetic */ WeakReference<Activity> $weakActivity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01991(WeakReference<Activity> weakReference, f fVar, zd.a<i0> aVar) {
                super(1);
                this.$weakActivity = weakReference;
                this.$inAppMessageParams = fVar;
                this.$subscriptionStatusChange = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$1(zd.a aVar, i iVar) {
                r.f(aVar, "$subscriptionStatusChange");
                r.f(iVar, "inAppMessageResult");
                int iA = iVar.a();
                if (iA == 0) {
                    LogUtilsKt.verboseLog(BillingStrings.BILLING_INAPP_MESSAGE_NONE);
                    return;
                }
                if (iA == 1) {
                    LogUtilsKt.debugLog(BillingStrings.BILLING_INAPP_MESSAGE_UPDATE);
                    aVar.invoke();
                } else {
                    String str = String.format(BillingStrings.BILLING_INAPP_MESSAGE_UNEXPECTED_CODE, Arrays.copyOf(new Object[]{Integer.valueOf(iA)}, 1));
                    r.e(str, "format(this, *args)");
                    LogUtilsKt.errorLog$default(str, null, 2, null);
                }
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.a aVar) {
                invoke2(aVar);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(com.android.billingclient.api.a aVar) {
                r.f(aVar, "$this$withConnectedClient");
                Activity activity = this.$weakActivity.get();
                if (activity == null) {
                    LogUtilsKt.debugLog("Activity is null, not showing Google Play in-app message.");
                    return;
                }
                f fVar = this.$inAppMessageParams;
                final zd.a<i0> aVar2 = this.$subscriptionStatusChange;
                aVar.l(activity, fVar, new h() { // from class: com.revenuecat.purchases.google.a
                    @Override // v6.h
                    public final void a(i iVar) {
                        BillingWrapper.C05801.C01991.invoke$lambda$1(aVar2, iVar);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05801(WeakReference<Activity> weakReference, f fVar, zd.a<i0> aVar) {
            super(1);
            this.$weakActivity = weakReference;
            this.$inAppMessageParams = fVar;
            this.$subscriptionStatusChange = aVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError == null) {
                BillingWrapper.this.withConnectedClient(new C01991(this.$weakActivity, this.$inAppMessageParams, this.$subscriptionStatusChange));
                return;
            }
            String str = String.format(BillingStrings.BILLING_CONNECTION_ERROR_INAPP_MESSAGES, Arrays.copyOf(new Object[]{purchasesError}, 1));
            r.e(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider) {
        super(purchasesStateProvider);
        r.f(clientFactory, "clientFactory");
        r.f(handler, "mainHandler");
        r.f(deviceCache, "deviceCache");
        r.f(purchasesStateProvider, "purchasesStateProvider");
        r.f(dateProvider, "dateProvider");
        this.clientFactory = clientFactory;
        this.mainHandler = handler;
        this.deviceCache = deviceCache;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
        this.purchaseContext = new LinkedHashMap();
        this.serviceRequests = new ConcurrentLinkedQueue<>();
        this.reconnectMilliseconds = 1000L;
    }

    public /* synthetic */ BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider, int i10, j jVar) {
        this(clientFactory, handler, deviceCache, diagnosticsTracker, purchasesStateProvider, (i10 & 32) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    private final Result<d, PurchasesError> buildOneTimePurchaseParams(GooglePurchasingData.InAppProduct inAppProduct, String str, Boolean bool) {
        d.b.a aVarA = d.b.a();
        aVarA.c(inAppProduct.getProductDetails());
        d.b bVarA = aVarA.a();
        r.e(bVarA, "newBuilder().apply {\n   …etails)\n        }.build()");
        d.a aVarC = d.a().d(t.d(bVarA)).c(UtilsKt.sha256(str));
        if (bool != null) {
            aVarC.b(bool.booleanValue());
        }
        d dVarA = aVarC.a();
        r.e(dVarA, "newBuilder()\n           …\n                .build()");
        return new Result.Success(dVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result<d, PurchasesError> buildPurchaseParams(GooglePurchasingData googlePurchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            return buildOneTimePurchaseParams((GooglePurchasingData.InAppProduct) googlePurchasingData, str, bool);
        }
        if (googlePurchasingData instanceof GooglePurchasingData.Subscription) {
            return buildSubscriptionPurchaseParams((GooglePurchasingData.Subscription) googlePurchasingData, replaceProductInfo, str, bool);
        }
        throw new q();
    }

    private final Result<d, PurchasesError> buildSubscriptionPurchaseParams(GooglePurchasingData.Subscription subscription, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        d.b.a aVarA = d.b.a();
        aVarA.b(subscription.getToken());
        aVarA.c(subscription.getProductDetails());
        d.b bVarA = aVarA.a();
        r.e(bVarA, "newBuilder().apply {\n   …etails)\n        }.build()");
        d.a aVarD = d.a().d(t.d(bVarA));
        if (replaceProductInfo != null) {
            r.e(aVarD, "buildSubscriptionPurchas…arams$lambda$29$lambda$27");
            BillingFlowParamsExtensionsKt.setUpgradeInfo(aVarD, replaceProductInfo);
            i0 i0Var = i0.f15558a;
        } else {
            r.e(aVarD.c(UtilsKt.sha256(str)), "setObfuscatedAccountId(appUserID.sha256())");
        }
        if (bool != null) {
            aVarD.b(bool.booleanValue());
        }
        d dVarA = aVarD.a();
        r.e(dVarA, "newBuilder()\n           …\n                .build()");
        return new Result.Success(dVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endConnection$lambda$9(BillingWrapper billingWrapper) {
        r.f(billingWrapper, "this$0");
        synchronized (billingWrapper) {
            com.android.billingclient.api.a aVar = billingWrapper.billingClient;
            if (aVar != null) {
                LogIntent logIntent = LogIntent.DEBUG;
                String str = String.format(BillingStrings.BILLING_CLIENT_ENDING, Arrays.copyOf(new Object[]{aVar}, 1));
                r.e(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
                aVar.c();
            }
            billingWrapper.billingClient = null;
            i0 i0Var = i0.f15558a;
        }
    }

    private final void executePendingRequests() {
        s<l<PurchasesError, i0>, Long> sVarPoll;
        synchronized (this) {
            while (true) {
                com.android.billingclient.api.a aVar = this.billingClient;
                boolean z10 = true;
                if (aVar == null || !aVar.f()) {
                    z10 = false;
                }
                if (!z10 || (sVarPoll = this.serviceRequests.poll()) == null) {
                    break;
                }
                r.e(sVarPoll, "poll()");
                final l<PurchasesError, i0> lVarA = sVarPoll.a();
                Long lB = sVarPoll.b();
                if (lB != null) {
                    this.mainHandler.postDelayed(new Runnable() { // from class: ob.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$0(lVarA);
                        }
                    }, lB.longValue());
                } else {
                    this.mainHandler.post(new Runnable() { // from class: ob.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$1(lVarA);
                        }
                    });
                }
            }
            i0 i0Var = i0.f15558a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executePendingRequests$lambda$3$lambda$2$lambda$0(l lVar) {
        r.f(lVar, "$request");
        lVar.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executePendingRequests$lambda$3$lambda$2$lambda$1(l lVar) {
        r.f(lVar, "$request");
        lVar.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executeRequestOnUIThread(Long l10, l<? super PurchasesError, i0> lVar) {
        if (getPurchasesUpdatedListener() != null) {
            this.serviceRequests.add(x.a(lVar, l10));
            com.android.billingclient.api.a aVar = this.billingClient;
            boolean z10 = false;
            if (aVar != null && !aVar.f()) {
                z10 = true;
            }
            if (z10) {
                BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
            } else {
                executePendingRequests();
            }
        } else {
            lVar.invoke(new PurchasesError(PurchasesErrorCode.UnknownError, "BillingWrapper is not attached to a listener"));
        }
    }

    static /* synthetic */ void executeRequestOnUIThread$default(BillingWrapper billingWrapper, Long l10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        billingWrapper.executeRequestOnUIThread(l10, lVar);
    }

    public static /* synthetic */ void getPurchaseContext$purchases_defaultsRelease$annotations() {
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        r.e(string, "stringWriter.toString()");
        return string;
    }

    private final void getStoreTransaction(Purchase purchase, l<? super StoreTransaction, i0> lVar) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_UPDATED, Arrays.copyOf(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(purchase)}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        synchronized (this) {
            PurchaseContext purchaseContext = this.purchaseContext.get(PurchaseExtensionsKt.getFirstProductId(purchase));
            if (purchaseContext != null && purchaseContext.getProductType() != null) {
                lVar.invoke(StoreTransactionConversionsKt.toStoreTransaction(purchase, purchaseContext));
                return;
            }
            String strF = purchase.f();
            r.e(strF, "purchase.purchaseToken");
            getPurchaseType$purchases_defaultsRelease(strF, new BillingWrapper$getStoreTransaction$1$2(lVar, purchase));
            i0 i0Var = i0.f15558a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBillingFlow(Activity activity, d dVar) {
        if (activity.getIntent() == null) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.NULL_ACTIVITY_INTENT);
        }
        withConnectedClient(new C05701(activity, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$18(e eVar, BillingWrapper billingWrapper) {
        PurchasesError purchasesErrorBillingResponseToPurchasesError;
        r.f(eVar, "$billingResult");
        r.f(billingWrapper, "this$0");
        int iB = eVar.b();
        if (iB != 6) {
            if (iB != 7 && iB != 8) {
                if (iB != 12) {
                    switch (iB) {
                        case -2:
                        case 3:
                            String humanReadableDescription = BillingResultExtensionsKt.toHumanReadableDescription(eVar);
                            if (r.b(eVar.a(), ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE)) {
                                String str = String.format(BillingStrings.BILLING_UNAVAILABLE_LESS_THAN_3, Arrays.copyOf(new Object[]{humanReadableDescription}, 1));
                                r.e(str, "format(this, *args)");
                                purchasesErrorBillingResponseToPurchasesError = new PurchasesError(PurchasesErrorCode.StoreProblemError, str);
                            } else {
                                String str2 = String.format(BillingStrings.BILLING_UNAVAILABLE, Arrays.copyOf(new Object[]{humanReadableDescription}, 1));
                                r.e(str2, "format(this, *args)");
                                purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(eVar.b(), str2);
                            }
                            LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                            billingWrapper.sendErrorsToAllPendingRequests(purchasesErrorBillingResponseToPurchasesError);
                            break;
                        case 0:
                            LogIntent logIntent = LogIntent.DEBUG;
                            Object[] objArr = new Object[1];
                            com.android.billingclient.api.a aVar = billingWrapper.billingClient;
                            objArr[0] = aVar != null ? aVar.toString() : null;
                            String str3 = String.format(BillingStrings.BILLING_SERVICE_SETUP_FINISHED, Arrays.copyOf(objArr, 1));
                            r.e(str3, "format(this, *args)");
                            LogWrapperKt.log(logIntent, str3);
                            BillingAbstract.StateListener stateListener = billingWrapper.getStateListener();
                            if (stateListener != null) {
                                stateListener.onConnected();
                            }
                            billingWrapper.executePendingRequests();
                            billingWrapper.reconnectMilliseconds = 1000L;
                            billingWrapper.trackProductDetailsNotSupportedIfNeeded();
                            break;
                    }
                }
            }
            LogIntent logIntent2 = LogIntent.GOOGLE_WARNING;
            String str4 = String.format(BillingStrings.BILLING_CLIENT_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(eVar)}, 1));
            r.e(str4, "format(this, *args)");
            LogWrapperKt.log(logIntent2, str4);
            return;
        }
        LogIntent logIntent3 = LogIntent.GOOGLE_WARNING;
        String str5 = String.format(BillingStrings.BILLING_CLIENT_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(eVar)}, 1));
        r.e(str5, "format(this, *args)");
        LogWrapperKt.log(logIntent3, str5);
        billingWrapper.retryBillingServiceConnectionWithExponentialBackoff();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchaseType(String str, String str2, l<? super ProductType, i0> lVar, l<? super Boolean, i0> lVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground(), str), new C05751(lVar2, str2), new C05762(lVar), new C05773(this), new AnonymousClass4(this)), 0L, 1, null);
    }

    private final void retryBillingServiceConnectionWithExponentialBackoff() {
        if (this.reconnectionAlreadyScheduled) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.BILLING_CLIENT_RETRY_ALREADY_SCHEDULED);
            return;
        }
        LogIntent logIntent = LogIntent.WARNING;
        String str = String.format(BillingStrings.BILLING_CLIENT_RETRY, Arrays.copyOf(new Object[]{Long.valueOf(this.reconnectMilliseconds)}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.reconnectionAlreadyScheduled = true;
        startConnectionOnMainThread(this.reconnectMilliseconds);
        this.reconnectMilliseconds = Math.min(this.reconnectMilliseconds * ((long) 2), 900000L);
    }

    private final synchronized void sendErrorsToAllPendingRequests(final PurchasesError purchasesError) {
        while (true) {
            s<l<PurchasesError, i0>, Long> sVarPoll = this.serviceRequests.poll();
            if (sVarPoll != null) {
                final l<PurchasesError, i0> lVarA = sVarPoll.a();
                this.mainHandler.post(new Runnable() { // from class: ob.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        BillingWrapper.sendErrorsToAllPendingRequests$lambda$31$lambda$30(lVarA, purchasesError);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendErrorsToAllPendingRequests$lambda$31$lambda$30(l lVar, PurchasesError purchasesError) {
        r.f(lVar, "$serviceRequest");
        r.f(purchasesError, "$error");
        lVar.invoke(purchasesError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startConnectionOnMainThread$lambda$4(BillingWrapper billingWrapper) {
        r.f(billingWrapper, "this$0");
        billingWrapper.startConnection();
    }

    private final void trackProductDetailsNotSupportedIfNeeded() {
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        com.android.billingclient.api.a aVar = this.billingClient;
        e eVarE = aVar != null ? aVar.e("fff") : null;
        if (eVarE == null || eVarE.b() != -2) {
            return;
        }
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        int iB = eVarE.b();
        String strA = eVarE.a();
        r.e(strA, "billingResult.debugMessage");
        diagnosticsTracker.trackProductDetailsNotSupported(iB, strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void withConnectedClient(l<? super com.android.billingclient.api.a, i0> lVar) {
        com.android.billingclient.api.a aVar = this.billingClient;
        i0 i0Var = null;
        if (aVar != null) {
            if (!aVar.f()) {
                aVar = null;
            }
            if (aVar != null) {
                lVar.invoke(aVar);
                i0Var = i0.f15558a;
            }
        }
        if (i0Var == null) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            String str = String.format(BillingStrings.BILLING_CLIENT_DISCONNECTED, Arrays.copyOf(new Object[]{getStackTrace()}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }

    public final void acknowledge$purchases_defaultsRelease(String str, PostReceiptInitiationSource postReceiptInitiationSource, l<? super String, i0> lVar) {
        r.f(str, "token");
        r.f(postReceiptInitiationSource, "initiationSource");
        r.f(lVar, "onAcknowledged");
        LogIntent logIntent = LogIntent.PURCHASE;
        String str2 = String.format(PurchaseStrings.ACKNOWLEDGING_PURCHASE, Arrays.copyOf(new Object[]{str}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        BillingClientUseCase.run$default(new AcknowledgePurchaseUseCase(new AcknowledgePurchaseUseCaseParams(str, postReceiptInitiationSource, getAppInBackground()), lVar, BillingWrapper$acknowledge$1.INSTANCE, new BillingWrapper$acknowledge$2(this), new BillingWrapper$acknowledge$3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean z10, StoreTransaction storeTransaction, boolean z11, PostReceiptInitiationSource postReceiptInitiationSource) {
        String purchaseToken;
        l<? super String, i0> anonymousClass3;
        r.f(storeTransaction, "purchase");
        r.f(postReceiptInitiationSource, "initiationSource");
        if (storeTransaction.getType() == ProductType.UNKNOWN || storeTransaction.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        Purchase originalGooglePurchase = StoreTransactionConversionsKt.getOriginalGooglePurchase(storeTransaction);
        boolean zH = originalGooglePurchase != null ? originalGooglePurchase.h() : false;
        if (!(storeTransaction.getType() == ProductType.INAPP)) {
            if (z10 && !zH) {
                purchaseToken = storeTransaction.getPurchaseToken();
                anonymousClass3 = new AnonymousClass3(this.deviceCache);
                acknowledge$purchases_defaultsRelease(purchaseToken, postReceiptInitiationSource, anonymousClass3);
                return;
            }
            this.deviceCache.addSuccessfullyPostedToken(storeTransaction.getPurchaseToken());
        }
        if (z10 && z11) {
            consumePurchase$purchases_defaultsRelease(storeTransaction.getPurchaseToken(), postReceiptInitiationSource, new AnonymousClass1(this.deviceCache));
            return;
        }
        if (z10 && !zH) {
            LogWrapperKt.log(LogIntent.PURCHASE, PurchaseStrings.NOT_CONSUMING_IN_APP_PURCHASE_ACCORDING_TO_BACKEND);
            purchaseToken = storeTransaction.getPurchaseToken();
            anonymousClass3 = new AnonymousClass2(this.deviceCache);
            acknowledge$purchases_defaultsRelease(purchaseToken, postReceiptInitiationSource, anonymousClass3);
            return;
        }
        this.deviceCache.addSuccessfullyPostedToken(storeTransaction.getPurchaseToken());
    }

    public final void consumePurchase$purchases_defaultsRelease(String str, PostReceiptInitiationSource postReceiptInitiationSource, l<? super String, i0> lVar) {
        r.f(str, "token");
        r.f(postReceiptInitiationSource, "initiationSource");
        r.f(lVar, "onConsumed");
        LogIntent logIntent = LogIntent.PURCHASE;
        String str2 = String.format(PurchaseStrings.CONSUMING_PURCHASE, Arrays.copyOf(new Object[]{str}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        BillingClientUseCase.run$default(new ConsumePurchaseUseCase(new ConsumePurchaseUseCaseParams(str, postReceiptInitiationSource, getAppInBackground()), lVar, BillingWrapper$consumePurchase$1.INSTANCE, new BillingWrapper$consumePurchase$2(this), new BillingWrapper$consumePurchase$3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    protected void endConnection() {
        this.mainHandler.post(new Runnable() { // from class: ob.a
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.endConnection$lambda$9(this.f16433a);
            }
        });
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String str, ProductType productType, String str2, l<? super StoreTransaction, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "appUserID");
        r.f(productType, "productType");
        r.f(str2, "productId");
        r.f(lVar, "onCompletion");
        r.f(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str3 = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{str2, productType.name()}, 2));
        r.e(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent, str3);
        String googleProductType = ProductTypeConversionsKt.toGoogleProductType(productType);
        i0 i0Var = null;
        if (googleProductType != null) {
            BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, googleProductType, getAppInBackground()), new BillingWrapper$findPurchaseInPurchaseHistory$1$1(productType, lVar, str2, lVar2), lVar2, new BillingWrapper$findPurchaseInPurchaseHistory$1$2(this), new BillingWrapper$findPurchaseInPurchaseHistory$1$3(this)), 0L, 1, null);
            i0Var = i0.f15558a;
        }
        if (i0Var == null) {
            lVar2.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, PurchaseStrings.NOT_RECOGNIZED_PRODUCT_TYPE));
        }
    }

    public final boolean getAppInBackground() {
        return getPurchasesStateProvider().getPurchasesState().getAppInBackground();
    }

    public final synchronized com.android.billingclient.api.a getBillingClient() {
        return this.billingClient;
    }

    public final Map<String, PurchaseContext> getPurchaseContext$purchases_defaultsRelease() {
        return this.purchaseContext;
    }

    public final void getPurchaseType$purchases_defaultsRelease(String str, l<? super ProductType, i0> lVar) {
        r.f(str, "purchaseToken");
        r.f(lVar, "listener");
        queryPurchaseType("subs", str, lVar, new BillingWrapper$getPurchaseType$1(lVar, this, str));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getStorefront(l<? super String, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        LogUtilsKt.verboseLog(BillingStrings.BILLING_INITIATE_GETTING_COUNTRY_CODE);
        BillingClientUseCase.run$default(new GetBillingConfigUseCase(new GetBillingConfigUseCaseParams(getAppInBackground()), this.deviceCache, new C05671(lVar), lVar2, new C05682(this), new C05693(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public boolean isConnected() {
        com.android.billingclient.api.a aVar = this.billingClient;
        if (aVar != null) {
            return aVar.f();
        }
        return false;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
        String optionId;
        ReplacementMode replacementMode;
        PresentedOfferingContext presentedOfferingContext2;
        GoogleReplacementMode googleReplacementMode;
        r.f(activity, "activity");
        r.f(str, "appUserID");
        r.f(purchasingData, "purchasingData");
        GooglePurchasingData googlePurchasingData = purchasingData instanceof GooglePurchasingData ? (GooglePurchasingData) purchasingData : null;
        if (googlePurchasingData == null) {
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
            String str2 = String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Play", "GooglePurchasingData"}, 2));
            r.e(str2, "format(this, *args)");
            PurchasesError purchasesError = new PurchasesError(purchasesErrorCode, str2);
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                return;
            }
            return;
        }
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            optionId = null;
        } else {
            if (!(googlePurchasingData instanceof GooglePurchasingData.Subscription)) {
                throw new q();
            }
            optionId = ((GooglePurchasingData.Subscription) googlePurchasingData).getOptionId();
        }
        if (replaceProductInfo != null) {
            LogIntent logIntent = LogIntent.PURCHASE;
            String str3 = String.format(PurchaseStrings.UPGRADING_SKU, Arrays.copyOf(new Object[]{replaceProductInfo.getOldPurchase().getProductIds().get(0), googlePurchasingData.getProductId()}, 2));
            r.e(str3, "format(this, *args)");
            LogWrapperKt.log(logIntent, str3);
        } else {
            LogIntent logIntent2 = LogIntent.PURCHASE;
            String str4 = String.format(PurchaseStrings.PURCHASING_PRODUCT, Arrays.copyOf(new Object[]{googlePurchasingData.getProductId()}, 1));
            r.e(str4, "format(this, *args)");
            LogWrapperKt.log(logIntent2, str4);
        }
        synchronized (this) {
            if (replaceProductInfo != null) {
                try {
                    replacementMode = replaceProductInfo.getReplacementMode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                replacementMode = null;
            }
            String productId = replacementMode == GoogleReplacementMode.DEFERRED ? (String) c0.Y(replaceProductInfo.getOldPurchase().getProductIds()) : googlePurchasingData.getProductId();
            Map<String, PurchaseContext> map = this.purchaseContext;
            ProductType productType = googlePurchasingData.getProductType();
            ReplacementMode replacementMode2 = replaceProductInfo != null ? replaceProductInfo.getReplacementMode() : null;
            if (replacementMode2 instanceof GoogleReplacementMode) {
                googleReplacementMode = (GoogleReplacementMode) replacementMode2;
                presentedOfferingContext2 = presentedOfferingContext;
            } else {
                presentedOfferingContext2 = presentedOfferingContext;
                googleReplacementMode = null;
            }
            map.put(productId, new PurchaseContext(productType, presentedOfferingContext2, optionId, googleReplacementMode));
            i0 i0Var = i0.f15558a;
        }
        executeRequestOnUIThread$default(this, null, new C05712(purchasingData, replaceProductInfo, str, bool, activity), 1, null);
    }

    @Override // v6.c
    public void onBillingServiceDisconnected() {
        LogIntent logIntent = LogIntent.WARNING;
        Object[] objArr = new Object[1];
        com.android.billingclient.api.a aVar = this.billingClient;
        objArr[0] = aVar != null ? aVar.toString() : null;
        String str = String.format(BillingStrings.BILLING_SERVICE_DISCONNECTED_INSTANCE, Arrays.copyOf(objArr, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
    }

    @Override // v6.c
    public void onBillingSetupFinished(final e eVar) {
        r.f(eVar, "billingResult");
        this.mainHandler.post(new Runnable() { // from class: ob.e
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.onBillingSetupFinished$lambda$18(eVar, this);
            }
        });
    }

    @Override // v6.m
    public void onPurchasesUpdated(e eVar, List<? extends Purchase> list) {
        r.f(eVar, "billingResult");
        List<? extends Purchase> listM = list == null ? u.m() : list;
        if (eVar.b() == 0 && (!listM.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listM.iterator();
            while (it.hasNext()) {
                getStoreTransaction((Purchase) it.next(), new BillingWrapper$onPurchasesUpdated$1$1(arrayList, listM, this));
            }
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        StringBuilder sb2 = new StringBuilder();
        String str = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(eVar)}, 1));
        r.e(str, "format(this, *args)");
        sb2.append(str);
        String str2 = null;
        List<? extends Purchase> list2 = !listM.isEmpty() ? listM : null;
        if (list2 != null) {
            str2 = "Purchases:" + c0.h0(list2, ", ", null, null, 0, null, BillingWrapper$onPurchasesUpdated$3$1.INSTANCE, 30, null);
        }
        sb2.append(str2);
        LogWrapperKt.log(logIntent, sb2.toString());
        String str3 = "Error updating purchases. " + BillingResultExtensionsKt.toHumanReadableDescription(eVar);
        int iB = eVar.b();
        if (list == null && eVar.b() == 0) {
            iB = 6;
            str3 = "Error: onPurchasesUpdated received an OK BillingResult with a Null purchases list.";
        }
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(iB, str3);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesErrorBillingResponseToPurchasesError);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String str, l<? super List<StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "appUserID");
        r.f(lVar, "onReceivePurchaseHistory");
        r.f(lVar2, "onReceivePurchaseHistoryError");
        queryPurchaseHistoryAsync("subs", new C05721(lVar2, lVar), lVar2);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(ProductType productType, Set<String> set, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(productType, "productType");
        r.f(set, "productIds");
        r.f(lVar, "onReceive");
        r.f(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(OfferingStrings.FETCHING_PRODUCTS, Arrays.copyOf(new Object[]{c0.h0(set, null, null, null, 0, null, null, 63, null)}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        BillingClientUseCase.run$default(new QueryProductDetailsUseCase(new QueryProductDetailsUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, set, productType, getAppInBackground()), lVar, lVar2, new BillingWrapper$queryProductDetailsAsync$useCase$1(this), new BillingWrapper$queryProductDetailsAsync$useCase$2(this)), 0L, 1, null);
    }

    public final void queryPurchaseHistoryAsync(String str, l<? super List<? extends PurchaseHistoryRecord>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "productType");
        r.f(lVar, "onReceivePurchaseHistory");
        r.f(lVar2, "onReceivePurchaseHistoryError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(RestoreStrings.QUERYING_PURCHASE_HISTORY, Arrays.copyOf(new Object[]{str}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, str, getAppInBackground()), lVar, lVar2, new C05731(this), new C05742(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String str, l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "appUserID");
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.QUERYING_PURCHASE);
        BillingClientUseCase.run$default(new QueryPurchasesUseCase(new QueryPurchasesUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground()), lVar, lVar2, new C05781(this), new C05792(this)), 0L, 1, null);
    }

    public final synchronized void setBillingClient(com.android.billingclient.api.a aVar) {
        this.billingClient = aVar;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list, zd.a<i0> aVar) {
        r.f(activity, "activity");
        r.f(list, "inAppMessageTypes");
        r.f(aVar, "subscriptionStatusChange");
        if (list.isEmpty()) {
            LogUtilsKt.errorLog$default(BillingStrings.BILLING_UNSPECIFIED_INAPP_MESSAGE_TYPES, null, 2, null);
            return;
        }
        f.a aVarA = f.a();
        r.e(aVarA, "newBuilder()");
        Iterator<? extends InAppMessageType> it = list.iterator();
        while (it.hasNext()) {
            aVarA.a(it.next().getInAppMessageCategoryId$purchases_defaultsRelease());
        }
        f fVarB = aVarA.b();
        r.e(fVarB, "inAppMessageParamsBuilder.build()");
        executeRequestOnUIThread$default(this, null, new C05801(new WeakReference(activity), fVarB, aVar), 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        synchronized (this) {
            if (this.billingClient == null) {
                this.billingClient = this.clientFactory.buildClient(this);
            }
            this.reconnectionAlreadyScheduled = false;
            com.android.billingclient.api.a aVar = this.billingClient;
            if (aVar != null) {
                if (!aVar.f()) {
                    LogIntent logIntent = LogIntent.DEBUG;
                    String str = String.format(BillingStrings.BILLING_CLIENT_STARTING, Arrays.copyOf(new Object[]{aVar}, 1));
                    r.e(str, "format(this, *args)");
                    LogWrapperKt.log(logIntent, str);
                    try {
                        aVar.m(this);
                    } catch (IllegalStateException e10) {
                        LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                        String str2 = String.format(BillingStrings.ILLEGAL_STATE_EXCEPTION_WHEN_CONNECTING, Arrays.copyOf(new Object[]{e10}, 1));
                        r.e(str2, "format(this, *args)");
                        LogWrapperKt.log(logIntent2, str2);
                        sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e10.getMessage()));
                    }
                }
                i0 i0Var = i0.f15558a;
            }
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long j10) {
        this.mainHandler.postDelayed(new Runnable() { // from class: ob.d
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.startConnectionOnMainThread$lambda$4(this.f16436a);
            }
        }, j10);
    }
}
