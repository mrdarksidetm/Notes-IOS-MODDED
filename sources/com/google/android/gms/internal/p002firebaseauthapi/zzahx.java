package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import e9.o;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzahx implements zzadt<zzahx> {
    private static final String zza = "zzahx";
    private String zzb;
    private String zzc;
    private long zzd;
    private List<zzags> zze;
    private String zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahx zza(String str) throws zzabg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            o.a(jSONObject.optString("localId", null));
            o.a(jSONObject.optString("email", null));
            o.a(jSONObject.optString("displayName", null));
            this.zzb = o.a(jSONObject.optString("idToken", null));
            o.a(jSONObject.optString("photoUrl", null));
            this.zzc = o.a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = zzags.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzf = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzaid.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final List<zzags> zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzf);
    }
}
