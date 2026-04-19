package com.revenuecat.purchases.google.usecase;

import ae.r;
import ae.s;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase;
import md.i0;
import md.q;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class ConsumePurchaseUseCase extends BillingClientUseCase<String> {
    private final l<PurchasesError, i0> onError;
    private final l<String, i0> onReceive;
    private final ConsumePurchaseUseCaseParams useCaseParams;
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<com.android.billingclient.api.a, i0> {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(ConsumePurchaseUseCase consumePurchaseUseCase, com.android.billingclient.api.e eVar, String str) {
            r.f(consumePurchaseUseCase, "this$0");
            r.f(eVar, "billingResult");
            r.f(str, "purchaseToken");
            BillingClientUseCase.processResult$default(consumePurchaseUseCase, eVar, str, null, new ConsumePurchaseUseCase$executeAsync$1$1$1(consumePurchaseUseCase), 4, null);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.a aVar) {
            r.f(aVar, "$this$invoke");
            v6.e eVarA = v6.e.b().b(ConsumePurchaseUseCase.this.useCaseParams.getPurchaseToken()).a();
            r.e(eVarA, "newBuilder()\n           …\n                .build()");
            final ConsumePurchaseUseCase consumePurchaseUseCase = ConsumePurchaseUseCase.this;
            aVar.b(eVarA, new v6.f() { // from class: com.revenuecat.purchases.google.usecase.b
                @Override // v6.f
                public final void a(com.android.billingclient.api.e eVar, String str) {
                    ConsumePurchaseUseCase.AnonymousClass1.invoke$lambda$0(consumePurchaseUseCase, eVar, str);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsumePurchaseUseCase(ConsumePurchaseUseCaseParams consumePurchaseUseCaseParams, l<? super String, i0> lVar, l<? super PurchasesError, i0> lVar2, l<? super l<? super com.android.billingclient.api.a, i0>, i0> lVar3, p<? super Long, ? super l<? super PurchasesError, i0>, i0> pVar) {
        super(consumePurchaseUseCaseParams, lVar2, pVar);
        r.f(consumePurchaseUseCaseParams, "useCaseParams");
        r.f(lVar, "onReceive");
        r.f(lVar2, "onError");
        r.f(lVar3, "withConnectedClient");
        r.f(pVar, "executeRequestOnUIThread");
        this.useCaseParams = consumePurchaseUseCaseParams;
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
        return "Error consuming purchase";
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
