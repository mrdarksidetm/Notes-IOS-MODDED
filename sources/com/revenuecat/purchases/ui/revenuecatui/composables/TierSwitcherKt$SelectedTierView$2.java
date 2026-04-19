package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import md.i0;
import t0.e2;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class TierSwitcherKt$SelectedTierView$2 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $backgroundSelectedColor;
    final /* synthetic */ long $foregroundSelectedColor;
    final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TierSwitcherKt$SelectedTierView$2(TemplateConfiguration.TierInfo tierInfo, long j10, long j11, int i10) {
        super(2);
        this.$selectedTier = tierInfo;
        this.$backgroundSelectedColor = j10;
        this.$foregroundSelectedColor = j11;
        this.$$changed = i10;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        TierSwitcherKt.m188SelectedTierView1wkBAMs(this.$selectedTier, this.$backgroundSelectedColor, this.$foregroundSelectedColor, lVar, e2.a(this.$$changed | 1));
    }
}
