package ca;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements ba.b0 {
    public static final Parcelable.Creator<i> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6689b;

    public i(long j10, long j11) {
        this.f6688a = j10;
        this.f6689b = j11;
    }

    public static i a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new i(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f6688a);
            jSONObject.put("creationTimestamp", this.f6689b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ba.b0
    public final long i() {
        return this.f6689b;
    }

    @Override // ba.b0
    public final long m() {
        return this.f6688a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.v(parcel, 1, m());
        x8.c.v(parcel, 2, i());
        x8.c.b(parcel, iA);
    }
}
