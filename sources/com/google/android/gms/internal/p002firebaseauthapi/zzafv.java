package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzafv implements zzafp {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzafv(String str, String str2, String str3, String str4, String str5) {
        this.zza = m.e(str);
        this.zzb = m.e(str2);
        this.zzc = m.e(str3);
        this.zzd = m.e(str4);
        this.zze = str5;
    }

    public static zzafv zza(String str, String str2, String str3, String str4, String str5) {
        return new zzafv(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafp
    public final /* synthetic */ zzafp zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("displayName", this.zzb);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(this.zzc)) {
            jSONObject2.put("sessionInfo", this.zzc);
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject2.put("verificationCode", this.zzd);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        if (!TextUtils.isEmpty(this.zze)) {
            jSONObject.put("tenantId", this.zze);
        }
        return jSONObject.toString();
    }
}
