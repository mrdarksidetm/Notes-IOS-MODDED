package d1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class j0<T> implements List<T>, be.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v<T> f9362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9365d;

    public static final class a implements ListIterator<T>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ae.f0 f9366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0<T> f9367b;

        a(ae.f0 f0Var, j0<T> j0Var) {
            this.f9366a = f0Var;
            this.f9367b = j0Var;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void add(T t10) {
            w.f();
            throw new md.i();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            w.f();
            throw new md.i();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void set(T t10) {
            w.f();
            throw new md.i();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f9366a.f703a < this.f9367b.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f9366a.f703a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i10 = this.f9366a.f703a + 1;
            w.g(i10, this.f9367b.size());
            this.f9366a.f703a = i10;
            return this.f9367b.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f9366a.f703a + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.f9366a.f703a;
            w.g(i10, this.f9367b.size());
            this.f9366a.f703a = i10 - 1;
            return this.f9367b.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f9366a.f703a;
        }
    }

    public j0(v<T> vVar, int i10, int i11) {
        this.f9362a = vVar;
        this.f9363b = i10;
        this.f9364c = vVar.o();
        this.f9365d = i11 - i10;
    }

    private final void f() {
        if (this.f9362a.o() != this.f9364c) {
            throw new ConcurrentModificationException();
        }
    }

    public int a() {
        return this.f9365d;
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        f();
        this.f9362a.add(this.f9363b + i10, t10);
        this.f9365d = size() + 1;
        this.f9364c = this.f9362a.o();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        f();
        this.f9362a.add(this.f9363b + size(), t10);
        this.f9365d = size() + 1;
        this.f9364c = this.f9362a.o();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        f();
        boolean zAddAll = this.f9362a.addAll(i10 + this.f9363b, collection);
        if (zAddAll) {
            this.f9365d = size() + collection.size();
            this.f9364c = this.f9362a.o();
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            f();
            v<T> vVar = this.f9362a;
            int i10 = this.f9363b;
            vVar.t(i10, size() + i10);
            this.f9365d = 0;
            this.f9364c = this.f9362a.o();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public T d(int i10) {
        f();
        T tRemove = this.f9362a.remove(this.f9363b + i10);
        this.f9365d = size() - 1;
        this.f9364c = this.f9362a.o();
        return tRemove;
    }

    @Override // java.util.List
    public T get(int i10) {
        f();
        w.g(i10, size());
        return this.f9362a.get(this.f9363b + i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        f();
        int i10 = this.f9363b;
        Iterator<Integer> it = ge.o.t(i10, size() + i10).iterator();
        while (it.hasNext()) {
            int iNextInt = ((nd.l0) it).nextInt();
            if (ae.r.b(obj, this.f9362a.get(iNextInt))) {
                return iNextInt - this.f9363b;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        f();
        int size = this.f9363b + size();
        do {
            size--;
            if (size < this.f9363b) {
                return -1;
            }
        } while (!ae.r.b(obj, this.f9362a.get(size)));
        return size - this.f9363b;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        f();
        ae.f0 f0Var = new ae.f0();
        f0Var.f703a = i10 - 1;
        return new a(f0Var, this);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return d(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        f();
        v<T> vVar = this.f9362a;
        int i10 = this.f9363b;
        int iU = vVar.u(collection, i10, size() + i10);
        if (iU > 0) {
            this.f9364c = this.f9362a.o();
            this.f9365d = size() - iU;
        }
        return iU > 0;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        w.g(i10, size());
        f();
        T t11 = this.f9362a.set(i10 + this.f9363b, t10);
        this.f9364c = this.f9362a.o();
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        if (!((i10 >= 0 && i10 <= i11) && i11 <= size())) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
        }
        f();
        v<T> vVar = this.f9362a;
        int i12 = this.f9363b;
        return new j0(vVar, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ae.i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ae.i.b(this, tArr);
    }
}
