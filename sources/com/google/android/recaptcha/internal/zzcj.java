package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;
import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzcj extends j implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdc zzd;
    final /* synthetic */ zzbl zze;
    final /* synthetic */ zzdq zzf;
    final /* synthetic */ zzbv zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcj(Application application, String str, zzdc zzdcVar, zzbl zzblVar, zzdq zzdqVar, zzbv zzbvVar, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = zzdcVar;
        this.zze = zzblVar;
        this.zzf = zzdqVar;
        this.zzg = zzbvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzcj(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcj) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = rd.d.e();
        int i10 = this.zza;
        u.b(obj);
        if (i10 == 0) {
            Application application = this.zzb;
            int i11 = zzbz.zza;
            String str = this.zzc;
            zzdc zzdcVar = this.zzd;
            zzbl zzblVar = this.zze;
            int iZza = zzbz.zza(application);
            String packageName = application.getPackageName();
            String strZzd = zzdcVar.zzd();
            int i12 = Build.VERSION.SDK_INT;
            String strZza = zzblVar.zza();
            zzqs zzqsVarZzf = zzqt.zzf();
            zzqsVarZzf.zzs(str);
            zzqsVarZzf.zzp(packageName);
            zzqsVarZzf.zzt(iZza);
            zzqsVarZzf.zzq("18.5.1");
            zzqsVarZzf.zzr(strZzd);
            zzqsVarZzf.zze(String.valueOf(i12));
            zzqsVarZzf.zzd(strZza);
            zzqt zzqtVar = (zzqt) zzqsVarZzf.zzj();
            zzdq zzdqVar = this.zzf;
            zzbv zzbvVar = this.zzg;
            zzdc zzdcVar2 = this.zzd;
            String strZzb = zzbvVar.zzb();
            this.zza = 1;
            obj = zzdqVar.zza(strZzb, zzqtVar, zzdcVar2, this);
            if (obj == objE) {
                return objE;
            }
        }
        return obj;
    }
}
