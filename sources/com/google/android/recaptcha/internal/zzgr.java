package com.google.android.recaptcha.internal;

import le.k;
import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzgr extends j implements p {
    final /* synthetic */ zzgv zza;
    final /* synthetic */ zzpq zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgr(zzgv zzgvVar, zzpq zzpqVar, d dVar) {
        super(2, dVar);
        this.zza = zzgvVar;
        this.zzb = zzpqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzgr(this.zza, this.zzb, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgr) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Exception {
        rd.d.e();
        u.b(obj);
        try {
            zzgv zzgvVar = this.zza;
            k.d(this.zza.zzn.zzb(), null, null, new zzgq(this.zza, zzgvVar.zzp().zzb(this.zzb, zzgvVar.zzl), null), 3, null);
        } catch (zzbj e10) {
            this.zza.zzu().a(e10);
        }
        return i0.f15558a;
    }
}
