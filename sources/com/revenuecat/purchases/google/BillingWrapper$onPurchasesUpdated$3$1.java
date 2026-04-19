package com.revenuecat.purchases.google;

import ae.r;
import ae.s;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class BillingWrapper$onPurchasesUpdated$3$1 extends s implements l<Purchase, CharSequence> {
    public static final BillingWrapper$onPurchasesUpdated$3$1 INSTANCE = new BillingWrapper$onPurchasesUpdated$3$1();

    BillingWrapper$onPurchasesUpdated$3$1() {
        super(1);
    }

    @Override // zd.l
    public final CharSequence invoke(Purchase purchase) {
        r.f(purchase, "it");
        return PurchaseExtensionsKt.toHumanReadableDescription(purchase);
    }
}
