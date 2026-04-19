package z;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E>, be.b, be.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f24055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f24056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24057c;

    private final class a extends e<E> {
        public a() {
            super(b.this.n());
        }

        @Override // z.e
        protected E c(int i10) {
            return b.this.v(i10);
        }

        @Override // z.e
        protected void d(int i10) {
            b.this.r(i10);
        }
    }

    public b() {
        this(0, 1, null);
    }

    public b(int i10) {
        this.f24055a = a0.a.f14a;
        this.f24056b = a0.a.f16c;
        if (i10 > 0) {
            d.a(this, i10);
        }
    }

    public /* synthetic */ b(int i10, int i11, ae.j jVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public final void a(int i10) {
        int iN = n();
        if (f().length < i10) {
            int[] iArrF = f();
            Object[] objArrD = d();
            d.a(this, i10);
            if (n() > 0) {
                nd.o.k(iArrF, f(), 0, 0, n(), 6, null);
                nd.o.l(objArrD, d(), 0, 0, n(), 6, null);
            }
        }
        if (n() != iN) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iC;
        int iN = n();
        if (e10 == null) {
            iC = d.d(this);
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iC = d.c(this, e10, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        if (iN >= f().length) {
            int i12 = 4;
            if (iN >= 8) {
                i12 = (iN >> 1) + iN;
            } else if (iN >= 4) {
                i12 = 8;
            }
            int[] iArrF = f();
            Object[] objArrD = d();
            d.a(this, i12);
            if (iN != n()) {
                throw new ConcurrentModificationException();
            }
            if (!(f().length == 0)) {
                nd.o.k(iArrF, f(), 0, 0, iArrF.length, 6, null);
                nd.o.l(objArrD, d(), 0, 0, objArrD.length, 6, null);
            }
        }
        if (i11 < iN) {
            int i13 = i11 + 1;
            nd.o.f(f(), f(), i13, i11, iN);
            nd.o.h(d(), d(), i13, i11, iN);
        }
        if (iN != n() || i11 >= f().length) {
            throw new ConcurrentModificationException();
        }
        f()[i11] = i10;
        d()[i11] = e10;
        u(n() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        ae.r.f(collection, "elements");
        a(n() + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (n() != 0) {
            t(a0.a.f14a);
            s(a0.a.f16c);
            u(0);
        }
        if (n() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        ae.r.f(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object[] d() {
        return this.f24056b;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int iN = n();
                for (int i10 = 0; i10 < iN; i10++) {
                    if (((Set) obj).contains(v(i10))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int[] f() {
        return this.f24055a;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrF = f();
        int iN = n();
        int i10 = 0;
        for (int i11 = 0; i11 < iN; i11++) {
            i10 += iArrF[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d.d(this) : d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return n() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a();
    }

    public int l() {
        return this.f24057c;
    }

    public final int n() {
        return this.f24057c;
    }

    public final boolean o(b<? extends E> bVar) {
        ae.r.f(bVar, "array");
        int iN = bVar.n();
        int iN2 = n();
        for (int i10 = 0; i10 < iN; i10++) {
            remove(bVar.v(i10));
        }
        return iN2 != n();
    }

    public final E r(int i10) {
        int iN = n();
        E e10 = (E) d()[i10];
        if (iN <= 1) {
            clear();
        } else {
            int i11 = iN - 1;
            if (f().length <= 8 || n() >= f().length / 3) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    int i13 = i11 + 1;
                    nd.o.f(f(), f(), i10, i12, i13);
                    nd.o.h(d(), d(), i10, i12, i13);
                }
                d()[i11] = null;
            } else {
                int iN2 = n() > 8 ? n() + (n() >> 1) : 8;
                int[] iArrF = f();
                Object[] objArrD = d();
                d.a(this, iN2);
                if (i10 > 0) {
                    nd.o.k(iArrF, f(), 0, 0, i10, 6, null);
                    nd.o.l(objArrD, d(), 0, 0, i10, 6, null);
                }
                if (i10 < i11) {
                    int i14 = i10 + 1;
                    int i15 = i11 + 1;
                    nd.o.f(iArrF, f(), i10, i14, i15);
                    nd.o.h(objArrD, d(), i10, i14, i15);
                }
            }
            if (iN != n()) {
                throw new ConcurrentModificationException();
            }
            u(i11);
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        r(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        ae.r.f(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        ae.r.f(collection, "elements");
        boolean z10 = false;
        for (int iN = n() - 1; -1 < iN; iN--) {
            if (!nd.c0.S(collection, d()[iN])) {
                r(iN);
                z10 = true;
            }
        }
        return z10;
    }

    public final void s(Object[] objArr) {
        ae.r.f(objArr, "<set-?>");
        this.f24056b = objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return l();
    }

    public final void t(int[] iArr) {
        ae.r.f(iArr, "<set-?>");
        this.f24055a = iArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return nd.o.n(this.f24056b, 0, this.f24057c);
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        ae.r.f(tArr, "array");
        T[] tArr2 = (T[]) c.a(tArr, this.f24057c);
        nd.o.h(this.f24056b, tArr2, 0, 0, this.f24057c);
        ae.r.e(tArr2, "result");
        return tArr2;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(n() * 14);
        sb2.append('{');
        int iN = n();
        for (int i10 = 0; i10 < iN; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E eV = v(i10);
            if (eV != this) {
                sb2.append(eV);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        ae.r.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final void u(int i10) {
        this.f24057c = i10;
    }

    public final E v(int i10) {
        return (E) d()[i10];
    }
}
