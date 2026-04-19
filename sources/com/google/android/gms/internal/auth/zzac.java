package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.b;
import k8.f;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
final class zzac extends b {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(zzal zzalVar, a aVar, e eVar, boolean z10) {
        super((a<?>) aVar, eVar);
        this.zza = z10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final h createFailedResult(Status status) {
        return new zzaj(status);
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((f) ((zzam) bVar).getService()).I(this.zza);
        setResult(new zzaj(Status.f8385f));
    }

    @Override // com.google.android.gms.common.api.internal.b, v8.c
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((h) obj);
    }
}
