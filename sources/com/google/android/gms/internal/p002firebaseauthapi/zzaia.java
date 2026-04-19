package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzaia implements zzadq {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzaia() {
    }

    public static zzaia zza(String str, String str2, boolean z10) {
        zzaia zzaiaVar = new zzaia();
        zzaiaVar.zzb = m.e(str);
        zzaiaVar.zzc = m.e(str2);
        zzaiaVar.zzf = z10;
        return zzaiaVar;
    }

    public static zzaia zzb(String str, String str2, boolean z10) {
        zzaia zzaiaVar = new zzaia();
        zzaiaVar.zza = m.e(str);
        zzaiaVar.zzd = m.e(str2);
        zzaiaVar.zzf = z10;
        return zzaiaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("sessionInfo", this.zzb);
            str = this.zzc;
            str2 = "code";
        } else {
            jSONObject.put("phoneNumber", this.zza);
            str = this.zzd;
            str2 = "temporaryProof";
        }
        jSONObject.put(str2, str);
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
