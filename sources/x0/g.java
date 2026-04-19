package x0;

import ge.o;

/* JADX INFO: loaded from: classes.dex */
public final class g<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T[] f22925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k<T> f22926d;

    public g(Object[] objArr, T[] tArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f22925c = tArr;
        int iD = l.d(i11);
        this.f22926d = new k<>(objArr, o.h(i10, iD), iD, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        c();
        if (this.f22926d.hasNext()) {
            g(e() + 1);
            return this.f22926d.next();
        }
        T[] tArr = this.f22925c;
        int iE = e();
        g(iE + 1);
        return tArr[iE - this.f22926d.f()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        d();
        if (e() <= this.f22926d.f()) {
            g(e() - 1);
            return this.f22926d.previous();
        }
        T[] tArr = this.f22925c;
        g(e() - 1);
        return tArr[e() - this.f22926d.f()];
    }
}
