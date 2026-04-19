package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import n8.c;
import v8.n;

/* JADX INFO: loaded from: classes.dex */
final class zbam extends zbl {
    final /* synthetic */ TaskCompletionSource zba;

    zbam(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    public final void zbb(Status status, c cVar) {
        n.b(status, cVar, this.zba);
    }
}
