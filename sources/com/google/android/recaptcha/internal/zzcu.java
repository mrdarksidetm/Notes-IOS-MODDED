package com.google.android.recaptcha.internal;

import ae.r;
import com.google.android.recaptcha.RecaptchaAction;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzcu extends j implements p {
    final /* synthetic */ zzdc zza;
    final /* synthetic */ zzcx zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ zzpw zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcu(zzdc zzdcVar, zzcx zzcxVar, RecaptchaAction recaptchaAction, zzpw zzpwVar, d dVar) {
        super(2, dVar);
        this.zza = zzdcVar;
        this.zzb = zzcxVar;
        this.zzc = recaptchaAction;
        this.zzd = zzpwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzcu(this.zza, this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcu) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        rd.d.e();
        u.b(obj);
        zzdf zzdfVarZzf = this.zza.zzf(28);
        zzqc zzqcVarZzf = zzqd.zzf();
        zzcx zzcxVar = this.zzb;
        zzqcVarZzf.zzu(zzcxVar.zze());
        zzqcVarZzf.zzd(this.zzc.getAction());
        zzqcVarZzf.zzp(zzcxVar.zzf.zzL());
        zzqcVarZzf.zzq(zzcxVar.zzf.zzK());
        zzpw zzpwVar = this.zzd;
        zzqcVarZzf.zzs(zzpwVar.zzJ());
        zzqcVarZzf.zze(zzpwVar.zzj());
        zzqcVarZzf.zzr(zzpwVar.zzK());
        zzqcVarZzf.zzt(zzpwVar);
        zzqd zzqdVar = (zzqd) zzqcVarZzf.zzj();
        try {
            zzbv zzbvVar = this.zzb.zze;
            try {
                int i10 = zzdt.zza;
                if (!zzdt.zzb(zzbvVar.zzd())) {
                    throw new zzbj(zzbh.zzc, zzbg.zzQ, null);
                }
                URLConnection uRLConnectionOpenConnection = new URL(zzbvVar.zzd()).openConnection();
                r.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
                httpURLConnection.connect();
                httpURLConnection.getOutputStream().write(zzqdVar.zzd());
                if (httpURLConnection.getResponseCode() != 200) {
                    throw zzdr.zzb(httpURLConnection.getResponseCode());
                }
                try {
                    zzqf zzqfVarZzi = zzqf.zzi(httpURLConnection.getInputStream());
                    zzdfVarZzf.zza();
                    return zzqfVarZzi;
                } catch (Exception unused) {
                    throw new zzbj(zzbh.zzb, zzbg.zzG, null);
                }
            } catch (Exception e10) {
                if (e10 instanceof zzbj) {
                    throw ((zzbj) e10);
                }
                throw new zzbj(zzbh.zzc, zzbg.zzF, null);
            }
        } catch (Exception e11) {
            zzbj zzbjVar = e11 instanceof zzbj ? (zzbj) e11 : new zzbj(zzbh.zzb, zzbg.zzZ, null);
            zzdfVarZzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }
}
