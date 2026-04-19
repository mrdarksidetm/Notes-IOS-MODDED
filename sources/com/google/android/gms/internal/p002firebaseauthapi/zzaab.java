package com.google.android.gms.internal.p002firebaseauthapi;

import ca.t;

/* JADX INFO: loaded from: classes.dex */
final class zzaab implements zzael<zzahz> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzzk zzb;

    zzaab(zzzk zzzkVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzahz zzahzVar) {
        zzahz zzahzVar2 = zzahzVar;
        this.zzb.zza(new zzagl(zzahzVar2.zzd(), zzahzVar2.zzb(), Long.valueOf(zzahzVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzahzVar2.zzf()), null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(t.a(str));
    }
}
