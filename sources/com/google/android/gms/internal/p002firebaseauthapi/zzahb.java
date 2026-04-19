package com.google.android.gms.internal.p002firebaseauthapi;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzahb implements zzadq {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzj;
    private boolean zzh = true;
    private zzahq zzg = new zzahq();
    private zzahq zzi = new zzahq();

    public final zzahb zza(String str) {
        m.e(str);
        this.zzi.zzb().add(str);
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        int i10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", this.zzh);
        if (!this.zzi.zzb().isEmpty()) {
            List<String> listZzb = this.zzi.zzb();
            JSONArray jSONArray = new JSONArray();
            for (int i11 = 0; i11 < listZzb.size(); i11++) {
                jSONArray.put(listZzb.get(i11));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List<String> listZzb2 = this.zzg.zzb();
        int size = listZzb2.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < listZzb2.size(); i12++) {
            String str = listZzb2.get(i12);
            str.hashCode();
            i10 = 2;
            switch (str) {
                case "DISPLAY_NAME":
                    break;
                case "EMAIL":
                    i10 = 1;
                    break;
                case "PHOTO_URL":
                    i10 = 4;
                    break;
                case "PASSWORD":
                    i10 = 5;
                    break;
                default:
                    i10 = 0;
                    break;
            }
            iArr[i12] = i10;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i13 = 0; i13 < size; i13++) {
                jSONArray2.put(iArr[i13]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.zza;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, str4);
        }
        String str5 = this.zzb;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.zzf;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.zze;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.zzj;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }

    public final zzahb zzb(String str) {
        if (str == null) {
            this.zzg.zzb().add("DISPLAY_NAME");
        } else {
            this.zzb = str;
        }
        return this;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzahb zzc(String str) {
        if (str == null) {
            this.zzg.zzb().add("EMAIL");
        } else {
            this.zzc = str;
        }
        return this;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzahb zzd(String str) {
        this.zza = m.e(str);
        return this;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final zzahb zze(String str) {
        this.zze = m.e(str);
        return this;
    }

    public final String zze() {
        return this.zzf;
    }

    public final zzahb zzf(String str) {
        if (str == null) {
            this.zzg.zzb().add("PASSWORD");
        } else {
            this.zzd = str;
        }
        return this;
    }

    public final zzahb zzg(String str) {
        if (str == null) {
            this.zzg.zzb().add("PHOTO_URL");
        } else {
            this.zzf = str;
        }
        return this;
    }

    public final zzahb zzh(String str) {
        this.zzj = str;
        return this;
    }

    public final boolean zzi(String str) {
        m.e(str);
        return this.zzg.zzb().contains(str);
    }
}
