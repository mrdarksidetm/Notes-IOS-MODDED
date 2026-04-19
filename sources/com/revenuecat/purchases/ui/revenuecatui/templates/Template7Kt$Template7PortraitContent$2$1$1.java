package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.r;
import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class Template7Kt$Template7PortraitContent$2$1$1 extends s implements l<TemplateConfiguration.TierInfo, i0> {
    final /* synthetic */ l<TemplateConfiguration.TierInfo, i0> $onSelectTierChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Template7Kt$Template7PortraitContent$2$1$1(l<? super TemplateConfiguration.TierInfo, i0> lVar) {
        super(1);
        this.$onSelectTierChange = lVar;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(TemplateConfiguration.TierInfo tierInfo) {
        invoke2(tierInfo);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TemplateConfiguration.TierInfo tierInfo) {
        r.f(tierInfo, "it");
        this.$onSelectTierChange.invoke(tierInfo);
    }
}
