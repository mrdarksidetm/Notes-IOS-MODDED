package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzaau implements zzael<zzagb> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzade zzb;
    private final /* synthetic */ zzagl zzc;

    zzaau(zzaav zzaavVar, zzael zzaelVar, zzade zzadeVar, zzagl zzaglVar) {
        this.zza = zzaelVar;
        this.zzb = zzadeVar;
        this.zzc = zzaglVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagb zzagbVar) {
        List<zzage> listZza = zzagbVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users");
        } else {
            this.zzb.zza(this.zzc, listZza.get(0));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
