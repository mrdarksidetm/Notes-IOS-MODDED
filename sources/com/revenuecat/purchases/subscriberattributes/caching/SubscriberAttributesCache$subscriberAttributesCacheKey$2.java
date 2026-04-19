package com.revenuecat.purchases.subscriberattributes.caching;

import ae.s;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class SubscriberAttributesCache$subscriberAttributesCacheKey$2 extends s implements a<String> {
    final /* synthetic */ SubscriberAttributesCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriberAttributesCache$subscriberAttributesCacheKey$2(SubscriberAttributesCache subscriberAttributesCache) {
        super(0);
        this.this$0 = subscriberAttributesCache;
    }

    @Override // zd.a
    public final String invoke() {
        return this.this$0.getDeviceCache$purchases_defaultsRelease().newKey("subscriberAttributes");
    }
}
