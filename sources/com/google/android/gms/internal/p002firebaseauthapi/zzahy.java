package com.google.android.gms.internal.p002firebaseauthapi;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzahy implements zzadq {
    private String zza;
    private String zzb;
    private final String zzc;
    private final String zzd;
    private boolean zze = true;

    public zzahy(String str, String str2, String str3, String str4) {
        this.zza = m.e(str);
        this.zzb = m.e(str2);
        this.zzc = str3;
        this.zzd = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zza);
        jSONObject.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, this.zzb);
        jSONObject.put("returnSecureToken", this.zze);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            zzaid.zza(jSONObject, "captchaResponse", str2);
        } else {
            zzaid.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
