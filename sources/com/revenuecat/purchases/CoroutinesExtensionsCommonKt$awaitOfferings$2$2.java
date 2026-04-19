package com.revenuecat.purchases;

import ae.r;
import ae.s;
import md.i0;
import md.t;
import md.u;
import qd.d;
import zd.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesExtensionsCommonKt$awaitOfferings$2$2 extends s implements l<PurchasesError, i0> {
    final /* synthetic */ d<Offerings> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutinesExtensionsCommonKt$awaitOfferings$2$2(d<? super Offerings> dVar) {
        super(1);
        this.$continuation = dVar;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError purchasesError) {
        r.f(purchasesError, "it");
        d<Offerings> dVar = this.$continuation;
        t.a aVar = t.f15576b;
        dVar.resumeWith(t.b(u.a(new PurchasesException(purchasesError))));
    }
}
