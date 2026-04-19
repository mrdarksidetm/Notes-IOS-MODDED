package com.revenuecat.purchases.ui.revenuecatui.data;

import ae.r;
import com.revenuecat.purchases.ui.revenuecatui.PaywallModeKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import md.q;
import t0.l;
import t0.o;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallStateKt {
    public static final TemplateConfiguration.Colors getCurrentColors(PaywallState.Loaded.Legacy legacy, l lVar, int i10) {
        r.f(legacy, "<this>");
        if (o.I()) {
            o.U(779612430, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.data.<get-currentColors> (PaywallState.kt:73)");
        }
        TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(lVar, 8);
        if (o.I()) {
            o.T();
        }
        return currentColors;
    }

    public static final ProcessedLocalizedConfiguration getSelectedLocalization(PaywallState.Loaded.Legacy legacy) {
        r.f(legacy, "<this>");
        return legacy.getSelectedPackage().getValue().getLocalization();
    }

    public static final boolean isInFullScreenMode(PaywallState.Loaded.Legacy legacy) {
        r.f(legacy, "<this>");
        return PaywallModeKt.isFullScreen(legacy.getTemplateConfiguration().getMode());
    }

    public static final PaywallState.Loaded.Legacy loadedLegacy(PaywallState paywallState) {
        r.f(paywallState, "<this>");
        if (paywallState instanceof PaywallState.Error) {
            return null;
        }
        if (!(paywallState instanceof PaywallState.Loaded)) {
            if (paywallState instanceof PaywallState.Loading) {
                return null;
            }
            throw new q();
        }
        PaywallState.Loaded loaded = (PaywallState.Loaded) paywallState;
        if (loaded instanceof PaywallState.Loaded.Legacy) {
            return (PaywallState.Loaded.Legacy) paywallState;
        }
        if (loaded instanceof PaywallState.Loaded.Components) {
            return null;
        }
        throw new q();
    }
}
