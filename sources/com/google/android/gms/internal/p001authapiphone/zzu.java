package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.tasks.TaskCompletionSource;
import v8.n;
import w8.a;

/* JADX INFO: loaded from: classes.dex */
final class zzu extends d.a {
    final /* synthetic */ TaskCompletionSource zza;

    zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void onResult(Status status) {
        if (status.x() == 6) {
            this.zza.trySetException(a.a(status));
        } else {
            n.a(status, this.zza);
        }
    }
}
