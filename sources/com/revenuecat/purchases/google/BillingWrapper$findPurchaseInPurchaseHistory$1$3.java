package com.revenuecat.purchases.google;

import ae.o;
import ae.r;
import com.revenuecat.purchases.PurchasesError;
import md.i0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
/* synthetic */ class BillingWrapper$findPurchaseInPurchaseHistory$1$3 extends o implements p<Long, l<? super PurchasesError, ? extends i0>, i0> {
    BillingWrapper$findPurchaseInPurchaseHistory$1$3(Object obj) {
        super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(Long l10, l<? super PurchasesError, ? extends i0> lVar) {
        invoke2(l10, (l<? super PurchasesError, i0>) lVar);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Long l10, l<? super PurchasesError, i0> lVar) {
        r.f(lVar, "p1");
        ((BillingWrapper) this.receiver).executeRequestOnUIThread(l10, lVar);
    }
}
