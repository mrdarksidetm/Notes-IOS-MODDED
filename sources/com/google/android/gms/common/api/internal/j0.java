package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
abstract class j0 extends v8.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final TaskCompletionSource f8491b;

    public j0(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f8491b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void a(Status status) {
        this.f8491b.trySetException(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void b(Exception exc) {
        this.f8491b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void c(v vVar) throws DeadObjectException {
        try {
            h(vVar);
        } catch (DeadObjectException e10) {
            a(q0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(q0.e(e11));
        } catch (RuntimeException e12) {
            this.f8491b.trySetException(e12);
        }
    }

    protected abstract void h(v vVar);
}
