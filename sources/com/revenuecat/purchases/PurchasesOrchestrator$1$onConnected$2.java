package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.common.LogUtilsKt;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PurchasesOrchestrator$1$onConnected$2 extends s implements l<PurchasesError, i0> {
    public static final PurchasesOrchestrator$1$onConnected$2 INSTANCE = new PurchasesOrchestrator$1$onConnected$2();

    PurchasesOrchestrator$1$onConnected$2() {
        super(1);
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
    }
}
