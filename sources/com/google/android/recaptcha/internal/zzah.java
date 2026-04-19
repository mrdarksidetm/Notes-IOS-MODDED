package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.b;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
final class zzah extends b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzap zzb;
    int zzc;
    zzap zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzah(zzap zzapVar, d dVar) {
        super(dVar);
        this.zzb = zzapVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzc(null, this);
    }
}
