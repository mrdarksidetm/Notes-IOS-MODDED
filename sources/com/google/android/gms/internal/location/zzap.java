package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.location.LocationResult;
import n9.i;

/* JADX INFO: loaded from: classes.dex */
final class zzap implements e.b<i> {
    final /* synthetic */ LocationResult zza;

    zzap(zzar zzarVar, LocationResult locationResult) {
        this.zza = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.e.b
    public final /* bridge */ /* synthetic */ void notifyListener(i iVar) {
        iVar.b(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.e.b
    public final void onNotifyListenerFailed() {
    }
}
