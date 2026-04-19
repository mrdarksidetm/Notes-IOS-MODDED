package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.location.LocationRequest;
import n9.j;

/* JADX INFO: loaded from: classes.dex */
final class zzs extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ j zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzs(zzz zzzVar, e eVar, LocationRequest locationRequest, j jVar, Looper looper) {
        super(eVar);
        this.zza = locationRequest;
        this.zzb = jVar;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzC(this.zza, f.a(this.zzb, zzbj.zza(this.zzc), j.class.getSimpleName()), new zzy(this));
    }
}
