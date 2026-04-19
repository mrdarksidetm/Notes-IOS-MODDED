package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ca.u1;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzahr extends a implements zzadq {
    public static final Parcelable.Creator<zzahr> CREATOR = new zzahu();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzahr() {
        this.zzi = true;
        this.zzj = true;
    }

    public zzahr(u1 u1Var, String str) {
        m.k(u1Var);
        this.zzl = m.e(u1Var.d());
        this.zzm = m.e(str);
        this.zze = m.e(u1Var.c());
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    public zzahr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        this.zze = m.e(str3);
        this.zzf = null;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            sb2.append("id_token=");
            sb2.append(this.zzc);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb2.append("access_token=");
            sb2.append(this.zzd);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            sb2.append("identifier=");
            sb2.append(this.zzf);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            sb2.append("oauth_token_secret=");
            sb2.append(this.zzh);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            sb2.append("code=");
            sb2.append(this.zzk);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb2.append("nonce=");
            sb2.append(str9);
            sb2.append("&");
        }
        sb2.append("providerId=");
        sb2.append(this.zze);
        this.zzg = sb2.toString();
        this.zzj = true;
    }

    zzahr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z12;
        this.zzp = str13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.C(parcel, 2, this.zza, false);
        c.C(parcel, 3, this.zzb, false);
        c.C(parcel, 4, this.zzc, false);
        c.C(parcel, 5, this.zzd, false);
        c.C(parcel, 6, this.zze, false);
        c.C(parcel, 7, this.zzf, false);
        c.C(parcel, 8, this.zzg, false);
        c.C(parcel, 9, this.zzh, false);
        c.g(parcel, 10, this.zzi);
        c.g(parcel, 11, this.zzj);
        c.C(parcel, 12, this.zzk, false);
        c.C(parcel, 13, this.zzl, false);
        c.C(parcel, 14, this.zzm, false);
        c.C(parcel, 15, this.zzn, false);
        c.g(parcel, 16, this.zzo);
        c.C(parcel, 17, this.zzp, false);
        c.b(parcel, iA);
    }

    public final zzahr zza(String str) {
        this.zzb = m.e(str);
        return this;
    }

    public final zzahr zza(boolean z10) {
        this.zzj = false;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.zzg;
        if (str3 != null) {
            jSONObject.put("postBody", str3);
        }
        String str4 = this.zzn;
        if (str4 != null) {
            jSONObject.put("tenantId", str4);
        }
        String str5 = this.zzp;
        if (str5 != null) {
            jSONObject.put("pendingToken", str5);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put("sessionId", this.zzl);
        }
        if (TextUtils.isEmpty(this.zzm)) {
            str = this.zza;
            if (str != null) {
            }
            jSONObject.put("returnIdpCredential", this.zzo);
            return jSONObject.toString();
        }
        str = this.zzm;
        jSONObject.put("requestUri", str);
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public final zzahr zzb(String str) {
        this.zzn = str;
        return this;
    }

    public final zzahr zzb(boolean z10) {
        this.zzo = true;
        return this;
    }

    public final zzahr zzc(boolean z10) {
        this.zzi = true;
        return this;
    }
}
