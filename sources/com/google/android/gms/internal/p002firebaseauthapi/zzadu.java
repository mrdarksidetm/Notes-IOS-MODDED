package com.google.android.gms.internal.p002firebaseauthapi;

import aa.a;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import la.i;
import w8.m;
import x9.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzadu {
    private Context zza;
    private zzaen zzb;
    private String zzc;
    private final f zzd;
    private boolean zze;
    private String zzf;

    public zzadu(Context context, f fVar, String str) {
        this.zze = false;
        this.zza = (Context) m.k(context);
        this.zzd = (f) m.k(fVar);
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    public zzadu(f fVar, String str) {
        this(fVar.l(), fVar, str);
    }

    private static String zza(f fVar) {
        a aVar = FirebaseAuth.getInstance(fVar).v0().get();
        if (aVar == null) {
            return null;
        }
        try {
            z9.a aVar2 = (z9.a) Tasks.await(aVar.a(false));
            if (aVar2.a() != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(aVar2.a()));
            }
            return aVar2.b();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e10.getMessage());
            return null;
        }
    }

    private static String zzb(f fVar) {
        i iVar = FirebaseAuth.getInstance(fVar).y0().get();
        if (iVar != null) {
            try {
                return (String) Tasks.await(iVar.a());
            } catch (InterruptedException | ExecutionException e10) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e10.getMessage());
            }
        }
        return null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zza(URLConnection uRLConnection) {
        StringBuilder sb2;
        String str;
        if (this.zze) {
            String str2 = this.zzc;
            sb2 = new StringBuilder();
            sb2.append(str2);
            str = "/FirebaseUI-Android";
        } else {
            String str3 = this.zzc;
            sb2 = new StringBuilder();
            sb2.append(str3);
            str = "/FirebaseCore-Android";
        }
        sb2.append(str);
        String string = sb2.toString();
        if (this.zzb == null) {
            this.zzb = new zzaen(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzadx.zza());
        uRLConnection.setRequestProperty("X-Client-Version", string);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.q().c());
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String strZza = zza(this.zzd);
        if (!TextUtils.isEmpty(strZza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", strZza);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }
}
