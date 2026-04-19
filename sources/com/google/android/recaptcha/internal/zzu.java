package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import le.a2;
import le.f;
import le.k;
import le.n0;
import md.i0;
import md.t;
import md.u;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzu extends j implements p {
    int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzx zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzu(String str, zzx zzxVar, d dVar) {
        super(2, dVar);
        this.zzb = str;
        this.zzc = zzxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        zzu zzuVar = new zzu(this.zzb, this.zzc, dVar);
        zzuVar.zzd = obj;
        return zzuVar;
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = rd.d.e();
        int i10 = this.zza;
        u.b(obj);
        if (i10 == 0) {
            n0 n0Var = (n0) this.zzd;
            String str = this.zzb;
            zzqm zzqmVarZzf = zzqn.zzf();
            zzqmVarZzf.zze(str);
            zzx zzxVar = this.zzc;
            zzxVar.zzr().put(this.zzb, zzqmVarZzf);
            ArrayList arrayList = new ArrayList();
            List list = this.zzc.zzb;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzaa) obj2).zzf()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(k.d(n0Var, null, null, new zzt(this.zzc, this.zzb, (zzaa) it.next(), zzqmVarZzf, null), 3, null));
            }
            a2[] a2VarArr = (a2[]) arrayList.toArray(new a2[0]);
            a2[] a2VarArr2 = (a2[]) Arrays.copyOf(a2VarArr, a2VarArr.length);
            this.zza = 1;
            if (f.c(a2VarArr2, this) == objE) {
                return objE;
            }
        }
        t.a aVar = t.f15576b;
        return t.a(t.b(this.zzc.zzt(this.zzb)));
    }
}
