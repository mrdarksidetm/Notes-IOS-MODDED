package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v8.y f8509c;

    public n0(v8.y yVar, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f8509c = yVar;
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final /* bridge */ /* synthetic */ void d(n nVar, boolean z10) {
    }

    @Override // v8.u
    public final boolean f(v vVar) {
        return this.f8509c.f22282a.f();
    }

    @Override // v8.u
    public final t8.d[] g(v vVar) {
        return this.f8509c.f22282a.c();
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void h(v vVar) {
        this.f8509c.f22282a.d(vVar.w(), this.f8491b);
        e.a aVarB = this.f8509c.f22282a.b();
        if (aVarB != null) {
            vVar.y().put(aVarB, this.f8509c);
        }
    }
}
