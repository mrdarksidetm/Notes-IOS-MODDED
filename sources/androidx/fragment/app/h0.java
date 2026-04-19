package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.y;

/* JADX INFO: loaded from: classes.dex */
class h0 implements androidx.lifecycle.e, x4.f, o4.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f4096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.z f4097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f4098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y.b f4099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.j f4100e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x4.e f4101f = null;

    h0(n nVar, androidx.lifecycle.z zVar, Runnable runnable) {
        this.f4096a = nVar;
        this.f4097b = zVar;
        this.f4098c = runnable;
    }

    void a(g.a aVar) {
        this.f4100e.h(aVar);
    }

    void b() {
        if (this.f4100e == null) {
            this.f4100e = new androidx.lifecycle.j(this);
            x4.e eVarA = x4.e.a(this);
            this.f4101f = eVarA;
            eVarA.c();
            this.f4098c.run();
        }
    }

    boolean c() {
        return this.f4100e != null;
    }

    void d(Bundle bundle) {
        this.f4101f.d(bundle);
    }

    void e(Bundle bundle) {
        this.f4101f.e(bundle);
    }

    void f(g.b bVar) {
        this.f4100e.m(bVar);
    }

    @Override // androidx.lifecycle.e
    public q4.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f4096a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        q4.b bVar = new q4.b();
        if (application != null) {
            bVar.c(y.a.f4399e, application);
        }
        bVar.c(androidx.lifecycle.t.f4385a, this.f4096a);
        bVar.c(androidx.lifecycle.t.f4386b, this);
        if (this.f4096a.getArguments() != null) {
            bVar.c(androidx.lifecycle.t.f4387c, this.f4096a.getArguments());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.e
    public y.b getDefaultViewModelProviderFactory() {
        y.b defaultViewModelProviderFactory = this.f4096a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f4096a.mDefaultFactory)) {
            this.f4099d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f4099d == null) {
            Application application = null;
            Context applicationContext = this.f4096a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            n nVar = this.f4096a;
            this.f4099d = new androidx.lifecycle.u(application, nVar, nVar.getArguments());
        }
        return this.f4099d;
    }

    @Override // o4.e
    public androidx.lifecycle.g getLifecycle() {
        b();
        return this.f4100e;
    }

    @Override // x4.f
    public x4.d getSavedStateRegistry() {
        b();
        return this.f4101f.b();
    }

    @Override // o4.q
    public androidx.lifecycle.z getViewModelStore() {
        b();
        return this.f4097b;
    }
}
