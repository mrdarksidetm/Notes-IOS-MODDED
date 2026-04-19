package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.location.LocationRequest;
import n9.i;

/* JADX INFO: loaded from: classes.dex */
final class zzt extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ i zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzt(zzz zzzVar, e eVar, LocationRequest locationRequest, i iVar, Looper looper) {
        super(eVar);
        this.zza = locationRequest;
        this.zzb = iVar;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzB(zzba.zza(null, this.zza), f.a(this.zzb, zzbj.zza(this.zzc), i.class.getSimpleName()), new zzy(this));
    }
}
