package com.revenuecat.purchases.common.caching;

import ae.s;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class DeviceCache$legacyAppUserIDCacheKey$2 extends s implements a<String> {
    final /* synthetic */ DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceCache$legacyAppUserIDCacheKey$2(DeviceCache deviceCache) {
        super(0);
        this.this$0 = deviceCache;
    }

    @Override // zd.a
    public final String invoke() {
        return this.this$0.getApiKeyPrefix();
    }
}
