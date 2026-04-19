package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.b;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
final class zzcp extends b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcx zzb;
    int zzc;
    zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcp(zzcx zzcxVar, d dVar) {
        super(dVar);
        this.zzb = zzcxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzf(0L, null, null, this);
    }
}
