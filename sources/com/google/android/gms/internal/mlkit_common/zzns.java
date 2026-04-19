package com.google.android.gms.internal.mlkit_common;

import w8.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzns {
    private final String zza;
    private final zznq zzc;
    private final String zze;
    private final zznp zzf;
    private final String zzb = null;
    private final String zzd = null;
    private final Long zzg = null;
    private final Boolean zzh = null;
    private final Boolean zzi = null;

    /* synthetic */ zzns(zzno zznoVar, zznr zznrVar) {
        this.zza = zznoVar.zza;
        this.zzc = zznoVar.zzb;
        this.zze = zznoVar.zzc;
        this.zzf = zznoVar.zzd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzns)) {
            return false;
        }
        zzns zznsVar = (zzns) obj;
        return k.b(this.zza, zznsVar.zza) && k.b(null, null) && k.b(this.zzc, zznsVar.zzc) && k.b(null, null) && k.b(this.zze, zznsVar.zze) && k.b(this.zzf, zznsVar.zzf) && k.b(null, null) && k.b(null, null) && k.b(null, null);
    }

    public final int hashCode() {
        return k.c(this.zza, null, this.zzc, null, this.zze, this.zzf, null, null, null);
    }

    public final zznp zza() {
        return this.zzf;
    }

    public final zznq zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zza;
    }
}
