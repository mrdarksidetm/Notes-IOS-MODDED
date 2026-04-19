package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import le.n0;
import md.i0;
import md.u;
import nd.c0;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzdj extends j implements p {
    final /* synthetic */ zzdk zza;
    final /* synthetic */ zzre zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdj(zzdk zzdkVar, zzre zzreVar, d dVar) {
        super(2, dVar);
        this.zza = zzdkVar;
        this.zzb = zzreVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzdj(this.zza, this.zzb, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdj) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        rd.d.e();
        u.b(obj);
        zzre zzreVar = this.zzb;
        zzdk zzdkVar = this.zza;
        synchronized (zzdg.class) {
            if (zzdkVar.zze != null) {
                byte[] bArrZzd = zzreVar.zzd();
                zzdb zzdbVar = new zzdb(zzhz.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                zzda zzdaVar = zzdkVar.zze;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ss", zzdbVar.zzc());
                contentValues.put("ts", Long.valueOf(zzdbVar.zzb()));
                zzdaVar.getWritableDatabase().insert("ce", null, contentValues);
                int iZzb = zzdkVar.zze.zzb() - 500;
                if (iZzb > 0) {
                    zzdkVar.zze.zza(c0.v0(zzdkVar.zze.zzd(), iZzb));
                }
                if (zzdkVar.zze.zzb() >= 20) {
                    zzdkVar.zzg();
                }
            }
        }
        return i0.f15558a;
    }
}
