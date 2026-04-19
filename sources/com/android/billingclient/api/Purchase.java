package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f8011c;

    public Purchase(String str, String str2) {
        this.f8009a = str;
        this.f8010b = str2;
        this.f8011c = new JSONObject(str);
    }

    private final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        if (this.f8011c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f8011c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (this.f8011c.has("productId")) {
            arrayList.add(this.f8011c.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        String strOptString = this.f8011c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String b() {
        return this.f8009a;
    }

    public List<String> c() {
        return j();
    }

    public int d() {
        return this.f8011c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long e() {
        return this.f8011c.optLong("purchaseTime");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f8009a, purchase.b()) && TextUtils.equals(this.f8010b, purchase.g());
    }

    public String f() {
        JSONObject jSONObject = this.f8011c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String g() {
        return this.f8010b;
    }

    public boolean h() {
        return this.f8011c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f8009a.hashCode();
    }

    public boolean i() {
        return this.f8011c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f8009a));
    }
}
