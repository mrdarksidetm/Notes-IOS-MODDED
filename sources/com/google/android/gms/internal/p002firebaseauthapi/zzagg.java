package com.google.android.gms.internal.p002firebaseauthapi;

import ba.e;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzagg implements zzadq {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private e zze;
    private String zzf;
    private String zzg;

    public zzagg(int i10) {
        this.zza = zza(i10);
    }

    private zzagg(int i10, e eVar, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        this.zze = (e) m.k(eVar);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public static zzagg zza(e eVar, String str, String str2) {
        m.e(str);
        m.e(str2);
        m.k(eVar);
        return new zzagg(7, eVar, null, str2, str, null, null);
    }

    private static String zza(int i10) {
        return i10 != 1 ? i10 != 4 ? i10 != 6 ? i10 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public final zzagg zza(e eVar) {
        this.zze = (e) m.k(eVar);
        return this;
    }

    public final zzagg zza(String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        int i10;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.hashCode();
        i10 = 1;
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i10 = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i10 = 7;
                break;
            case "EMAIL_SIGNIN":
                i10 = 6;
                break;
            default:
                i10 = 0;
                break;
        }
        jSONObject.put("requestType", i10);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        e eVar = this.zze;
        if (eVar != null) {
            jSONObject.put("androidInstallApp", eVar.x());
            jSONObject.put("canHandleCodeInApp", this.zze.u());
            if (this.zze.C() != null) {
                jSONObject.put("continueUrl", this.zze.C());
            }
            if (this.zze.B() != null) {
                jSONObject.put("iosBundleId", this.zze.B());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.A() != null) {
                jSONObject.put("androidPackageName", this.zze.A());
            }
            if (this.zze.z() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.z());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
            if (this.zze.zze() != null) {
                jSONObject.put("linkDomain", this.zze.zze());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzaid.zza(jSONObject, "captchaResp", str6);
        } else {
            zzaid.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final e zzb() {
        return this.zze;
    }

    public final zzagg zzb(String str) {
        this.zzb = m.e(str);
        return this;
    }

    public final zzagg zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final zzagg zzd(String str) {
        this.zzd = m.e(str);
        return this;
    }

    public final String zzd() {
        return this.zzd;
    }
}
