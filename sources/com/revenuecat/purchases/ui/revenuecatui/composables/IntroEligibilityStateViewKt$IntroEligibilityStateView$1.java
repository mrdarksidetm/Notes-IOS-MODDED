package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import i2.g0;
import md.i0;
import t0.l;
import t0.o;
import u2.i;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class IntroEligibilityStateViewKt$IntroEligibilityStateView$1 extends s implements q<String, l, Integer, i0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ n2.i0 $fontWeight;
    final /* synthetic */ e $modifier;
    final /* synthetic */ g0 $style;
    final /* synthetic */ i $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IntroEligibilityStateViewKt$IntroEligibilityStateView$1(e eVar, long j10, g0 g0Var, n2.i0 i0Var, i iVar, boolean z10, int i10) {
        super(3);
        this.$modifier = eVar;
        this.$color = j10;
        this.$style = g0Var;
        this.$fontWeight = i0Var;
        this.$textAlign = iVar;
        this.$allowLinks = z10;
        this.$$dirty = i10;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(String str, l lVar, Integer num) {
        invoke(str, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(String str, l lVar, int i10) {
        int i11;
        r.f(str, "it");
        if ((i10 & 14) == 0) {
            i11 = i10 | (lVar.N(str) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) == 18 && lVar.s()) {
            lVar.x();
            return;
        }
        if (o.I()) {
            o.U(503605632, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateView.<anonymous> (IntroEligibilityStateView.kt:39)");
        }
        e eVar = this.$modifier;
        long j10 = this.$color;
        g0 g0Var = this.$style;
        n2.i0 i0Var = this.$fontWeight;
        i iVar = this.$textAlign;
        boolean z10 = this.$allowLinks;
        int i12 = this.$$dirty;
        MarkdownKt.m163MarkdownSXj7GJg(str, eVar, j10, g0Var, 0L, i0Var, null, null, iVar, z10, true, lVar, ((i12 >> 24) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i11 & 14) | ((i12 >> 6) & 896) | ((i12 >> 6) & 7168) | ((i12 >> 3) & 458752) | ((i12 << 3) & 234881024) | ((i12 << 3) & 1879048192), 6, 208);
        if (o.I()) {
            o.T();
        }
    }
}
