package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzahl extends zzahh {
    private static final String zza = "zzahl";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahh
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzahl zza(String str) throws zzabg {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (jSONObjectOptJSONObject != null) {
                this.zzb = zzag.zza(jSONObjectOptJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzaid.zza(e10, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahh, com.google.android.gms.internal.p002firebaseauthapi.zzadt
    public final /* synthetic */ zzadt zza(String str) {
        return (zzahl) zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahh
    public final String zza() {
        return this.zzb;
    }
}
