package com.google.android.gms.internal.p002firebaseauthapi;

import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzaae implements zzael<zzagl> {
    final /* synthetic */ zzzk zza;
    private final /* synthetic */ zzahr zzb;
    private final /* synthetic */ zzade zzc;

    zzaae(zzzk zzzkVar, zzahr zzahrVar, zzade zzadeVar) {
        this.zzb = zzahrVar;
        this.zzc = zzadeVar;
        this.zza = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        this.zzb.zzb(true);
        this.zzb.zza(zzaglVar.zzc());
        this.zza.zza.zza(this.zzb, new zzaah(this, this.zzc, this));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzc.zza(t.a(str));
    }
}
