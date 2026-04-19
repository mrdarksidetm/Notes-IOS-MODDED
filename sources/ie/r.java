package ie;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class r<T, R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<T> f12710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.l<T, R> f12711b;

    public static final class a implements Iterator<R>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f12712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r<T, R> f12713b;

        a(r<T, R> rVar) {
            this.f12713b = rVar;
            this.f12712a = ((r) rVar).f12710a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12712a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((r) this.f12713b).f12711b.invoke(this.f12712a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(g<? extends T> gVar, zd.l<? super T, ? extends R> lVar) {
        ae.r.f(gVar, "sequence");
        ae.r.f(lVar, "transformer");
        this.f12710a = gVar;
        this.f12711b = lVar;
    }

    @Override // ie.g
    public Iterator<R> iterator() {
        return new a(this);
    }
}
