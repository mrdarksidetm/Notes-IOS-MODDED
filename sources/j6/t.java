package j6;

import java.util.concurrent.CancellationException;
import le.a2;

/* JADX INFO: loaded from: classes.dex */
public final class t implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x5.e f14066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f14067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l6.b<?> f14068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.lifecycle.g f14069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a2 f14070e;

    public t(x5.e eVar, h hVar, l6.b<?> bVar, androidx.lifecycle.g gVar, a2 a2Var) {
        this.f14066a = eVar;
        this.f14067b = hVar;
        this.f14068c = bVar;
        this.f14069d = gVar;
        this.f14070e = a2Var;
    }

    public void a() {
        a2.a.b(this.f14070e, null, 1, null);
        l6.b<?> bVar = this.f14068c;
        if (bVar instanceof o4.d) {
            this.f14069d.c((o4.d) bVar);
        }
        this.f14069d.c(this);
    }

    public final void b() {
        this.f14066a.b(this.f14067b);
    }

    @Override // j6.o
    public void f() {
        if (this.f14068c.getView().isAttachedToWindow()) {
            return;
        }
        o6.j.m(this.f14068c.getView()).c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(o4.e eVar) {
        o6.j.m(this.f14068c.getView()).a();
    }

    @Override // j6.o
    public void start() {
        this.f14069d.a(this);
        l6.b<?> bVar = this.f14068c;
        if (bVar instanceof o4.d) {
            o6.g.b(this.f14069d, (o4.d) bVar);
        }
        o6.j.m(this.f14068c.getView()).c(this);
    }
}
