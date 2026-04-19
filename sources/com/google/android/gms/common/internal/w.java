package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import w8.r0;
import w8.t0;

/* JADX INFO: loaded from: classes.dex */
final class w implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f8620a;

    /* synthetic */ w(x xVar, t0 t0Var) {
        this.f8620a = xVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f8620a.f8621f) {
                r0 r0Var = (r0) message.obj;
                v vVar = (v) this.f8620a.f8621f.get(r0Var);
                if (vVar != null && vVar.i()) {
                    if (vVar.j()) {
                        vVar.g("GmsClientSupervisor");
                    }
                    this.f8620a.f8621f.remove(r0Var);
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f8620a.f8621f) {
            r0 r0Var2 = (r0) message.obj;
            v vVar2 = (v) this.f8620a.f8621f.get(r0Var2);
            if (vVar2 != null && vVar2.a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(r0Var2), new Exception());
                ComponentName componentNameB = vVar2.b();
                if (componentNameB == null) {
                    componentNameB = r0Var2.a();
                }
                if (componentNameB == null) {
                    String strC = r0Var2.c();
                    w8.m.k(strC);
                    componentNameB = new ComponentName(strC, "unknown");
                }
                vVar2.onServiceDisconnected(componentNameB);
            }
        }
        return true;
    }
}
