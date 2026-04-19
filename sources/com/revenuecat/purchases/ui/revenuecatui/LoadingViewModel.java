package com.revenuecat.purchases.ui.revenuecatui;

import ae.r;
import android.app.Activity;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import oe.f0;
import oe.g;
import oe.h0;
import oe.s;
import q0.h;
import t0.k3;
import t0.p3;

/* JADX INFO: loaded from: classes2.dex */
final class LoadingViewModel implements PaywallViewModel {
    private final s<PaywallState> _state;
    private final p3<PurchasesError> actionError;
    private final p3<Boolean> actionInProgress;
    private final ResourceProvider resourceProvider;

    public LoadingViewModel(PaywallState paywallState, ResourceProvider resourceProvider) {
        r.f(paywallState, "state");
        r.f(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
        this.actionInProgress = k3.e(Boolean.FALSE, null, 2, null);
        this.actionError = k3.e(null, null, 2, null);
        this._state = h0.a(paywallState);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void clearActionError() {
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void closePaywall() {
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public p3<PurchasesError> getActionError() {
        return this.actionError;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public p3<Boolean> getActionInProgress() {
        return this.actionInProgress;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public ResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public f0<PaywallState> getState() {
        return g.a(this._state);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void purchaseSelectedPackage(Activity activity) {
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void refreshStateIfColorsChanged(h hVar, boolean z10) {
        r.f(hVar, "colorScheme");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void refreshStateIfLocaleChanged() {
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void restorePurchases() {
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void selectPackage(TemplateConfiguration.PackageInfo packageInfo) {
        r.f(packageInfo, "packageToSelect");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void trackPaywallImpressionIfNeeded() {
    }
}
