package com.revenuecat.purchases.utils;

import ae.r;
import android.os.Parcel;
import org.json.JSONObject;
import ve.a;

/* JADX INFO: loaded from: classes2.dex */
public final class JSONObjectParceler implements a<JSONObject> {
    public static final JSONObjectParceler INSTANCE = new JSONObjectParceler();

    private JSONObjectParceler() {
    }

    public JSONObject create(Parcel parcel) {
        r.f(parcel, "parcel");
        return new JSONObject(parcel.readString());
    }

    public JSONObject[] newArray(int i10) {
        return (JSONObject[]) a.C0467a.a(this, i10);
    }

    public void write(JSONObject jSONObject, Parcel parcel, int i10) {
        r.f(jSONObject, "<this>");
        r.f(parcel, "parcel");
        parcel.writeString(jSONObject.toString());
    }
}
