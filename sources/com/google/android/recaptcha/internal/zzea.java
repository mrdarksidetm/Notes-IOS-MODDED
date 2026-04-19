package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import le.k;
import le.n0;
import le.o0;
import md.i0;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzea implements zzdv {
    private final n0 zza;
    private final zzem zzb;
    private final zzge zzc;
    private final Map zzd;

    public zzea(n0 n0Var, zzem zzemVar, zzge zzgeVar, Map map) {
        this.zza = n0Var;
        this.zzb = zzemVar;
        this.zzc = zzgeVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzea zzeaVar, zzrs zzrsVar, zzek zzekVar) throws zzby {
        zzgz zzgzVarZzb = zzgz.zzb();
        int iZza = zzekVar.zza();
        zzfe zzfeVar = (zzfe) zzeaVar.zzd.get(Integer.valueOf(zzrsVar.zzf()));
        if (zzfeVar == null) {
            throw new zzby(5, 2, null);
        }
        int iZzg = zzrsVar.zzg();
        zzrr[] zzrrVarArr = (zzrr[]) zzrsVar.zzj().toArray(new zzrr[0]);
        zzfeVar.zza(iZzg, zzekVar, (zzrr[]) Arrays.copyOf(zzrrVarArr, zzrrVarArr.length));
        if (iZza == zzekVar.zza()) {
            zzekVar.zzg(zzekVar.zza() + 1);
        }
        zzgzVarZzb.zzf();
        long jZza = zzgzVarZzb.zza(TimeUnit.MICROSECONDS);
        int i10 = zzbq.zza;
        int iZzk = zzrsVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbq.zza(iZzk - 2, jZza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzek zzekVar, d dVar) {
        Object objE = o0.e(new zzdx(zzekVar, list, this, null), dVar);
        return objE == rd.d.e() ? objE : i0.f15558a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzek zzekVar, d dVar) {
        Object objE = o0.e(new zzdy(exc, zzekVar, this, null), dVar);
        return objE == rd.d.e() ? objE : i0.f15558a;
    }

    @Override // com.google.android.recaptcha.internal.zzdv
    public final void zza(String str) {
        k.d(this.zza, null, null, new zzdz(new zzek(this.zzb), this, str, null), 3, null);
    }
}
