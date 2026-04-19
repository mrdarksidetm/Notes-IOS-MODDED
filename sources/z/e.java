package z;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e<T> implements Iterator<T>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24069c;

    public e(int i10) {
        this.f24067a = i10;
    }

    protected abstract T c(int i10);

    protected abstract void d(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24068b < this.f24067a;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tC = c(this.f24068b);
        this.f24068b++;
        this.f24069c = true;
        return tC;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f24069c) {
            throw new IllegalStateException("Call next() before removing an element.".toString());
        }
        int i10 = this.f24068b - 1;
        this.f24068b = i10;
        d(i10);
        this.f24067a--;
        this.f24069c = false;
    }
}
