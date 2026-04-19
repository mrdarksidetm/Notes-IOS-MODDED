package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v8.b f8515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f8516b = new TaskCompletionSource();

    public p(v8.b bVar) {
        this.f8515a = bVar;
    }

    public final v8.b a() {
        return this.f8515a;
    }

    public final TaskCompletionSource b() {
        return this.f8516b;
    }
}
