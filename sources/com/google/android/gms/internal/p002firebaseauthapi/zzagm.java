package com.google.android.gms.internal.p002firebaseauthapi;

import e9.o;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public class zzagm implements zzadt<zzagm> {
    private static final String zza = "zzagm";
    private String zzb;
    private zzal<zzagt> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzagm zza(String str) throws zzabg {
        zzal<zzagt> zzalVarZza;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = o.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzalVarZza = zzal.zza(new ArrayList());
                } else {
                    zzao zzaoVarZzg = zzal.zzg();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                        zzaoVarZzg.zza(jSONObject2 == null ? zzagt.zza(null, null) : zzagt.zza(o.a(jSONObject2.optString("provider")), o.a(jSONObject2.optString("enforcementState"))));
                    }
                    zzalVarZza = zzaoVarZzg.zza();
                }
                this.zzc = zzalVarZza;
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzaid.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb(String str) {
        m.e(str);
        zzal<zzagt> zzalVar = this.zzc;
        if (zzalVar != null && !zzalVar.isEmpty()) {
            zzal<zzagt> zzalVar2 = this.zzc;
            int size = zzalVar2.size();
            int i10 = 0;
            while (i10 < size) {
                zzagt zzagtVar = zzalVar2.get(i10);
                i10++;
                zzagt zzagtVar2 = zzagtVar;
                String strZza = zzagtVar2.zza();
                String strZzb = zzagtVar2.zzb();
                if (strZza != null && strZzb != null && strZzb.equals(str)) {
                    return zzagtVar2.zza();
                }
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String strZzb = zzb(str);
        if (strZzb == null) {
            return false;
        }
        return strZzb.equals("ENFORCE") || strZzb.equals("AUDIT");
    }
}
