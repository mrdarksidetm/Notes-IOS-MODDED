package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.b;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
final class zzam extends b {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzap zzc;
    int zzd;
    zzap zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzam(zzap zzapVar, d dVar) {
        super(dVar);
        this.zzc = zzapVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zze(this);
    }
}
