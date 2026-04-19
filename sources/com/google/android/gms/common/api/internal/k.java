package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class k<A extends a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e.a f8492a;

    protected k(e.a<L> aVar) {
        this.f8492a = aVar;
    }

    public e.a<L> a() {
        return this.f8492a;
    }

    protected abstract void b(A a10, TaskCompletionSource<Boolean> taskCompletionSource);
}
