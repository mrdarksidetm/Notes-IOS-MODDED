package com.revenuecat.purchases.google.usecase;

import ae.r;
import ae.s;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Map;
import md.i0;
import nd.r0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class QueryPurchasesUseCase extends BillingClientUseCase<Map<String, ? extends StoreTransaction>> {
    private final l<PurchasesError, i0> onError;
    private final l<Map<String, StoreTransaction>, i0> onSuccess;
    private final QueryPurchasesUseCaseParams useCaseParams;
    private final l<l<? super com.android.billingclient.api.a, i0>, i0> withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<com.android.billingclient.api.a, i0> {

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase$executeAsync$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02001 extends s implements l<Map<String, ? extends StoreTransaction>, i0> {
            final /* synthetic */ QueryPurchasesUseCase this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase$executeAsync$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C02011 extends s implements l<Map<String, ? extends StoreTransaction>, i0> {
                final /* synthetic */ Map<String, StoreTransaction> $activeSubs;
                final /* synthetic */ QueryPurchasesUseCase this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02011(QueryPurchasesUseCase queryPurchasesUseCase, Map<String, StoreTransaction> map) {
                    super(1);
                    this.this$0 = queryPurchasesUseCase;
                    this.$activeSubs = map;
                }

                @Override // zd.l
                public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends StoreTransaction> map) {
                    invoke2((Map<String, StoreTransaction>) map);
                    return i0.f15558a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Map<String, StoreTransaction> map) {
                    r.f(map, "unconsumedInApps");
                    this.this$0.onOk2(r0.l(this.$activeSubs, map));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02001(QueryPurchasesUseCase queryPurchasesUseCase) {
                super(1);
                this.this$0 = queryPurchasesUseCase;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends StoreTransaction> map) {
                invoke2((Map<String, StoreTransaction>) map);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Map<String, StoreTransaction> map) {
                r.f(map, "activeSubs");
                QueryPurchasesUseCase queryPurchasesUseCase = this.this$0;
                queryPurchasesUseCase.queryInApps(new C02011(queryPurchasesUseCase, map), this.this$0.getOnError());
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.a aVar) {
            r.f(aVar, "$this$invoke");
            QueryPurchasesUseCase queryPurchasesUseCase = QueryPurchasesUseCase.this;
            queryPurchasesUseCase.querySubscriptions(new C02001(queryPurchasesUseCase), QueryPurchasesUseCase.this.getOnError());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QueryPurchasesUseCase(QueryPurchasesUseCaseParams queryPurchasesUseCaseParams, l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2, l<? super l<? super com.android.billingclient.api.a, i0>, i0> lVar3, p<? super Long, ? super l<? super PurchasesError, i0>, i0> pVar) {
        super(queryPurchasesUseCaseParams, lVar2, pVar);
        r.f(queryPurchasesUseCaseParams, "useCaseParams");
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        r.f(lVar3, "withConnectedClient");
        r.f(pVar, "executeRequestOnUIThread");
        this.useCaseParams = queryPurchasesUseCaseParams;
        this.onSuccess = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryInApps(l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.useCaseParams.getDateProvider(), this.useCaseParams.getDiagnosticsTrackerIfEnabled(), this.useCaseParams.getAppInBackground(), "inapp"), lVar, lVar2, this.withConnectedClient, getExecuteRequestOnUIThread()), 0L, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void querySubscriptions(l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.useCaseParams.getDateProvider(), this.useCaseParams.getDiagnosticsTrackerIfEnabled(), this.useCaseParams.getAppInBackground(), "subs"), lVar, lVar2, this.withConnectedClient, getExecuteRequestOnUIThread()), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when querying purchases";
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
