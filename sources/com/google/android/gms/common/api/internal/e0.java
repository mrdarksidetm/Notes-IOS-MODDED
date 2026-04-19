package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class e0 extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.a f8463b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e0(h.a aVar, e.a aVar2) {
        super(aVar2);
        this.f8463b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.k
    protected final void b(a.b bVar, TaskCompletionSource<Boolean> taskCompletionSource) {
        this.f8463b.f8474b.accept(bVar, taskCompletionSource);
    }
}
