package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;
import w8.r0;

/* JADX INFO: loaded from: classes.dex */
final class x extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f8621f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f8622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Handler f8623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f8624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d9.b f8625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f8626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f8627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile Executor f8628m;

    x(Context context, Looper looper, Executor executor) {
        w wVar = new w(this, null);
        this.f8624i = wVar;
        this.f8622g = context.getApplicationContext();
        this.f8623h = new zzi(looper, wVar);
        this.f8625j = d9.b.b();
        this.f8626k = 5000L;
        this.f8627l = 300000L;
        this.f8628m = executor;
    }

    @Override // com.google.android.gms.common.internal.e
    protected final void f(r0 r0Var, ServiceConnection serviceConnection, String str) {
        w8.m.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8621f) {
            v vVar = (v) this.f8621f.get(r0Var);
            if (vVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + r0Var.toString());
            }
            if (!vVar.h(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + r0Var.toString());
            }
            vVar.f(serviceConnection, str);
            if (vVar.i()) {
                this.f8623h.sendMessageDelayed(this.f8623h.obtainMessage(0, r0Var), this.f8626k);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.e
    protected final boolean h(r0 r0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zJ;
        w8.m.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8621f) {
            v vVar = (v) this.f8621f.get(r0Var);
            if (executor == null) {
                executor = this.f8628m;
            }
            if (vVar == null) {
                vVar = new v(this, r0Var);
                vVar.d(serviceConnection, serviceConnection, str);
                vVar.e(str, executor);
                this.f8621f.put(r0Var, vVar);
            } else {
                this.f8623h.removeMessages(0, r0Var);
                if (vVar.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + r0Var.toString());
                }
                vVar.d(serviceConnection, serviceConnection, str);
                int iA = vVar.a();
                if (iA == 1) {
                    serviceConnection.onServiceConnected(vVar.b(), vVar.c());
                } else if (iA == 2) {
                    vVar.e(str, executor);
                }
            }
            zJ = vVar.j();
        }
        return zJ;
    }
}
