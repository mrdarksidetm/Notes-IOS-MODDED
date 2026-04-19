package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import le.f;
import le.k;
import le.n0;
import le.u0;
import md.i0;
import md.t;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzk extends j implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzpq zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzk(zzl zzlVar, long j10, zzpq zzpqVar, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = j10;
        this.zzd = zzpqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, dVar);
        zzkVar.zze = obj;
        return zzkVar;
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        zzdf zzdfVar;
        Object objA2;
        Object objE = rd.d.e();
        if (this.zza != 0) {
            zzdfVar = (zzdf) this.zze;
            u.b(obj);
            objA = obj;
        } else {
            u.b(obj);
            n0 n0Var = (n0) this.zze;
            zzl zzlVar = this.zzb;
            zzdc zzdcVarZza = zzlVar.zza();
            zzdcVarZza.zzc(zzlVar.zza().zzd());
            zzdf zzdfVarZzf = zzdcVarZza.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(k.b(n0Var, null, null, new zzj((zze) it.next(), this.zzc, this.zzd, null), 3, null));
            }
            u0[] u0VarArr = (u0[]) arrayList.toArray(new u0[0]);
            u0[] u0VarArr2 = (u0[]) Arrays.copyOf(u0VarArr, u0VarArr.length);
            this.zze = zzdfVarZzf;
            this.zza = 1;
            objA = f.a(u0VarArr2, this);
            if (objA == objE) {
                return objE;
            }
            zzdfVar = zzdfVarZzf;
        }
        List list = (List) objA;
        if ((list instanceof Collection) && list.isEmpty()) {
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzY, null);
            zzdfVar.zzb(zzbjVar);
            t.a aVar = t.f15576b;
            objA2 = u.a(zzbjVar);
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!t.g(((t) it2.next()).j())) {
                    zzdfVar.zza();
                    objA2 = i0.f15558a;
                    break;
                }
            }
            zzbj zzbjVar2 = new zzbj(zzbh.zzb, zzbg.zzY, null);
            zzdfVar.zzb(zzbjVar2);
            t.a aVar2 = t.f15576b;
            objA2 = u.a(zzbjVar2);
        }
        return t.a(t.b(objA2));
    }
}
