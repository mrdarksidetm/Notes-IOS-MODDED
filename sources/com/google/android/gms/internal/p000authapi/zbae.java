package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import n8.h;
import w8.a;

/* JADX INFO: loaded from: classes.dex */
final class zbae extends zbs {
    final /* synthetic */ TaskCompletionSource zba;

    zbae(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbt
    public final void zbb(Status status, h hVar) {
        if (status.B()) {
            this.zba.setResult(hVar);
        } else {
            this.zba.setException(a.a(status));
        }
    }
}
