package com.revenuecat.purchases.ui.revenuecatui;

import ae.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.composables.Fade;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderDefaults;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt$placeholder$1;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt$placeholder$2;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt;
import l0.f;
import l0.g;
import l1.m1;
import md.i0;
import t0.l;
import t0.o;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class LoadingPaywallKt$LoadingPaywall$3$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadingPaywallKt$LoadingPaywall$3$1(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
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
            o.U(-1190756256, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadingPaywall.<anonymous>.<anonymous> (LoadingPaywall.kt:97)");
        }
        PaywallState.Loaded.Legacy legacy = this.$state;
        PaywallViewModel paywallViewModel = this.$viewModel;
        e.a aVar = e.f2662a;
        f fVarC = g.c(UIConstant.INSTANCE.m82getDefaultPackageCornerRadiusD9Ej5fM());
        LoadingPaywallConstants loadingPaywallConstants = LoadingPaywallConstants.INSTANCE;
        Template2Kt.Template2(legacy, paywallViewModel, PlaceholderKt.m182placeholdercf5BqRc(aVar, true, loadingPaywallConstants.m77getPlaceholderColor0d7_KjU(), (48 & 4) != 0 ? m1.a() : fVarC, (48 & 8) != 0 ? null : new Fade(loadingPaywallConstants.m77getPlaceholderColor0d7_KjU(), PlaceholderDefaults.INSTANCE.getFadeAnimationSpec(), null), (48 & 16) != 0 ? PlaceholderKt$placeholder$1.INSTANCE : null, (48 & 32) != 0 ? PlaceholderKt$placeholder$2.INSTANCE : null), lVar, (this.$$dirty & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8, 0);
        if (o.I()) {
            o.T();
        }
    }
}
