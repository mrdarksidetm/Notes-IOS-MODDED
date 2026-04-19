package com.revenuecat.purchases.hybridcommon.ui;

import ae.r;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;

/* JADX INFO: loaded from: classes2.dex */
public interface PaywallResultListener {

    public static final class DefaultImpls {
        public static void onPaywallResult(PaywallResultListener paywallResultListener, PaywallResult paywallResult) {
            r.f(paywallResult, "paywallResult");
        }
    }

    void onPaywallResult(PaywallResult paywallResult);

    void onPaywallResult(String str);
}
