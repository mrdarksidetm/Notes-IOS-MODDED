package com.google.android.gms.internal.p002firebaseauthapi;

import ba.n1;
import e9.o;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzagb implements zzadt<zzagb> {
    private static final String zza = "zzagb";
    private zzagd zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagb zza(String str) throws zzabg {
        zzagd zzagdVar;
        int i10;
        zzage zzageVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzagdVar = new zzagd(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    boolean z10 = false;
                    int i11 = 0;
                    while (i11 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                        if (jSONObject2 == null) {
                            zzageVar = new zzage();
                            i10 = i11;
                        } else {
                            i10 = i11;
                            zzageVar = new zzage(o.a(jSONObject2.optString("localId", null)), o.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z10), o.a(jSONObject2.optString("displayName", null)), o.a(jSONObject2.optString("photoUrl", null)), zzagu.zza(jSONObject2.optJSONArray("providerUserInfo")), o.a(jSONObject2.optString("rawPassword", null)), o.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzags.zza(jSONObject2.optJSONArray("mfaInfo")), n1.x(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzageVar);
                        i11 = i10 + 1;
                        z10 = false;
                    }
                    zzagdVar = new zzagd(arrayList);
                }
            } else {
                zzagdVar = new zzagd();
            }
            this.zzb = zzagdVar;
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzaid.zza(e10, zza, str);
        }
    }

    public final List<zzage> zza() {
        return this.zzb.zza();
    }
}
