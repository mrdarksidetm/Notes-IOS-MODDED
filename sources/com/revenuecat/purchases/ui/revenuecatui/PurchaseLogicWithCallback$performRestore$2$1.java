package com.revenuecat.purchases.ui.revenuecatui;

import ae.r;
import ae.s;
import md.i0;
import md.t;
import qd.d;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PurchaseLogicWithCallback$performRestore$2$1 extends s implements l<PurchaseLogicResult, i0> {
    final /* synthetic */ d<PurchaseLogicResult> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PurchaseLogicWithCallback$performRestore$2$1(d<? super PurchaseLogicResult> dVar) {
        super(1);
        this.$continuation = dVar;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchaseLogicResult purchaseLogicResult) {
        invoke2(purchaseLogicResult);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchaseLogicResult purchaseLogicResult) {
        r.f(purchaseLogicResult, "result");
        this.$continuation.resumeWith(t.b(purchaseLogicResult));
    }
}
