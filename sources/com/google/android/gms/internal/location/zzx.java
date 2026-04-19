package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import n9.y;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
abstract class zzx extends y<Status> {
    public zzx(e eVar) {
        super(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ h createFailedResult(Status status) {
        return status;
    }
}
