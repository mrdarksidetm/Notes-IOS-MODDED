package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.b;
import md.t;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
final class zzgu extends b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgv zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgu(zzgv zzgvVar, d dVar) {
        super(dVar);
        this.zzb = zzgvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == rd.d.e() ? objZzh : t.a(objZzh);
    }
}
