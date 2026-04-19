package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import f2.f;
import i2.g0;
import md.i0;
import q0.q0;
import t0.l;
import t0.o;
import u2.i;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class FooterKt$Button$1$3$3$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ long $color;
    final /* synthetic */ int $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FooterKt$Button$1$3$3$1(int i10, e eVar, long j10, int i11) {
        super(2);
        this.$it = i10;
        this.$childModifier = eVar;
        this.$color = j10;
        this.$$dirty = i11;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.s()) {
            lVar.x();
            return;
        }
        if (o.I()) {
            o.U(1301841013, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Button.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Footer.kt:234)");
        }
        String strA = f.a(this.$it, lVar, 0);
        int iA = i.f21560b.a();
        g0 g0VarStyle = FooterConstants.INSTANCE.style(lVar, 6);
        e eVar = this.$childModifier;
        long j10 = this.$color;
        i iVarH = i.h(iA);
        int i11 = this.$$dirty;
        q0.b(strA, eVar, j10, 0L, null, null, null, 0L, null, iVarH, 0L, 0, true, 0, 0, null, g0VarStyle, lVar, ((i11 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i11 << 3) & 896), 384, 60920);
        if (o.I()) {
            o.T();
        }
    }
}
