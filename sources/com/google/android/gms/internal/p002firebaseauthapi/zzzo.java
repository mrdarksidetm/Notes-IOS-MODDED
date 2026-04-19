package com.google.android.gms.internal.p002firebaseauthapi;

import ba.j;
import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzzo implements zzael<zzagl> {
    private final /* synthetic */ j zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzade zzc;
    private final /* synthetic */ zzzk zzd;

    zzzo(zzzk zzzkVar, j jVar, String str, zzade zzadeVar) {
        this.zza = jVar;
        this.zzb = str;
        this.zzc = zzadeVar;
        this.zzd = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        this.zzd.zza(new zzafn(this.zza, zzaglVar.zzc(), this.zzb), this.zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzc.zza(t.a(str));
    }
}
