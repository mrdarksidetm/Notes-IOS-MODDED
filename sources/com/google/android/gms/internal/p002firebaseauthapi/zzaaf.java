package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import ba.o0;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class zzaaf implements zzael<zzahz> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzaac zzc;

    zzaaf(zzaac zzaacVar, zzade zzadeVar, zzael zzaelVar) {
        this.zza = zzadeVar;
        this.zzb = zzaelVar;
        this.zzc = zzaacVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzahz zzahzVar) {
        zzahz zzahzVar2 = zzahzVar;
        if (TextUtils.isEmpty(zzahzVar2.zze())) {
            this.zzc.zza.zza(new zzagl(zzahzVar2.zzd(), zzahzVar2.zzb(), Long.valueOf(zzahzVar2.zza()), "Bearer"), null, "phone", Boolean.valueOf(zzahzVar2.zzf()), null, this.zza, this.zzb);
        } else {
            this.zza.zza(new Status(17025), o0.D(zzahzVar2.zzc(), zzahzVar2.zze()));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(str);
    }
}
