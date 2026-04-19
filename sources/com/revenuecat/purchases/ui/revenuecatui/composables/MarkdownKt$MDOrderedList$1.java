package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.f0;
import ae.r;
import ae.s;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import i2.d;
import i2.g0;
import md.i0;
import n2.t;
import t0.l;
import t0.o;
import u2.i;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class MarkdownKt$MDOrderedList$1 extends s implements q<uf.s, l, Integer, i0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ char $delimiter;
    final /* synthetic */ t $fontFamily;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ n2.i0 $fontWeight;
    final /* synthetic */ f0 $number;
    final /* synthetic */ g0 $style;
    final /* synthetic */ i $textAlign;
    final /* synthetic */ boolean $textFillMaxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$MDOrderedList$1(long j10, g0 g0Var, long j11, n2.i0 i0Var, t tVar, i iVar, boolean z10, boolean z11, int i10, f0 f0Var, char c10) {
        super(3);
        this.$color = j10;
        this.$style = g0Var;
        this.$fontSize = j11;
        this.$fontWeight = i0Var;
        this.$fontFamily = tVar;
        this.$textAlign = iVar;
        this.$allowLinks = z10;
        this.$textFillMaxWidth = z11;
        this.$$dirty = i10;
        this.$number = f0Var;
        this.$delimiter = c10;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(uf.s sVar, l lVar, Integer num) {
        invoke(sVar, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(uf.s sVar, l lVar, int i10) {
        r.f(sVar, "it");
        if (o.I()) {
            o.U(-1609568168, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDOrderedList.<anonymous> (Markdown.kt:294)");
        }
        g0 g0Var = this.$style;
        f0 f0Var = this.$number;
        char c10 = this.$delimiter;
        long j10 = this.$color;
        boolean z10 = this.$allowLinks;
        d.a aVar = new d.a(0, 1, null);
        aVar.k(g0Var.O());
        StringBuilder sb2 = new StringBuilder();
        int i11 = f0Var.f703a;
        f0Var.f703a = i11 + 1;
        sb2.append(i11);
        sb2.append(c10);
        sb2.append(' ');
        aVar.h(sb2.toString());
        MarkdownKt.m175appendMarkdownChildren9LQNqLg(aVar, sVar, j10, z10);
        aVar.i();
        d dVarL = aVar.l();
        long j11 = this.$color;
        g0 g0Var2 = this.$style;
        long j12 = this.$fontSize;
        n2.i0 i0Var = this.$fontWeight;
        t tVar = this.$fontFamily;
        i iVar = this.$textAlign;
        boolean z11 = this.$allowLinks;
        boolean z12 = this.$textFillMaxWidth;
        int i12 = this.$$dirty;
        MarkdownKt.m164MarkdownTextqyq4mXc(dVarL, j11, g0Var2, j12, i0Var, tVar, iVar, z11, z12, null, lVar, (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), 512);
        if (o.I()) {
            o.T();
        }
    }
}
