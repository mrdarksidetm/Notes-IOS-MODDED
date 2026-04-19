package com.android.billingclient.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f8054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8055c;

    c(String str) {
        this.f8053a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f8054b = jSONObject;
        this.f8055c = jSONObject.optString("countryCode");
    }

    public String a() {
        return this.f8055c;
    }
}
