package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzek {
    public zzbt zza;
    private final zzem zzb;
    private int zzd;
    private final zzel zze;
    private final zzed zzg;
    private final zzcb zzh;
    private String zzc = "recaptcha.m.Main.rge";
    private final zzbt zzf = new zzbt();

    public zzek(zzem zzemVar) {
        this.zzb = zzemVar;
        this.zze = zzemVar.zza();
        this.zzg = zzemVar.zzd();
        this.zzh = zzemVar.zzc();
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzbt zzb() {
        return this.zzf;
    }

    public final zzel zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze() {
        this.zzb.zzb();
    }

    public final void zzf(String str) {
        this.zzc = str;
    }

    public final void zzg(int i10) {
        this.zzd = i10;
    }

    public final zzcb zzh() {
        return this.zzh;
    }

    public final zzed zzi() {
        return this.zzg;
    }
}
