package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.f;
import n9.j;

/* JADX INFO: loaded from: classes.dex */
final class zzv extends zzx {
    final /* synthetic */ j zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzv(zzz zzzVar, e eVar, j jVar) {
        super(eVar);
        this.zza = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzF(f.c(this.zza, j.class.getSimpleName()), new zzy(this));
    }
}
