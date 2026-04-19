package com.revenuecat.purchases;

import ae.r;
import ae.s;
import md.i0;
import md.t;
import qd.d;
import zd.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesExtensionsCommonKt$awaitRestore$2$2 extends s implements l<CustomerInfo, i0> {
    final /* synthetic */ d<CustomerInfo> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutinesExtensionsCommonKt$awaitRestore$2$2(d<? super CustomerInfo> dVar) {
        super(1);
        this.$continuation = dVar;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
        invoke2(customerInfo);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CustomerInfo customerInfo) {
        r.f(customerInfo, "it");
        this.$continuation.resumeWith(t.b(customerInfo));
    }
}
