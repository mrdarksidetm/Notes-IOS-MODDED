package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzagq {
    private Long zza;
    private Long zzb;

    public static zzagq zza(String str) throws UnsupportedEncodingException {
        try {
            zzagq zzagqVar = new zzagq();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            zzagqVar.zza = Long.valueOf(jSONObject.optLong("iat"));
            zzagqVar.zzb = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzagqVar;
        } catch (JSONException e10) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. " + String.valueOf(e10));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. " + String.valueOf(e10));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    public final Long zzb() {
        return this.zza;
    }
}
