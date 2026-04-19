package com.google.android.recaptcha.internal;

import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzt extends j implements p {
    int zza;
    final /* synthetic */ zzx zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzaa zzd;
    final /* synthetic */ zzqm zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzt(zzx zzxVar, String str, zzaa zzaaVar, zzqm zzqmVar, d dVar) {
        super(2, dVar);
        this.zzb = zzxVar;
        this.zzc = str;
        this.zzd = zzaaVar;
        this.zze = zzqmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzt(this.zzb, this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzt) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = rd.d.e();
        int i10 = this.zza;
        u.b(obj);
        if (i10 == 0) {
            zzx zzxVar = this.zzb;
            String str = this.zzc;
            zzaa zzaaVar = this.zzd;
            this.zza = 1;
            obj = zzxVar.zzu(str, zzaaVar, this);
            if (obj == objE) {
                return objE;
            }
        }
        this.zze.zzd((zzqj) obj);
        return i0.f15558a;
    }
}
