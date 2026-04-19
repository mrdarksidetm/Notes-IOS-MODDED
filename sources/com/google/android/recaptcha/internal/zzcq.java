package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.b;
import md.t;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
final class zzcq extends b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcx zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcq(zzcx zzcxVar, d dVar) {
        super(dVar);
        this.zzb = zzcxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo6execute0E7RQCE = this.zzb.mo6execute0E7RQCE(null, 0L, this);
        return objMo6execute0E7RQCE == rd.d.e() ? objMo6execute0E7RQCE : t.a(objMo6execute0E7RQCE);
    }
}
