package com.google.android.gms.internal.p002firebaseauthapi;

import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzabb implements zzael<zzahf> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzzk zzb;

    zzabb(zzzk zzzkVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzahf zzahfVar) {
        zzahf zzahfVar2 = zzahfVar;
        this.zzb.zza(new zzagl(zzahfVar2.zzc(), zzahfVar2.zzb(), Long.valueOf(zzahfVar2.zza()), "Bearer"), null, null, Boolean.TRUE, null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(t.a(str));
    }
}
