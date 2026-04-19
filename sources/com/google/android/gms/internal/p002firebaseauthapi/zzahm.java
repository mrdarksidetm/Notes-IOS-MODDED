package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzahm implements zzahi {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private zzafg zzg;
    private final String zzh;

    private zzahm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.zza = m.e(str);
        m.e(str2);
        this.zzb = str3;
        this.zzc = str4;
        this.zzd = str5;
        this.zze = str6;
        this.zzf = str7;
        this.zzh = null;
    }

    public static zzahm zza(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        m.e(str2);
        return new zzahm(str, "phone", str2, str3, str4, str5, str6, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaProvider", 1);
        if (this.zzb != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zzb);
            if (!TextUtils.isEmpty(this.zzd)) {
                jSONObject2.put("recaptchaToken", this.zzd);
            }
            if (!TextUtils.isEmpty(this.zze)) {
                jSONObject2.put("playIntegrityToken", this.zze);
            }
            zzafg zzafgVar = this.zzg;
            if (zzafgVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzafgVar.zza());
            }
            String str = this.zzf;
            if (str != null) {
                zzaid.zza(jSONObject2, "captchaResponse", str);
            } else {
                zzaid.zza(jSONObject2);
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        if (!TextUtils.isEmpty(null)) {
            jSONObject.put("tenantId", (Object) null);
        }
        return jSONObject.toString();
    }

    public final void zza(zzafg zzafgVar) {
        this.zzg = zzafgVar;
    }

    public final String zzb() {
        return this.zzc;
    }
}
