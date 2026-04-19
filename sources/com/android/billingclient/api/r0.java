package com.android.billingclient.api;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8215c;

    /* synthetic */ r0(JSONObject jSONObject, v6.n0 n0Var) {
        this.f8213a = jSONObject.optString("productId");
        this.f8214b = jSONObject.optString("productType");
        String strOptString = jSONObject.optString("offerToken");
        this.f8215c = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f8213a.equals(r0Var.f8213a) && this.f8214b.equals(r0Var.f8214b) && Objects.equals(this.f8215c, r0Var.f8215c);
    }

    public final int hashCode() {
        return Objects.hash(this.f8213a, this.f8214b, this.f8215c);
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.f8213a, this.f8214b, this.f8215c);
    }
}
