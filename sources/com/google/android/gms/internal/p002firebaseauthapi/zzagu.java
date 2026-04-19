package com.google.android.gms.internal.p002firebaseauthapi;

import e9.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzagu {
    private List<zzagr> zza;

    public zzagu() {
        this.zza = new ArrayList();
    }

    private zzagu(List<zzagr> list) {
        this.zza = !list.isEmpty() ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public static zzagu zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzagu(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(jSONObject == null ? new zzagr() : new zzagr(o.a(jSONObject.optString("federatedId", null)), o.a(jSONObject.optString("displayName", null)), o.a(jSONObject.optString("photoUrl", null)), o.a(jSONObject.optString("providerId", null)), null, o.a(jSONObject.optString("phoneNumber", null)), o.a(jSONObject.optString("email", null))));
        }
        return new zzagu(arrayList);
    }

    public final List<zzagr> zza() {
        return this.zza;
    }
}
