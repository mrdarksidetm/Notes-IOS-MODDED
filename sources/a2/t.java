package a2;

import androidx.compose.ui.e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class t implements List<e.c>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f280a = new Object[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f281b = new long[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f282c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f283d;

    private final class a implements ListIterator<e.c>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f286c;

        public a(int i10, int i11, int i12) {
            this.f284a = i10;
            this.f285b = i11;
            this.f286c = i12;
        }

        public /* synthetic */ a(t tVar, int i10, int i11, int i12, int i13, ae.j jVar) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? tVar.size() : i12);
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e.c next() {
            Object[] objArr = t.this.f280a;
            int i10 = this.f284a;
            this.f284a = i10 + 1;
            Object obj = objArr[i10];
            ae.r.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e.c previous() {
            Object[] objArr = t.this.f280a;
            int i10 = this.f284a - 1;
            this.f284a = i10;
            Object obj = objArr[i10];
            ae.r.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f284a < this.f286c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f284a > this.f285b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f284a - this.f285b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f284a - this.f285b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private final class b implements List<e.c>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f289b;

        public b(int i10, int i11) {
            this.f288a = i10;
            this.f289b = i11;
        }

        public boolean a(e.c cVar) {
            return indexOf(cVar) != -1;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i10, e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends e.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends e.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof e.c) {
                return a((e.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((e.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e.c get(int i10) {
            Object obj = t.this.f280a[i10 + this.f288a];
            ae.r.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        public int f() {
            return this.f289b - this.f288a;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof e.c) {
                return l((e.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<e.c> iterator() {
            t tVar = t.this;
            int i10 = this.f288a;
            return tVar.new a(i10, i10, this.f289b);
        }

        public int l(e.c cVar) {
            int i10 = this.f288a;
            int i11 = this.f289b;
            if (i10 > i11) {
                return -1;
            }
            while (!ae.r.b(t.this.f280a[i10], cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10++;
            }
            return i10 - this.f288a;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof e.c) {
                return n((e.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<e.c> listIterator() {
            t tVar = t.this;
            int i10 = this.f288a;
            return tVar.new a(i10, i10, this.f289b);
        }

        @Override // java.util.List
        public ListIterator<e.c> listIterator(int i10) {
            t tVar = t.this;
            int i11 = this.f288a;
            return tVar.new a(i10 + i11, i11, this.f289b);
        }

        public int n(e.c cVar) {
            int i10 = this.f289b;
            int i11 = this.f288a;
            if (i11 > i10) {
                return -1;
            }
            while (!ae.r.b(t.this.f280a[i10], cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f288a;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ e.c remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<e.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ e.c set(int i10, e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return f();
        }

        @Override // java.util.List
        public void sort(Comparator<? super e.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<e.c> subList(int i10, int i11) {
            t tVar = t.this;
            int i12 = this.f288a;
            return tVar.new b(i10 + i12, i12 + i11);
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

    private final void A() {
        int i10 = this.f282c + 1;
        int iO = nd.u.o(this);
        if (i10 <= iO) {
            while (true) {
                this.f280a[i10] = null;
                if (i10 == iO) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f283d = this.f282c + 1;
    }

    private final void o() {
        int i10 = this.f282c;
        Object[] objArr = this.f280a;
        if (i10 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f280a = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f281b, length);
            ae.r.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f281b = jArrCopyOf;
        }
    }

    private final long r() {
        long jA = u.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.f282c + 1;
        int iO = nd.u.o(this);
        if (i10 <= iO) {
            while (true) {
                long jB = p.b(this.f281b[i10]);
                if (p.a(jB, jA) < 0) {
                    jA = jB;
                }
                if (p.c(jA) < 0.0f && p.d(jA)) {
                    return jA;
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        return jA;
    }

    public final void B(e.c cVar, float f10, boolean z10, zd.a<md.i0> aVar) {
        if (this.f282c == nd.u.o(this)) {
            w(cVar, f10, z10, aVar);
            if (this.f282c + 1 == nd.u.o(this)) {
                A();
                return;
            }
            return;
        }
        long jR = r();
        int i10 = this.f282c;
        this.f282c = nd.u.o(this);
        w(cVar, f10, z10, aVar);
        if (this.f282c + 1 < nd.u.o(this) && p.a(jR, r()) > 0) {
            int i11 = this.f282c + 1;
            int i12 = i10 + 1;
            Object[] objArr = this.f280a;
            nd.o.h(objArr, objArr, i12, i11, size());
            long[] jArr = this.f281b;
            nd.o.g(jArr, jArr, i12, i11, size());
            this.f282c = ((size() + i10) - this.f282c) - 1;
        }
        A();
        this.f282c = i10;
    }

    public final void a() {
        this.f282c = size() - 1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, e.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends e.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends e.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f282c = -1;
        A();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e.c) {
            return n((e.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((e.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof e.c) {
            return x((e.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<e.c> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof e.c) {
            return z((e.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<e.c> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public ListIterator<e.c> listIterator(int i10) {
        return new a(this, i10, 0, 0, 6, null);
    }

    public boolean n(e.c cVar) {
        return indexOf(cVar) != -1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ e.c remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<e.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e.c get(int i10) {
        Object obj = this.f280a[i10];
        ae.r.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (e.c) obj;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ e.c set(int i10, e.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return t();
    }

    @Override // java.util.List
    public void sort(Comparator<? super e.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<e.c> subList(int i10, int i11) {
        return new b(i10, i11);
    }

    public int t() {
        return this.f283d;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ae.i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ae.i.b(this, tArr);
    }

    public final boolean u() {
        long jR = r();
        return p.c(jR) < 0.0f && p.d(jR);
    }

    public final void v(e.c cVar, boolean z10, zd.a<md.i0> aVar) {
        w(cVar, -1.0f, z10, aVar);
    }

    public final void w(e.c cVar, float f10, boolean z10, zd.a<md.i0> aVar) {
        int i10 = this.f282c;
        this.f282c = i10 + 1;
        o();
        Object[] objArr = this.f280a;
        int i11 = this.f282c;
        objArr[i11] = cVar;
        this.f281b[i11] = u.a(f10, z10);
        A();
        aVar.invoke();
        this.f282c = i10;
    }

    public int x(e.c cVar) {
        int iO = nd.u.o(this);
        if (iO < 0) {
            return -1;
        }
        int i10 = 0;
        while (!ae.r.b(this.f280a[i10], cVar)) {
            if (i10 == iO) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    public final boolean y(float f10, boolean z10) {
        if (this.f282c == nd.u.o(this)) {
            return true;
        }
        return p.a(r(), u.a(f10, z10)) > 0;
    }

    public int z(e.c cVar) {
        for (int iO = nd.u.o(this); -1 < iO; iO--) {
            if (ae.r.b(this.f280a[iO], cVar)) {
                return iO;
            }
        }
        return -1;
    }
}
