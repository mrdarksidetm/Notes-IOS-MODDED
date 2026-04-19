package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.b;
import k8.f;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
final class zzae extends b {
    final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzae(zzal zzalVar, a aVar, e eVar, String str) {
        super((a<?>) aVar, eVar);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ h createFailedResult(Status status) {
        return new zzai(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((f) ((zzam) bVar).getService()).D(new zzad(this), this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.b, v8.c
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((h) obj);
    }
}
