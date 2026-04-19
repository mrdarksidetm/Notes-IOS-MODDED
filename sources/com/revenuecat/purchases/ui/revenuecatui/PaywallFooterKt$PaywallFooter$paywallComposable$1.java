package com.revenuecat.purchases.ui.revenuecatui;

import ae.s;
import md.i0;
import t0.l;
import t0.o;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class PaywallFooterKt$PaywallFooter$paywallComposable$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ boolean $condensed;
    final /* synthetic */ PaywallOptions $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallFooterKt$PaywallFooter$paywallComposable$1(boolean z10, PaywallOptions paywallOptions) {
        super(2);
        this.$condensed = z10;
        this.$options = paywallOptions;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.s()) {
            lVar.x();
            return;
        }
        if (o.I()) {
            o.U(-1620873749, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallFooter.<anonymous> (PaywallFooter.kt:28)");
        }
        PaywallKt.Paywall(PaywallOptions.copy$default(this.$options, null, false, null, null, null, PaywallMode.Companion.footerMode(this.$condensed), null, 93, null), lVar, 0);
        if (o.I()) {
            o.T();
        }
    }
}
