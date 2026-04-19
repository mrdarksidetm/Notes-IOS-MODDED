package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: loaded from: classes.dex */
final class i0 extends zau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k0 f8483a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, Looper looper) {
        super(looper);
        this.f8483a = k0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Status statusA;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i10);
            return;
        }
        u8.d dVar = (u8.d) message.obj;
        synchronized (this.f8483a.f8497e) {
            k0 k0Var = (k0) w8.m.k(this.f8483a.f8494b);
            if (dVar == null) {
                statusA = new Status(13, "Transform returned null");
            } else if (dVar instanceof f0) {
                statusA = ((f0) dVar).a();
            } else {
                k0Var.j(dVar);
            }
            k0Var.k(statusA);
        }
    }
}
