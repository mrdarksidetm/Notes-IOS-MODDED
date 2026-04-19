package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.r;
import ae.s;
import b0.e;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import md.i0;
import t0.l;
import t0.o;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class Template4Kt$CheckmarkBox$1$1 extends s implements q<e, l, Integer, i0> {
    final /* synthetic */ TemplateConfiguration.Colors $colors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template4Kt$CheckmarkBox$1$1(TemplateConfiguration.Colors colors) {
        super(3);
        this.$colors = colors;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(e eVar, l lVar, Integer num) {
        invoke(eVar, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(e eVar, l lVar, int i10) {
        r.f(eVar, "$this$AnimatedVisibility");
        if (o.I()) {
            o.U(-2128395201, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CheckmarkBox.<anonymous>.<anonymous> (Template4.kt:443)");
        }
        PaywallIconKt.m179PaywallIconFNF3uiM(PaywallIconName.CHECK_CIRCLE, null, this.$colors.m219getAccent10d7_KjU(), lVar, 6, 2);
        if (o.I()) {
            o.T();
        }
    }
}
