package com.google.android.gms.internal.p002firebaseauthapi;

import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzzr implements zzael<zzafq> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzzk zzb;

    zzzr(zzzk zzzkVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzafq zzafqVar) {
        zzafq zzafqVar2 = zzafqVar;
        if (zzafqVar2.zzf()) {
            this.zza.zza(new zzzl(zzafqVar2.zzc(), zzafqVar2.zze(), null));
        } else {
            this.zzb.zza(new zzagl(zzafqVar2.zzd(), zzafqVar2.zzb(), Long.valueOf(zzafqVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzafqVar2.zzg()), null, this.zza, this);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(t.a(str));
    }
}
