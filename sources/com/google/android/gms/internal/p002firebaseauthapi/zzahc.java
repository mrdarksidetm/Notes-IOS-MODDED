package com.google.android.gms.internal.p002firebaseauthapi;

import e9.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzahc implements zzadt<zzahc> {
    private static final String zza = "zzahc";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahc zza(String str) throws zzabg {
        try {
            this.zzb = o.a(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzaid.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
