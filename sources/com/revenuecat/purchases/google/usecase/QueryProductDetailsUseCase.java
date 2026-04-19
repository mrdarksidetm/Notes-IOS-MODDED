package com.revenuecat.purchases.google.usecase;

import ae.r;
import ae.s;
import com.android.billingclient.api.e;
import com.android.billingclient.api.h;
import com.android.billingclient.api.i;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreProductConversionsKt;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import md.i0;
import nd.c0;
import nd.u;
import v6.j;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class QueryProductDetailsUseCase extends BillingClientUseCase<List<? extends h>> {
    private final l<PurchasesError, i0> onError;
    private final l<List<? extends StoreProduct>, i0> onReceive;
    private final QueryProductDetailsUseCaseParams useCaseParams;
    private final l<l<? super com.android.billingclient.api.a, i0>, i0> withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<com.android.billingclient.api.a, i0> {
        final /* synthetic */ Set<String> $nonEmptyProductIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Set<String> set) {
            super(1);
            this.$nonEmptyProductIds = set;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.a aVar) {
            r.f(aVar, "$this$invoke");
            String googleProductType = ProductTypeConversionsKt.toGoogleProductType(QueryProductDetailsUseCase.this.useCaseParams.getProductType());
            if (googleProductType == null) {
                googleProductType = "inapp";
            }
            i iVarBuildQueryProductDetailsParams = BillingClientParamBuildersKt.buildQueryProductDetailsParams(googleProductType, this.$nonEmptyProductIds);
            final QueryProductDetailsUseCase queryProductDetailsUseCase = QueryProductDetailsUseCase.this;
            queryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse(aVar, googleProductType, iVarBuildQueryProductDetailsParams, new j() { // from class: com.revenuecat.purchases.google.usecase.d
                @Override // v6.j
                public final void a(com.android.billingclient.api.e eVar, List list) {
                    BillingClientUseCase.processResult$default(queryProductDetailsUseCase, eVar, list, null, null, 12, null);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$1, reason: invalid class name and case insensitive filesystem */
    static final class C05821 extends s implements l<h, CharSequence> {
        public static final C05821 INSTANCE = new C05821();

        C05821() {
            super(1);
        }

        @Override // zd.l
        public final CharSequence invoke(h hVar) {
            r.f(hVar, "it");
            String string = hVar.toString();
            r.e(string, "it.toString()");
            return string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QueryProductDetailsUseCase(QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2, l<? super l<? super com.android.billingclient.api.a, i0>, i0> lVar3, p<? super Long, ? super l<? super PurchasesError, i0>, i0> pVar) {
        super(queryProductDetailsUseCaseParams, lVar2, pVar);
        r.f(queryProductDetailsUseCaseParams, "useCaseParams");
        r.f(lVar, "onReceive");
        r.f(lVar2, "onError");
        r.f(lVar3, "withConnectedClient");
        r.f(pVar, "executeRequestOnUIThread");
        this.useCaseParams = queryProductDetailsUseCaseParams;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void queryProductDetailsAsyncEnsuringOneResponse(com.android.billingclient.api.a aVar, final String str, i iVar, final j jVar) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final Date now = this.useCaseParams.getDateProvider().getNow();
        aVar.i(iVar, new j() { // from class: qb.a
            @Override // v6.j
            public final void a(e eVar, List list) {
                QueryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse$lambda$3(atomicBoolean, this, str, now, jVar, eVar, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryProductDetailsAsyncEnsuringOneResponse$lambda$3(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, String str, Date date, j jVar, com.android.billingclient.api.e eVar, List list) {
        r.f(atomicBoolean, "$hasResponded");
        r.f(queryProductDetailsUseCase, "this$0");
        r.f(str, "$productType");
        r.f(date, "$requestStartTime");
        r.f(jVar, "$listener");
        r.f(eVar, "billingResult");
        r.f(list, "productDetailsList");
        if (!atomicBoolean.getAndSet(true)) {
            queryProductDetailsUseCase.trackGoogleQueryProductDetailsRequestIfNeeded(str, eVar, date);
            jVar.a(eVar, list);
        } else {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str2 = String.format(OfferingStrings.EXTRA_QUERY_PRODUCT_DETAILS_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(eVar.b())}, 1));
            r.e(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent, str2);
        }
    }

    private final void trackGoogleQueryProductDetailsRequestIfNeeded(String str, com.android.billingclient.api.e eVar, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int iB = eVar.b();
            String strA = eVar.a();
            r.e(strA, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m22trackGoogleQueryProductDetailsRequestWn2Vu4Y(str, iB, strA, DurationExtensionsKt.between(ke.a.f14459b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        Set<String> productIds = this.useCaseParams.getProductIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj : productIds) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Set setH0 = c0.H0(arrayList);
        if (!setH0.isEmpty()) {
            this.withConnectedClient.invoke(new AnonymousClass1(setH0));
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.EMPTY_PRODUCT_ID_LIST);
            this.onReceive.invoke(u.m());
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when fetching products";
    }

    public final l<PurchasesError, i0> getOnError() {
        return this.onError;
    }

    public final l<List<? extends StoreProduct>, i0> getOnReceive() {
        return this.onReceive;
    }

    public final l<l<? super com.android.billingclient.api.a, i0>, i0> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(List<? extends h> list) {
        onOk2((List<h>) list);
    }

    /* JADX INFO: renamed from: onOk, reason: avoid collision after fix types in other method */
    public void onOk2(List<h> list) {
        r.f(list, "received");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(OfferingStrings.FETCHING_PRODUCTS_FINISHED, Arrays.copyOf(new Object[]{c0.h0(this.useCaseParams.getProductIds(), null, null, null, 0, null, null, 63, null)}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        LogIntent logIntent2 = LogIntent.PURCHASE;
        String str2 = String.format(OfferingStrings.RETRIEVED_PRODUCTS, Arrays.copyOf(new Object[]{c0.h0(list, null, null, null, 0, null, C05821.INSTANCE, 31, null)}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent2, str2);
        List<h> list2 = !list.isEmpty() ? list : null;
        if (list2 != null) {
            for (h hVar : list2) {
                LogIntent logIntent3 = LogIntent.PURCHASE;
                String str3 = String.format(OfferingStrings.LIST_PRODUCTS, Arrays.copyOf(new Object[]{hVar.d(), hVar}, 2));
                r.e(str3, "format(this, *args)");
                LogWrapperKt.log(logIntent3, str3);
            }
        }
        this.onReceive.invoke(StoreProductConversionsKt.toStoreProducts(list));
    }
}
