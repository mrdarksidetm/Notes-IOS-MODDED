package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.r;
import ae.s;
import b0.e;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import md.i0;
import t0.l;
import t0.o;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class Template2Kt$AnimatedPackages$1$1 extends s implements q<e, l, Integer, i0> {
    final /* synthetic */ PaywallState.Loaded.Legacy $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template2Kt$AnimatedPackages$1$1(PaywallState.Loaded.Legacy legacy) {
        super(3);
        this.$state = legacy;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(e eVar, l lVar, Integer num) {
        invoke(eVar, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(e eVar, l lVar, int i10) {
        r.f(eVar, "$this$AnimatedVisibility");
        if (o.I()) {
            o.U(4658274, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.AnimatedPackages.<anonymous>.<anonymous> (Template2.kt:311)");
        }
        OfferDetailsKt.OfferDetails(this.$state, null, lVar, 8, 2);
        if (o.I()) {
            o.T();
        }
    }
}
