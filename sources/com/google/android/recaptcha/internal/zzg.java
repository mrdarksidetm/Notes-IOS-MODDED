package com.google.android.recaptcha.internal;

import le.n0;
import md.i0;
import md.t;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzg extends j implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzg(zze zzeVar, String str, long j10, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzg(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzg) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZzc;
        Object objE = rd.d.e();
        int i10 = this.zza;
        u.b(obj);
        if (i10 != 0) {
            objZzc = ((t) obj).j();
        } else {
            zze zzeVar = this.zzb;
            String str = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            objZzc = zzeVar.zzc(str, j10, this);
            if (objZzc == objE) {
                return objE;
            }
        }
        return t.a(objZzc);
    }
}
