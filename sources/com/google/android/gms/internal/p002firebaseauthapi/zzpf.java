package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzpf implements zzpj {
    private final zzzc zza;
    private final zzvu zzb;

    private zzpf(zzvu zzvuVar, zzzc zzzcVar) {
        this.zzb = zzvuVar;
        this.zza = zzzcVar;
    }

    public static zzpf zza(zzvu zzvuVar) {
        return new zzpf(zzvuVar, zzpr.zza(zzvuVar.zzf()));
    }

    public static zzpf zzb(zzvu zzvuVar) {
        return new zzpf(zzvuVar, zzpr.zzb(zzvuVar.zzf()));
    }

    public final zzvu zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
    public final zzzc zzc() {
        return this.zza;
    }
}
