package com.google.android.recaptcha.internal;

import ae.s;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import le.u0;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class zzaw extends s implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ u0 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaw(TaskCompletionSource taskCompletionSource, u0 u0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = u0Var;
    }

    @Override // zd.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return i0.f15558a;
    }
}
