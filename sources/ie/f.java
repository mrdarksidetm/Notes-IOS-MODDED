package ie;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class f<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.a<T> f12685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.l<T, T> f12686b;

    public static final class a implements Iterator<T>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f12687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12688b = -2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f<T> f12689c;

        a(f<T> fVar) {
            this.f12689c = fVar;
        }

        private final void c() {
            T t10;
            if (this.f12688b == -2) {
                t10 = (T) ((f) this.f12689c).f12685a.invoke();
            } else {
                zd.l lVar = ((f) this.f12689c).f12686b;
                T t11 = this.f12687a;
                ae.r.c(t11);
                t10 = (T) lVar.invoke(t11);
            }
            this.f12687a = t10;
            this.f12688b = t10 == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12688b < 0) {
                c();
            }
            return this.f12688b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f12688b < 0) {
                c();
            }
            if (this.f12688b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f12687a;
            ae.r.d(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f12688b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(zd.a<? extends T> aVar, zd.l<? super T, ? extends T> lVar) {
        ae.r.f(aVar, "getInitialValue");
        ae.r.f(lVar, "getNextValue");
        this.f12685a = aVar;
        this.f12686b = lVar;
    }

    @Override // ie.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
