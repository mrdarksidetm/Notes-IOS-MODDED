package ie;

import java.util.Iterator;
import java.util.NoSuchElementException;
import md.i0;
import md.t;
import md.u;

/* JADX INFO: loaded from: classes2.dex */
final class h<T> extends i<T> implements Iterator<T>, qd.d<i0>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f12691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator<? extends T> f12692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private qd.d<? super i0> f12693d;

    private final Throwable e() {
        int i10 = this.f12690a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f12690a);
    }

    private final T g() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // ie.i
    public Object c(T t10, qd.d<? super i0> dVar) {
        this.f12691b = t10;
        this.f12690a = 3;
        this.f12693d = dVar;
        Object objE = rd.d.e();
        if (objE == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objE == rd.d.e() ? objE : i0.f15558a;
    }

    @Override // qd.d
    public qd.g getContext() {
        return qd.h.f19040a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f12690a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator<? extends T> it = this.f12692c;
                ae.r.c(it);
                if (it.hasNext()) {
                    this.f12690a = 2;
                    return true;
                }
                this.f12692c = null;
            }
            this.f12690a = 5;
            qd.d<? super i0> dVar = this.f12693d;
            ae.r.c(dVar);
            this.f12693d = null;
            t.a aVar = t.f15576b;
            dVar.resumeWith(t.b(i0.f15558a));
        }
    }

    public final void i(qd.d<? super i0> dVar) {
        this.f12693d = dVar;
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i10 = this.f12690a;
        if (i10 == 0 || i10 == 1) {
            return g();
        }
        if (i10 == 2) {
            this.f12690a = 1;
            Iterator<? extends T> it = this.f12692c;
            ae.r.c(it);
            return it.next();
        }
        if (i10 != 3) {
            throw e();
        }
        this.f12690a = 0;
        T t10 = this.f12691b;
        this.f12691b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // qd.d
    public void resumeWith(Object obj) throws Throwable {
        u.b(obj);
        this.f12690a = 4;
    }
}
