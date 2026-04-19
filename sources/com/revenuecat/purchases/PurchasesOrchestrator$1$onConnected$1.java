package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import java.util.Arrays;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PurchasesOrchestrator$1$onConnected$1 extends s implements l<String, i0> {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$1$onConnected$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(1);
        this.this$0 = purchasesOrchestrator;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(String str) {
        invoke2(str);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        r.f(str, "countryCode");
        this.this$0.storefrontCountryCode = str;
        String str2 = String.format(BillingStrings.BILLING_COUNTRY_CODE, Arrays.copyOf(new Object[]{str}, 1));
        r.e(str2, "format(this, *args)");
        LogUtilsKt.debugLog(str2);
    }
}
