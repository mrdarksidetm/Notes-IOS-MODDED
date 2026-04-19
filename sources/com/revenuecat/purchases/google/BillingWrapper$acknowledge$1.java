package com.revenuecat.purchases.google;

import ae.r;
import ae.s;
import com.revenuecat.purchases.PurchasesError;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class BillingWrapper$acknowledge$1 extends s implements l<PurchasesError, i0> {
    public static final BillingWrapper$acknowledge$1 INSTANCE = new BillingWrapper$acknowledge$1();

    BillingWrapper$acknowledge$1() {
        super(1);
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError purchasesError) {
        r.f(purchasesError, "<anonymous parameter 0>");
    }
}
