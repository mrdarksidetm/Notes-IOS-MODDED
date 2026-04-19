package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.b;
import md.t;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
final class zzcs extends b {
    Object zza;
    Object zzb;
    double zzc;
    /* synthetic */ Object zzd;
    final /* synthetic */ zzcx zze;
    int zzf;
    zzcx zzg;
    zzdf zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcs(zzcx zzcxVar, d dVar) {
        super(dVar);
        this.zze = zzcxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zzd = obj;
        this.zzf |= Integer.MIN_VALUE;
        Object objZzg = this.zze.zzg(null, 0L, this);
        return objZzg == rd.d.e() ? objZzg : t.a(objZzg);
    }
}
