package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import androidx.compose.ui.e;
import f1.b;
import i2.g0;
import md.i0;
import n2.t;
import t0.e2;
import t0.l;
import u2.i;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class MarkdownKt$Markdown$2 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ t $fontFamily;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ n2.i0 $fontWeight;
    final /* synthetic */ b.InterfaceC0266b $horizontalAlignment;
    final /* synthetic */ e $modifier;
    final /* synthetic */ g0 $style;
    final /* synthetic */ String $text;
    final /* synthetic */ i $textAlign;
    final /* synthetic */ boolean $textFillMaxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$Markdown$2(String str, e eVar, long j10, g0 g0Var, long j11, n2.i0 i0Var, t tVar, b.InterfaceC0266b interfaceC0266b, i iVar, boolean z10, boolean z11, int i10, int i11, int i12) {
        super(2);
        this.$text = str;
        this.$modifier = eVar;
        this.$color = j10;
        this.$style = g0Var;
        this.$fontSize = j11;
        this.$fontWeight = i0Var;
        this.$fontFamily = tVar;
        this.$horizontalAlignment = interfaceC0266b;
        this.$textAlign = iVar;
        this.$allowLinks = z10;
        this.$textFillMaxWidth = z11;
        this.$$changed = i10;
        this.$$changed1 = i11;
        this.$$default = i12;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        MarkdownKt.m163MarkdownSXj7GJg(this.$text, this.$modifier, this.$color, this.$style, this.$fontSize, this.$fontWeight, this.$fontFamily, this.$horizontalAlignment, this.$textAlign, this.$allowLinks, this.$textFillMaxWidth, lVar, e2.a(this.$$changed | 1), e2.a(this.$$changed1), this.$$default);
    }
}
