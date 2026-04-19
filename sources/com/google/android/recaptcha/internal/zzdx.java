package com.google.android.recaptcha.internal;

import java.util.List;
import le.n0;
import le.o0;
import md.i0;
import md.u;
import nd.c0;
import qd.d;
import sd.a;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzdx extends j implements p {
    int zza;
    final /* synthetic */ zzek zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzea zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdx(zzek zzekVar, List list, zzea zzeaVar, d dVar) {
        super(2, dVar);
        this.zzb = zzekVar;
        this.zzc = list;
        this.zzd = zzeaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        zzdx zzdxVar = new zzdx(this.zzb, this.zzc, this.zzd, dVar);
        zzdxVar.zze = obj;
        return zzdxVar;
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = rd.d.e();
        int i10 = this.zza;
        u.b(obj);
        if (i10 == 0) {
            n0 n0Var = (n0) this.zze;
            while (true) {
                zzek zzekVar = this.zzb;
                if (zzekVar.zza() < 0) {
                    break;
                }
                if (zzekVar.zza() >= this.zzc.size() || !o0.g(n0Var)) {
                    break;
                }
                zzrs zzrsVar = (zzrs) this.zzc.get(this.zzb.zza());
                try {
                    zzea.zzf(this.zzd, zzrsVar, this.zzb);
                } catch (Exception e10) {
                    zzrsVar.zzk();
                    a.d(zzrsVar.zzg());
                    c0.h0(zzrsVar.zzj(), null, null, null, 0, null, new zzdw(this.zzd), 31, null);
                    zzea zzeaVar = this.zzd;
                    zzek zzekVar2 = this.zzb;
                    this.zza = 1;
                    if (zzeaVar.zzh(e10, zzekVar2, this) == objE) {
                        return objE;
                    }
                }
            }
            return i0.f15558a;
        }
        return i0.f15558a;
    }
}
