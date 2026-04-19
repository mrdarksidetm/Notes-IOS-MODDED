package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.r;
import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import md.i0;
import t0.k1;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class Template7Kt$Template7$2$2 extends s implements l<TemplateConfiguration.TierInfo, i0> {
    final /* synthetic */ k1<TemplateConfiguration.TierInfo> $selectedTier$delegate;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template7Kt$Template7$2$2(PaywallState.Loaded.Legacy legacy, k1<TemplateConfiguration.TierInfo> k1Var) {
        super(1);
        this.$state = legacy;
        this.$selectedTier$delegate = k1Var;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(TemplateConfiguration.TierInfo tierInfo) {
        invoke2(tierInfo);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TemplateConfiguration.TierInfo tierInfo) {
        r.f(tierInfo, "it");
        this.$selectedTier$delegate.setValue(tierInfo);
        this.$state.selectPackage(Template7Kt.Template7$lambda$5(this.$selectedTier$delegate).getDefaultPackage());
    }
}
