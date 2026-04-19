package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
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
final class zzh extends j implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(zzl zzlVar, String str, long j10, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, dVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        zzdf zzdfVar;
        Object objE = rd.d.e();
        if (this.zza != 0) {
            zzdfVar = (zzdf) this.zze;
            u.b(obj);
            objA = obj;
        } else {
            u.b(obj);
            n0 n0Var = (n0) this.zze;
            zzl zzlVar = this.zzb;
            String str = this.zzc;
            zzdc zzdcVarZza = zzlVar.zza();
            zzdcVarZza.zzc(str);
            zzdf zzdfVarZzf = zzdcVarZza.zzf(31);
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(k.b(n0Var, null, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3, null));
                }
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
        String str2 = this.zzc;
        zzpv zzpvVarZzf = zzpw.zzf();
        zzpvVarZzf.zzd(str2);
        Iterator it = ((List) objA).iterator();
        while (it.hasNext()) {
            Object objJ = ((t) it.next()).j();
            if (t.h(objJ)) {
                zzpvVarZzf.zzg((zzpw) objJ);
            }
        }
        zzpw zzpwVar = (zzpw) zzpvVarZzf.zzj();
        zzdfVar.zza();
        return zzpwVar;
    }
}
