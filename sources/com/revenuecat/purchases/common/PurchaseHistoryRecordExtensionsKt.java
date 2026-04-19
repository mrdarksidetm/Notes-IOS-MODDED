package com.revenuecat.purchases.common;

import ae.r;
import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.ArrayList;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseHistoryRecordExtensionsKt {
    public static final String getFirstSku(PurchaseHistoryRecord purchaseHistoryRecord) {
        r.f(purchaseHistoryRecord, "<this>");
        String str = purchaseHistoryRecord.f().get(0);
        String str2 = str;
        if (purchaseHistoryRecord.f().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        r.e(str, "skus[0].also {\n        i…_ONE_SKU)\n        }\n    }");
        return str2;
    }

    public static final ArrayList<String> getListOfSkus(PurchaseHistoryRecord purchaseHistoryRecord) {
        r.f(purchaseHistoryRecord, "<this>");
        ArrayList<String> arrayListF = purchaseHistoryRecord.f();
        r.e(arrayListF, "this.skus");
        return arrayListF;
    }

    public static final String toHumanReadableDescription(PurchaseHistoryRecord purchaseHistoryRecord) {
        r.f(purchaseHistoryRecord, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("skus: ");
        ArrayList<String> arrayListF = purchaseHistoryRecord.f();
        r.e(arrayListF, "this.skus");
        sb2.append(c0.h0(arrayListF, null, "[", "]", 0, null, null, 57, null));
        sb2.append(", purchaseTime: ");
        sb2.append(purchaseHistoryRecord.c());
        sb2.append(", purchaseToken: ");
        sb2.append(purchaseHistoryRecord.d());
        return sb2.toString();
    }
}
