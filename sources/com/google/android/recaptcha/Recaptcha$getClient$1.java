package com.google.android.recaptcha;

import kotlin.coroutines.jvm.internal.b;
import md.t;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
final class Recaptcha$getClient$1 extends b {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recaptcha$getClient$1(Recaptcha recaptcha, d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM5getClientBWLJW6A = this.zzb.m5getClientBWLJW6A(null, null, 0L, this);
        return objM5getClientBWLJW6A == rd.d.e() ? objM5getClientBWLJW6A : t.a(objM5getClientBWLJW6A);
    }
}
