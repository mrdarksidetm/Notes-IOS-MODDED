package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class m implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f8504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f8505b;

    m(n nVar, TaskCompletionSource taskCompletionSource) {
        this.f8505b = nVar;
        this.f8504a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f8505b.f8508b.remove(this.f8504a);
    }
}
