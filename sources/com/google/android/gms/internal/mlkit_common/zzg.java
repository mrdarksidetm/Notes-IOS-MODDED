package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes.dex */
public final class zzg {
    private final zzan zza = new zzan();
    private Boolean zzb;

    private zzg() {
    }

    /* synthetic */ zzg(zzf zzfVar) {
    }

    public final zzg zza(zzs zzsVar) {
        zzae.zzc(this.zzb, "Must call internal() or external() before appending rules.");
        this.zza.zzb(zzsVar);
        return this;
    }

    public final zzg zzb() {
        zzae.zze(this.zzb == null, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.FALSE;
        return this;
    }

    public final zzg zzc() {
        zzae.zze(this.zzb == null, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.TRUE;
        return this;
    }

    public final zzi zzd() {
        zzae.zzc(this.zzb, "Must call internal() or external() when building a SourcePolicy.");
        return new zzi(this.zzb.booleanValue(), false, this.zza.zzc(), null);
    }
}
