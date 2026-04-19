package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import androidx.webkit.internal.a;
import g5.f0;
import g5.l0;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class f extends f5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ServiceWorkerController f4945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ServiceWorkerControllerBoundaryInterface f4946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f5.i f4947c;

    public f() {
        a.c cVar = m.f4977k;
        if (cVar.c()) {
            this.f4945a = g5.c.g();
            this.f4946b = null;
            this.f4947c = g5.c.i(e());
        } else {
            if (!cVar.d()) {
                throw m.a();
            }
            this.f4945a = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = l0.d().getServiceWorkerController();
            this.f4946b = serviceWorkerController;
            this.f4947c = new g(serviceWorkerController.getServiceWorkerWebSettings());
        }
    }

    private ServiceWorkerControllerBoundaryInterface d() {
        if (this.f4946b == null) {
            this.f4946b = l0.d().getServiceWorkerController();
        }
        return this.f4946b;
    }

    private ServiceWorkerController e() {
        if (this.f4945a == null) {
            this.f4945a = g5.c.g();
        }
        return this.f4945a;
    }

    @Override // f5.h
    public f5.i b() {
        return this.f4947c;
    }

    @Override // f5.h
    public void c(f5.g gVar) {
        a.c cVar = m.f4977k;
        if (cVar.c()) {
            if (gVar == null) {
                g5.c.p(e(), null);
                return;
            } else {
                g5.c.q(e(), gVar);
                return;
            }
        }
        if (!cVar.d()) {
            throw m.a();
        }
        if (gVar == null) {
            d().setServiceWorkerClient(null);
        } else {
            d().setServiceWorkerClient(nf.a.c(new f0(gVar)));
        }
    }
}
