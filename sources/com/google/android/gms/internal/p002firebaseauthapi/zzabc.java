package com.google.android.gms.internal.p002firebaseauthapi;

import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzabc implements zzael<zzagl> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzade zzb;
    private final /* synthetic */ zzzk zzc;

    zzabc(zzzk zzzkVar, String str, zzade zzadeVar) {
        this.zza = str;
        this.zzb = zzadeVar;
        this.zzc = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        zzagl zzaglVar2 = zzaglVar;
        zzahb zzahbVar = new zzahb();
        zzahbVar.zzd(zzaglVar2.zzc()).zzc(this.zza);
        zzzk.zza(this.zzc, this.zzb, zzaglVar2, zzahbVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(t.a(str));
    }
}
