package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import w8.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f8582a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static x f8583b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static HandlerThread f8584c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Executor f8585d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f8586e = false;

    public static int b() {
        return 4225;
    }

    public static e c(Context context) {
        synchronized (f8582a) {
            if (f8583b == null) {
                f8583b = new x(context.getApplicationContext(), f8586e ? d().getLooper() : context.getMainLooper(), f8585d);
            }
        }
        return f8583b;
    }

    public static HandlerThread d() {
        synchronized (f8582a) {
            HandlerThread handlerThread = f8584c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f8584c = handlerThread2;
            handlerThread2.start();
            return f8584c;
        }
    }

    public boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return h(new r0(componentName, 4225), serviceConnection, str, executor);
    }

    public void e(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        f(new r0(componentName, 4225), serviceConnection, str);
    }

    protected abstract void f(r0 r0Var, ServiceConnection serviceConnection, String str);

    public final void g(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        f(new r0(str, str2, 4225, z10), serviceConnection, str3);
    }

    protected abstract boolean h(r0 r0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
