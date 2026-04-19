package com.google.android.gms.internal.p002firebaseauthapi;

import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzaal implements zzael<zzagl> {
    final /* synthetic */ zzzk zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzade zzd;

    zzaal(zzzk zzzkVar, String str, String str2, zzade zzadeVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzadeVar;
        this.zza = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        this.zza.zza.zza(new zzaic(zzaglVar.zzc(), this.zzb, this.zzc), new zzaak(this, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzd.zza(t.a(str));
    }
}
