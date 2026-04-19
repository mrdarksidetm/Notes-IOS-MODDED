package com.revenuecat.purchases.common.caching;

import ke.a;
import ke.c;
import ke.d;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceCacheKt {
    public static final int CUSTOMER_INFO_SCHEMA_VERSION = 3;
    private static final long PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD;
    private static final String SHARED_PREFERENCES_PREFIX = "com.revenuecat.purchases.";

    static {
        a.C0337a c0337a = a.f14459b;
        PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD = c.s(25, d.f14471g);
    }
}
