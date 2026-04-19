package e;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<c> f10110b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zd.a<i0> f10111c;

    public q(boolean z10) {
        this.f10109a = z10;
    }

    public final void a(c cVar) {
        ae.r.f(cVar, "cancellable");
        this.f10110b.add(cVar);
    }

    public final zd.a<i0> b() {
        return this.f10111c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(b bVar) {
        ae.r.f(bVar, "backEvent");
    }

    public void f(b bVar) {
        ae.r.f(bVar, "backEvent");
    }

    public final boolean g() {
        return this.f10109a;
    }

    public final void h() {
        Iterator<T> it = this.f10110b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).cancel();
        }
    }

    public final void i(c cVar) {
        ae.r.f(cVar, "cancellable");
        this.f10110b.remove(cVar);
    }

    public final void j(boolean z10) {
        this.f10109a = z10;
        zd.a<i0> aVar = this.f10111c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void k(zd.a<i0> aVar) {
        this.f10111c = aVar;
    }
}
