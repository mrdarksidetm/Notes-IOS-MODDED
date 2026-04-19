package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.f;
import n9.i;

/* JADX INFO: loaded from: classes.dex */
final class zzn extends zzx {
    final /* synthetic */ i zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzn(zzz zzzVar, e eVar, i iVar) {
        super(eVar);
        this.zza = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzH(f.c(this.zza, i.class.getSimpleName()), new zzy(this));
    }
}
