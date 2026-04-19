package com.revenuecat.purchases;

import ae.r;
import ae.s;
import md.i0;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1 extends s implements p<PurchasesError, Boolean, i0> {
    public static final ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1 INSTANCE = new ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1();

    ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1() {
        super(2);
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
        invoke(purchasesError, bool.booleanValue());
        return i0.f15558a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z10) {
        r.f(purchasesError, "<anonymous parameter 0>");
    }
}
