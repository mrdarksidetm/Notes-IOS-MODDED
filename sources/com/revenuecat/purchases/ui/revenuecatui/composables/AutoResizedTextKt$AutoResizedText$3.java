package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import androidx.compose.ui.e;
import i2.g0;
import md.i0;
import t0.e2;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class AutoResizedTextKt$AutoResizedText$3 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ n2.i0 $fontWeight;
    final /* synthetic */ e $modifier;
    final /* synthetic */ g0 $style;
    final /* synthetic */ String $text;
    final /* synthetic */ int $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoResizedTextKt$AutoResizedText$3(String str, e eVar, long j10, g0 g0Var, n2.i0 i0Var, int i10, int i11, int i12) {
        super(2);
        this.$text = str;
        this.$modifier = eVar;
        this.$color = j10;
        this.$style = g0Var;
        this.$fontWeight = i0Var;
        this.$textAlign = i10;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        AutoResizedTextKt.m142AutoResizedTextW72HBGU(this.$text, this.$modifier, this.$color, this.$style, this.$fontWeight, this.$textAlign, lVar, e2.a(this.$$changed | 1), this.$$default);
    }
}
