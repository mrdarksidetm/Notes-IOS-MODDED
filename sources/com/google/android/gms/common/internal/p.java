package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class p implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f8605b;

    public p(b bVar, int i10) {
        this.f8605b = bVar;
        this.f8604a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar = this.f8605b;
        if (iBinder == null) {
            b.zzk(bVar, 16);
            return;
        }
        synchronized (bVar.zzq) {
            b bVar2 = this.f8605b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            bVar2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof w8.h)) ? new l(iBinder) : (w8.h) iInterfaceQueryLocalInterface;
        }
        this.f8605b.zzl(0, null, this.f8604a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f8605b.zzq) {
            this.f8605b.zzr = null;
        }
        b bVar = this.f8605b;
        int i10 = this.f8604a;
        Handler handler = bVar.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
