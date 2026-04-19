package com.revenuecat.purchases.google.usecase;

import ae.r;
import ae.s;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseHistoryRecordExtensionsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import md.i0;
import nd.u;
import v6.k;
import v6.n;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class QueryPurchaseHistoryUseCase extends BillingClientUseCase<List<? extends PurchaseHistoryRecord>> {
    private final l<PurchasesError, i0> onError;
    private final l<List<? extends PurchaseHistoryRecord>, i0> onReceive;
    private final QueryPurchaseHistoryUseCaseParams useCaseParams;
    private final l<l<? super com.android.billingclient.api.a, i0>, i0> withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<com.android.billingclient.api.a, i0> {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1$lambda$0(AtomicBoolean atomicBoolean, QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase, Date date, com.android.billingclient.api.e eVar, List list) {
            r.f(atomicBoolean, "$hasResponded");
            r.f(queryPurchaseHistoryUseCase, "this$0");
            r.f(date, "$requestStartTime");
            r.f(eVar, "billingResult");
            if (!atomicBoolean.getAndSet(true)) {
                queryPurchaseHistoryUseCase.trackGoogleQueryPurchaseHistoryRequestIfNeeded(queryPurchaseHistoryUseCase.useCaseParams.getProductType(), eVar, date);
                BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase, eVar, list, null, null, 12, null);
            } else {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                String str = String.format(RestoreStrings.EXTRA_QUERY_PURCHASE_HISTORY_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(eVar.b())}, 1));
                r.e(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
            }
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
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final Date now = QueryPurchaseHistoryUseCase.this.useCaseParams.getDateProvider().getNow();
            n nVarBuildQueryPurchaseHistoryParams = BillingClientParamBuildersKt.buildQueryPurchaseHistoryParams(QueryPurchaseHistoryUseCase.this.useCaseParams.getProductType());
            if (nVarBuildQueryPurchaseHistoryParams != null) {
                final QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase = QueryPurchaseHistoryUseCase.this;
                aVar.j(nVarBuildQueryPurchaseHistoryParams, new k() { // from class: com.revenuecat.purchases.google.usecase.e
                    @Override // v6.k
                    public final void a(com.android.billingclient.api.e eVar, List list) {
                        QueryPurchaseHistoryUseCase.AnonymousClass1.invoke$lambda$1$lambda$0(atomicBoolean, queryPurchaseHistoryUseCase, now, eVar, list);
                    }
                });
                i0Var = i0.f15558a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase2 = QueryPurchaseHistoryUseCase.this;
                String str = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchaseHistory"}, 1));
                r.e(str, "format(this, *args)");
                LogUtilsKt.errorLog$default(str, null, 2, null);
                com.android.billingclient.api.e eVarA = com.android.billingclient.api.e.c().c(5).a();
                r.e(eVarA, "newBuilder()\n           …                 .build()");
                BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase2, eVarA, null, null, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QueryPurchaseHistoryUseCase(QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams, l<? super List<? extends PurchaseHistoryRecord>, i0> lVar, l<? super PurchasesError, i0> lVar2, l<? super l<? super com.android.billingclient.api.a, i0>, i0> lVar3, p<? super Long, ? super l<? super PurchasesError, i0>, i0> pVar) {
        super(queryPurchaseHistoryUseCaseParams, lVar2, pVar);
        r.f(queryPurchaseHistoryUseCaseParams, "useCaseParams");
        r.f(lVar, "onReceive");
        r.f(lVar2, "onError");
        r.f(lVar3, "withConnectedClient");
        r.f(pVar, "executeRequestOnUIThread");
        this.useCaseParams = queryPurchaseHistoryUseCaseParams;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackGoogleQueryPurchaseHistoryRequestIfNeeded(String str, com.android.billingclient.api.e eVar, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int iB = eVar.b();
            String strA = eVar.a();
            r.e(strA, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m23trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(str, iB, strA, DurationExtensionsKt.between(ke.a.f14459b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error receiving purchase history";
    }

    public final l<PurchasesError, i0> getOnError() {
        return this.onError;
    }

    public final l<List<? extends PurchaseHistoryRecord>, i0> getOnReceive() {
        return this.onReceive;
    }

    public final l<l<? super com.android.billingclient.api.a, i0>, i0> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(List<? extends PurchaseHistoryRecord> list) {
        i0 i0Var = null;
        List<? extends PurchaseHistoryRecord> list2 = !(list == null || list.isEmpty()) ? list : null;
        if (list2 != null) {
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                LogIntent logIntent = LogIntent.RC_PURCHASE_SUCCESS;
                String str = String.format(RestoreStrings.PURCHASE_HISTORY_RETRIEVED, Arrays.copyOf(new Object[]{PurchaseHistoryRecordExtensionsKt.toHumanReadableDescription(purchaseHistoryRecord)}, 1));
                r.e(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
            }
            i0Var = i0.f15558a;
        }
        if (i0Var == null) {
            LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.PURCHASE_HISTORY_EMPTY);
        }
        l<List<? extends PurchaseHistoryRecord>, i0> lVar = this.onReceive;
        if (list == null) {
            list = u.m();
        }
        lVar.invoke(list);
    }
}
