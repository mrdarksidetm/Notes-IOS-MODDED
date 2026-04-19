package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzab extends zzae {
    private final /* synthetic */ zzo zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzab(zzac zzacVar, zzx zzxVar, CharSequence charSequence, zzo zzoVar) {
        super(zzxVar, charSequence);
        this.zzb = zzoVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzae
    public final int zza(int i10) {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzae
    public final int zzb(int i10) {
        if (this.zzb.zza(i10)) {
            return this.zzb.zzb();
        }
        return -1;
    }
}
