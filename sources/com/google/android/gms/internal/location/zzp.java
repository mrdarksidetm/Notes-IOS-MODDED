package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;

/* JADX INFO: loaded from: classes.dex */
final class zzp extends zzx {
    final /* synthetic */ Location zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzp(zzz zzzVar, e eVar, Location location) {
        super(eVar);
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzJ(this.zza);
        setResult(Status.f8385f);
    }
}
