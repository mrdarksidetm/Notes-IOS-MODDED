package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import le.u0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzax {
    public static final Task zza(u0 u0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        u0Var.invokeOnCompletion(new zzaw(taskCompletionSource, u0Var));
        return taskCompletionSource.getTask();
    }
}
