package com.google.android.gms.internal.p002firebaseauthapi;

import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzaac implements zzael<zzagl> {
    final /* synthetic */ zzzk zza;
    private final /* synthetic */ zzaia zzb;
    private final /* synthetic */ zzade zzc;

    zzaac(zzzk zzzkVar, zzaia zzaiaVar, zzade zzadeVar) {
        this.zzb = zzaiaVar;
        this.zzc = zzadeVar;
        this.zza = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        this.zzb.zza(zzaglVar.zzc());
        this.zza.zza.zza(this.zzb, new zzaaf(this, this.zzc, this));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzc.zza(t.a(str));
    }
}
