package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
class bi extends com.google.android.play.integrity.internal.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f8794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f8795b;

    bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.f8795b = bnVar;
        this.f8794a = taskCompletionSource;
    }

    @Override // q9.s
    public final void b(Bundle bundle) {
        this.f8795b.f8803a.v(this.f8794a);
    }

    @Override // q9.s
    public void c(Bundle bundle) {
        this.f8795b.f8803a.v(this.f8794a);
    }

    @Override // q9.s
    public final void d(Bundle bundle) {
        this.f8795b.f8803a.v(this.f8794a);
    }

    @Override // q9.s
    public void e(Bundle bundle) {
        this.f8795b.f8803a.v(this.f8794a);
    }
}
