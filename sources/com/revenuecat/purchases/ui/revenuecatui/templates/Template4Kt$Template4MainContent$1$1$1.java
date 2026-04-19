package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.r;
import ae.s;
import b0.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import md.i0;
import t0.l;
import t0.o;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class Template4Kt$Template4MainContent$1$1$1 extends s implements q<e, l, Integer, i0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template4Kt$Template4MainContent$1$1$1(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
        super(3);
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
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
            o.U(492758735, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4MainContent.<anonymous>.<anonymous>.<anonymous> (Template4.kt:180)");
        }
        Template4Kt.Packages(this.$state, this.$viewModel, lVar, (this.$$dirty & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        if (o.I()) {
            o.T();
        }
    }
}
