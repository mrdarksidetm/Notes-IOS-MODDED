package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import i2.d;
import i2.g0;
import md.i0;
import n2.t;
import q0.y;
import t0.l;
import t0.o;
import u2.i;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class MarkdownKt$MDBulletList$1 extends s implements q<uf.s, l, Integer, i0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ t $fontFamily;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ n2.i0 $fontWeight;
    final /* synthetic */ char $marker;
    final /* synthetic */ g0 $style;
    final /* synthetic */ i $textAlign;
    final /* synthetic */ boolean $textFillMaxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$MDBulletList$1(long j10, g0 g0Var, long j11, n2.i0 i0Var, t tVar, i iVar, boolean z10, boolean z11, int i10, char c10) {
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
        this.$marker = c10;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(uf.s sVar, l lVar, Integer num) {
        invoke(sVar, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(uf.s sVar, l lVar, int i10) {
        r.f(sVar, "it");
        if (o.I()) {
            o.U(1682895250, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDBulletList.<anonymous> (Markdown.kt:248)");
        }
        lVar.e(165965891);
        char c10 = this.$marker;
        long j10 = this.$color;
        boolean z10 = this.$allowLinks;
        d.a aVar = new d.a(0, 1, null);
        aVar.k(y.f18928a.c(lVar, y.f18929b | 0).b().O());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c10);
        sb2.append(' ');
        aVar.h(sb2.toString());
        MarkdownKt.m175appendMarkdownChildren9LQNqLg(aVar, sVar, j10, z10);
        aVar.i();
        d dVarL = aVar.l();
        lVar.K();
        long j11 = this.$color;
        g0 g0Var = this.$style;
        long j12 = this.$fontSize;
        n2.i0 i0Var = this.$fontWeight;
        t tVar = this.$fontFamily;
        i iVar = this.$textAlign;
        boolean z11 = this.$allowLinks;
        boolean z12 = this.$textFillMaxWidth;
        int i11 = this.$$dirty;
        MarkdownKt.m164MarkdownTextqyq4mXc(dVarL, j11, g0Var, j12, i0Var, tVar, iVar, z11, z12, null, lVar, (i11 & 234881024) | (i11 & 896) | (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11), 512);
        if (o.I()) {
            o.T();
        }
    }
}
