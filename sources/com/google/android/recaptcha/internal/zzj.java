package com.google.android.recaptcha.internal;

import le.n0;
import md.i0;
import md.t;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzj extends j implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzpq zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzj(zze zzeVar, long j10, zzpq zzpqVar, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = j10;
        this.zzd = zzpqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzj(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZze;
        Object objE = rd.d.e();
        int i10 = this.zza;
        u.b(obj);
        if (i10 != 0) {
            objZze = ((t) obj).j();
        } else {
            zze zzeVar = this.zzb;
            long j10 = this.zzc;
            zzpq zzpqVar = this.zzd;
            this.zza = 1;
            objZze = zzeVar.zze(j10, zzpqVar, this);
            if (objZze == objE) {
                return objE;
            }
        }
        return t.a(objZze);
    }
}
