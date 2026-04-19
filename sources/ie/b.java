package ie;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements g<T>, c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<T> f12673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12674b;

    public static final class a implements Iterator<T>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f12675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12676b;

        a(b<T> bVar) {
            this.f12675a = ((b) bVar).f12673a.iterator();
            this.f12676b = ((b) bVar).f12674b;
        }

        private final void c() {
            while (this.f12676b > 0 && this.f12675a.hasNext()) {
                this.f12675a.next();
                this.f12676b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            c();
            return this.f12675a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            c();
            return this.f12675a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(g<? extends T> gVar, int i10) {
        ae.r.f(gVar, "sequence");
        this.f12673a = gVar;
        this.f12674b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + com.amazon.a.a.o.c.a.b.f7490a).toString());
    }

    @Override // ie.c
    public g<T> a(int i10) {
        int i11 = this.f12674b;
        int i12 = i11 + i10;
        return i12 < 0 ? new q(this, i10) : new p(this.f12673a, i11, i12);
    }

    @Override // ie.c
    public g<T> b(int i10) {
        int i11 = this.f12674b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f12673a, i11);
    }

    @Override // ie.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
