package com.revenuecat.purchases.ui.revenuecatui.data;

import android.app.Activity;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import oe.f0;
import q0.h;
import t0.p3;

/* JADX INFO: loaded from: classes2.dex */
public interface PaywallViewModel {
    void clearActionError();

    void closePaywall();

    p3<PurchasesError> getActionError();

    p3<Boolean> getActionInProgress();

    ResourceProvider getResourceProvider();

    f0<PaywallState> getState();

    void purchaseSelectedPackage(Activity activity);

    void refreshStateIfColorsChanged(h hVar, boolean z10);

    void refreshStateIfLocaleChanged();

    void restorePurchases();

    void selectPackage(TemplateConfiguration.PackageInfo packageInfo);

    void trackPaywallImpressionIfNeeded();
}
