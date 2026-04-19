package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.data.LogInResult;
import md.i0;
import md.t;
import qd.d;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class CoroutinesExtensionsKt$awaitLogIn$2$2 extends s implements p<CustomerInfo, Boolean, i0> {
    final /* synthetic */ d<LogInResult> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutinesExtensionsKt$awaitLogIn$2$2(d<? super LogInResult> dVar) {
        super(2);
        this.$continuation = dVar;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo, Boolean bool) {
        invoke(customerInfo, bool.booleanValue());
        return i0.f15558a;
    }

    public final void invoke(CustomerInfo customerInfo, boolean z10) {
        r.f(customerInfo, "customerInfo");
        d<LogInResult> dVar = this.$continuation;
        t.a aVar = t.f15576b;
        dVar.resumeWith(t.b(new LogInResult(customerInfo, z10)));
    }
}
