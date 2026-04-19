package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.location.LocationRequest;
import n9.j;

/* JADX INFO: loaded from: classes.dex */
final class zzr extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ j zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzr(zzz zzzVar, e eVar, LocationRequest locationRequest, j jVar) {
        super(eVar);
        this.zza = locationRequest;
        this.zzb = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzC(this.zza, f.a(this.zzb, zzbj.zzb(), j.class.getSimpleName()), new zzy(this));
    }
}
