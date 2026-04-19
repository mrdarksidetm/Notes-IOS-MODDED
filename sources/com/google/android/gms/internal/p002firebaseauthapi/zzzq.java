package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzzq implements zzael<zzagb> {
    private final /* synthetic */ zzaem zza;
    private final /* synthetic */ zzade zzb;
    private final /* synthetic */ zzagl zzc;
    private final /* synthetic */ zzahb zzd;
    private final /* synthetic */ zzzk zze;

    zzzq(zzzk zzzkVar, zzaem zzaemVar, zzade zzadeVar, zzagl zzaglVar, zzahb zzahbVar) {
        this.zza = zzaemVar;
        this.zzb = zzadeVar;
        this.zzc = zzaglVar;
        this.zzd = zzahbVar;
        this.zze = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagb zzagbVar) {
        List<zzage> listZza = zzagbVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users");
        } else {
            zzzk.zza(this.zze, this.zzb, this.zzc, listZza.get(0), this.zzd, this.zza);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
