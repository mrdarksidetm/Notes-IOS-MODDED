package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import md.i0;
import zd.a;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class TierSwitcherKt$TierSwitcher$2$2$1$2 extends s implements a<i0> {
    final /* synthetic */ l<TemplateConfiguration.TierInfo, i0> $onTierSelected;
    final /* synthetic */ TemplateConfiguration.TierInfo $tier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TierSwitcherKt$TierSwitcher$2$2$1$2(l<? super TemplateConfiguration.TierInfo, i0> lVar, TemplateConfiguration.TierInfo tierInfo) {
        super(0);
        this.$onTierSelected = lVar;
        this.$tier = tierInfo;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onTierSelected.invoke(this.$tier);
    }
}
