package x0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<E> implements ListIterator<E>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22908b;

    public a(int i10, int i11) {
        this.f22907a = i10;
        this.f22908b = i11;
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void d() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int e() {
        return this.f22907a;
    }

    public final int f() {
        return this.f22908b;
    }

    public final void g(int i10) {
        this.f22907a = i10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f22907a < this.f22908b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f22907a > 0;
    }

    public final void i(int i10) {
        this.f22908b = i10;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f22907a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f22907a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
