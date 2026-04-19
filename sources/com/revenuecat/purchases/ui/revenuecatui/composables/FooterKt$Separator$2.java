package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import h0.g0;
import md.i0;
import t0.e2;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class FooterKt$Separator$2 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ g0 $this_Separator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FooterKt$Separator$2(g0 g0Var, long j10, int i10) {
        super(2);
        this.$this_Separator = g0Var;
        this.$color = j10;
        this.$$changed = i10;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        FooterKt.m150SeparatorRPmYEkk(this.$this_Separator, this.$color, lVar, e2.a(this.$$changed | 1));
    }
}
