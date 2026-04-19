package com.revenuecat.purchases.common.networking;

import ae.r;
import com.revenuecat.purchases.CustomerInfo;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class PostReceiptResponse {
    private final JSONObject body;
    private final CustomerInfo customerInfo;
    private final Map<String, PostReceiptProductInfo> productInfoByProductId;

    public PostReceiptResponse(CustomerInfo customerInfo, Map<String, PostReceiptProductInfo> map, JSONObject jSONObject) {
        r.f(customerInfo, "customerInfo");
        r.f(jSONObject, "body");
        this.customerInfo = customerInfo;
        this.productInfoByProductId = map;
        this.body = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostReceiptResponse copy$default(PostReceiptResponse postReceiptResponse, CustomerInfo customerInfo, Map map, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            customerInfo = postReceiptResponse.customerInfo;
        }
        if ((i10 & 2) != 0) {
            map = postReceiptResponse.productInfoByProductId;
        }
        if ((i10 & 4) != 0) {
            jSONObject = postReceiptResponse.body;
        }
        return postReceiptResponse.copy(customerInfo, map, jSONObject);
    }

    public final CustomerInfo component1() {
        return this.customerInfo;
    }

    public final Map<String, PostReceiptProductInfo> component2() {
        return this.productInfoByProductId;
    }

    public final JSONObject component3() {
        return this.body;
    }

    public final PostReceiptResponse copy(CustomerInfo customerInfo, Map<String, PostReceiptProductInfo> map, JSONObject jSONObject) {
        r.f(customerInfo, "customerInfo");
        r.f(jSONObject, "body");
        return new PostReceiptResponse(customerInfo, map, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostReceiptResponse)) {
            return false;
        }
        PostReceiptResponse postReceiptResponse = (PostReceiptResponse) obj;
        return r.b(this.customerInfo, postReceiptResponse.customerInfo) && r.b(this.productInfoByProductId, postReceiptResponse.productInfoByProductId) && r.b(this.body, postReceiptResponse.body);
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final Map<String, PostReceiptProductInfo> getProductInfoByProductId() {
        return this.productInfoByProductId;
    }

    public int hashCode() {
        int iHashCode = this.customerInfo.hashCode() * 31;
        Map<String, PostReceiptProductInfo> map = this.productInfoByProductId;
        return ((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.body.hashCode();
    }

    public String toString() {
        return "PostReceiptResponse(customerInfo=" + this.customerInfo + ", productInfoByProductId=" + this.productInfoByProductId + ", body=" + this.body + ')';
    }
}
