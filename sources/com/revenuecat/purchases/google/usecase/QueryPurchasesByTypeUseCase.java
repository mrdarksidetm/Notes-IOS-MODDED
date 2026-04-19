package com.revenuecat.purchases.google.usecase;

import ae.r;
import ae.s;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.e;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreTransactionConversionsKt;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import md.i0;
import md.x;
import nd.q0;
import nd.r0;
import nd.v;
import v6.o;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class QueryPurchasesByTypeUseCase extends BillingClientUseCase<Map<String, ? extends StoreTransaction>> {
    private final l<PurchasesError, i0> onError;
    private final l<Map<String, StoreTransaction>, i0> onSuccess;
    private final QueryPurchasesByTypeUseCaseParams useCaseParams;
    private final l<l<? super com.android.billingclient.api.a, i0>, i0> withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<com.android.billingclient.api.a, i0> {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1$lambda$0(QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, com.android.billingclient.api.e eVar, List list) {
            r.f(queryPurchasesByTypeUseCase, "this$0");
            r.f(eVar, "result");
            r.f(list, "purchases");
            BillingClientUseCase.processResult$default(queryPurchasesByTypeUseCase, eVar, queryPurchasesByTypeUseCase.toMapOfGooglePurchaseWrapper(list, queryPurchasesByTypeUseCase.useCaseParams.getProductType()), null, null, 12, null);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.a aVar) {
            i0 i0Var;
            r.f(aVar, "$this$invoke");
            o oVarBuildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams(QueryPurchasesByTypeUseCase.this.useCaseParams.getProductType());
            if (oVarBuildQueryPurchasesParams != null) {
                final QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase = QueryPurchasesByTypeUseCase.this;
                queryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse(aVar, queryPurchasesByTypeUseCase.useCaseParams.getProductType(), oVarBuildQueryPurchasesParams, new v6.l() { // from class: com.revenuecat.purchases.google.usecase.f
                    @Override // v6.l
                    public final void a(com.android.billingclient.api.e eVar, List list) {
                        QueryPurchasesByTypeUseCase.AnonymousClass1.invoke$lambda$1$lambda$0(queryPurchasesByTypeUseCase, eVar, list);
                    }
                });
                i0Var = i0.f15558a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase2 = QueryPurchasesByTypeUseCase.this;
                String str = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchasesByType"}, 1));
                r.e(str, "format(this, *args)");
                LogUtilsKt.errorLog$default(str, null, 2, null);
                com.android.billingclient.api.e eVarA = com.android.billingclient.api.e.c().c(5).a();
                r.e(eVarA, "newBuilder()\n           …                 .build()");
                BillingClientUseCase.processResult$default(queryPurchasesByTypeUseCase2, eVarA, r0.e(), null, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QueryPurchasesByTypeUseCase(QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams, l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2, l<? super l<? super com.android.billingclient.api.a, i0>, i0> lVar3, p<? super Long, ? super l<? super PurchasesError, i0>, i0> pVar) {
        super(queryPurchasesByTypeUseCaseParams, lVar2, pVar);
        r.f(queryPurchasesByTypeUseCaseParams, "useCaseParams");
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        r.f(lVar3, "withConnectedClient");
        r.f(pVar, "executeRequestOnUIThread");
        this.useCaseParams = queryPurchasesByTypeUseCaseParams;
        this.onSuccess = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchasesAsyncWithTrackingEnsuringOneResponse(com.android.billingclient.api.a aVar, final String str, o oVar, final v6.l lVar) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final Date now = this.useCaseParams.getDateProvider().getNow();
        aVar.k(oVar, new v6.l() { // from class: qb.b
            @Override // v6.l
            public final void a(e eVar, List list) {
                QueryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$0(atomicBoolean, this, str, now, lVar, eVar, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$0(AtomicBoolean atomicBoolean, QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, String str, Date date, v6.l lVar, com.android.billingclient.api.e eVar, List list) {
        r.f(atomicBoolean, "$hasResponded");
        r.f(queryPurchasesByTypeUseCase, "this$0");
        r.f(str, "$productType");
        r.f(date, "$requestStartTime");
        r.f(lVar, "$listener");
        r.f(eVar, "billingResult");
        r.f(list, "purchases");
        if (!atomicBoolean.getAndSet(true)) {
            queryPurchasesByTypeUseCase.trackGoogleQueryPurchasesRequestIfNeeded(str, eVar, date);
            lVar.a(eVar, list);
        } else {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str2 = String.format(OfferingStrings.EXTRA_QUERY_PURCHASES_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(eVar.b())}, 1));
            r.e(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfGooglePurchaseWrapper(List<? extends Purchase> list, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ge.o.d(q0.b(v.x(list, 10)), 16));
        for (Purchase purchase : list) {
            String strF = purchase.f();
            r.e(strF, "purchase.purchaseToken");
            md.s sVarA = x.a(UtilsKt.sha1(strF), StoreTransactionConversionsKt.toStoreTransaction$default(purchase, ProductTypeConversionsKt.toRevenueCatProductType(str), null, null, null, 14, null));
            linkedHashMap.put(sVarA.c(), sVarA.d());
        }
        return linkedHashMap;
    }

    private final void trackGoogleQueryPurchasesRequestIfNeeded(String str, com.android.billingclient.api.e eVar, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int iB = eVar.b();
            String strA = eVar.a();
            r.e(strA, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m24trackGoogleQueryPurchasesRequestWn2Vu4Y(str, iB, strA, DurationExtensionsKt.between(ke.a.f14459b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when querying purchases of type " + this.useCaseParams.getProductType();
    }

    public final l<PurchasesError, i0> getOnError() {
        return this.onError;
    }

    public final l<Map<String, StoreTransaction>, i0> getOnSuccess() {
        return this.onSuccess;
    }

    public final l<l<? super com.android.billingclient.api.a, i0>, i0> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(Map<String, ? extends StoreTransaction> map) {
        onOk2((Map<String, StoreTransaction>) map);
    }

    /* JADX INFO: renamed from: onOk, reason: avoid collision after fix types in other method */
    public void onOk2(Map<String, StoreTransaction> map) {
        r.f(map, "received");
        this.onSuccess.invoke(map);
    }
}
