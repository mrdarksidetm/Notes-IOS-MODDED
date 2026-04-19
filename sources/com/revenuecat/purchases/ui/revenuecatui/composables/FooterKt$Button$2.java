package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import androidx.compose.ui.e;
import h0.g0;
import java.util.Arrays;
import md.i0;
import t0.e2;
import t0.l;
import zd.a;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class FooterKt$Button$2 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ a<i0> $action;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ long $color;
    final /* synthetic */ int[] $texts;
    final /* synthetic */ g0 $this_Button;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FooterKt$Button$2(g0 g0Var, long j10, e eVar, int[] iArr, a<i0> aVar, int i10) {
        super(2);
        this.$this_Button = g0Var;
        this.$color = j10;
        this.$childModifier = eVar;
        this.$texts = iArr;
        this.$action = aVar;
        this.$$changed = i10;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        g0 g0Var = this.$this_Button;
        long j10 = this.$color;
        e eVar = this.$childModifier;
        int[] iArr = this.$texts;
        FooterKt.m149ButtonsW7UJKQ(g0Var, j10, eVar, Arrays.copyOf(iArr, iArr.length), this.$action, lVar, e2.a(this.$$changed | 1));
    }
}
