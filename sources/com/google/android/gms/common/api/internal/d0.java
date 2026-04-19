package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class d0 extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ h.a f8457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(h.a aVar, e eVar, t8.d[] dVarArr, boolean z10, int i10) {
        super(eVar, dVarArr, z10, i10);
        this.f8457e = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.g
    protected final void d(a.b bVar, TaskCompletionSource<Void> taskCompletionSource) {
        this.f8457e.f8473a.accept(bVar, taskCompletionSource);
    }
}
