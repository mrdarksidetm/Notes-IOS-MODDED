package nd;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class k<E> extends f<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16126d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object[] f16127e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f16129b = f16127e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16130c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private final void f(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f16129b.length;
        while (i10 < length && it.hasNext()) {
            this.f16129b[i10] = it.next();
            i10++;
        }
        int i11 = this.f16128a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f16129b[i12] = it.next();
        }
        this.f16130c = size() + collection.size();
    }

    private final void l(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f16129b;
        o.h(objArr2, objArr, 0, this.f16128a, objArr2.length);
        Object[] objArr3 = this.f16129b;
        int length = objArr3.length;
        int i11 = this.f16128a;
        o.h(objArr3, objArr, length - i11, 0, i11);
        this.f16128a = 0;
        this.f16129b = objArr;
    }

    private final int n(int i10) {
        return i10 == 0 ? p.Q(this.f16129b) : i10 - 1;
    }

    private final void o(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f16129b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f16127e) {
            this.f16129b = new Object[ge.o.d(i10, 10)];
        } else {
            l(c.f16106a.e(objArr.length, i10));
        }
    }

    private final int r(int i10) {
        if (i10 == p.Q(this.f16129b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int t(int i10) {
        return i10 < 0 ? i10 + this.f16129b.length : i10;
    }

    private final int u(int i10) {
        Object[] objArr = this.f16129b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // nd.f
    public int a() {
        return this.f16130c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        c.f16106a.c(i10, size());
        if (i10 == size()) {
            addLast(e10);
            return;
        }
        if (i10 == 0) {
            addFirst(e10);
            return;
        }
        o(size() + 1);
        int iU = u(this.f16128a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iN = n(iU);
            int iN2 = n(this.f16128a);
            int i11 = this.f16128a;
            if (iN >= i11) {
                Object[] objArr = this.f16129b;
                objArr[iN2] = objArr[i11];
                o.h(objArr, objArr, i11, i11 + 1, iN + 1);
            } else {
                Object[] objArr2 = this.f16129b;
                o.h(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f16129b;
                objArr3[objArr3.length - 1] = objArr3[0];
                o.h(objArr3, objArr3, 0, 1, iN + 1);
            }
            this.f16129b[iN] = e10;
            this.f16128a = iN2;
        } else {
            int iU2 = u(this.f16128a + size());
            Object[] objArr4 = this.f16129b;
            if (iU < iU2) {
                o.h(objArr4, objArr4, iU + 1, iU, iU2);
            } else {
                o.h(objArr4, objArr4, 1, 0, iU2);
                Object[] objArr5 = this.f16129b;
                objArr5[0] = objArr5[objArr5.length - 1];
                o.h(objArr5, objArr5, iU + 1, iU, objArr5.length - 1);
            }
            this.f16129b[iU] = e10;
        }
        this.f16130c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        ae.r.f(collection, "elements");
        c.f16106a.c(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        o(size() + collection.size());
        int iU = u(this.f16128a + size());
        int iU2 = u(this.f16128a + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f16128a;
            int length = i11 - size;
            if (iU2 < i11) {
                Object[] objArr = this.f16129b;
                o.h(objArr, objArr, length, i11, objArr.length);
                Object[] objArr2 = this.f16129b;
                if (size >= iU2) {
                    o.h(objArr2, objArr2, objArr2.length - size, 0, iU2);
                } else {
                    o.h(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f16129b;
                    o.h(objArr3, objArr3, 0, size, iU2);
                }
            } else if (length >= 0) {
                Object[] objArr4 = this.f16129b;
                o.h(objArr4, objArr4, length, i11, iU2);
            } else {
                Object[] objArr5 = this.f16129b;
                length += objArr5.length;
                int i12 = iU2 - i11;
                int length2 = objArr5.length - length;
                if (length2 >= i12) {
                    o.h(objArr5, objArr5, length, i11, iU2);
                } else {
                    o.h(objArr5, objArr5, length, i11, i11 + length2);
                    Object[] objArr6 = this.f16129b;
                    o.h(objArr6, objArr6, 0, this.f16128a + length2, iU2);
                }
            }
            this.f16128a = length;
            f(t(iU2 - size), collection);
        } else {
            int length3 = iU2 + size;
            if (iU2 < iU) {
                int i13 = size + iU;
                Object[] objArr7 = this.f16129b;
                if (i13 <= objArr7.length) {
                    o.h(objArr7, objArr7, length3, iU2, iU);
                } else if (length3 >= objArr7.length) {
                    length3 -= objArr7.length;
                    o.h(objArr7, objArr7, length3, iU2, iU);
                } else {
                    int length4 = iU - (i13 - objArr7.length);
                    o.h(objArr7, objArr7, 0, length4, iU);
                    Object[] objArr8 = this.f16129b;
                    o.h(objArr8, objArr8, length3, iU2, length4);
                }
            } else {
                Object[] objArr9 = this.f16129b;
                o.h(objArr9, objArr9, size, 0, iU);
                Object[] objArr10 = this.f16129b;
                if (length3 >= objArr10.length) {
                    o.h(objArr10, objArr10, length3 - objArr10.length, iU2, objArr10.length);
                } else {
                    o.h(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f16129b;
                    o.h(objArr11, objArr11, length3, iU2, objArr11.length - size);
                }
            }
            f(iU2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        ae.r.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        o(size() + collection.size());
        f(u(this.f16128a + size()), collection);
        return true;
    }

    public final void addFirst(E e10) {
        o(size() + 1);
        int iN = n(this.f16128a);
        this.f16128a = iN;
        this.f16129b[iN] = e10;
        this.f16130c = size() + 1;
    }

    public final void addLast(E e10) {
        o(size() + 1);
        this.f16129b[u(this.f16128a + size())] = e10;
        this.f16130c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int iU = u(this.f16128a + size());
        int i10 = this.f16128a;
        if (i10 < iU) {
            o.q(this.f16129b, null, i10, iU);
        } else if (!isEmpty()) {
            Object[] objArr = this.f16129b;
            o.q(objArr, null, this.f16128a, objArr.length);
            o.q(this.f16129b, null, 0, iU);
        }
        this.f16128a = 0;
        this.f16130c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // nd.f
    public E d(int i10) {
        c.f16106a.b(i10, size());
        if (i10 == u.o(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        int iU = u(this.f16128a + i10);
        E e10 = (E) this.f16129b[iU];
        if (i10 < (size() >> 1)) {
            int i11 = this.f16128a;
            if (iU >= i11) {
                Object[] objArr = this.f16129b;
                o.h(objArr, objArr, i11 + 1, i11, iU);
            } else {
                Object[] objArr2 = this.f16129b;
                o.h(objArr2, objArr2, 1, 0, iU);
                Object[] objArr3 = this.f16129b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f16128a;
                o.h(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f16129b;
            int i13 = this.f16128a;
            objArr4[i13] = null;
            this.f16128a = r(i13);
        } else {
            int iU2 = u(this.f16128a + u.o(this));
            Object[] objArr5 = this.f16129b;
            if (iU <= iU2) {
                o.h(objArr5, objArr5, iU, iU + 1, iU2 + 1);
            } else {
                o.h(objArr5, objArr5, iU, iU + 1, objArr5.length);
                Object[] objArr6 = this.f16129b;
                objArr6[objArr6.length - 1] = objArr6[0];
                o.h(objArr6, objArr6, 0, 1, iU2 + 1);
            }
            this.f16129b[iU2] = null;
        }
        this.f16130c = size() - 1;
        return e10;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f16129b[this.f16128a];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        c.f16106a.b(i10, size());
        return (E) this.f16129b[u(this.f16128a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int iU = u(this.f16128a + size());
        int length = this.f16128a;
        if (length < iU) {
            while (length < iU) {
                if (!ae.r.b(obj, this.f16129b[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iU) {
            return -1;
        }
        int length2 = this.f16129b.length;
        while (true) {
            if (length >= length2) {
                for (int i10 = 0; i10 < iU; i10++) {
                    if (ae.r.b(obj, this.f16129b[i10])) {
                        length = i10 + this.f16129b.length;
                    }
                }
                return -1;
            }
            if (ae.r.b(obj, this.f16129b[length])) {
                break;
            }
            length++;
        }
        return length - this.f16128a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iQ;
        int iU = u(this.f16128a + size());
        int i10 = this.f16128a;
        if (i10 < iU) {
            iQ = iU - 1;
            if (i10 <= iQ) {
                while (!ae.r.b(obj, this.f16129b[iQ])) {
                    if (iQ != i10) {
                        iQ--;
                    }
                }
                return iQ - this.f16128a;
            }
            return -1;
        }
        if (i10 > iU) {
            int i11 = iU - 1;
            while (true) {
                if (-1 >= i11) {
                    iQ = p.Q(this.f16129b);
                    int i12 = this.f16128a;
                    if (i12 <= iQ) {
                        while (!ae.r.b(obj, this.f16129b[iQ])) {
                            if (iQ != i12) {
                                iQ--;
                            }
                        }
                    }
                } else {
                    if (ae.r.b(obj, this.f16129b[i11])) {
                        iQ = i11 + this.f16129b.length;
                        break;
                    }
                    i11--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        int iU;
        ae.r.f(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f16129b.length == 0) == false) {
                int iU2 = u(this.f16128a + size());
                int i10 = this.f16128a;
                if (i10 < iU2) {
                    iU = i10;
                    while (i10 < iU2) {
                        Object obj = this.f16129b[i10];
                        if (!collection.contains(obj)) {
                            this.f16129b[iU] = obj;
                            iU++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    o.q(this.f16129b, null, iU, iU2);
                } else {
                    int length = this.f16129b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f16129b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!collection.contains(obj2)) {
                            this.f16129b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iU = u(i11);
                    for (int i12 = 0; i12 < iU2; i12++) {
                        Object[] objArr2 = this.f16129b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!collection.contains(obj3)) {
                            this.f16129b[iU] = obj3;
                            iU = r(iU);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f16130c = t(iU - this.f16128a);
                }
            }
        }
        return z10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f16129b;
        int i10 = this.f16128a;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f16128a = r(i10);
        this.f16130c = size() - 1;
        return e10;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iU = u(this.f16128a + u.o(this));
        Object[] objArr = this.f16129b;
        E e10 = (E) objArr[iU];
        objArr[iU] = null;
        this.f16130c = size() - 1;
        return e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        int iU;
        ae.r.f(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f16129b.length == 0) == false) {
                int iU2 = u(this.f16128a + size());
                int i10 = this.f16128a;
                if (i10 < iU2) {
                    iU = i10;
                    while (i10 < iU2) {
                        Object obj = this.f16129b[i10];
                        if (collection.contains(obj)) {
                            this.f16129b[iU] = obj;
                            iU++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    o.q(this.f16129b, null, iU, iU2);
                } else {
                    int length = this.f16129b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f16129b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (collection.contains(obj2)) {
                            this.f16129b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iU = u(i11);
                    for (int i12 = 0; i12 < iU2; i12++) {
                        Object[] objArr2 = this.f16129b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (collection.contains(obj3)) {
                            this.f16129b[iU] = obj3;
                            iU = r(iU);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f16130c = t(iU - this.f16128a);
                }
            }
        }
        return z10;
    }

    public final E s() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f16129b[u(this.f16128a + u.o(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        c.f16106a.b(i10, size());
        int iU = u(this.f16128a + i10);
        Object[] objArr = this.f16129b;
        E e11 = (E) objArr[iU];
        objArr[iU] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        ae.r.f(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) m.a(tArr, size());
        }
        int iU = u(this.f16128a + size());
        int i10 = this.f16128a;
        if (i10 < iU) {
            o.l(this.f16129b, tArr, 0, i10, iU, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f16129b;
            o.h(objArr, tArr, 0, this.f16128a, objArr.length);
            Object[] objArr2 = this.f16129b;
            o.h(objArr2, tArr, objArr2.length - this.f16128a, 0, iU);
        }
        return (T[]) t.f(size(), tArr);
    }

    public final E v() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E w() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }
}
