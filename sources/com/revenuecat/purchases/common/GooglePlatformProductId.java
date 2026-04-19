package com.revenuecat.purchases.common;

import ae.j;
import ae.r;
import java.util.Map;
import md.x;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class GooglePlatformProductId extends PlatformProductId {
    private final String basePlanId;
    private final String offerId;
    private final String productId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePlatformProductId(String str, String str2, String str3) {
        super(str);
        r.f(str, "productId");
        this.productId = str;
        this.basePlanId = str2;
        this.offerId = str3;
    }

    public /* synthetic */ GooglePlatformProductId(String str, String str2, String str3, int i10, j jVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }

    @Override // com.revenuecat.purchases.common.PlatformProductId
    public Map<String, String> getAsMap() {
        return r0.h(x.a("product_id", getProductId()), x.a("base_plan_id", this.basePlanId), x.a("offer_id", this.offerId));
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    @Override // com.revenuecat.purchases.common.PlatformProductId
    public String getProductId() {
        return this.productId;
    }
}
