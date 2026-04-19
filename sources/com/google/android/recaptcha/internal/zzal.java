package com.google.android.recaptcha.internal;

import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzal extends j implements p {
    int zza;
    final /* synthetic */ zzap zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzal(zzap zzapVar, d dVar) {
        super(2, dVar);
        this.zzb = zzapVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzal(this.zzb, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = rd.d.e();
        int i10 = this.zza;
        u.b(obj);
        if (i10 == 0) {
            this.zzb.zze = zzat.zza;
            zzap zzapVar = this.zzb;
            this.zza = 1;
            if (zzapVar.zze(this) == objE) {
                return objE;
            }
        }
        return i0.f15558a;
    }
}
