package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import h0.c;
import l1.j0;
import md.i0;
import t0.e2;
import t0.l;
import zd.a;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class CloseButtonKt$CloseButton$2 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $actionInProgress;
    final /* synthetic */ j0 $color;
    final /* synthetic */ a<i0> $onClick;
    final /* synthetic */ boolean $shouldDisplayDismissButton;
    final /* synthetic */ c $this_CloseButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseButtonKt$CloseButton$2(c cVar, boolean z10, j0 j0Var, boolean z11, a<i0> aVar, int i10) {
        super(2);
        this.$this_CloseButton = cVar;
        this.$shouldDisplayDismissButton = z10;
        this.$color = j0Var;
        this.$actionInProgress = z11;
        this.$onClick = aVar;
        this.$$changed = i10;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        CloseButtonKt.m144CloseButtondrOMvmE(this.$this_CloseButton, this.$shouldDisplayDismissButton, this.$color, this.$actionInProgress, this.$onClick, lVar, e2.a(this.$$changed | 1));
    }
}
