package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import n8.j;
import v8.n;

/* JADX INFO: loaded from: classes.dex */
final class zbaf extends zbu {
    final /* synthetic */ TaskCompletionSource zba;

    zbaf(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbv
    public final void zbb(Status status, j jVar) {
        n.b(status, jVar, this.zba);
    }
}
