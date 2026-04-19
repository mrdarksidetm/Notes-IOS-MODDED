package com.revenuecat.purchases.ui.revenuecatui.helpers;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public final class TestTag {
    public static final TestTag INSTANCE = new TestTag();
    public static final String PURCHASE_BUTTON_TAG = "PurchaseButton";

    private TestTag() {
    }

    public final String selectButtonTestTag(String str) {
        r.f(str, "packageId");
        return "SelectButton_" + str;
    }
}
