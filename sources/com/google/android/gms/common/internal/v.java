package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import w8.r0;
import w8.u0;

/* JADX INFO: loaded from: classes.dex */
final class v implements ServiceConnection, u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8613a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8614b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IBinder f8616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r0 f8617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ComponentName f8618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ x f8619g;

    public v(x xVar, r0 r0Var) {
        this.f8619g = xVar;
        this.f8617e = r0Var;
    }

    public final int a() {
        return this.f8614b;
    }

    public final ComponentName b() {
        return this.f8618f;
    }

    public final IBinder c() {
        return this.f8616d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f8613a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f8614b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (e9.l.k()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            x xVar = this.f8619g;
            boolean zD = xVar.f8625j.d(xVar.f8622g, str, this.f8617e.b(xVar.f8622g), this, 4225, executor);
            this.f8615c = zD;
            if (zD) {
                this.f8619g.f8623h.sendMessageDelayed(this.f8619g.f8623h.obtainMessage(1, this.f8617e), this.f8619g.f8627l);
            } else {
                this.f8614b = 2;
                try {
                    x xVar2 = this.f8619g;
                    xVar2.f8625j.c(xVar2.f8622g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f8613a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f8619g.f8623h.removeMessages(1, this.f8617e);
        x xVar = this.f8619g;
        xVar.f8625j.c(xVar.f8622g, this);
        this.f8615c = false;
        this.f8614b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f8613a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f8613a.isEmpty();
    }

    public final boolean j() {
        return this.f8615c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f8619g.f8621f) {
            this.f8619g.f8623h.removeMessages(1, this.f8617e);
            this.f8616d = iBinder;
            this.f8618f = componentName;
            Iterator it = this.f8613a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f8614b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f8619g.f8621f) {
            this.f8619g.f8623h.removeMessages(1, this.f8617e);
            this.f8616d = null;
            this.f8618f = componentName;
            Iterator it = this.f8613a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f8614b = 2;
        }
    }
}
