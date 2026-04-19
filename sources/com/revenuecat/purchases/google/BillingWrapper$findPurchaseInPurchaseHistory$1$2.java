package com.revenuecat.purchases.google;

import ae.o;
import ae.r;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
/* synthetic */ class BillingWrapper$findPurchaseInPurchaseHistory$1$2 extends o implements l<l<? super com.android.billingclient.api.a, ? extends i0>, i0> {
    BillingWrapper$findPurchaseInPurchaseHistory$1$2(Object obj) {
        super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(l<? super com.android.billingclient.api.a, ? extends i0> lVar) {
        invoke2((l<? super com.android.billingclient.api.a, i0>) lVar);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(l<? super com.android.billingclient.api.a, i0> lVar) {
        r.f(lVar, "p0");
        ((BillingWrapper) this.receiver).withConnectedClient(lVar);
    }
}
