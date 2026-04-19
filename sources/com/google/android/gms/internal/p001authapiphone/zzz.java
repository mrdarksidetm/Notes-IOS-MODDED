package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v8.n;

/* JADX INFO: loaded from: classes.dex */
final class zzz extends zzi {
    final /* synthetic */ TaskCompletionSource zza;

    zzz(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzj
    public final void zzb(Status status) {
        n.a(status, this.zza);
    }
}
