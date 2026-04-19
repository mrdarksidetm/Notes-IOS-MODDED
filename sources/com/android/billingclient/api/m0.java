package com.android.billingclient.api;

import com.android.billingclient.api.h;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h.c f8191f;

    m0(JSONObject jSONObject) {
        this.f8186a = jSONObject.getString("productId");
        this.f8187b = jSONObject.optString(com.amazon.a.a.o.b.S);
        this.f8188c = jSONObject.optString("name");
        this.f8189d = jSONObject.optString(com.amazon.a.a.o.b.f7429c);
        this.f8190e = jSONObject.optString("basePlanId");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.f8191f = jSONObjectOptJSONObject == null ? null : new h.c(jSONObjectOptJSONObject);
    }
}
