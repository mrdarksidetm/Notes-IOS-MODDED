package com.google.android.recaptcha.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzem {
    private final zzel zza;
    private final HashMap zzb;
    private final zzed zzc;
    private final zzcb zzd;

    public zzem(zzed zzedVar, zzcb zzcbVar, zzbu zzbuVar) {
        this.zzc = zzedVar;
        this.zzd = zzcbVar;
        zzel zzelVar = new zzel();
        this.zza = zzelVar;
        HashMap map = new HashMap();
        this.zzb = map;
        zzelVar.zzd(173, map);
    }

    public final zzel zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza.zzc();
        this.zza.zzd(173, this.zzb);
    }

    public final zzcb zzc() {
        return this.zzd;
    }

    public final zzed zzd() {
        return this.zzc;
    }

    public final void zze(int i10, Object obj) {
        this.zzb.put(Integer.valueOf(i10 - 2), obj);
    }
}
