package com.google.android.gms.internal.p002firebaseauthapi;

import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzaao implements zzael<zzafs> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzaap zzb;

    zzaao(zzaap zzaapVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzaapVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzafs zzafsVar) {
        zzafs zzafsVar2 = zzafsVar;
        this.zzb.zza.zza(new zzagl(zzafsVar2.zzb(), zzafsVar2.zza(), Long.valueOf(zzagn.zza(zzafsVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(t.a(str));
    }
}
