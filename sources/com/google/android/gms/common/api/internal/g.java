package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class g<A extends a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f8465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t8.d[] f8466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8468d;

    protected g(e<L> eVar, t8.d[] dVarArr, boolean z10, int i10) {
        this.f8465a = eVar;
        this.f8466b = dVarArr;
        this.f8467c = z10;
        this.f8468d = i10;
    }

    public void a() {
        this.f8465a.a();
    }

    public e.a<L> b() {
        return this.f8465a.b();
    }

    public t8.d[] c() {
        return this.f8466b;
    }

    protected abstract void d(A a10, TaskCompletionSource<Void> taskCompletionSource);

    public final int e() {
        return this.f8468d;
    }

    public final boolean f() {
        return this.f8467c;
    }
}
