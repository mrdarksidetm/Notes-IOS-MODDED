package com.google.android.gms.internal.p002firebaseauthapi;

import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzaan implements zzael<zzaht> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzzk zzb;

    zzaan(zzzk zzzkVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzaht zzahtVar) {
        zzaht zzahtVar2 = zzahtVar;
        if (zzahtVar2.zzl()) {
            this.zza.zza(new zzzl(zzahtVar2.zzf(), zzahtVar2.zzk(), zzahtVar2.zzb()));
        } else {
            zzzk.zza(this.zzb, zzahtVar2, this.zza, this);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(t.a(str));
    }
}
