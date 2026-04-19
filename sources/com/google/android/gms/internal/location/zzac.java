package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import n9.h;

/* JADX INFO: loaded from: classes.dex */
final class zzac extends zzae {
    final /* synthetic */ h zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(zzaf zzafVar, e eVar, h hVar, PendingIntent pendingIntent) {
        super(eVar);
        this.zza = hVar;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzv(this.zza, this.zzb, this);
    }
}
