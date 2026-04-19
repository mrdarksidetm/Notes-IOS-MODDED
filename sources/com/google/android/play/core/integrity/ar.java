package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class ar extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f8757a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(as asVar, Handler handler) {
        super(handler);
        this.f8757a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        TaskCompletionSource taskCompletionSource;
        int i11;
        if (i10 == 1) {
            taskCompletionSource = this.f8757a.f8758a;
            i11 = 3;
        } else if (i10 == 2) {
            taskCompletionSource = this.f8757a.f8758a;
            i11 = 2;
        } else {
            if (i10 != 3) {
                return;
            }
            taskCompletionSource = this.f8757a.f8758a;
            i11 = 1;
        }
        taskCompletionSource.trySetResult(i11);
    }
}
