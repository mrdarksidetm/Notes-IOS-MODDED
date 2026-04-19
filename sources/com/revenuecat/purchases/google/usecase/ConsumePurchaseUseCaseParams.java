package com.revenuecat.purchases.google.usecase;

import ae.r;
import com.revenuecat.purchases.PostReceiptInitiationSource;

/* JADX INFO: loaded from: classes2.dex */
public final class ConsumePurchaseUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final PostReceiptInitiationSource initiationSource;
    private final String purchaseToken;

    public ConsumePurchaseUseCaseParams(String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z10) {
        r.f(str, "purchaseToken");
        r.f(postReceiptInitiationSource, "initiationSource");
        this.purchaseToken = str;
        this.initiationSource = postReceiptInitiationSource;
        this.appInBackground = z10;
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final PostReceiptInitiationSource getInitiationSource() {
        return this.initiationSource;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }
}
