package com.revenuecat.purchases.common.networking;

import ae.r;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class ETagData {
    private final String eTag;
    private final Date lastRefreshTime;

    public ETagData(String str, Date date) {
        r.f(str, "eTag");
        this.eTag = str;
        this.lastRefreshTime = date;
    }

    public static /* synthetic */ ETagData copy$default(ETagData eTagData, String str, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eTagData.eTag;
        }
        if ((i10 & 2) != 0) {
            date = eTagData.lastRefreshTime;
        }
        return eTagData.copy(str, date);
    }

    public final String component1() {
        return this.eTag;
    }

    public final Date component2() {
        return this.lastRefreshTime;
    }

    public final ETagData copy(String str, Date date) {
        r.f(str, "eTag");
        return new ETagData(str, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ETagData)) {
            return false;
        }
        ETagData eTagData = (ETagData) obj;
        return r.b(this.eTag, eTagData.eTag) && r.b(this.lastRefreshTime, eTagData.lastRefreshTime);
    }

    public final String getETag() {
        return this.eTag;
    }

    public final Date getLastRefreshTime() {
        return this.lastRefreshTime;
    }

    public int hashCode() {
        int iHashCode = this.eTag.hashCode() * 31;
        Date date = this.lastRefreshTime;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        return "ETagData(eTag=" + this.eTag + ", lastRefreshTime=" + this.lastRefreshTime + ')';
    }
}
