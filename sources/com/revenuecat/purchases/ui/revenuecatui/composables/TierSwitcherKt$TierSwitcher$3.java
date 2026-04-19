package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import java.util.List;
import md.i0;
import t0.e2;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class TierSwitcherKt$TierSwitcher$3 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $backgroundSelectedColor;
    final /* synthetic */ long $foregroundColor;
    final /* synthetic */ long $foregroundSelectedColor;
    final /* synthetic */ zd.l<TemplateConfiguration.TierInfo, i0> $onTierSelected;
    final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
    final /* synthetic */ List<TemplateConfiguration.TierInfo> $tiers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TierSwitcherKt$TierSwitcher$3(List<TemplateConfiguration.TierInfo> list, TemplateConfiguration.TierInfo tierInfo, zd.l<? super TemplateConfiguration.TierInfo, i0> lVar, long j10, long j11, long j12, long j13, int i10) {
        super(2);
        this.$tiers = list;
        this.$selectedTier = tierInfo;
        this.$onTierSelected = lVar;
        this.$backgroundColor = j10;
        this.$backgroundSelectedColor = j11;
        this.$foregroundColor = j12;
        this.$foregroundSelectedColor = j13;
        this.$$changed = i10;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        TierSwitcherKt.m189TierSwitcherUFBoNtE(this.$tiers, this.$selectedTier, this.$onTierSelected, this.$backgroundColor, this.$backgroundSelectedColor, this.$foregroundColor, this.$foregroundSelectedColor, lVar, e2.a(this.$$changed | 1));
    }
}
