package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzac implements zzad {
    private final /* synthetic */ zzn zza;

    zzac(zzn zznVar) {
        this.zza = zznVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzad
    public final /* synthetic */ Iterator zza(zzx zzxVar, CharSequence charSequence) {
        return new zzab(this, zzxVar, charSequence, this.zza.zza(charSequence));
    }
}
