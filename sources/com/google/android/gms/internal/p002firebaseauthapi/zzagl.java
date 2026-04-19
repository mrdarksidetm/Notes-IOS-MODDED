package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import e9.f;
import e9.o;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public class zzagl extends a implements zzadt<zzagl> {
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;
    private static final String zza = zzagl.class.getSimpleName();
    public static final Parcelable.Creator<zzagl> CREATOR = new zzago();

    public zzagl() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    public zzagl(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    zzagl(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }

    public static zzagl zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzagl zzaglVar = new zzagl();
            zzaglVar.zzb = jSONObject.optString("refresh_token", null);
            zzaglVar.zzc = jSONObject.optString("access_token", null);
            zzaglVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzaglVar.zze = jSONObject.optString("token_type", null);
            zzaglVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzaglVar;
        } catch (JSONException e10) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzzh(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzagl zza(String str) throws zzabg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = o.a(jSONObject.optString("refresh_token"));
            this.zzc = o.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = o.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzaid.zza(e10, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.C(parcel, 2, this.zzb, false);
        c.C(parcel, 3, this.zzc, false);
        c.x(parcel, 4, Long.valueOf(zza()), false);
        c.C(parcel, 5, this.zze, false);
        c.x(parcel, 6, Long.valueOf(this.zzf.longValue()), false);
        c.b(parcel, iA);
    }

    public final long zza() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final void zzc(String str) {
        this.zzb = m.e(str);
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzzh(e10);
        }
    }

    public final boolean zzg() {
        return f.b().a() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }
}
