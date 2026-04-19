package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.r;
import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import h0.g0;
import md.i0;
import t0.l;
import t0.o;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class Template4Kt$SelectPackageButton$2$1$4 extends s implements q<g0, l, Integer, i0> {
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template4Kt$SelectPackageButton$2$1$4(TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors) {
        super(3);
        this.$packageInfo = packageInfo;
        this.$colors = colors;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(g0 g0Var, l lVar, Integer num) {
        invoke(g0Var, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(g0 g0Var, l lVar, int i10) {
        r.f(g0Var, "$this$Button");
        if ((i10 & 81) == 16 && lVar.s()) {
            lVar.x();
            return;
        }
        if (o.I()) {
            o.U(-1357178314, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton.<anonymous>.<anonymous>.<anonymous> (Template4.kt:323)");
        }
        Template4Kt.SelectPackageButtonContent(this.$packageInfo, this.$colors, lVar, 8);
        if (o.I()) {
            o.T();
        }
    }
}
