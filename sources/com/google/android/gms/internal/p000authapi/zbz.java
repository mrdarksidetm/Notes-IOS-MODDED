package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import n8.a;

/* JADX INFO: loaded from: classes.dex */
final class zbz extends zbi {
    final /* synthetic */ TaskCompletionSource zba;

    zbz(zbaa zbaaVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbj
    public final void zbb(Status status, a aVar) {
        if (status.B()) {
            this.zba.setResult(aVar);
        } else {
            this.zba.setException(w8.a.a(status));
        }
    }
}
