package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzk {
    public static final zzk zza;
    public static final zzk zzb;
    public static final zzk zzc;
    private final boolean zzd;
    private final boolean zze = false;
    private final zzad zzf;

    static {
        zzh zzhVar = null;
        zzi zziVar = new zzi(zzhVar);
        zziVar.zzb();
        zza = zziVar.zzd();
        zzi zziVar2 = new zzi(zzhVar);
        zziVar2.zzb();
        zziVar2.zza(new zzg());
        zzb = zziVar2.zzd();
        zzi zziVar3 = new zzi(zzhVar);
        zziVar3.zzc();
        zzc = zziVar3.zzd();
    }

    /* synthetic */ zzk(boolean z10, boolean z11, zzad zzadVar, zzj zzjVar) {
        this.zzd = z10;
        this.zzf = zzadVar;
    }

    static /* bridge */ /* synthetic */ boolean zza(zzk zzkVar) {
        boolean z10 = zzkVar.zze;
        return false;
    }

    static /* bridge */ /* synthetic */ int zzc(zzk zzkVar, Context context, zzp zzpVar) {
        zzad zzadVar = zzkVar.zzf;
        int size = zzadVar.size();
        int i10 = 0;
        while (i10 < size) {
            int iZza = ((zzq) zzadVar.get(i10)).zza(context, zzpVar, zzkVar.zzd) - 1;
            i10++;
            if (iZza == 1) {
                return 2;
            }
        }
        return 3;
    }
}
