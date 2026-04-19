package com.google.android.recaptcha.internal;

import le.n0;
import md.i0;
import md.t;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzw extends j implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzpq zzd;
    final /* synthetic */ zzx zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzw(zzpq zzpqVar, zzx zzxVar, d dVar) {
        super(2, dVar);
        this.zzd = zzpqVar;
        this.zze = zzxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzw(this.zzd, this.zze, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzw) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        Object obj2;
        ?? it;
        Object objE = rd.d.e();
        if (this.zzc != 0) {
            Object obj3 = this.zzb;
            Object obj4 = this.zza;
            u.b(obj);
            it = obj3;
            obj2 = obj4;
        } else {
            u.b(obj);
            if (!this.zzd.zzO()) {
                t.a aVar = t.f15576b;
                objA = u.a(new zzbj(zzbh.zzb, zzbg.zzac, null));
                return t.a(t.b(objA));
            }
            zzpq zzpqVar = this.zzd;
            zzx zzxVar = this.zze;
            zzps zzpsVarZzj = zzpqVar.zzj();
            zzxVar.zzc = zzpsVarZzj.zzi();
            it = this.zze.zzb.iterator();
            obj2 = zzpsVarZzj;
        }
        while (it.hasNext()) {
            zzaa zzaaVar = (zzaa) it.next();
            this.zza = obj2;
            this.zzb = it;
            this.zzc = 1;
            if (zzaaVar.zzd((zzps) obj2, this) == objE) {
                return objE;
            }
        }
        t.a aVar2 = t.f15576b;
        objA = i0.f15558a;
        return t.a(t.b(objA));
    }
}
