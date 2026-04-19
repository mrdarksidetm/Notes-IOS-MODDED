package com.revenuecat.purchases;

import ae.r;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class IntentExtensionsKt {
    @ExperimentalPreviewRevenueCatPurchasesAPI
    public static final /* synthetic */ WebPurchaseRedemption asWebPurchaseRedemption(Intent intent) {
        r.f(intent, "<this>");
        return Purchases.Companion.parseAsWebPurchaseRedemption(intent);
    }
}
