package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes.dex */
public final class zzno {
    private String zza;
    private zznq zzb;
    private String zzc;
    private zznp zzd;

    public final zzno zza(String str) {
        this.zzc = str;
        return this;
    }

    public final zzno zzb(zznp zznpVar) {
        this.zzd = zznpVar;
        return this;
    }

    public final zzno zzc(String str) {
        this.zza = str;
        return this;
    }

    public final zzno zzd(zznq zznqVar) {
        this.zzb = zznqVar;
        return this;
    }

    public final zzns zzg() {
        return new zzns(this, null);
    }
}
