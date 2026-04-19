package com.revenuecat.purchases.ui.revenuecatui;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import md.i0;
import t0.l;
import t0.o;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class InternalPaywallKt$LoadedPaywall$3$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalPaywallKt$LoadedPaywall$3$1(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
        super(2);
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
        this.$$dirty = i10;
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
            o.U(1771404190, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadedPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:163)");
        }
        InternalPaywallKt.TemplatePaywall(this.$state, this.$viewModel, lVar, (this.$$dirty & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        if (o.I()) {
            o.T();
        }
    }
}
