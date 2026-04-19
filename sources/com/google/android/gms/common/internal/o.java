package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import w8.m0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f8602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8603b;

    public o(b bVar, int i10) {
        this.f8602a = bVar;
        this.f8603b = i10;
    }

    @Override // w8.g
    public final void P(int i10, IBinder iBinder, s sVar) {
        b bVar = this.f8602a;
        w8.m.l(bVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        w8.m.k(sVar);
        b.zzj(bVar, sVar);
        y(i10, iBinder, sVar.f8609a);
    }

    @Override // w8.g
    public final void h(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // w8.g
    public final void y(int i10, IBinder iBinder, Bundle bundle) {
        w8.m.l(this.f8602a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f8602a.onPostInitHandler(i10, iBinder, bundle, this.f8603b);
        this.f8602a = null;
    }
}
