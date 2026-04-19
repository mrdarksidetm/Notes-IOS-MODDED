package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
final class c implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f8856a;

    /* synthetic */ c(d dVar, q9.b bVar) {
        this.f8856a = dVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f8856a.f8859b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f8856a.c().post(new a(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f8856a.f8859b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f8856a.c().post(new b(this));
    }
}
