package com.revenuecat.purchases.common.networking;

import ae.r;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import nd.q0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class PostReceiptResponseKt {
    public static final PostReceiptResponse buildPostReceiptResponse(HTTPResult hTTPResult) {
        r.f(hTTPResult, "result");
        CustomerInfo customerInfoBuildCustomerInfo = CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult);
        JSONObject jSONObjectOptJSONObject = hTTPResult.getBody().optJSONObject("purchased_products");
        LinkedHashMap linkedHashMap = null;
        if (jSONObjectOptJSONObject != null) {
            Map map$default = JSONObjectExtensionsKt.toMap$default(jSONObjectOptJSONObject, false, 1, null);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(map$default.size()));
            for (Map.Entry entry : map$default.entrySet()) {
                Object key = entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                if (!jSONObject.has("should_consume")) {
                    jSONObject = null;
                }
                linkedHashMap2.put(key, new PostReceiptProductInfo(jSONObject != null ? Boolean.valueOf(jSONObject.optBoolean("should_consume")) : null));
            }
            linkedHashMap = linkedHashMap2;
        }
        return new PostReceiptResponse(customerInfoBuildCustomerInfo, linkedHashMap, hTTPResult.getBody());
    }
}
