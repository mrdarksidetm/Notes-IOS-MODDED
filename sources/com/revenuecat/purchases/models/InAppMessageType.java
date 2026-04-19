package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes2.dex */
public enum InAppMessageType {
    BILLING_ISSUES(2);

    private final int inAppMessageCategoryId;

    InAppMessageType(int i10) {
        this.inAppMessageCategoryId = i10;
    }

    public final int getInAppMessageCategoryId$purchases_defaultsRelease() {
        return this.inAppMessageCategoryId;
    }
}
