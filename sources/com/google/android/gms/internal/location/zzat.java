package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.e;
import n9.j;

/* JADX INFO: loaded from: classes.dex */
final class zzat implements e.b<j> {
    final /* synthetic */ Location zza;

    zzat(zzau zzauVar, Location location) {
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.e.b
    public final /* bridge */ /* synthetic */ void notifyListener(j jVar) {
        jVar.onLocationChanged(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.e.b
    public final void onNotifyListenerFailed() {
    }
}
