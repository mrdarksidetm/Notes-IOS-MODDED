package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import androidx.compose.ui.e;
import md.i0;
import t0.e2;
import t0.l;
import uf.b;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class MarkdownKt$MDBlockQuote$3 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ b $blockQuote;
    final /* synthetic */ long $color;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$MDBlockQuote$3(b bVar, long j10, boolean z10, e eVar, int i10, int i11) {
        super(2);
        this.$blockQuote = bVar;
        this.$color = j10;
        this.$allowLinks = z10;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        MarkdownKt.m156MDBlockQuotesW7UJKQ(this.$blockQuote, this.$color, this.$allowLinks, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
    }
}
