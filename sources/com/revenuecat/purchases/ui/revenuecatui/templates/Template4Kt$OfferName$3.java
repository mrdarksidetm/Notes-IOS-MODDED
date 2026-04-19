package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import md.i0;
import t0.e2;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class Template4Kt$OfferName$3 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $modifier;
    final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
    final /* synthetic */ long $textColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template4Kt$OfferName$3(TemplateConfiguration.PackageInfo packageInfo, long j10, e eVar, int i10, int i11) {
        super(2);
        this.$packageInfo = packageInfo;
        this.$textColor = j10;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        Template4Kt.m269OfferName3IgeMak(this.$packageInfo, this.$textColor, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
    }
}
