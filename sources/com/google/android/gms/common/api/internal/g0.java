package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class g0 extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j.a f8469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g0(j.a aVar, t8.d[] dVarArr, boolean z10, int i10) {
        super(dVarArr, z10, i10);
        this.f8469d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.j
    protected final void b(a.b bVar, TaskCompletionSource taskCompletionSource) {
        this.f8469d.f8487a.accept(bVar, taskCompletionSource);
    }
}
