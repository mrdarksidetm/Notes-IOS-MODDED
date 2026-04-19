package com.revenuecat.purchases.hybridcommon.ui;

import ae.r;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import md.q;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallResultExtensionsKt {
    public static final String getName(PaywallResult paywallResult) {
        r.f(paywallResult, "<this>");
        if (r.b(paywallResult, PaywallResult.Cancelled.INSTANCE)) {
            return "CANCELLED";
        }
        if (paywallResult instanceof PaywallResult.Error) {
            return "ERROR";
        }
        if (paywallResult instanceof PaywallResult.Purchased) {
            return "PURCHASED";
        }
        if (paywallResult instanceof PaywallResult.Restored) {
            return "RESTORED";
        }
        throw new q();
    }

    public static /* synthetic */ void getName$annotations(PaywallResult paywallResult) {
    }
}
