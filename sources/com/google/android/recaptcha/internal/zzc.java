package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.b;
import md.t;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
final class zzc extends b {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzdf zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(zze zzeVar, d dVar) {
        super(dVar);
        this.zzc = zzeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object objZze = this.zzc.zze(0L, null, this);
        return objZze == rd.d.e() ? objZze : t.a(objZze);
    }
}
