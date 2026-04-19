package d1;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class b0<T> implements ListIterator<T>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v<T> f9324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9326c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9327d;

    public b0(v<T> vVar, int i10) {
        this.f9324a = vVar;
        this.f9325b = i10 - 1;
        this.f9327d = vVar.o();
    }

    private final void c() {
        if (this.f9324a.o() != this.f9327d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(T t10) {
        c();
        this.f9324a.add(this.f9325b + 1, t10);
        this.f9326c = -1;
        this.f9325b++;
        this.f9327d = this.f9324a.o();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f9325b < this.f9324a.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f9325b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        c();
        int i10 = this.f9325b + 1;
        this.f9326c = i10;
        w.g(i10, this.f9324a.size());
        T t10 = this.f9324a.get(i10);
        this.f9325b = i10;
        return t10;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f9325b + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        c();
        w.g(this.f9325b, this.f9324a.size());
        int i10 = this.f9325b;
        this.f9326c = i10;
        this.f9325b--;
        return this.f9324a.get(i10);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f9325b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        c();
        this.f9324a.remove(this.f9325b);
        this.f9325b--;
        this.f9326c = -1;
        this.f9327d = this.f9324a.o();
    }

    @Override // java.util.ListIterator
    public void set(T t10) {
        c();
        int i10 = this.f9326c;
        if (i10 < 0) {
            w.e();
            throw new md.i();
        }
        this.f9324a.set(i10, t10);
        this.f9327d = this.f9324a.o();
    }
}
