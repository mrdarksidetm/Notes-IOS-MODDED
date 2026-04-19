package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.d;
import n9.i;

/* JADX INFO: loaded from: classes.dex */
final class zzar extends d {
    private final e<i> zza;

    zzar(e<i> eVar) {
        this.zza = eVar;
    }

    public final synchronized void zzc() {
        this.zza.a();
    }

    @Override // n9.v
    public final void zzd(LocationResult locationResult) {
        this.zza.c(new zzap(this, locationResult));
    }

    @Override // n9.v
    public final void zze(LocationAvailability locationAvailability) {
        this.zza.c(new zzaq(this, locationAvailability));
    }
}
