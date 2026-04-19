package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f8014c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f8012a = str;
        this.f8013b = str2;
        this.f8014c = new JSONObject(str);
    }

    private final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        if (this.f8014c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f8014c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (this.f8014c.has("productId")) {
            arrayList.add(this.f8014c.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        return this.f8012a;
    }

    public List<String> b() {
        return g();
    }

    public long c() {
        return this.f8014c.optLong("purchaseTime");
    }

    public String d() {
        JSONObject jSONObject = this.f8014c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String e() {
        return this.f8013b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f8012a, purchaseHistoryRecord.a()) && TextUtils.equals(this.f8013b, purchaseHistoryRecord.e());
    }

    @Deprecated
    public ArrayList<String> f() {
        return g();
    }

    public int hashCode() {
        return this.f8012a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f8012a));
    }
}
