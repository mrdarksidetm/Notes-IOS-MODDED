package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.b;
import md.t;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
final class zzv extends b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzx zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzv(zzx zzxVar, d dVar) {
        super(dVar);
        this.zzb = zzxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == rd.d.e() ? objZzh : t.a(objZzh);
    }
}
