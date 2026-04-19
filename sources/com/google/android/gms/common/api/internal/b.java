package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.BasePendingResult;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<R extends u8.h, A extends a.b> extends BasePendingResult<R> implements v8.c<R> {
    private final com.google.android.gms.common.api.a<?> api;
    private final a.c<A> clientKey;

    @Deprecated
    protected b(a.c<A> cVar, com.google.android.gms.common.api.e eVar) {
        super((com.google.android.gms.common.api.e) w8.m.l(eVar, "GoogleApiClient must not be null"));
        this.clientKey = (a.c) w8.m.k(cVar);
        this.api = null;
    }

    protected b(com.google.android.gms.common.api.a<?> aVar, com.google.android.gms.common.api.e eVar) {
        super((com.google.android.gms.common.api.e) w8.m.l(eVar, "GoogleApiClient must not be null"));
        w8.m.l(aVar, "Api must not be null");
        this.clientKey = aVar.b();
        this.api = aVar;
    }

    protected b(BasePendingResult.a<R> aVar) {
        super(aVar);
        this.clientKey = new a.c<>();
        this.api = null;
    }

    private void setFailedResult(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void doExecute(A a10);

    public final com.google.android.gms.common.api.a<?> getApi() {
        return this.api;
    }

    public final a.c<A> getClientKey() {
        return this.clientKey;
    }

    protected void onSetFailedResult(R r10) {
    }

    public final void run(A a10) throws DeadObjectException {
        try {
            doExecute(a10);
        } catch (DeadObjectException e10) {
            setFailedResult(e10);
            throw e10;
        } catch (RemoteException e11) {
            setFailedResult(e11);
        }
    }

    public final void setFailedResult(Status status) {
        w8.m.b(!status.B(), "Failed result must not be success");
        R rCreateFailedResult = createFailedResult(status);
        setResult((u8.h) rCreateFailedResult);
        onSetFailedResult(rCreateFailedResult);
    }

    @Override // v8.c
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((u8.h) obj);
    }
}
