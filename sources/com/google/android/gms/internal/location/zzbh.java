package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import n9.l;
import n9.m;
import n9.y;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
final class zzbh extends y<m> {
    final /* synthetic */ l zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbh(zzbi zzbiVar, e eVar, l lVar, String str) {
        super(eVar);
        this.zza = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ h createFailedResult(Status status) {
        return new m(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzL(this.zza, this, null);
    }
}
