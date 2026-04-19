package ca;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzage;
import com.google.android.gms.internal.p002firebaseauthapi.zzagr;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e2 extends x8.a implements ba.b1 {
    public static final Parcelable.Creator<e2> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f6654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uri f6655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f6656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f6657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f6659i;

    public e2(zzage zzageVar, String str) {
        w8.m.k(zzageVar);
        w8.m.e(str);
        this.f6651a = w8.m.e(zzageVar.zzi());
        this.f6652b = str;
        this.f6656f = zzageVar.zzh();
        this.f6653c = zzageVar.zzg();
        Uri uriZzc = zzageVar.zzc();
        if (uriZzc != null) {
            this.f6654d = uriZzc.toString();
            this.f6655e = uriZzc;
        }
        this.f6658h = zzageVar.zzm();
        this.f6659i = null;
        this.f6657g = zzageVar.zzj();
    }

    public e2(zzagr zzagrVar) {
        w8.m.k(zzagrVar);
        this.f6651a = zzagrVar.zzd();
        this.f6652b = w8.m.e(zzagrVar.zzf());
        this.f6653c = zzagrVar.zzb();
        Uri uriZza = zzagrVar.zza();
        if (uriZza != null) {
            this.f6654d = uriZza.toString();
            this.f6655e = uriZza;
        }
        this.f6656f = zzagrVar.zzc();
        this.f6657g = zzagrVar.zze();
        this.f6658h = false;
        this.f6659i = zzagrVar.zzg();
    }

    public e2(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f6651a = str;
        this.f6652b = str2;
        this.f6656f = str3;
        this.f6657g = str4;
        this.f6653c = str5;
        this.f6654d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f6655e = Uri.parse(this.f6654d);
        }
        this.f6658h = z10;
        this.f6659i = str7;
    }

    public static e2 u(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new e2(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzzh(e10);
        }
    }

    @Override // ba.b1
    public final Uri b() {
        if (!TextUtils.isEmpty(this.f6654d) && this.f6655e == null) {
            this.f6655e = Uri.parse(this.f6654d);
        }
        return this.f6655e;
    }

    @Override // ba.b1
    public final String c() {
        return this.f6652b;
    }

    @Override // ba.b1
    public final String d() {
        return this.f6651a;
    }

    @Override // ba.b1
    public final boolean e() {
        return this.f6658h;
    }

    @Override // ba.b1
    public final String g() {
        return this.f6657g;
    }

    @Override // ba.b1
    public final String k() {
        return this.f6653c;
    }

    @Override // ba.b1
    public final String t() {
        return this.f6656f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, d(), false);
        x8.c.C(parcel, 2, c(), false);
        x8.c.C(parcel, 3, k(), false);
        x8.c.C(parcel, 4, this.f6654d, false);
        x8.c.C(parcel, 5, t(), false);
        x8.c.C(parcel, 6, g(), false);
        x8.c.g(parcel, 7, e());
        x8.c.C(parcel, 8, this.f6659i, false);
        x8.c.b(parcel, iA);
    }

    public final String x() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f6651a);
            jSONObject.putOpt("providerId", this.f6652b);
            jSONObject.putOpt("displayName", this.f6653c);
            jSONObject.putOpt("photoUrl", this.f6654d);
            jSONObject.putOpt("email", this.f6656f);
            jSONObject.putOpt("phoneNumber", this.f6657g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f6658h));
            jSONObject.putOpt("rawUserInfo", this.f6659i);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzzh(e10);
        }
    }

    public final String zza() {
        return this.f6659i;
    }
}
