package com.google.android.gms.internal.p002firebaseauthapi;

import ba.f;
import ba.j;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;
import z8.a;

/* JADX INFO: loaded from: classes.dex */
public class zzafn implements zzadq {
    private static final String zza = "zzafn";
    private final String zzb;
    private final String zzc;
    private final j zzd;
    private final String zze;
    private final String zzf;

    static {
        new a(zzafn.class.getSimpleName(), new String[0]);
    }

    public zzafn(j jVar, String str, String str2) {
        this.zzd = (j) m.k(jVar);
        this.zzb = m.e(jVar.zzc());
        this.zzc = m.e(jVar.zze());
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        f fVarC = f.c(this.zzc);
        String strA = fVarC != null ? fVarC.a() : null;
        String strD = fVarC != null ? fVarC.d() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (strA != null) {
            jSONObject.put("oobCode", strA);
        }
        if (strD != null) {
            jSONObject.put("tenantId", strD);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzaid.zza(jSONObject, "captchaResp", str2);
        } else {
            zzaid.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final j zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
