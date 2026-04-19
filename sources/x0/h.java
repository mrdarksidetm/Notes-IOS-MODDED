package x0;

import ae.r;
import ge.o;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public final class h<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f<T> f22927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k<? extends T> f22929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22930f;

    public h(f<T> fVar, int i10) {
        super(i10, fVar.size());
        this.f22927c = fVar;
        this.f22928d = fVar.n();
        this.f22930f = -1;
        n();
    }

    private final void j() {
        if (this.f22928d != this.f22927c.n()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void l() {
        if (this.f22930f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void m() {
        i(this.f22927c.size());
        this.f22928d = this.f22927c.n();
        this.f22930f = -1;
        n();
    }

    private final void n() {
        Object[] objArrO = this.f22927c.o();
        if (objArrO == null) {
            this.f22929e = null;
            return;
        }
        int iD = l.d(this.f22927c.size());
        int iH = o.h(e(), iD);
        int iR = (this.f22927c.r() / 5) + 1;
        k<? extends T> kVar = this.f22929e;
        if (kVar == null) {
            this.f22929e = new k<>(objArrO, iH, iD, iR);
        } else {
            r.c(kVar);
            kVar.n(objArrO, iH, iD, iR);
        }
    }

    @Override // x0.a, java.util.ListIterator
    public void add(T t10) {
        j();
        this.f22927c.add(e(), t10);
        g(e() + 1);
        m();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        j();
        c();
        this.f22930f = e();
        k<? extends T> kVar = this.f22929e;
        if (kVar == null) {
            Object[] objArrS = this.f22927c.s();
            int iE = e();
            g(iE + 1);
            return (T) objArrS[iE];
        }
        if (kVar.hasNext()) {
            g(e() + 1);
            return kVar.next();
        }
        Object[] objArrS2 = this.f22927c.s();
        int iE2 = e();
        g(iE2 + 1);
        return (T) objArrS2[iE2 - kVar.f()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        j();
        d();
        this.f22930f = e() - 1;
        k<? extends T> kVar = this.f22929e;
        if (kVar == null) {
            Object[] objArrS = this.f22927c.s();
            g(e() - 1);
            return (T) objArrS[e()];
        }
        if (e() <= kVar.f()) {
            g(e() - 1);
            return kVar.previous();
        }
        Object[] objArrS2 = this.f22927c.s();
        g(e() - 1);
        return (T) objArrS2[e() - kVar.f()];
    }

    @Override // x0.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        j();
        l();
        this.f22927c.remove(this.f22930f);
        if (this.f22930f < e()) {
            g(this.f22930f);
        }
        m();
    }

    @Override // x0.a, java.util.ListIterator
    public void set(T t10) {
        j();
        l();
        this.f22927c.set(this.f22930f, t10);
        this.f22928d = this.f22927c.n();
        n();
    }
}
