package com.amazon.device.iap.internal.b;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f7830a = "KEY_TIMESTAMP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7831b = "KEY_REQUEST_ID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7832c = "KEY_USER_ID";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f7833d = "KEY_RECEIPT_STRING";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f7836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f7837h;

    public c(String str, String str2, String str3, long j10) {
        this.f7834e = str;
        this.f7835f = str2;
        this.f7837h = str3;
        this.f7836g = j10;
    }

    public static c a(String str) throws b {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(f7832c), jSONObject.getString(f7833d), jSONObject.getString(f7831b), jSONObject.getLong(f7830a));
        } catch (Throwable th) {
            throw new b("Input invalid for PendingReceipt Object:" + str, th);
        }
    }

    public String a() {
        return this.f7834e;
    }

    public String b() {
        return this.f7837h;
    }

    public String c() {
        return this.f7835f;
    }

    public long d() {
        return this.f7836g;
    }

    public String e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f7832c, this.f7834e);
        jSONObject.put(f7833d, this.f7835f);
        jSONObject.put(f7831b, this.f7837h);
        jSONObject.put(f7830a, this.f7836g);
        return jSONObject.toString();
    }
}
