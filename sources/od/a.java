package od;

import ae.j;
import ae.r;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import nd.c;
import nd.f;
import nd.o;
import nd.t;

/* JADX INFO: loaded from: classes2.dex */
public final class a<E> extends f<E> implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C0370a f16441g = new C0370a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f16442h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private E[] f16443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a<E> f16447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a<E> f16448f;

    /* JADX INFO: renamed from: od.a$a, reason: collision with other inner class name */
    private static final class C0370a {
        private C0370a() {
        }

        public /* synthetic */ C0370a(j jVar) {
            this();
        }
    }

    private static final class b<E> implements ListIterator<E>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<E> f16449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16452d;

        public b(a<E> aVar, int i10) {
            r.f(aVar, "list");
            this.f16449a = aVar;
            this.f16450b = i10;
            this.f16451c = -1;
            this.f16452d = ((AbstractList) aVar).modCount;
        }

        private final void c() {
            if (((AbstractList) this.f16449a).modCount != this.f16452d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            c();
            a<E> aVar = this.f16449a;
            int i10 = this.f16450b;
            this.f16450b = i10 + 1;
            aVar.add(i10, e10);
            this.f16451c = -1;
            this.f16452d = ((AbstractList) this.f16449a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f16450b < ((a) this.f16449a).f16445c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f16450b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            c();
            if (this.f16450b >= ((a) this.f16449a).f16445c) {
                throw new NoSuchElementException();
            }
            int i10 = this.f16450b;
            this.f16450b = i10 + 1;
            this.f16451c = i10;
            return (E) ((a) this.f16449a).f16443a[((a) this.f16449a).f16444b + this.f16451c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f16450b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            c();
            int i10 = this.f16450b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f16450b = i11;
            this.f16451c = i11;
            return (E) ((a) this.f16449a).f16443a[((a) this.f16449a).f16444b + this.f16451c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f16450b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            c();
            int i10 = this.f16451c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f16449a.remove(i10);
            this.f16450b = this.f16451c;
            this.f16451c = -1;
            this.f16452d = ((AbstractList) this.f16449a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            c();
            int i10 = this.f16451c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f16449a.set(i10, e10);
        }
    }

    static {
        a aVar = new a(0);
        aVar.f16446d = true;
        f16442h = aVar;
    }

    public a() {
        this(10);
    }

    public a(int i10) {
        this(od.b.d(i10), 0, 0, false, null, null);
    }

    private a(E[] eArr, int i10, int i11, boolean z10, a<E> aVar, a<E> aVar2) {
        this.f16443a = eArr;
        this.f16444b = i10;
        this.f16445c = i11;
        this.f16446d = z10;
        this.f16447e = aVar;
        this.f16448f = aVar2;
        if (aVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) aVar).modCount;
        }
    }

    private final boolean A() {
        a<E> aVar;
        return this.f16446d || ((aVar = this.f16448f) != null && aVar.f16446d);
    }

    private final void B() {
        ((AbstractList) this).modCount++;
    }

    private final E C(int i10) {
        B();
        a<E> aVar = this.f16447e;
        if (aVar != null) {
            this.f16445c--;
            return aVar.C(i10);
        }
        E[] eArr = this.f16443a;
        E e10 = eArr[i10];
        o.h(eArr, eArr, i10, i10 + 1, this.f16444b + this.f16445c);
        od.b.f(this.f16443a, (this.f16444b + this.f16445c) - 1);
        this.f16445c--;
        return e10;
    }

    private final void D(int i10, int i11) {
        if (i11 > 0) {
            B();
        }
        a<E> aVar = this.f16447e;
        if (aVar != null) {
            aVar.D(i10, i11);
        } else {
            E[] eArr = this.f16443a;
            o.h(eArr, eArr, i10, i10 + i11, this.f16445c);
            E[] eArr2 = this.f16443a;
            int i12 = this.f16445c;
            od.b.g(eArr2, i12 - i11, i12);
        }
        this.f16445c -= i11;
    }

    private final int E(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        int iE;
        a<E> aVar = this.f16447e;
        if (aVar != null) {
            iE = aVar.E(i10, i11, collection, z10);
        } else {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = i10 + i12;
                if (collection.contains(this.f16443a[i14]) == z10) {
                    E[] eArr = this.f16443a;
                    i12++;
                    eArr[i13 + i10] = eArr[i14];
                    i13++;
                } else {
                    i12++;
                }
            }
            int i15 = i11 - i13;
            E[] eArr2 = this.f16443a;
            o.h(eArr2, eArr2, i10 + i13, i11 + i10, this.f16445c);
            E[] eArr3 = this.f16443a;
            int i16 = this.f16445c;
            od.b.g(eArr3, i16 - i15, i16);
            iE = i15;
        }
        if (iE > 0) {
            B();
        }
        this.f16445c -= iE;
        return iE;
    }

    private final void r(int i10, Collection<? extends E> collection, int i11) {
        B();
        a<E> aVar = this.f16447e;
        if (aVar != null) {
            aVar.r(i10, collection, i11);
            this.f16443a = this.f16447e.f16443a;
            this.f16445c += i11;
        } else {
            z(i10, i11);
            Iterator<? extends E> it = collection.iterator();
            for (int i12 = 0; i12 < i11; i12++) {
                this.f16443a[i10 + i12] = it.next();
            }
        }
    }

    private final void s(int i10, E e10) {
        B();
        a<E> aVar = this.f16447e;
        if (aVar == null) {
            z(i10, 1);
            this.f16443a[i10] = e10;
        } else {
            aVar.s(i10, e10);
            this.f16443a = this.f16447e.f16443a;
            this.f16445c++;
        }
    }

    private final void u() {
        a<E> aVar = this.f16448f;
        if (aVar != null && ((AbstractList) aVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void v() {
        if (A()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean w(List<?> list) {
        return od.b.h(this.f16443a, this.f16444b, this.f16445c, list);
    }

    private final void x(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f16443a;
        if (i10 > eArr.length) {
            this.f16443a = (E[]) od.b.e(this.f16443a, c.f16106a.e(eArr.length, i10));
        }
    }

    private final void y(int i10) {
        x(this.f16445c + i10);
    }

    private final void z(int i10, int i11) {
        y(i11);
        E[] eArr = this.f16443a;
        o.h(eArr, eArr, i10 + i11, i10, this.f16444b + this.f16445c);
        this.f16445c += i11;
    }

    @Override // nd.f
    public int a() {
        u();
        return this.f16445c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        v();
        u();
        c.f16106a.c(i10, this.f16445c);
        s(this.f16444b + i10, e10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        v();
        u();
        s(this.f16444b + this.f16445c, e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        r.f(collection, "elements");
        v();
        u();
        c.f16106a.c(i10, this.f16445c);
        int size = collection.size();
        r(this.f16444b + i10, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        r.f(collection, "elements");
        v();
        u();
        int size = collection.size();
        r(this.f16444b + this.f16445c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        v();
        u();
        D(this.f16444b, this.f16445c);
    }

    @Override // nd.f
    public E d(int i10) {
        v();
        u();
        c.f16106a.b(i10, this.f16445c);
        return C(this.f16444b + i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        u();
        return obj == this || ((obj instanceof List) && w((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        u();
        c.f16106a.b(i10, this.f16445c);
        return this.f16443a[this.f16444b + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        u();
        return od.b.i(this.f16443a, this.f16444b, this.f16445c);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        u();
        for (int i10 = 0; i10 < this.f16445c; i10++) {
            if (r.b(this.f16443a[this.f16444b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        u();
        return this.f16445c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        u();
        for (int i10 = this.f16445c - 1; i10 >= 0; i10--) {
            if (r.b(this.f16443a[this.f16444b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        u();
        c.f16106a.c(i10, this.f16445c);
        return new b(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        v();
        u();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        r.f(collection, "elements");
        v();
        u();
        return E(this.f16444b, this.f16445c, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        r.f(collection, "elements");
        v();
        u();
        return E(this.f16444b, this.f16445c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        v();
        u();
        c.f16106a.b(i10, this.f16445c);
        E[] eArr = this.f16443a;
        int i11 = this.f16444b;
        E e11 = eArr[i11 + i10];
        eArr[i11 + i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i10, int i11) {
        c.f16106a.d(i10, i11, this.f16445c);
        E[] eArr = this.f16443a;
        int i12 = this.f16444b + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f16446d;
        a<E> aVar = this.f16448f;
        return new a(eArr, i12, i13, z10, this, aVar == null ? this : aVar);
    }

    public final List<E> t() {
        if (this.f16447e != null) {
            throw new IllegalStateException();
        }
        v();
        this.f16446d = true;
        return this.f16445c > 0 ? this : f16442h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        u();
        E[] eArr = this.f16443a;
        int i10 = this.f16444b;
        return o.n(eArr, i10, this.f16445c + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        r.f(tArr, "destination");
        u();
        int length = tArr.length;
        int i10 = this.f16445c;
        if (length >= i10) {
            E[] eArr = this.f16443a;
            int i11 = this.f16444b;
            o.h(eArr, tArr, 0, i11, i10 + i11);
            return (T[]) t.f(this.f16445c, tArr);
        }
        E[] eArr2 = this.f16443a;
        int i12 = this.f16444b;
        T[] tArr2 = (T[]) Arrays.copyOfRange(eArr2, i12, i10 + i12, tArr.getClass());
        r.e(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        u();
        return od.b.j(this.f16443a, this.f16444b, this.f16445c, this);
    }
}
