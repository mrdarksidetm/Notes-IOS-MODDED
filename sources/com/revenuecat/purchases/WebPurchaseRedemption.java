package com.revenuecat.purchases;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalPreviewRevenueCatPurchasesAPI
public final class WebPurchaseRedemption {
    private final String redemptionToken;

    public WebPurchaseRedemption(String str) {
        r.f(str, "redemptionToken");
        this.redemptionToken = str;
    }

    public final String getRedemptionToken$purchases_defaultsRelease() {
        return this.redemptionToken;
    }
}
