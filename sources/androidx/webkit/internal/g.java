package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.webkit.internal.a;
import g5.l0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class g extends f5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ServiceWorkerWebSettings f4948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ServiceWorkerWebSettingsBoundaryInterface f4949b;

    public g(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f4948a = serviceWorkerWebSettings;
    }

    public g(InvocationHandler invocationHandler) {
        this.f4949b = (ServiceWorkerWebSettingsBoundaryInterface) nf.a.a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }

    private ServiceWorkerWebSettingsBoundaryInterface i() {
        if (this.f4949b == null) {
            this.f4949b = (ServiceWorkerWebSettingsBoundaryInterface) nf.a.a(ServiceWorkerWebSettingsBoundaryInterface.class, l0.c().e(this.f4948a));
        }
        return this.f4949b;
    }

    private ServiceWorkerWebSettings j() {
        if (this.f4948a == null) {
            this.f4948a = l0.c().d(Proxy.getInvocationHandler(this.f4949b));
        }
        return this.f4948a;
    }

    @Override // f5.i
    public boolean a() {
        a.c cVar = m.f4979m;
        if (cVar.c()) {
            return g5.c.a(j());
        }
        if (cVar.d()) {
            return i().getAllowContentAccess();
        }
        throw m.a();
    }

    @Override // f5.i
    public boolean b() {
        a.c cVar = m.f4980n;
        if (cVar.c()) {
            return g5.c.b(j());
        }
        if (cVar.d()) {
            return i().getAllowFileAccess();
        }
        throw m.a();
    }

    @Override // f5.i
    public boolean c() {
        a.c cVar = m.f4981o;
        if (cVar.c()) {
            return g5.c.c(j());
        }
        if (cVar.d()) {
            return i().getBlockNetworkLoads();
        }
        throw m.a();
    }

    @Override // f5.i
    public int d() {
        a.c cVar = m.f4978l;
        if (cVar.c()) {
            return g5.c.d(j());
        }
        if (cVar.d()) {
            return i().getCacheMode();
        }
        throw m.a();
    }

    @Override // f5.i
    public void e(boolean z10) {
        a.c cVar = m.f4979m;
        if (cVar.c()) {
            g5.c.k(j(), z10);
        } else {
            if (!cVar.d()) {
                throw m.a();
            }
            i().setAllowContentAccess(z10);
        }
    }

    @Override // f5.i
    public void f(boolean z10) {
        a.c cVar = m.f4980n;
        if (cVar.c()) {
            g5.c.l(j(), z10);
        } else {
            if (!cVar.d()) {
                throw m.a();
            }
            i().setAllowFileAccess(z10);
        }
    }

    @Override // f5.i
    public void g(boolean z10) {
        a.c cVar = m.f4981o;
        if (cVar.c()) {
            g5.c.m(j(), z10);
        } else {
            if (!cVar.d()) {
                throw m.a();
            }
            i().setBlockNetworkLoads(z10);
        }
    }

    @Override // f5.i
    public void h(int i10) {
        a.c cVar = m.f4978l;
        if (cVar.c()) {
            g5.c.n(j(), i10);
        } else {
            if (!cVar.d()) {
                throw m.a();
            }
            i().setCacheMode(i10);
        }
    }
}
