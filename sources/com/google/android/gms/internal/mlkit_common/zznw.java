package com.google.android.gms.internal.mlkit_common;

import w8.k;

/* JADX INFO: loaded from: classes.dex */
public final class zznw {
    private final zzns zza;
    private final zznu zzb = null;
    private final zznu zzc = null;
    private final Boolean zzd = null;

    /* synthetic */ zznw(zznt zzntVar, zznv zznvVar) {
        this.zza = zzntVar.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zznw) && k.b(this.zza, ((zznw) obj).zza) && k.b(null, null) && k.b(null, null) && k.b(null, null);
    }

    public final int hashCode() {
        return k.c(this.zza, null, null, null);
    }

    public final zzns zza() {
        return this.zza;
    }
}
