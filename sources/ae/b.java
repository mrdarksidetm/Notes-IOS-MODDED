package ae;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class b<T> implements Iterator<T>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T[] f695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f696b;

    public b(T[] tArr) {
        r.f(tArr, "array");
        this.f695a = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f696b < this.f695a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f695a;
            int i10 = this.f696b;
            this.f696b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f696b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
