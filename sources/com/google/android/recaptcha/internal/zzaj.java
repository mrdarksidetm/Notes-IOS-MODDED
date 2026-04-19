package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.b;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
final class zzaj extends b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzap zzb;
    int zzc;
    String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaj(zzap zzapVar, d dVar) {
        super(dVar);
        this.zzb = zzapVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzj(null, this);
    }
}
