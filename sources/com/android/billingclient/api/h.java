package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzai;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f8123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f8127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f8129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f8130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f8131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f8132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f8133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f8134m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8136b;

        a(JSONObject jSONObject) {
            this.f8135a = jSONObject.getInt("commitmentPaymentsCount");
            this.f8136b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        public int a() {
            return this.f8135a;
        }

        public int b() {
            return this.f8136b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f8138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f8140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f8141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f8142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final zzai f8143g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Long f8144h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final h0 f8145i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final l0 f8146j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final i0 f8147k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final j0 f8148l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final k0 f8149m;

        b(JSONObject jSONObject) {
            this.f8137a = jSONObject.optString("formattedPrice");
            this.f8138b = jSONObject.optLong("priceAmountMicros");
            this.f8139c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f8140d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f8141e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f8142f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f8143g = zzai.zzj(arrayList);
            this.f8144h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f8145i = jSONObjectOptJSONObject == null ? null : new h0(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f8146j = jSONObjectOptJSONObject2 == null ? null : new l0(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f8147k = jSONObjectOptJSONObject3 == null ? null : new i0(jSONObjectOptJSONObject3);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f8148l = jSONObjectOptJSONObject4 == null ? null : new j0(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f8149m = jSONObjectOptJSONObject5 != null ? new k0(jSONObjectOptJSONObject5) : null;
        }

        public String a() {
            return this.f8137a;
        }

        public long b() {
            return this.f8138b;
        }

        public String c() {
            return this.f8139c;
        }

        public final String d() {
            return this.f8140d;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f8151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f8153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f8154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f8155f;

        c(JSONObject jSONObject) {
            this.f8153d = jSONObject.optString("billingPeriod");
            this.f8152c = jSONObject.optString("priceCurrencyCode");
            this.f8150a = jSONObject.optString("formattedPrice");
            this.f8151b = jSONObject.optLong("priceAmountMicros");
            this.f8155f = jSONObject.optInt("recurrenceMode");
            this.f8154e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f8154e;
        }

        public String b() {
            return this.f8153d;
        }

        public String c() {
            return this.f8150a;
        }

        public long d() {
            return this.f8151b;
        }

        public String e() {
            return this.f8152c;
        }

        public int f() {
            return this.f8155f;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f8156a;

        d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f8156a = arrayList;
        }

        public List<c> a() {
            return this.f8156a;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f8160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f8161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a f8162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final m0 f8163g;

        e(JSONObject jSONObject) {
            this.f8157a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f8158b = true == strOptString.isEmpty() ? null : strOptString;
            this.f8159c = jSONObject.getString("offerIdToken");
            this.f8160d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f8162f = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            this.f8163g = jSONObjectOptJSONObject2 != null ? new m0(jSONObjectOptJSONObject2) : null;
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f8161e = arrayList;
        }

        public String a() {
            return this.f8157a;
        }

        public a b() {
            return this.f8162f;
        }

        public String c() {
            return this.f8158b;
        }

        public List<String> d() {
            return this.f8161e;
        }

        public String e() {
            return this.f8159c;
        }

        public d f() {
            return this.f8160d;
        }
    }

    h(String str) {
        this.f8122a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f8123b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f8124c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f8125d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f8126e = jSONObject.optString(com.amazon.a.a.o.b.S);
        this.f8127f = jSONObject.optString("name");
        this.f8128g = jSONObject.optString(com.amazon.a.a.o.b.f7429c);
        this.f8130i = jSONObject.optString("packageDisplayName");
        this.f8131j = jSONObject.optString(com.amazon.a.a.o.b.f7436j);
        this.f8129h = jSONObject.optString("skuDetailsToken");
        this.f8132k = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new e(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f8133l = arrayList;
        } else {
            this.f8133l = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f8123b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f8123b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f8134m = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f8134m = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f8134m = arrayList2;
        }
    }

    public String a() {
        return this.f8128g;
    }

    public String b() {
        return this.f8127f;
    }

    public b c() {
        List list = this.f8134m;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) this.f8134m.get(0);
    }

    public String d() {
        return this.f8124c;
    }

    public String e() {
        return this.f8125d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return TextUtils.equals(this.f8122a, ((h) obj).f8122a);
        }
        return false;
    }

    public List<e> f() {
        return this.f8133l;
    }

    public String g() {
        return this.f8126e;
    }

    public final String h() {
        return this.f8123b.optString("packageName");
    }

    public int hashCode() {
        return this.f8122a.hashCode();
    }

    final String i() {
        return this.f8129h;
    }

    public String j() {
        return this.f8132k;
    }

    public String toString() {
        List list = this.f8133l;
        return "ProductDetails{jsonString='" + this.f8122a + "', parsedJson=" + this.f8123b.toString() + ", productId='" + this.f8124c + "', productType='" + this.f8125d + "', title='" + this.f8126e + "', productDetailsToken='" + this.f8129h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
