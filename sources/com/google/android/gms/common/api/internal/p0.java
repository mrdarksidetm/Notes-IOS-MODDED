package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e.a f8517c;

    public p0(e.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f8517c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final /* bridge */ /* synthetic */ void d(n nVar, boolean z10) {
    }

    @Override // v8.u
    public final boolean f(v vVar) {
        v8.y yVar = (v8.y) vVar.y().get(this.f8517c);
        return yVar != null && yVar.f22282a.f();
    }

    @Override // v8.u
    public final t8.d[] g(v vVar) {
        v8.y yVar = (v8.y) vVar.y().get(this.f8517c);
        if (yVar == null) {
            return null;
        }
        return yVar.f22282a.c();
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void h(v vVar) {
        v8.y yVar = (v8.y) vVar.y().remove(this.f8517c);
        if (yVar == null) {
            this.f8491b.trySetResult(Boolean.FALSE);
            return;
        }
        yVar.f22283b.b(vVar.w(), this.f8491b);
        yVar.f22282a.a();
    }
}
