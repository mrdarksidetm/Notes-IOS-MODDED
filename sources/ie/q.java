package ie;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class q<T> implements g<T>, c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<T> f12706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12707b;

    public static final class a implements Iterator<T>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<T> f12709b;

        a(q<T> qVar) {
            this.f12708a = ((q) qVar).f12707b;
            this.f12709b = ((q) qVar).f12706a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12708a > 0 && this.f12709b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.f12708a;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f12708a = i10 - 1;
            return this.f12709b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(g<? extends T> gVar, int i10) {
        ae.r.f(gVar, "sequence");
        this.f12706a = gVar;
        this.f12707b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + com.amazon.a.a.o.c.a.b.f7490a).toString());
    }

    @Override // ie.c
    public g<T> a(int i10) {
        return i10 >= this.f12707b ? this : new q(this.f12706a, i10);
    }

    @Override // ie.c
    public g<T> b(int i10) {
        int i11 = this.f12707b;
        return i10 >= i11 ? m.e() : new p(this.f12706a, i10, i11);
    }

    @Override // ie.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
