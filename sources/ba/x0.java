package ba;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzahp;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class x0 extends j0 {
    public static final Parcelable.Creator<x0> CREATOR = new s1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zzahp f5637d;

    public x0(String str, String str2, long j10, zzahp zzahpVar) {
        this.f5634a = w8.m.e(str);
        this.f5635b = str2;
        this.f5636c = j10;
        this.f5637d = (zzahp) w8.m.l(zzahpVar, "totpInfo cannot be null.");
    }

    public static x0 A(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new x0(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzahp());
    }

    @Override // ba.j0
    public String d() {
        return this.f5634a;
    }

    @Override // ba.j0
    public String k() {
        return this.f5635b;
    }

    @Override // ba.j0
    public long u() {
        return this.f5636c;
    }

    @Override // android.os.Parcelable
    @SuppressLint({"FirebaseUnknownNullness"})
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, d(), false);
        x8.c.C(parcel, 2, k(), false);
        x8.c.v(parcel, 3, u());
        x8.c.A(parcel, 4, this.f5637d, i10, false);
        x8.c.b(parcel, iA);
    }

    @Override // ba.j0
    public String x() {
        return "totp";
    }

    @Override // ba.j0
    public JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f5634a);
            jSONObject.putOpt("displayName", this.f5635b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f5636c));
            jSONObject.putOpt("totpInfo", this.f5637d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzh(e10);
        }
    }
}
