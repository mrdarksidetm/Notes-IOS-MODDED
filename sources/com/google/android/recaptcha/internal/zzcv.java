package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import le.a3;
import le.c3;
import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzcv extends j implements p {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzdc zzc;
    final /* synthetic */ zzcx zzd;
    final /* synthetic */ RecaptchaAction zze;
    final /* synthetic */ zzpw zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcv(long j10, zzdc zzdcVar, zzcx zzcxVar, RecaptchaAction recaptchaAction, zzpw zzpwVar, d dVar) {
        super(2, dVar);
        this.zzb = j10;
        this.zzc = zzdcVar;
        this.zzd = zzcxVar;
        this.zze = recaptchaAction;
        this.zzf = zzpwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzcv(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcv) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = rd.d.e();
        try {
            if (this.zza != 0) {
                u.b(obj);
            } else {
                u.b(obj);
                long j10 = this.zzb;
                zzcu zzcuVar = new zzcu(this.zzc, this.zzd, this.zze, this.zzf, null);
                this.zza = 1;
                obj = c3.c(j10, zzcuVar, this);
                if (obj == objE) {
                    return objE;
                }
            }
            return (zzqf) obj;
        } catch (zzbj e10) {
            throw e10;
        } catch (a3 unused) {
            throw new zzbj(zzbh.zzc, zzbg.zzb, null);
        } catch (Exception unused2) {
            throw new zzbj(zzbh.zzb, zzbg.zza, null);
        }
    }
}
