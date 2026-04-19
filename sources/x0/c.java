package x0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T[] f22910c;

    public c(T[] tArr, int i10, int i11) {
        super(i10, i11);
        this.f22910c = tArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.f22910c;
        int iE = e();
        g(iE + 1);
        return tArr[iE];
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.f22910c;
        g(e() - 1);
        return tArr[e()];
    }
}
