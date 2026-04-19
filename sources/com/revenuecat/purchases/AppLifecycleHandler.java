package com.revenuecat.purchases;

import ae.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import o4.e;

/* JADX INFO: loaded from: classes2.dex */
public final class AppLifecycleHandler implements DefaultLifecycleObserver {
    private final LifecycleDelegate lifecycleDelegate;

    public AppLifecycleHandler(LifecycleDelegate lifecycleDelegate) {
        r.f(lifecycleDelegate, "lifecycleDelegate");
        this.lifecycleDelegate = lifecycleDelegate;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(e eVar) {
        r.f(eVar, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(e eVar) {
        r.f(eVar, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(e eVar) {
        r.f(eVar, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(e eVar) {
        r.f(eVar, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(e eVar) {
        r.f(eVar, "owner");
        this.lifecycleDelegate.onAppForegrounded();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(e eVar) {
        r.f(eVar, "owner");
        this.lifecycleDelegate.onAppBackgrounded();
    }
}
