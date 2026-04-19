package ie;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class p<T> implements g<T>, c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<T> f12700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12702c;

    public static final class a implements Iterator<T>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f12703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<T> f12705c;

        a(p<T> pVar) {
            this.f12705c = pVar;
            this.f12703a = ((p) pVar).f12700a.iterator();
        }

        private final void c() {
            while (this.f12704b < ((p) this.f12705c).f12701b && this.f12703a.hasNext()) {
                this.f12703a.next();
                this.f12704b++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            c();
            return this.f12704b < ((p) this.f12705c).f12702c && this.f12703a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            c();
            if (this.f12704b >= ((p) this.f12705c).f12702c) {
                throw new NoSuchElementException();
            }
            this.f12704b++;
            return this.f12703a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(g<? extends T> gVar, int i10, int i11) {
        ae.r.f(gVar, "sequence");
        this.f12700a = gVar;
        this.f12701b = i10;
        this.f12702c = i11;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    private final int f() {
        return this.f12702c - this.f12701b;
    }

    @Override // ie.c
    public g<T> a(int i10) {
        if (i10 >= f()) {
            return this;
        }
        g<T> gVar = this.f12700a;
        int i11 = this.f12701b;
        return new p(gVar, i11, i10 + i11);
    }

    @Override // ie.c
    public g<T> b(int i10) {
        return i10 >= f() ? m.e() : new p(this.f12700a, this.f12701b + i10, this.f12702c);
    }

    @Override // ie.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
