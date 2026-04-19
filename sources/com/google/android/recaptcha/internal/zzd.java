package com.google.android.recaptcha.internal;

import le.n0;
import md.i0;
import md.t;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzd extends j implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzpq zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(zze zzeVar, zzpq zzpqVar, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = zzpqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzd(this.zzb, this.zzc, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZzh;
        Object objE = rd.d.e();
        int i10 = this.zza;
        u.b(obj);
        if (i10 != 0) {
            objZzh = ((t) obj).j();
        } else {
            zze zzeVar = this.zzb;
            zzpq zzpqVar = this.zzc;
            this.zza = 1;
            objZzh = zzeVar.zzh(zzpqVar, this);
            if (objZzh == objE) {
                return objE;
            }
        }
        return t.a(objZzh);
    }
}
