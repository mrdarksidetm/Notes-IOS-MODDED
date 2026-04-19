package com.revenuecat.purchases.common.networking;

import ae.j;
import ae.r;
import com.revenuecat.purchases.VerificationResult;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPResult {
    public static final Companion Companion = new Companion(null);
    public static final String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    public static final String REQUEST_TIME_HEADER_NAME = "X-RevenueCat-Request-Time";
    public static final String SIGNATURE_HEADER_NAME = "X-Signature";
    private final Integer backendErrorCode;
    private final String backendErrorMessage;
    private final JSONObject body;
    private final Origin origin;
    private final String payload;
    private final Date requestDate;
    private final int responseCode;
    private final VerificationResult verificationResult;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final HTTPResult deserialize(String str) throws JSONException {
            Origin originValueOf;
            VerificationResult verificationResultValueOf;
            r.f(str, "serialized");
            JSONObject jSONObject = new JSONObject(str);
            int i10 = jSONObject.getInt("responseCode");
            String string = jSONObject.getString("payload");
            if (jSONObject.has("origin")) {
                String string2 = jSONObject.getString("origin");
                r.e(string2, "jsonObject.getString(SERIALIZATION_NAME_ORIGIN)");
                originValueOf = Origin.valueOf(string2);
            } else {
                originValueOf = Origin.CACHE;
            }
            Origin origin = originValueOf;
            Date date = jSONObject.has("requestDate") ? new Date(jSONObject.getLong("requestDate")) : null;
            if (jSONObject.has("verificationResult")) {
                String string3 = jSONObject.getString("verificationResult");
                r.e(string3, "jsonObject.getString(SER…NAME_VERIFICATION_RESULT)");
                verificationResultValueOf = VerificationResult.valueOf(string3);
            } else {
                verificationResultValueOf = VerificationResult.NOT_REQUESTED;
            }
            r.e(string, "payload");
            return new HTTPResult(i10, string, origin, date, verificationResultValueOf);
        }
    }

    public enum Origin {
        BACKEND,
        CACHE
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HTTPResult(int r2, java.lang.String r3, com.revenuecat.purchases.common.networking.HTTPResult.Origin r4, java.util.Date r5, com.revenuecat.purchases.VerificationResult r6) {
        /*
            r1 = this;
            java.lang.String r0 = "payload"
            ae.r.f(r3, r0)
            java.lang.String r0 = "origin"
            ae.r.f(r4, r0)
            java.lang.String r0 = "verificationResult"
            ae.r.f(r6, r0)
            r1.<init>()
            r1.responseCode = r2
            r1.payload = r3
            r1.origin = r4
            r1.requestDate = r5
            r1.verificationResult = r6
            boolean r2 = je.m.v(r3)
            r4 = 1
            r2 = r2 ^ r4
            r5 = 0
            if (r2 == 0) goto L26
            goto L27
        L26:
            r3 = r5
        L27:
            org.json.JSONObject r2 = new org.json.JSONObject
            if (r3 == 0) goto L2f
            r2.<init>(r3)
            goto L32
        L2f:
            r2.<init>()
        L32:
            r1.body = r2
            boolean r3 = com.revenuecat.purchases.common.BackendHelperKt.isSuccessful(r1)
            if (r3 != 0) goto L50
            java.lang.String r3 = "code"
            int r3 = r2.optInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r6 = r3.intValue()
            if (r6 <= 0) goto L4c
            r6 = r4
            goto L4d
        L4c:
            r6 = 0
        L4d:
            if (r6 == 0) goto L50
            goto L51
        L50:
            r3 = r5
        L51:
            r1.backendErrorCode = r3
            boolean r3 = com.revenuecat.purchases.common.BackendHelperKt.isSuccessful(r1)
            if (r3 != 0) goto L6c
            java.lang.String r3 = "message"
            java.lang.String r2 = r2.optString(r3)
            java.lang.String r3 = "it"
            ae.r.e(r2, r3)
            boolean r3 = je.m.v(r2)
            r3 = r3 ^ r4
            if (r3 == 0) goto L6c
            r5 = r2
        L6c:
            r1.backendErrorMessage = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.networking.HTTPResult.<init>(int, java.lang.String, com.revenuecat.purchases.common.networking.HTTPResult$Origin, java.util.Date, com.revenuecat.purchases.VerificationResult):void");
    }

    public static /* synthetic */ HTTPResult copy$default(HTTPResult hTTPResult, int i10, String str, Origin origin, Date date, VerificationResult verificationResult, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = hTTPResult.responseCode;
        }
        if ((i11 & 2) != 0) {
            str = hTTPResult.payload;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            origin = hTTPResult.origin;
        }
        Origin origin2 = origin;
        if ((i11 & 8) != 0) {
            date = hTTPResult.requestDate;
        }
        Date date2 = date;
        if ((i11 & 16) != 0) {
            verificationResult = hTTPResult.verificationResult;
        }
        return hTTPResult.copy(i10, str2, origin2, date2, verificationResult);
    }

    public final int component1() {
        return this.responseCode;
    }

    public final String component2() {
        return this.payload;
    }

    public final Origin component3() {
        return this.origin;
    }

    public final Date component4() {
        return this.requestDate;
    }

    public final VerificationResult component5() {
        return this.verificationResult;
    }

    public final HTTPResult copy(int i10, String str, Origin origin, Date date, VerificationResult verificationResult) {
        r.f(str, "payload");
        r.f(origin, "origin");
        r.f(verificationResult, "verificationResult");
        return new HTTPResult(i10, str, origin, date, verificationResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPResult)) {
            return false;
        }
        HTTPResult hTTPResult = (HTTPResult) obj;
        return this.responseCode == hTTPResult.responseCode && r.b(this.payload, hTTPResult.payload) && this.origin == hTTPResult.origin && r.b(this.requestDate, hTTPResult.requestDate) && this.verificationResult == hTTPResult.verificationResult;
    }

    public final Integer getBackendErrorCode() {
        return this.backendErrorCode;
    }

    public final String getBackendErrorMessage() {
        return this.backendErrorMessage;
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final Origin getOrigin() {
        return this.origin;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final VerificationResult getVerificationResult() {
        return this.verificationResult;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.responseCode) * 31) + this.payload.hashCode()) * 31) + this.origin.hashCode()) * 31;
        Date date = this.requestDate;
        return ((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + this.verificationResult.hashCode();
    }

    public final String serialize() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("responseCode", this.responseCode);
        jSONObject.put("payload", this.payload);
        jSONObject.put("origin", this.origin.name());
        Date date = this.requestDate;
        jSONObject.put("requestDate", date != null ? Long.valueOf(date.getTime()) : null);
        jSONObject.put("verificationResult", this.verificationResult.name());
        String string = jSONObject.toString();
        r.e(string, "jsonObject.toString()");
        return string;
    }

    public String toString() {
        return "HTTPResult(responseCode=" + this.responseCode + ", payload=" + this.payload + ", origin=" + this.origin + ", requestDate=" + this.requestDate + ", verificationResult=" + this.verificationResult + ')';
    }
}
