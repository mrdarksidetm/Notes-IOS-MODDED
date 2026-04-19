package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends v8.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f8512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f8513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v8.l f8514d;

    public o0(int i10, j jVar, TaskCompletionSource taskCompletionSource, v8.l lVar) {
        super(i10);
        this.f8513c = taskCompletionSource;
        this.f8512b = jVar;
        this.f8514d = lVar;
        if (i10 == 2 && jVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void a(Status status) {
        this.f8513c.trySetException(this.f8514d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void b(Exception exc) {
        this.f8513c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void c(v vVar) throws DeadObjectException {
        try {
            this.f8512b.b(vVar.w(), this.f8513c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(q0.e(e11));
        } catch (RuntimeException e12) {
            this.f8513c.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void d(n nVar, boolean z10) {
        nVar.d(this.f8513c, z10);
    }

    @Override // v8.u
    public final boolean f(v vVar) {
        return this.f8512b.c();
    }

    @Override // v8.u
    public final t8.d[] g(v vVar) {
        return this.f8512b.e();
    }
}
