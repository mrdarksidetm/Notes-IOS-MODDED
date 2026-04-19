package com.google.android.recaptcha.internal;

import android.app.Application;
import le.a3;
import le.c3;
import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzck extends j implements p {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ Application zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzdc zze;
    final /* synthetic */ zzbl zzf;
    final /* synthetic */ zzdq zzg;
    final /* synthetic */ zzbv zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzck(long j10, Application application, String str, zzdc zzdcVar, zzbl zzblVar, zzdq zzdqVar, zzbv zzbvVar, d dVar) {
        super(2, dVar);
        this.zzb = j10;
        this.zzc = application;
        this.zzd = str;
        this.zze = zzdcVar;
        this.zzf = zzblVar;
        this.zzg = zzdqVar;
        this.zzh = zzbvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzck(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzck) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzbj zzbjVar;
        Object objE = rd.d.e();
        try {
            if (this.zza != 0) {
                u.b(obj);
            } else {
                u.b(obj);
                long j10 = this.zzb;
                zzcj zzcjVar = new zzcj(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, null);
                this.zza = 1;
                obj = c3.c(j10, zzcjVar, this);
                if (obj == objE) {
                    return objE;
                }
            }
            return (zzpq) obj;
        } catch (Exception e10) {
            zzco zzcoVar = zzco.zza;
            if (e10 instanceof a3) {
                zzbjVar = new zzbj(zzbh.zzc, zzbg.zzb, e10.getMessage());
            } else {
                if (e10 instanceof zzbj) {
                    throw ((zzbj) e10);
                }
                zzbjVar = new zzbj(zzbh.zzb, zzbg.zza, e10.getMessage());
            }
            throw zzbjVar;
        }
    }
}
