package com.revenuecat.purchases.amazon;

import ae.r;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorsKt {
    public static final PurchasesError errorGettingReceiptInfo(PurchasesError purchasesError) {
        r.f(purchasesError, "error");
        return new PurchasesError(PurchasesErrorCode.InvalidReceiptError, "Couldn't get Amazon receipt data from RevenueCat backend. Error: " + purchasesError);
    }

    public static final PurchasesError missingTermSkuError(JSONObject jSONObject) {
        r.f(jSONObject, "response");
        return new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, "Amazon receipt data response is missing termSku. Response:\n" + jSONObject);
    }
}
