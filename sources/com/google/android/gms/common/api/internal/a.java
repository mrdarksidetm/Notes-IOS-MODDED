package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f8422e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f8423a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f8424b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f8425c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8426d = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0177a {
        void a(boolean z10);
    }

    private a() {
    }

    public static a b() {
        return f8422e;
    }

    public static void c(Application application) {
        a aVar = f8422e;
        synchronized (aVar) {
            if (!aVar.f8426d) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f8426d = true;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f8422e) {
            Iterator it = this.f8425c.iterator();
            while (it.hasNext()) {
                ((InterfaceC0177a) it.next()).a(z10);
            }
        }
    }

    public void a(InterfaceC0177a interfaceC0177a) {
        synchronized (f8422e) {
            this.f8425c.add(interfaceC0177a);
        }
    }

    public boolean d() {
        return this.f8423a.get();
    }

    public boolean e(boolean z10) {
        if (!this.f8424b.get()) {
            if (!e9.l.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f8424b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f8423a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f8424b;
        boolean zCompareAndSet = this.f8423a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f8424b;
        boolean zCompareAndSet = this.f8423a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f8423a.compareAndSet(false, true)) {
            this.f8424b.set(true);
            f(true);
        }
    }
}
