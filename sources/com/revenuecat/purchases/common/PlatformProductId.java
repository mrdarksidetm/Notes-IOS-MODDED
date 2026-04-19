package com.revenuecat.purchases.common;

import ae.r;
import java.util.Map;
import md.x;
import nd.q0;

/* JADX INFO: loaded from: classes2.dex */
public class PlatformProductId {
    private final String productId;

    public PlatformProductId(String str) {
        r.f(str, "productId");
        this.productId = str;
    }

    public Map<String, String> getAsMap() {
        return q0.c(x.a("product_id", getProductId()));
    }

    public String getProductId() {
        return this.productId;
    }
}
