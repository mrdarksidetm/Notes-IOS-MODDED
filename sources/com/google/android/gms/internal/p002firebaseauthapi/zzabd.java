package com.google.android.gms.internal.p002firebaseauthapi;

import ba.c1;
import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzabd implements zzael<zzagl> {
    private final /* synthetic */ c1 zza;
    private final /* synthetic */ zzade zzb;
    private final /* synthetic */ zzzk zzc;

    zzabd(zzzk zzzkVar, c1 c1Var, zzade zzadeVar) {
        this.zza = c1Var;
        this.zzb = zzadeVar;
        this.zzc = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        zzagl zzaglVar2 = zzaglVar;
        zzahb zzahbVar = new zzahb();
        zzahbVar.zzd(zzaglVar2.zzc());
        if (this.zza.x() || this.zza.k() != null) {
            zzahbVar.zzb(this.zza.k());
        }
        if (this.zza.z() || this.zza.u() != null) {
            zzahbVar.zzg(this.zza.zza());
        }
        zzzk.zza(this.zzc, this.zzb, zzaglVar2, zzahbVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(t.a(str));
    }
}
