package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import androidx.core.content.a;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzce extends j implements p {
    int zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Application zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzbv zzf;
    final /* synthetic */ zzbo zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzce(String str, Application application, long j10, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, d dVar) {
        super(2, dVar);
        this.zzc = str;
        this.zzd = application;
        this.zze = j10;
        this.zzf = zzbvVar;
        this.zzg = zzboVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        zzce zzceVar = new zzce(this.zzc, this.zzd, this.zze, this.zzf, null, null, this.zzg, dVar);
        zzceVar.zzb = obj;
        return zzceVar;
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzce) create((zzdc) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = rd.d.e();
        int i10 = this.zza;
        u.b(obj);
        if (i10 == 0) {
            zzdc zzdcVar = (zzdc) this.zzb;
            String str = this.zzc;
            zzco zzcoVar = zzco.zza;
            zzcx zzcxVarZza = zzco.zza(zzcoVar, str);
            if (zzcxVarZza != null) {
                return zzcxVarZza;
            }
            Application application = this.zzd;
            if (this.zze < 5000) {
                throw new zzbj(zzbh.zzj, zzbg.zzI, null);
            }
            if (a.checkSelfPermission(application, "android.permission.INTERNET") != 0) {
                throw new zzbj(zzbh.zzc, zzbg.zzap, null);
            }
            Application application2 = this.zzd;
            String str2 = this.zzc;
            long j10 = this.zze;
            zzbv zzbvVar = this.zzf;
            zzbo zzboVar = this.zzg;
            this.zza = 1;
            obj = zzcoVar.zzm(application2, str2, j10, zzbvVar, null, null, zzboVar, zzdcVar, this);
            if (obj == objE) {
                return objE;
            }
        }
        return obj;
    }
}
