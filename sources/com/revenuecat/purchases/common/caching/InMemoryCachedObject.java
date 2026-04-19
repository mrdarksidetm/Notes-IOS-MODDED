package com.revenuecat.purchases.common.caching;

import ae.j;
import ae.r;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class InMemoryCachedObject<T> {
    private T cachedInstance;
    private final DateProvider dateProvider;
    private Date lastUpdatedAt;

    public InMemoryCachedObject() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public InMemoryCachedObject(Date date, DateProvider dateProvider) {
        r.f(dateProvider, "dateProvider");
        this.lastUpdatedAt = date;
        this.dateProvider = dateProvider;
    }

    public /* synthetic */ InMemoryCachedObject(Date date, DateProvider dateProvider, int i10, j jVar) {
        this((i10 & 1) != 0 ? null : date, (i10 & 2) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    public final void cacheInstance(T t10) {
        this.cachedInstance = t10;
        this.lastUpdatedAt = this.dateProvider.getNow();
    }

    public final void clearCache() {
        clearCacheTimestamp();
        this.cachedInstance = null;
    }

    public final void clearCacheTimestamp() {
        this.lastUpdatedAt = null;
    }

    public final T getCachedInstance() {
        return this.cachedInstance;
    }

    public final Date getLastUpdatedAt$purchases_defaultsRelease() {
        return this.lastUpdatedAt;
    }

    public final void setCachedInstance(T t10) {
        this.cachedInstance = t10;
    }

    public final void setLastUpdatedAt$purchases_defaultsRelease(Date date) {
        this.lastUpdatedAt = date;
    }

    public final void updateCacheTimestamp(Date date) {
        r.f(date, "date");
        this.lastUpdatedAt = date;
    }
}
