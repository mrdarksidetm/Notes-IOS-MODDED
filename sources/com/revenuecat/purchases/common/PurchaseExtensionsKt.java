package com.revenuecat.purchases.common;

import ae.r;
import com.android.billingclient.api.Purchase;
import java.util.List;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseExtensionsKt {
    public static final String getFirstProductId(Purchase purchase) {
        r.f(purchase, "<this>");
        String str = purchase.c().get(0);
        String str2 = str;
        if (purchase.c().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        r.e(str, "products[0].also {\n     …_ONE_SKU)\n        }\n    }");
        return str2;
    }

    public static final String toHumanReadableDescription(Purchase purchase) {
        r.f(purchase, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("productIds: ");
        List<String> listC = purchase.c();
        r.e(listC, "this.products");
        sb2.append(c0.h0(listC, null, "[", "]", 0, null, null, 57, null));
        sb2.append(", orderId: ");
        sb2.append(purchase.a());
        sb2.append(", purchaseToken: ");
        sb2.append(purchase.f());
        return sb2.toString();
    }
}
