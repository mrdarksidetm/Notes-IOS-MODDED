package z0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class c<E> implements Iterator<E>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f24127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<E, a> f24128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24129c;

    public c(Object obj, Map<E, a> map) {
        this.f24127a = obj;
        this.f24128b = map;
    }

    private final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24129c < this.f24128b.size();
    }

    @Override // java.util.Iterator
    public E next() {
        c();
        E e10 = (E) this.f24127a;
        this.f24129c++;
        a aVar = this.f24128b.get(e10);
        if (aVar != null) {
            this.f24127a = aVar.c();
            return e10;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
