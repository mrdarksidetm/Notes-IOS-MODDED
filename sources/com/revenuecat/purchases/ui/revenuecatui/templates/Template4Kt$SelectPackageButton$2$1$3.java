package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import md.i0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class Template4Kt$SelectPackageButton$2$1$3 extends s implements a<i0> {
    final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template4Kt$SelectPackageButton$2$1$3(PaywallViewModel paywallViewModel, TemplateConfiguration.PackageInfo packageInfo) {
        super(0);
        this.$viewModel = paywallViewModel;
        this.$packageInfo = packageInfo;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.selectPackage(this.$packageInfo);
    }
}
