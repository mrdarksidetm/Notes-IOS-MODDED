package nd;

import com.google.android.gms.common.api.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c<E> extends nd.a<E> implements List<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16106a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        public final int e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 <= 0) {
                return i12;
            }
            if (i11 > 2147483639) {
                return a.e.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }

        public final boolean f(Collection<?> collection, Collection<?> collection2) {
            ae.r.f(collection, "c");
            ae.r.f(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!ae.r.b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection<?> collection) {
            ae.r.f(collection, "c");
            Iterator<?> it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    private class b implements Iterator<E>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16107a;

        public b() {
        }

        protected final int c() {
            return this.f16107a;
        }

        protected final void d(int i10) {
            this.f16107a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16107a < c.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            c<E> cVar = c.this;
            int i10 = this.f16107a;
            this.f16107a = i10 + 1;
            return cVar.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: nd.c$c, reason: collision with other inner class name */
    private class C0364c extends c<E>.b implements ListIterator<E> {
        public C0364c(int i10) {
            super();
            c.f16106a.c(i10, c.this.size());
            d(i10);
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return c() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return c();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            c<E> cVar = c.this;
            d(c() - 1);
            return cVar.get(c());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return c() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private static final class d<E> extends c<E> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c<E> f16110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f16111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16112d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c<? extends E> cVar, int i10, int i11) {
            ae.r.f(cVar, "list");
            this.f16110b = cVar;
            this.f16111c = i10;
            c.f16106a.d(i10, i11, cVar.size());
            this.f16112d = i11 - i10;
        }

        @Override // nd.a
        public int a() {
            return this.f16112d;
        }

        @Override // nd.c, java.util.List
        public E get(int i10) {
            c.f16106a.b(i10, this.f16112d);
            return this.f16110b.get(this.f16111c + i10);
        }
    }

    protected c() {
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f16106a.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f16106a.g(this);
    }

    public int indexOf(E e10) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (ae.r.b(it.next(), e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (ae.r.b(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C0364c(0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new C0364c(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }
}
