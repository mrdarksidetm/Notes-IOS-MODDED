package com.revenuecat.purchases.common;

import ae.r;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundAwareCallbackCacheKey {
    private final boolean appInBackground;
    private final List<String> cacheKey;

    public BackgroundAwareCallbackCacheKey(List<String> list, boolean z10) {
        r.f(list, "cacheKey");
        this.cacheKey = list;
        this.appInBackground = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BackgroundAwareCallbackCacheKey copy$default(BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = backgroundAwareCallbackCacheKey.cacheKey;
        }
        if ((i10 & 2) != 0) {
            z10 = backgroundAwareCallbackCacheKey.appInBackground;
        }
        return backgroundAwareCallbackCacheKey.copy(list, z10);
    }

    public final List<String> component1() {
        return this.cacheKey;
    }

    public final boolean component2() {
        return this.appInBackground;
    }

    public final BackgroundAwareCallbackCacheKey copy(List<String> list, boolean z10) {
        r.f(list, "cacheKey");
        return new BackgroundAwareCallbackCacheKey(list, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundAwareCallbackCacheKey)) {
            return false;
        }
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = (BackgroundAwareCallbackCacheKey) obj;
        return r.b(this.cacheKey, backgroundAwareCallbackCacheKey.cacheKey) && this.appInBackground == backgroundAwareCallbackCacheKey.appInBackground;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final List<String> getCacheKey() {
        return this.cacheKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.cacheKey.hashCode() * 31;
        boolean z10 = this.appInBackground;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public String toString() {
        return "BackgroundAwareCallbackCacheKey(cacheKey=" + this.cacheKey + ", appInBackground=" + this.appInBackground + ')';
    }
}
