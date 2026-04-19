package v0;

import ae.i;
import ae.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import nd.o;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public final class d<T> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21872d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T[] f21873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<T> f21874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21875c;

    private static final class a<T> implements List<T>, be.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<T> f21876a;

        public a(d<T> dVar) {
            this.f21876a = dVar;
        }

        public int a() {
            return this.f21876a.o();
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f21876a.a(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            return this.f21876a.b(t10);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends T> collection) {
            return this.f21876a.c(i10, collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            return this.f21876a.f(collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f21876a.i();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f21876a.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            return this.f21876a.k(collection);
        }

        public T d(int i10) {
            e.c(this, i10);
            return this.f21876a.x(i10);
        }

        @Override // java.util.List
        public T get(int i10) {
            e.c(this, i10);
            return this.f21876a.n()[i10];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f21876a.q(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f21876a.r();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f21876a.u(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return d(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f21876a.v(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            return this.f21876a.w(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            return this.f21876a.z(collection);
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            e.c(this, i10);
            return this.f21876a.A(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List<T> subList(int i10, int i11) {
            e.d(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return i.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) i.b(this, tArr);
        }
    }

    private static final class b<T> implements List<T>, be.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<T> f21877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21879c;

        public b(List<T> list, int i10, int i11) {
            this.f21877a = list;
            this.f21878b = i10;
            this.f21879c = i11;
        }

        public int a() {
            return this.f21879c - this.f21878b;
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f21877a.add(i10 + this.f21878b, t10);
            this.f21879c++;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            List<T> list = this.f21877a;
            int i10 = this.f21879c;
            this.f21879c = i10 + 1;
            list.add(i10, t10);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends T> collection) {
            this.f21877a.addAll(i10 + this.f21878b, collection);
            this.f21879c += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            this.f21877a.addAll(this.f21879c, collection);
            this.f21879c += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f21879c - 1;
            int i11 = this.f21878b;
            if (i11 <= i10) {
                while (true) {
                    this.f21877a.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f21879c = this.f21878b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f21879c;
            for (int i11 = this.f21878b; i11 < i10; i11++) {
                if (r.b(this.f21877a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public T d(int i10) {
            e.c(this, i10);
            this.f21879c--;
            return this.f21877a.remove(i10 + this.f21878b);
        }

        @Override // java.util.List
        public T get(int i10) {
            e.c(this, i10);
            return this.f21877a.get(i10 + this.f21878b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f21879c;
            for (int i11 = this.f21878b; i11 < i10; i11++) {
                if (r.b(this.f21877a.get(i11), obj)) {
                    return i11 - this.f21878b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f21879c == this.f21878b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f21879c - 1;
            int i11 = this.f21878b;
            if (i11 > i10) {
                return -1;
            }
            while (!r.b(this.f21877a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f21878b;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return d(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f21879c;
            for (int i11 = this.f21878b; i11 < i10; i11++) {
                if (r.b(this.f21877a.get(i11), obj)) {
                    this.f21877a.remove(i11);
                    this.f21879c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            int i10 = this.f21879c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f21879c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            int i10 = this.f21879c;
            int i11 = i10 - 1;
            int i12 = this.f21878b;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f21877a.get(i11))) {
                        this.f21877a.remove(i11);
                        this.f21879c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f21879c;
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            e.c(this, i10);
            return this.f21877a.set(i10 + this.f21878b, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List<T> subList(int i10, int i11) {
            e.d(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return i.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) i.b(this, tArr);
        }
    }

    private static final class c<T> implements ListIterator<T>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<T> f21880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21881b;

        public c(List<T> list, int i10) {
            this.f21880a = list;
            this.f21881b = i10;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            this.f21880a.add(this.f21881b, t10);
            this.f21881b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f21881b < this.f21880a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f21881b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.f21880a;
            int i10 = this.f21881b;
            this.f21881b = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f21881b;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.f21881b - 1;
            this.f21881b = i10;
            return this.f21880a.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f21881b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f21881b - 1;
            this.f21881b = i10;
            this.f21880a.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            this.f21880a.set(this.f21881b, t10);
        }
    }

    public d(T[] tArr, int i10) {
        this.f21873a = tArr;
        this.f21875c = i10;
    }

    public final T A(int i10, T t10) {
        T[] tArr = this.f21873a;
        T t11 = tArr[i10];
        tArr[i10] = t10;
        return t11;
    }

    public final void B(int i10) {
        this.f21875c = i10;
    }

    public final void C(Comparator<T> comparator) {
        o.A(this.f21873a, comparator, 0, this.f21875c);
    }

    public final void a(int i10, T t10) {
        l(this.f21875c + 1);
        T[] tArr = this.f21873a;
        int i11 = this.f21875c;
        if (i10 != i11) {
            o.h(tArr, tArr, i10 + 1, i10, i11);
        }
        tArr[i10] = t10;
        this.f21875c++;
    }

    public final boolean b(T t10) {
        l(this.f21875c + 1);
        T[] tArr = this.f21873a;
        int i10 = this.f21875c;
        tArr[i10] = t10;
        this.f21875c = i10 + 1;
        return true;
    }

    public final boolean c(int i10, Collection<? extends T> collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        l(this.f21875c + collection.size());
        T[] tArr = this.f21873a;
        if (i10 != this.f21875c) {
            o.h(tArr, tArr, collection.size() + i10, i10, this.f21875c);
        }
        for (T t10 : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                u.w();
            }
            tArr[i11 + i10] = t10;
            i11 = i12;
        }
        this.f21875c += collection.size();
        return true;
    }

    public final boolean d(int i10, d<T> dVar) {
        if (dVar.r()) {
            return false;
        }
        l(this.f21875c + dVar.f21875c);
        T[] tArr = this.f21873a;
        int i11 = this.f21875c;
        if (i10 != i11) {
            o.h(tArr, tArr, dVar.f21875c + i10, i10, i11);
        }
        o.h(dVar.f21873a, tArr, i10, 0, dVar.f21875c);
        this.f21875c += dVar.f21875c;
        return true;
    }

    public final boolean f(Collection<? extends T> collection) {
        return c(this.f21875c, collection);
    }

    public final List<T> h() {
        List<T> list = this.f21874b;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f21874b = aVar;
        return aVar;
    }

    public final void i() {
        T[] tArr = this.f21873a;
        int iO = o();
        while (true) {
            iO--;
            if (-1 >= iO) {
                this.f21875c = 0;
                return;
            }
            tArr[iO] = null;
        }
    }

    public final boolean j(T t10) {
        int iO = o() - 1;
        if (iO >= 0) {
            for (int i10 = 0; !r.b(n()[i10], t10); i10++) {
                if (i10 != iO) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean k(Collection<? extends T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!j(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void l(int i10) {
        T[] tArr = this.f21873a;
        if (tArr.length < i10) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i10, tArr.length * 2));
            r.e(tArr2, "copyOf(this, newSize)");
            this.f21873a = tArr2;
        }
    }

    public final T m() {
        if (r()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return n()[0];
    }

    public final T[] n() {
        return this.f21873a;
    }

    public final int o() {
        return this.f21875c;
    }

    public final int q(T t10) {
        int i10 = this.f21875c;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = 0;
        T[] tArr = this.f21873a;
        while (!r.b(t10, tArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean r() {
        return this.f21875c == 0;
    }

    public final boolean s() {
        return this.f21875c != 0;
    }

    public final T t() {
        if (r()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return n()[o() - 1];
    }

    public final int u(T t10) {
        int i10 = this.f21875c;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = i10 - 1;
        T[] tArr = this.f21873a;
        while (!r.b(t10, tArr[i11])) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean v(T t10) {
        int iQ = q(t10);
        if (iQ < 0) {
            return false;
        }
        x(iQ);
        return true;
    }

    public final boolean w(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f21875c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
        return i10 != this.f21875c;
    }

    public final T x(int i10) {
        T[] tArr = this.f21873a;
        T t10 = tArr[i10];
        if (i10 != o() - 1) {
            o.h(tArr, tArr, i10, i10 + 1, this.f21875c);
        }
        int i11 = this.f21875c - 1;
        this.f21875c = i11;
        tArr[i11] = null;
        return t10;
    }

    public final void y(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f21875c;
            if (i11 < i12) {
                T[] tArr = this.f21873a;
                o.h(tArr, tArr, i10, i11, i12);
            }
            int i13 = this.f21875c - (i11 - i10);
            int iO = o() - 1;
            if (i13 <= iO) {
                int i14 = i13;
                while (true) {
                    this.f21873a[i14] = null;
                    if (i14 == iO) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f21875c = i13;
        }
    }

    public final boolean z(Collection<? extends T> collection) {
        int i10 = this.f21875c;
        for (int iO = o() - 1; -1 < iO; iO--) {
            if (!collection.contains(n()[iO])) {
                x(iO);
            }
        }
        return i10 != this.f21875c;
    }
}
