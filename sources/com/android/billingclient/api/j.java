package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f8171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<a> f8172c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8175c;

        private a(JSONObject jSONObject) {
            this.f8173a = jSONObject.optString("productId");
            this.f8174b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f8175c = true == strOptString.isEmpty() ? null : strOptString;
        }

        public String a() {
            return this.f8173a;
        }

        public String b() {
            return this.f8175c;
        }

        public String c() {
            return this.f8174b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8173a.equals(aVar.a()) && this.f8174b.equals(aVar.c()) && Objects.equals(this.f8175c, aVar.b());
        }

        public int hashCode() {
            return Objects.hash(this.f8173a, this.f8174b, this.f8175c);
        }

        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f8173a, this.f8174b, this.f8175c);
        }
    }

    j(String str) {
        this.f8170a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f8171b = jSONObject;
        this.f8172c = a(jSONObject.optJSONArray("products"));
    }

    private static List<a> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new a(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }
}
