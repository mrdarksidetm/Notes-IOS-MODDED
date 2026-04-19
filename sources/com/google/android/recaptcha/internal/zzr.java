package com.google.android.recaptcha.internal;

import le.n0;
import md.i0;
import md.q;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzr extends j implements p {
    int zza;
    final /* synthetic */ zzaa zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzr(zzaa zzaaVar, String str, zzx zzxVar, d dVar) {
        super(2, dVar);
        this.zzb = zzaaVar;
        this.zzc = str;
        this.zzd = zzxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzr(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = rd.d.e();
        int i10 = this.zza;
        u.b(obj);
        if (i10 == 0) {
            zzaa zzaaVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzaaVar.zzc(str, this);
            if (obj == objE) {
                return objE;
            }
        }
        zzac zzacVar = (zzac) obj;
        zzqj zzqjVarZzf = zzql.zzf();
        zzqjVarZzf.zzp(3);
        if (zzacVar instanceof zzz) {
            zzqjVarZzf.zze(zzx.zzp(this.zzd, ((zzz) zzacVar).zza()));
        } else {
            if (!(zzacVar instanceof zzy)) {
                throw new q();
            }
            zzqjVarZzf.zzd(zzx.zzo(this.zzd, ((zzy) zzacVar).zza()));
        }
        return zzqjVarZzf;
    }
}
