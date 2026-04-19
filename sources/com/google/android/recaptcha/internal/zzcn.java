package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.b;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
final class zzcn extends b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzco zzb;
    int zzc;
    zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcn(zzco zzcoVar, d dVar) {
        super(dVar);
        this.zzb = zzcoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzi(null, null, null, this);
    }
}
