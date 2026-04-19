package com.revenuecat.purchases.common;

import ae.r;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerInfoFactory {
    public static final CustomerInfoFactory INSTANCE = new CustomerInfoFactory();

    private CustomerInfoFactory() {
    }

    private final HashMap<String, Date> parseDates(JSONObject jSONObject, String str) throws JSONException {
        HashMap<String, Date> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.getJSONObject(next).optString("product_plan_identifier");
            r.e(strOptString, "it");
            if (!(strOptString.length() > 0)) {
                strOptString = null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            if (strOptString != null) {
                String str2 = next + ':' + strOptString;
                if (str2 != null) {
                    next = str2;
                }
            }
            r.e(next, SubscriberAttributeKt.JSON_NAME_KEY);
            r.e(jSONObject2, "expirationObject");
            map.put(next, JSONObjectExtensionsKt.optDate(jSONObject2, str));
        }
        return map;
    }

    private final Map<String, Date> parseExpirations(JSONObject jSONObject) {
        return parseDates(jSONObject, "expires_date");
    }

    private final Map<String, Date> parsePurchaseDates(JSONObject jSONObject) {
        return parseDates(jSONObject, "purchase_date");
    }

    public final CustomerInfo buildCustomerInfo(HTTPResult hTTPResult) {
        r.f(hTTPResult, "httpResult");
        return buildCustomerInfo(hTTPResult.getBody(), hTTPResult.getRequestDate(), hTTPResult.getVerificationResult());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.revenuecat.purchases.CustomerInfo buildCustomerInfo(org.json.JSONObject r18, java.util.Date r19, com.revenuecat.purchases.VerificationResult r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.CustomerInfoFactory.buildCustomerInfo(org.json.JSONObject, java.util.Date, com.revenuecat.purchases.VerificationResult):com.revenuecat.purchases.CustomerInfo");
    }
}
