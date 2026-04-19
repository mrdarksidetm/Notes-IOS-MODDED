package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, k8.c
    public final void zzc(boolean z10) {
        this.zza.setResult(new zzak(z10 ? Status.f8385f : zzal.zza));
    }
}
