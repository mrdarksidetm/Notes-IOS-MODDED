package com.revenuecat.purchases.common.networking;

import ae.j;
import ae.r;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPResultWithETag {
    public static final Companion Companion = new Companion(null);
    private static final String SERIALIZATION_NAME_ETAG = "eTag";
    private static final String SERIALIZATION_NAME_HTTPRESULT = "httpResult";
    private static final String SERIALIZATION_NAME_LAST_REFRESH_TIME = "lastRefreshTime";
    private final ETagData eTagData;
    private final HTTPResult httpResult;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final HTTPResultWithETag deserialize(String str) throws JSONException {
            r.f(str, "serialized");
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(HTTPResultWithETag.SERIALIZATION_NAME_ETAG);
            Long lValueOf = Long.valueOf(jSONObject.optLong(HTTPResultWithETag.SERIALIZATION_NAME_LAST_REFRESH_TIME, -1L));
            if (!(lValueOf.longValue() != -1)) {
                lValueOf = null;
            }
            Date date = lValueOf != null ? new Date(lValueOf.longValue()) : null;
            String string2 = jSONObject.getString(HTTPResultWithETag.SERIALIZATION_NAME_HTTPRESULT);
            r.e(string, HTTPResultWithETag.SERIALIZATION_NAME_ETAG);
            ETagData eTagData = new ETagData(string, date);
            HTTPResult.Companion companion = HTTPResult.Companion;
            r.e(string2, "serializedHTTPResult");
            return new HTTPResultWithETag(eTagData, companion.deserialize(string2));
        }
    }

    public HTTPResultWithETag(ETagData eTagData, HTTPResult hTTPResult) {
        r.f(eTagData, "eTagData");
        r.f(hTTPResult, SERIALIZATION_NAME_HTTPRESULT);
        this.eTagData = eTagData;
        this.httpResult = hTTPResult;
    }

    public static /* synthetic */ HTTPResultWithETag copy$default(HTTPResultWithETag hTTPResultWithETag, ETagData eTagData, HTTPResult hTTPResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eTagData = hTTPResultWithETag.eTagData;
        }
        if ((i10 & 2) != 0) {
            hTTPResult = hTTPResultWithETag.httpResult;
        }
        return hTTPResultWithETag.copy(eTagData, hTTPResult);
    }

    public final ETagData component1() {
        return this.eTagData;
    }

    public final HTTPResult component2() {
        return this.httpResult;
    }

    public final HTTPResultWithETag copy(ETagData eTagData, HTTPResult hTTPResult) {
        r.f(eTagData, "eTagData");
        r.f(hTTPResult, SERIALIZATION_NAME_HTTPRESULT);
        return new HTTPResultWithETag(eTagData, hTTPResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPResultWithETag)) {
            return false;
        }
        HTTPResultWithETag hTTPResultWithETag = (HTTPResultWithETag) obj;
        return r.b(this.eTagData, hTTPResultWithETag.eTagData) && r.b(this.httpResult, hTTPResultWithETag.httpResult);
    }

    public final ETagData getETagData() {
        return this.eTagData;
    }

    public final HTTPResult getHttpResult() {
        return this.httpResult;
    }

    public int hashCode() {
        return (this.eTagData.hashCode() * 31) + this.httpResult.hashCode();
    }

    public final String serialize() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SERIALIZATION_NAME_ETAG, this.eTagData.getETag());
        Date lastRefreshTime = this.eTagData.getLastRefreshTime();
        if (lastRefreshTime != null) {
            jSONObject.put(SERIALIZATION_NAME_LAST_REFRESH_TIME, lastRefreshTime.getTime());
        }
        jSONObject.put(SERIALIZATION_NAME_HTTPRESULT, this.httpResult.serialize());
        String string = jSONObject.toString();
        r.e(string, "JSONObject().apply {\n   …e())\n        }.toString()");
        return string;
    }

    public String toString() {
        return "HTTPResultWithETag(eTagData=" + this.eTagData + ", httpResult=" + this.httpResult + ')';
    }
}
