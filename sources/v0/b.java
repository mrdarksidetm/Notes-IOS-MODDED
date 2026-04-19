package v0;

import ae.i;
import ae.r;
import ae.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import nd.c0;
import nd.o;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class b<T> implements Set<T>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f21867b = new Object[16];

    public static final class a implements Iterator<T>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b<T> f21869b;

        a(b<T> bVar) {
            this.f21869b = bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21868a < this.f21869b.size();
        }

        @Override // java.util.Iterator
        public T next() {
            Object[] objArrN = this.f21869b.n();
            int i10 = this.f21868a;
            this.f21868a = i10 + 1;
            T t10 = (T) objArrN[i10];
            r.d(t10, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: v0.b$b, reason: collision with other inner class name */
    static final class C0455b extends s implements l<T, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0455b f21870a = new C0455b();

        C0455b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(T t10) {
            return t10.toString();
        }
    }

    private final int d(Object obj) {
        int size = size() - 1;
        int iC = t0.c.c(obj);
        Object[] objArr = this.f21867b;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            Object obj2 = objArr[i11];
            int iC2 = t0.c.c(obj2);
            if (iC2 < iC) {
                i10 = i11 + 1;
            } else {
                if (iC2 <= iC) {
                    return obj2 == obj ? i11 : f(i11, obj, iC);
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    private final int f(int i10, Object obj, int i11) {
        Object obj2;
        Object[] objArr = this.f21867b;
        int size = size();
        for (int i12 = i10 - 1; -1 < i12; i12--) {
            Object obj3 = objArr[i12];
            if (obj3 == obj) {
                return i12;
            }
            if (t0.c.c(obj3) != i11) {
                break;
            }
        }
        do {
            i10++;
            if (i10 >= size) {
                return -(size + 1);
            }
            obj2 = objArr[i10];
            if (obj2 == obj) {
                return i10;
            }
        } while (t0.c.c(obj2) == i11);
        return -(i10 + 1);
    }

    public final void a(Collection<? extends T> collection) {
        Object[] objArr;
        int i10;
        Object obj;
        boolean z10;
        if (collection.isEmpty()) {
            return;
        }
        if (!(collection instanceof b)) {
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return;
        }
        Object[] objArr2 = this.f21867b;
        b bVar = (b) collection;
        Object[] objArr3 = bVar.f21867b;
        int size = size();
        int size2 = bVar.size();
        int i11 = size + size2;
        boolean z11 = this.f21867b.length < i11;
        boolean z12 = size == 0 || t0.c.c(objArr2[size + (-1)]) < t0.c.c(objArr3[0]);
        if (!z11 && z12) {
            o.h(objArr3, objArr2, size, 0, size2);
            this.f21866a = size() + size2;
            return;
        }
        if (z11) {
            objArr = new Object[size > size2 ? size * 2 : size2 * 2];
        } else {
            objArr = objArr2;
        }
        int i12 = size - 1;
        int i13 = size2 - 1;
        int i14 = i11 - 1;
        while (true) {
            if (i12 < 0 && i13 < 0) {
                break;
            }
            if (i12 < 0) {
                i10 = i13 - 1;
                obj = objArr3[i13];
            } else if (i13 < 0) {
                i10 = i13;
                obj = objArr2[i12];
                i12--;
            } else {
                Object obj2 = objArr2[i12];
                Object obj3 = objArr3[i13];
                int iC = t0.c.c(obj2);
                int iC2 = t0.c.c(obj3);
                if (iC > iC2) {
                    i12--;
                } else {
                    if (iC >= iC2) {
                        if (obj2 == obj3) {
                            i12--;
                            i13--;
                        } else {
                            int i15 = i12 - 1;
                            while (i15 >= 0) {
                                int i16 = i15 - 1;
                                Object obj4 = objArr2[i15];
                                if (t0.c.c(obj4) != iC2) {
                                    break;
                                }
                                if (obj3 == obj4) {
                                    z10 = true;
                                    break;
                                }
                                i15 = i16;
                            }
                            z10 = false;
                            if (z10) {
                                i13--;
                            }
                        }
                    }
                    i10 = i13 - 1;
                    obj = obj3;
                }
                i10 = i13;
                obj = obj2;
            }
            objArr[i14] = obj;
            i13 = i10;
            i14--;
        }
        if (i14 >= 0) {
            o.h(objArr, objArr, 0, i14 + 1, i11);
        }
        int i17 = i11 - (i14 + 1);
        o.q(objArr, null, i17, i11);
        this.f21867b = objArr;
        this.f21866a = i17;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t10) {
        int iD;
        int size = size();
        Object[] objArr = this.f21867b;
        if (size > 0) {
            iD = d(t10);
            if (iD >= 0) {
                return false;
            }
        } else {
            iD = -1;
        }
        int i10 = -(iD + 1);
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            o.h(objArr, objArr2, i10 + 1, i10, size);
            o.l(objArr, objArr2, 0, 0, i10, 6, null);
            this.f21867b = objArr2;
        } else {
            o.h(objArr, objArr, i10 + 1, i10, size);
        }
        this.f21867b[i10] = t10;
        this.f21866a = size() + 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        o.t(this.f21867b, null, 0, 0, 6, null);
        this.f21866a = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && d(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
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

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this);
    }

    public int l() {
        return this.f21866a;
    }

    public final Object[] n() {
        return this.f21867b;
    }

    public final boolean o() {
        return size() > 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(T t10) {
        if (t10 == null) {
            return false;
        }
        int iD = d(t10);
        Object[] objArr = this.f21867b;
        int size = size();
        if (iD < 0) {
            return false;
        }
        int i10 = size - 1;
        if (iD < i10) {
            o.h(objArr, objArr, iD, iD + 1, size);
        }
        objArr[i10] = null;
        this.f21866a = size() - 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return l();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return i.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) i.b(this, tArr);
    }

    public String toString() {
        return c0.h0(this, null, "[", "]", 0, null, C0455b.f21870a, 25, null);
    }
}
