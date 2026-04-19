package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbq {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i10, long j10) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer numValueOf = Integer.valueOf(i10);
        Object zzbpVar = concurrentHashMap.get(numValueOf);
        if (zzbpVar == null) {
            zzbpVar = new zzbp();
        }
        zzbp zzbpVar2 = (zzbp) zzbpVar;
        zzbpVar2.zzg(zzbpVar2.zzb() + 1);
        zzbpVar2.zzf(zzbpVar2.zzd() + j10);
        zzbpVar2.zze(Math.max(j10, zzbpVar2.zzc()));
        concurrentHashMap.put(numValueOf, zzbpVar2);
    }
}
