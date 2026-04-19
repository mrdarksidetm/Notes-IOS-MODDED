package ba;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class r0 extends j0 {
    public static final Parcelable.Creator<r0> CREATOR = new q1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5626d;

    public r0(String str, String str2, long j10, String str3) {
        this.f5623a = w8.m.e(str);
        this.f5624b = str2;
        this.f5625c = j10;
        this.f5626d = w8.m.e(str3);
    }

    public static r0 A(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new r0(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // ba.j0
    public String d() {
        return this.f5623a;
    }

    public String g() {
        return this.f5626d;
    }

    @Override // ba.j0
    public String k() {
        return this.f5624b;
    }

    @Override // ba.j0
    public long u() {
        return this.f5625c;
    }

    @Override // android.os.Parcelable
    @SuppressLint({"FirebaseUnknownNullness"})
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, d(), false);
        x8.c.C(parcel, 2, k(), false);
        x8.c.v(parcel, 3, u());
        x8.c.C(parcel, 4, g(), false);
        x8.c.b(parcel, iA);
    }

    @Override // ba.j0
    public String x() {
        return "phone";
    }

    @Override // ba.j0
    public JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f5623a);
            jSONObject.putOpt("displayName", this.f5624b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f5625c));
            jSONObject.putOpt("phoneNumber", this.f5626d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzh(e10);
        }
    }
}
