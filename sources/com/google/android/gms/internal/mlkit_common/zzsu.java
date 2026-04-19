package com.google.android.gms.internal.mlkit_common;

import wa.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzsu {
    public static zzst zzh() {
        zzsg zzsgVar = new zzsg();
        zzsgVar.zzg("NA");
        zzsgVar.zzf(false);
        zzsgVar.zze(false);
        zzsgVar.zzd(h.UNKNOWN);
        zzsgVar.zzb(zznf.NO_ERROR);
        zzsgVar.zza(zznl.UNKNOWN_STATUS);
        zzsgVar.zzc(0);
        return zzsgVar;
    }

    public abstract int zza();

    public abstract h zzb();

    public abstract zznf zzc();

    public abstract zznl zzd();

    public abstract String zze();

    public abstract boolean zzf();

    public abstract boolean zzg();
}
