package com.revenuecat.purchases.common.offerings;

import ae.j;
import ae.r;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.caching.DateExtensionsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.caching.InMemoryCachedObject;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class OfferingsCache {
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final InMemoryCachedObject<Offerings> offeringsCachedObject;

    public OfferingsCache(DeviceCache deviceCache, DateProvider dateProvider, InMemoryCachedObject<Offerings> inMemoryCachedObject) {
        r.f(deviceCache, "deviceCache");
        r.f(dateProvider, "dateProvider");
        r.f(inMemoryCachedObject, "offeringsCachedObject");
        this.deviceCache = deviceCache;
        this.dateProvider = dateProvider;
        this.offeringsCachedObject = inMemoryCachedObject;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OfferingsCache(DeviceCache deviceCache, DateProvider dateProvider, InMemoryCachedObject inMemoryCachedObject, int i10, j jVar) {
        dateProvider = (i10 & 2) != 0 ? new DefaultDateProvider() : dateProvider;
        this(deviceCache, dateProvider, (i10 & 4) != 0 ? new InMemoryCachedObject(null, dateProvider, 1, null) : inMemoryCachedObject);
    }

    public final synchronized void cacheOfferings(Offerings offerings, JSONObject jSONObject) {
        r.f(offerings, "offerings");
        r.f(jSONObject, "offeringsResponse");
        this.offeringsCachedObject.cacheInstance(offerings);
        this.deviceCache.cacheOfferingsResponse(jSONObject);
        this.offeringsCachedObject.updateCacheTimestamp(this.dateProvider.getNow());
    }

    public final synchronized void clearCache() {
        this.offeringsCachedObject.clearCache();
        this.deviceCache.clearOfferingsResponseCache();
    }

    public final synchronized void clearOfferingsCacheTimestamp() {
        this.offeringsCachedObject.clearCacheTimestamp();
    }

    public final synchronized Offerings getCachedOfferings() {
        return this.offeringsCachedObject.getCachedInstance();
    }

    public final synchronized JSONObject getCachedOfferingsResponse() {
        return this.deviceCache.getOfferingsResponseCache();
    }

    public final synchronized boolean isOfferingsCacheStale(boolean z10) {
        return DateExtensionsKt.isCacheStale(this.offeringsCachedObject.getLastUpdatedAt$purchases_defaultsRelease(), z10, this.dateProvider);
    }
}
