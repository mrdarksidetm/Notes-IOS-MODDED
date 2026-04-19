package com.revenuecat.purchases;

import ae.r;
import ae.s;
import md.i0;
import md.t;
import md.u;
import qd.d;
import zd.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesExtensionsCommonKt$awaitPurchase$2$2 extends s implements p<PurchasesError, Boolean, i0> {
    final /* synthetic */ d<PurchaseResult> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutinesExtensionsCommonKt$awaitPurchase$2$2(d<? super PurchaseResult> dVar) {
        super(2);
        this.$continuation = dVar;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
        invoke(purchasesError, bool.booleanValue());
        return i0.f15558a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z10) {
        r.f(purchasesError, "purchasesError");
        d<PurchaseResult> dVar = this.$continuation;
        t.a aVar = t.f15576b;
        dVar.resumeWith(t.b(u.a(new PurchasesTransactionException(purchasesError, z10))));
    }
}
