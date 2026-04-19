package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import v8.c;

/* JADX INFO: loaded from: classes.dex */
final class zzy extends zzah {
    private final c<Status> zza;

    public zzy(c<Status> cVar) {
        this.zza = cVar;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(zzaa zzaaVar) {
        this.zza.setResult(zzaaVar.getStatus());
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
    }
}
