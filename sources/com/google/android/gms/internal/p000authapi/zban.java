package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.tasks.TaskCompletionSource;
import v8.n;

/* JADX INFO: loaded from: classes.dex */
final class zban extends d.a {
    final /* synthetic */ TaskCompletionSource zba;

    zban(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void onResult(Status status) {
        n.a(status, this.zba);
    }
}
