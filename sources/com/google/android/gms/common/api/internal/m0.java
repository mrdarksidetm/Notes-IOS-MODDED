package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final b f8506b;

    public m0(int i10, b bVar) {
        super(i10);
        this.f8506b = (b) w8.m.l(bVar, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void a(Status status) {
        try {
            this.f8506b.setFailedResult(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void b(Exception exc) {
        try {
            this.f8506b.setFailedResult(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void c(v vVar) throws DeadObjectException {
        try {
            this.f8506b.run(vVar.w());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void d(n nVar, boolean z10) {
        nVar.c(this.f8506b, z10);
    }
}
