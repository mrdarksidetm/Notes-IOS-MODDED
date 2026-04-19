package com.revenuecat.purchases.ui.revenuecatui;

import ae.o;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import md.i0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
/* synthetic */ class InternalPaywallKt$LoadedPaywall$3$2 extends o implements a<i0> {
    InternalPaywallKt$LoadedPaywall$3$2(Object obj) {
        super(0, obj, PaywallViewModel.class, "closePaywall", "closePaywall()V", 0);
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PaywallViewModel) this.receiver).closePaywall();
    }
}
