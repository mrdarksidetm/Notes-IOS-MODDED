package com.revenuecat.purchases.google.usecase;

import ae.r;
import ae.s;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import md.i0;
import v6.g;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class GetBillingConfigUseCase extends BillingClientUseCase<com.android.billingclient.api.c> {
    private final DeviceCache deviceCache;
    private final l<PurchasesError, i0> onError;
    private final l<com.android.billingclient.api.c, i0> onReceive;
    private final l<l<? super com.android.billingclient.api.a, i0>, i0> withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<com.android.billingclient.api.a, i0> {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase, com.android.billingclient.api.e eVar, com.android.billingclient.api.c cVar) {
            r.f(atomicBoolean, "$hasResponded");
            r.f(getBillingConfigUseCase, "this$0");
            r.f(eVar, "result");
            if (!atomicBoolean.getAndSet(true)) {
                BillingClientUseCase.processResult$default(getBillingConfigUseCase, eVar, cVar, null, null, 12, null);
                return;
            }
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str = String.format(OfferingStrings.EXTRA_GET_BILLING_CONFIG_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(eVar.b())}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.a aVar) {
            r.f(aVar, "$this$invoke");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            g gVarA = g.a().a();
            final GetBillingConfigUseCase getBillingConfigUseCase = GetBillingConfigUseCase.this;
            aVar.d(gVarA, new v6.d() { // from class: com.revenuecat.purchases.google.usecase.c
                @Override // v6.d
                public final void a(com.android.billingclient.api.e eVar, com.android.billingclient.api.c cVar) {
                    GetBillingConfigUseCase.AnonymousClass1.invoke$lambda$0(atomicBoolean, getBillingConfigUseCase, eVar, cVar);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetBillingConfigUseCase(GetBillingConfigUseCaseParams getBillingConfigUseCaseParams, DeviceCache deviceCache, l<? super com.android.billingclient.api.c, i0> lVar, l<? super PurchasesError, i0> lVar2, l<? super l<? super com.android.billingclient.api.a, i0>, i0> lVar3, p<? super Long, ? super l<? super PurchasesError, i0>, i0> pVar) {
        super(getBillingConfigUseCaseParams, lVar2, pVar);
        r.f(getBillingConfigUseCaseParams, "useCaseParams");
        r.f(deviceCache, "deviceCache");
        r.f(lVar, "onReceive");
        r.f(lVar2, "onError");
        r.f(lVar3, "withConnectedClient");
        r.f(pVar, "executeRequestOnUIThread");
        this.deviceCache = deviceCache;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    public final DeviceCache getDeviceCache() {
        return this.deviceCache;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error getting billing config";
    }

    public final l<PurchasesError, i0> getOnError() {
        return this.onError;
    }

    public final l<com.android.billingclient.api.c, i0> getOnReceive() {
        return this.onReceive;
    }

    public final l<l<? super com.android.billingclient.api.a, i0>, i0> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(com.android.billingclient.api.c cVar) {
        if (cVar == null) {
            this.onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, BillingStrings.BILLING_CONFIG_NULL_ON_SUCCESS));
            return;
        }
        DeviceCache deviceCache = this.deviceCache;
        String strA = cVar.a();
        r.e(strA, "received.countryCode");
        deviceCache.setStorefront(strA);
        this.onReceive.invoke(cVar);
    }
}
