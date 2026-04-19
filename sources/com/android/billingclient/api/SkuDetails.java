package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SkuDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f8016b;

    public String a() {
        return this.f8016b.optString("productId");
    }

    public String b() {
        return this.f8016b.optString("type");
    }

    public int c() {
        return this.f8016b.optInt("offer_type");
    }

    public String d() {
        return this.f8016b.optString("offer_id");
    }

    public String e() {
        String strOptString = this.f8016b.optString("offerIdToken");
        return strOptString.isEmpty() ? this.f8016b.optString("offer_id_token") : strOptString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f8015a, ((SkuDetails) obj).f8015a);
        }
        return false;
    }

    public final String f() {
        return this.f8016b.optString("packageName");
    }

    public String g() {
        return this.f8016b.optString("serializedDocid");
    }

    final String h() {
        return this.f8016b.optString("skuDetailsToken");
    }

    public int hashCode() {
        return this.f8015a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f8015a));
    }
}
