package com.android.billingclient.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8179b;

    k0(JSONObject jSONObject) {
        this.f8178a = jSONObject.getString("rentalPeriod");
        String strOptString = jSONObject.optString("rentalExpirationPeriod");
        this.f8179b = true == strOptString.isEmpty() ? null : strOptString;
    }
}
