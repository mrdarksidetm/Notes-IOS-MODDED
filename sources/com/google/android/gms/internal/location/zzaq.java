package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.location.LocationAvailability;
import n9.i;

/* JADX INFO: loaded from: classes.dex */
final class zzaq implements e.b<i> {
    final /* synthetic */ LocationAvailability zza;

    zzaq(zzar zzarVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.e.b
    public final /* bridge */ /* synthetic */ void notifyListener(i iVar) {
        iVar.a(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.e.b
    public final void onNotifyListenerFailed() {
    }
}
