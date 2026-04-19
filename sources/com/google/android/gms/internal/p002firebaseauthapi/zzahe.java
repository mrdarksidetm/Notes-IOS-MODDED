package com.google.android.gms.internal.p002firebaseauthapi;

import e9.o;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzahe implements zzadt<zzahe> {
    private static final String zza = "zzahe";
    private String zzb;
    private zzagu zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahe zza(String str) throws zzabg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = o.a(jSONObject.optString("email", null));
            o.a(jSONObject.optString("passwordHash", null));
            jSONObject.optBoolean("emailVerified", false);
            o.a(jSONObject.optString("displayName", null));
            o.a(jSONObject.optString("photoUrl", null));
            this.zzc = zzagu.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzd = o.a(jSONObject.optString("idToken", null));
            this.zze = o.a(jSONObject.optString("refreshToken", null));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzaid.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzagr> zze() {
        zzagu zzaguVar = this.zzc;
        if (zzaguVar != null) {
            return zzaguVar.zza();
        }
        return null;
    }
}
