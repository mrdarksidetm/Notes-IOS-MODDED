package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.r;
import ae.s;
import b0.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import md.i0;
import t0.l;
import t0.o;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class Template7Kt$AnimatedPackages$1$1 extends s implements q<e, l, Integer, i0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template7Kt$AnimatedPackages$1$1(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.Colors colors, int i10) {
        super(3);
        this.$state = legacy;
        this.$colors = colors;
        this.$$dirty = i10;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(e eVar, l lVar, Integer num) {
        invoke(eVar, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(e eVar, l lVar, int i10) {
        r.f(eVar, "$this$AnimatedVisibility");
        if (o.I()) {
            o.U(-136603126, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.AnimatedPackages.<anonymous>.<anonymous> (Template7.kt:459)");
        }
        OfferDetailsKt.OfferDetails(this.$state, this.$colors, lVar, ((this.$$dirty >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8, 0);
        if (o.I()) {
            o.T();
        }
    }
}
