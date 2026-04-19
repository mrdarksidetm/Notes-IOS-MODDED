package com.revenuecat.purchases.google.usecase;

import ae.r;
import ae.s;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class AcknowledgePurchaseUseCase$executeAsync$1$1$1 extends s implements l<com.android.billingclient.api.e, i0> {
    final /* synthetic */ AcknowledgePurchaseUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcknowledgePurchaseUseCase$executeAsync$1$1$1(AcknowledgePurchaseUseCase acknowledgePurchaseUseCase) {
        super(1);
        this.this$0 = acknowledgePurchaseUseCase;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.e eVar) {
        invoke2(eVar);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.android.billingclient.api.e eVar) {
        String str;
        LogIntent logIntent;
        r.f(eVar, "errorBillingResult");
        if (eVar.b() == 8 && this.this$0.useCaseParams.getInitiationSource() == PostReceiptInitiationSource.RESTORE) {
            str = PurchaseStrings.ACKNOWLEDGING_PURCHASE_ERROR_RESTORE;
            logIntent = LogIntent.GOOGLE_WARNING;
        } else {
            str = this.this$0.getErrorMessage() + " - " + BillingResultExtensionsKt.toHumanReadableDescription(eVar);
            logIntent = LogIntent.GOOGLE_ERROR;
        }
        LogWrapperKt.log(logIntent, str);
        this.this$0.getOnError().invoke(ErrorsKt.billingResponseToPurchasesError(eVar.b(), str));
    }
}
