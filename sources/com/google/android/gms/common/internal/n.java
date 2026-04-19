package com.google.android.gms.common.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f8599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8600b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f8601c;

    public n(b bVar, Object obj) {
        this.f8601c = bVar;
        this.f8599a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f8599a;
            if (this.f8600b) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f8600b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f8599a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f8601c.zzt) {
            this.f8601c.zzt.remove(this);
        }
    }
}
