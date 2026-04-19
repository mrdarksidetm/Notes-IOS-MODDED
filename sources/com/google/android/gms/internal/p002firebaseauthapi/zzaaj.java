package com.google.android.gms.internal.p002firebaseauthapi;

import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzaaj implements zzael<zzagl> {
    final /* synthetic */ zzzk zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzade zzc;

    zzaaj(zzzk zzzkVar, String str, zzade zzadeVar) {
        this.zzb = str;
        this.zzc = zzadeVar;
        this.zza = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        zzagl zzaglVar2 = zzaglVar;
        this.zza.zza.zza(new zzagc(zzaglVar2.zzc()), new zzaai(this, this, zzaglVar2, this.zzb, this.zzc));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzc.zza(t.a(str));
    }
}
