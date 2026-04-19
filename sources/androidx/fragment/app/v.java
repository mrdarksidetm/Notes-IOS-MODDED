package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.w;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f4237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f4238b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f4239a;

        public final w.k a() {
            return null;
        }

        public final boolean b() {
            return this.f4239a;
        }
    }

    public v(w wVar) {
        ae.r.f(wVar, "fragmentManager");
        this.f4237a = wVar;
        this.f4238b = new CopyOnWriteArrayList<>();
    }

    public final void a(n nVar, Bundle bundle, boolean z10) {
        ae.r.f(nVar, "f");
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().a(nVar, bundle, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void b(n nVar, boolean z10) {
        ae.r.f(nVar, "f");
        this.f4237a.w0().f();
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().b(nVar, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void c(n nVar, Bundle bundle, boolean z10) {
        ae.r.f(nVar, "f");
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().c(nVar, bundle, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void d(n nVar, boolean z10) {
        ae.r.f(nVar, "f");
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().d(nVar, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void e(n nVar, boolean z10) {
        ae.r.f(nVar, "f");
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().e(nVar, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void f(n nVar, boolean z10) {
        ae.r.f(nVar, "f");
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().f(nVar, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void g(n nVar, boolean z10) {
        ae.r.f(nVar, "f");
        this.f4237a.w0().f();
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().g(nVar, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void h(n nVar, Bundle bundle, boolean z10) {
        ae.r.f(nVar, "f");
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().h(nVar, bundle, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void i(n nVar, boolean z10) {
        ae.r.f(nVar, "f");
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().i(nVar, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void j(n nVar, Bundle bundle, boolean z10) {
        ae.r.f(nVar, "f");
        ae.r.f(bundle, "outState");
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().j(nVar, bundle, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void k(n nVar, boolean z10) {
        ae.r.f(nVar, "f");
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().k(nVar, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void l(n nVar, boolean z10) {
        ae.r.f(nVar, "f");
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().l(nVar, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void m(n nVar, View view, Bundle bundle, boolean z10) {
        ae.r.f(nVar, "f");
        ae.r.f(view, "v");
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().m(nVar, view, bundle, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void n(n nVar, boolean z10) {
        ae.r.f(nVar, "f");
        n nVarZ0 = this.f4237a.z0();
        if (nVarZ0 != null) {
            w parentFragmentManager = nVarZ0.getParentFragmentManager();
            ae.r.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.y0().n(nVar, true);
        }
        for (a aVar : this.f4238b) {
            if (!z10 || aVar.b()) {
                aVar.a();
                throw null;
            }
        }
    }
}
