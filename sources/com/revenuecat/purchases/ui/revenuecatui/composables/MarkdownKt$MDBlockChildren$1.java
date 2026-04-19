package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import i2.g0;
import md.i0;
import n2.t;
import t0.e2;
import t0.l;
import u2.i;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class MarkdownKt$MDBlockChildren$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ t $fontFamily;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ n2.i0 $fontWeight;
    final /* synthetic */ uf.s $parent;
    final /* synthetic */ g0 $style;
    final /* synthetic */ i $textAlign;
    final /* synthetic */ boolean $textFillMaxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$MDBlockChildren$1(uf.s sVar, long j10, g0 g0Var, long j11, n2.i0 i0Var, t tVar, i iVar, boolean z10, boolean z11, int i10) {
        super(2);
        this.$parent = sVar;
        this.$color = j10;
        this.$style = g0Var;
        this.$fontSize = j11;
        this.$fontWeight = i0Var;
        this.$fontFamily = tVar;
        this.$textAlign = iVar;
        this.$allowLinks = z10;
        this.$textFillMaxWidth = z11;
        this.$$changed = i10;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        MarkdownKt.m155MDBlockChildrenlzeOXFE(this.$parent, this.$color, this.$style, this.$fontSize, this.$fontWeight, this.$fontFamily, this.$textAlign, this.$allowLinks, this.$textFillMaxWidth, lVar, e2.a(this.$$changed | 1));
    }
}
