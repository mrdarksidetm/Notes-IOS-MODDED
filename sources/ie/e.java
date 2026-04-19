package ie;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class e<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<T> f12678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.l<T, Boolean> f12680c;

    public static final class a implements Iterator<T>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f12681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12682b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f12683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e<T> f12684d;

        a(e<T> eVar) {
            this.f12684d = eVar;
            this.f12681a = ((e) eVar).f12678a.iterator();
        }

        private final void c() {
            int i10;
            while (true) {
                if (!this.f12681a.hasNext()) {
                    i10 = 0;
                    break;
                }
                T next = this.f12681a.next();
                if (((Boolean) ((e) this.f12684d).f12680c.invoke(next)).booleanValue() == ((e) this.f12684d).f12679b) {
                    this.f12683c = next;
                    i10 = 1;
                    break;
                }
            }
            this.f12682b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12682b == -1) {
                c();
            }
            return this.f12682b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f12682b == -1) {
                c();
            }
            if (this.f12682b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f12683c;
            this.f12683c = null;
            this.f12682b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(g<? extends T> gVar, boolean z10, zd.l<? super T, Boolean> lVar) {
        ae.r.f(gVar, "sequence");
        ae.r.f(lVar, "predicate");
        this.f12678a = gVar;
        this.f12679b = z10;
        this.f12680c = lVar;
    }

    @Override // ie.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
