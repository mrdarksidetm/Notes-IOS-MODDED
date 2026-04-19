package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes.dex */
final class zzu extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzu(zzz zzzVar, e eVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(eVar);
        this.zza = locationRequest;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzE(this.zza, this.zzb, new zzy(this));
    }
}
