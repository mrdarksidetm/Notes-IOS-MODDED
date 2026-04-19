package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import h0.g0;
import md.i0;
import t0.e2;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class Template7Kt$DiscountBanner$text$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ g0 $this_DiscountBanner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template7Kt$DiscountBanner$text$1(g0 g0Var, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, int i10) {
        super(2);
        this.$this_DiscountBanner = g0Var;
        this.$state = legacy;
        this.$packageInfo = packageInfo;
        this.$colors = colors;
        this.$$changed = i10;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        Template7Kt.DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, this.$colors, lVar, e2.a(this.$$changed | 1));
    }
}
