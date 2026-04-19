package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import n9.u;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
abstract class zzf extends u<Status> {
    public zzf(e eVar) {
        super(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ h createFailedResult(Status status) {
        return status;
    }
}
