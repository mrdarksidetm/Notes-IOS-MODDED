package com.revenuecat.purchases.google.usecase;

import ae.r;
import ae.s;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;
import md.i0;
import md.q;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class AcknowledgePurchaseUseCase extends BillingClientUseCase<String> {
    private final l<PurchasesError, i0> onError;
    private final l<String, i0> onReceive;
    private final AcknowledgePurchaseUseCaseParams useCaseParams;
    private final l<l<? super com.android.billingclient.api.a, i0>, i0> withConnectedClient;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostReceiptInitiationSource.values().length];
            try {
                iArr[PostReceiptInitiationSource.RESTORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostReceiptInitiationSource.PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<com.android.billingclient.api.a, i0> {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(AcknowledgePurchaseUseCase acknowledgePurchaseUseCase, com.android.billingclient.api.e eVar) {
            r.f(acknowledgePurchaseUseCase, "this$0");
            r.f(eVar, "billingResult");
            BillingClientUseCase.processResult$default(acknowledgePurchaseUseCase, eVar, acknowledgePurchaseUseCase.useCaseParams.getPurchaseToken(), null, new AcknowledgePurchaseUseCase$executeAsync$1$1$1(acknowledgePurchaseUseCase), 4, null);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.a aVar) {
            r.f(aVar, "$this$invoke");
            v6.a aVarA = v6.a.b().b(AcknowledgePurchaseUseCase.this.useCaseParams.getPurchaseToken()).a();
            r.e(aVarA, "newBuilder()\n           …\n                .build()");
            final AcknowledgePurchaseUseCase acknowledgePurchaseUseCase = AcknowledgePurchaseUseCase.this;
            aVar.a(aVarA, new v6.b() { // from class: com.revenuecat.purchases.google.usecase.a
                @Override // v6.b
                public final void a(com.android.billingclient.api.e eVar) {
                    AcknowledgePurchaseUseCase.AnonymousClass1.invoke$lambda$0(acknowledgePurchaseUseCase, eVar);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AcknowledgePurchaseUseCase(AcknowledgePurchaseUseCaseParams acknowledgePurchaseUseCaseParams, l<? super String, i0> lVar, l<? super PurchasesError, i0> lVar2, l<? super l<? super com.android.billingclient.api.a, i0>, i0> lVar3, p<? super Long, ? super l<? super PurchasesError, i0>, i0> pVar) {
        super(acknowledgePurchaseUseCaseParams, lVar2, pVar);
        r.f(acknowledgePurchaseUseCaseParams, "useCaseParams");
        r.f(lVar, "onReceive");
        r.f(lVar2, "onError");
        r.f(lVar3, "withConnectedClient");
        r.f(pVar, "executeRequestOnUIThread");
        this.useCaseParams = acknowledgePurchaseUseCaseParams;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    protected boolean getBackoffForNetworkErrors() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.useCaseParams.getInitiationSource().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return true;
        }
        throw new q();
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error acknowledging purchase";
    }

    public final l<PurchasesError, i0> getOnError() {
        return this.onError;
    }

    public final l<String, i0> getOnReceive() {
        return this.onReceive;
    }

    public final l<l<? super com.android.billingclient.api.a, i0>, i0> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(String str) {
        r.f(str, "received");
        this.onReceive.invoke(str);
    }
}
